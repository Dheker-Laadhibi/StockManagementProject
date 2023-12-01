import { Chart, registerables } from 'chart.js';
import { DashbordService } from './../services/dashbord.service';

import { Component, ElementRef, ViewChild, OnInit } from '@angular/core';

@Component({
  selector: 'app-page-statistiques',
  templateUrl: './page-statistiques.component.html',
  styleUrls: ['./page-statistiques.component.scss']
})
export class PageStatistiquesComponent implements OnInit {
  @ViewChild('myCanvas') myCanvas!: ElementRef<HTMLCanvasElement>;
  private ctx!: CanvasRenderingContext2D | null;
  numberOfArticles: number = 0;
  numberOfCategories: number = 0;
  numberOfUsers: number = 0;
  constructor(private DashbordService:DashbordService){

  }
  ngOnInit(): void {
    this.DashbordService.getNumberOfArticles().subscribe(
      (count: number) => {
        this.numberOfArticles = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );

    this.DashbordService.getNumberOfCategories().subscribe(
      (count: number) => {
        this.numberOfCategories = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );

    this.DashbordService.getNumberOfUsers().subscribe(
      (count: number) => {
        this.numberOfUsers = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );
  
    Chart.register(...registerables);
    this.DashbordService.getArticleCountByCategory().subscribe(data => {
      // Assuming data is an array of ArticleCategory objects
      const categories = data.map((item: any) => item.category);
    const counts = data.map((item: any) => item.count);

      this.ctx = this.myCanvas.nativeElement.getContext('2d');

      if (this.ctx) {
        const myChart = new Chart(this.ctx, {
          type: 'bar',
          data: {
            labels: categories,
            datasets: [{
              label: 'Article Count by Category',
              data: counts,
              backgroundColor: 'rgba(54, 162, 235, 0.5)',
              borderColor: 'rgba(54, 162, 235, 1)',
              borderWidth: 1
            }]
          },
          options: {
            scales: {
              y: {
                beginAtZero: true,
                ticks: {
                  precision: 0, // Précision à 0 décimales pour afficher uniquement des entiers
                  callback: function(value: any) {
                    if (Number.isInteger(value)) {
                      return value;
                    }
                  }
                }
              }
            }
          }
        });
      }
    });


    

    /*ngOnInit(): void {
    this.dashboardService.getNumberOfArticles().subscribe(
      (count: number) => {
        this.numberOfArticles = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );

    this.dashboardService.getNumberOfCategories().subscribe(
      (count: number) => {
        this.numberOfCategories = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );

    this.dashboardService.getNumberOfUsers().subscribe(
      (count: number) => {
        this.numberOfUsers = count;
      },
      (error) => {
        // Gérer les erreurs
      }
    );
  }
}*/ 
  }
}