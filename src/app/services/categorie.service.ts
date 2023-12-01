import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../modeles/category';

@Injectable({
  providedIn: 'root'
})
export class CategorieService {

  constructor(private http: HttpClient) { }
  private baseUrl = 'http://localhost:8082';
  getCategories(): Observable<any[]> {
    const url = `${this.baseUrl}/GetCategories`; // Endpoint pour récupérer les catégories
    return this.http.get<any[]>(url);
  }
 

  addCategory(newCategory: any): Observable<any> {
    const url = `${this.baseUrl}/addCatgorie`; // Endpoint pour ajouter une catégorie
    return this.http.post<any>(url,newCategory);
  }









}
