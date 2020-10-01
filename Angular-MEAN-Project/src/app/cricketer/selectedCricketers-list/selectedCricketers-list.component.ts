//import { Component, Input, OnInit } from '@angular/core';
import { Component, OnInit } from '@angular/core';

import { Cricketer } from '../Crickerter.model';
import { CricketerService } from '../Cricketer.service';


@Component({
selector : 'app-selectedCricketer-list',
templateUrl : './selectedCricketers-list.component.html',
styleUrls : ['./selectedCricketers-list.component.css']
})
export class SelectedCricketersComponent implements OnInit{



  // cricketersList = [
  //    {name:"Sachin",Country:"India"},
  //    {name:"Smith",Country:"Australia"},
  //    {name:"Williamson",Country:"NewZealand"}
  //  ];

   //@Input() selectedCricketerVar = [];

   constructor(public cricketerServ : CricketerService) {
    // window.alert('in SelectCriketerComponent constructor()');
   }

  cricketersList :  Cricketer[] = [];

    //getSelectedCricketerList(){

      //this.cricketer =  [{'sachin','india'},{sachin','india'}];
     // this.cricketersList = this.selectedCricketerVar;

   // }


    getSelectedCricketerListByService(){
      debugger;
      window.console.log('getSelectedCricketerListByService********* () ');
      this.cricketerServ.getCrickerList().subscribe((responsedata) => {
        debugger;
        //  this.criketers = responsedata.cricketer;
          window.console.log('** Value retrieved from server ' , responsedata);
      });
      window.console.debug('this.cricketersList () ', this.cricketersList);
      return  this.cricketersList;
    }


    ngOnInit() {
      window.console.log('selected crick init ');
      //this.getSelectedCricketerListByService();
    }

}
