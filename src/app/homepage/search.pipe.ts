

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(list : any[], filterString: string, propName:string): any[] {
    const result:any =[];
    if(!list || filterString==='' || propName ===''){
      return list;
    }
    list.forEach((a:any)=>{
      if(a[propName].trim().toLowerCase().includes(filterString.toLowerCase())){
        result.push(a);
      }
    });
    return result;
  }

}