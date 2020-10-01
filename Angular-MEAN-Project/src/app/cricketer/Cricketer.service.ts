import { Cricketer } from './Crickerter.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';



@Injectable()
export class CricketerService {

private criketers: Cricketer[] = [];

constructor(private httpclient: HttpClient) {

}

// tslint:disable-next-line: whitespace
public getCrickerList(): Observable<any[]> {
  debugger;
    window.console.log('in service classs , hitting the server');
    // return this.criketers;
    return this.httpclient.get<any[]>('http://localhost:3000/api/cricketer-list');

  window.console.log('** returning the value from server to client  ' , this.criketers);
  //return this.criketers;
}

onAddSelectedCricketer(selectedCricketer: Cricketer){
  window.console.log('in service call onAddSelectedCricketer' , selectedCricketer);
  const cricketer: Cricketer = {cricketerName : selectedCricketer.cricketerName , selected4reason : selectedCricketer.selected4reason};
   // this.criketers.push(selectedCricketer);
  this.criketers.push(cricketer);
   // window.console.debug("criketerlist list values are :", criketerlist.values)

}

}
