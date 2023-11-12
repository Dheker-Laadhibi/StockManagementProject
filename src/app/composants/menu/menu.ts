export interface menu{
    //create menu object 
id?:string,
titre?:string,
icon ?: string,
url:string,

//create sub menu object like article ,client .. for my menu 
sousMenu?:Array<menu>;






    
}