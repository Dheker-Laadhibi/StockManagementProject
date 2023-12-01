import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DashbordService {
private api='http://localhost:8082';
  constructor(private http:HttpClient) { }


  getArticleCountByCategory():Observable<any>{
    const articlesCountByCat = `${this.api}/count-by-category`;
return this.http.get<any[]>(articlesCountByCat);
  }

  getNumberOfArticles(): Observable<number> {
    const articlesCountEndpoint = `${this.api}/article-count`;
    return this.http.get<number>(articlesCountEndpoint);
  }


  getNumberOfCategories(): Observable<number> {
    const categoriesCountEndpoint = `${this.api}/category-count`;
    return this.http.get<number>(categoriesCountEndpoint);
  }


  getNumberOfUsers(): Observable<number> {
    const UsersCountEndpoint = `${this.api}/user-count`;
    return this.http.get<number>(UsersCountEndpoint);
  }







  
}
