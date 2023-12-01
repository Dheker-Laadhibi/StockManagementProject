import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { article } from '../modeles/article';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ArticleService  {

  private baseUrl = 'http://localhost:8082';

  constructor(private http: HttpClient) {

   }
 
 AjouterArticleDepuisForm( nouvelArticle1: article,idCategorie: number):Observable<article>{
const apiUrl=`${this.baseUrl}/ajouterArticleCat/${idCategorie}`;
console.log(this.http.get<article>(apiUrl));
return this.http.post<article>(apiUrl,nouvelArticle1);



 }
 
 getArticles(): Observable<article[]> {
  const url = `${this.baseUrl}/GetArticles`;
  return this.http.get<article[]>(url);
}


 /*private baseUrl = 'http://localhost:8082';
  getCategories(): Observable<Category[]> {
    const url = `${this.baseUrl}/GetCategories`; // Endpoint pour récupérer les catégories
    //return this.Http.get<any[]>(url);
    console.log(this.http.get<Category[]>(url));
    
   return this.http.get<Category[]>(url);
  }
*/ 









}
