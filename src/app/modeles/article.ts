import { Category } from "./category";


export interface article{
   


    id?: number;
    codearticle?: string;
    designation?: string;
    prixunitaire?: number;
    tauxtva?: number;
    prixunitairettc?: number;
    photo?: string;
   
    category: Category;
  

}