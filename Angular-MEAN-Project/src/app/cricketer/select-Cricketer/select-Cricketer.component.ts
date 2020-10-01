//import { OnInit, Component , EventEmitter, Output} from '@angular/core';
import { OnInit, Component} from '@angular/core';

import { Cricketer } from '../Crickerter.model';
import { NgForm } from '@angular/forms';
import { CricketerService } from '../Cricketer.service';

@Component({
selector : 'app-select-cricketer',
templateUrl: './select-Cricketer.component.html',
styleUrls: ['./select-Cricketer.component.css']
}) export class SelectCriketerComponent implements OnInit {

  criketer = '';
  enteredVal = '' ;
//@Output() cricketerCreated2 = new EventEmitter();
//@Output() cricketerCreated2 = new EventEmitter<Cricketer>(); //approach to use for model.
  selected4reason = '';
  cricketerName='';

  constructor(public cricketerServ : CricketerService) {
   // window.alert('in SelectCriketerComponent constructor()');
  }

  onAddCricketerByModelFormService(formVal : NgForm){
    window.console.log('onAddCricketerByModelFormService', formVal);
    const cricketer : Cricketer = {
     cricketerName :  formVal.value.cricketerName ,
    selected4reason :  formVal.value.selected4reason
    }

    window.console.log('Calling service  cricketer ', cricketer);

    this.cricketerServ.onAddSelectedCricketer(cricketer);

    window.console.log('Back from service');
  }


  ngOnInit() {

  }

  // onAddCricketerCallCompontentFromUI() {
  //   window.console.log('the selected cricketer is  onAddCricketerCallCompontentFromUI :');
  //   this.criketer = 'Sachin for Mumbai';
  //  }

  // onAddCricketerbyRef(criketerVal: HTMLInputElement) {
  //   window.console.log('the selected cricketer is  onAddCricketerbyRef :');
  //   // this.criketer = 'Sachin for Mumbai'  ;
  //  // console.log(criketerVal.value);
  //   console.dir(criketerVal);
  //   window.console.debug('debug val :', criketerVal.value);
  //   this.criketer = criketerVal.value  ;
  //   // this.enteredVal = this.enteredVal.valueOf;
  // }


  // onAddCricketerBytwoWay() {
  //   window.console.log('the selected cricketer is onAddCricketerBytwoWay :');
  //   // this.criketer = 'Sachin for Mumbai'  ;
  //  // console.log(criketerVal.value);
  //   this.criketer = this.enteredVal; // 2 way getter method
  // }

  // onAddCricketerBytwoWay2() {
  //   window.console.log('the selected cricketer is onAddCricketerBytwoWay222 :');

  //   const cricketer = {
  //     cricketerName : this.cricketerName,
  //     selected4reason : this.selected4reason
  //   };
  //   window.console.log('the selected cricketer is onAddCricketerBytwoWay222 :' , cricketer);

  //   this.cricketerCreated2.emit(cricketer);



  // }


  // onAddCricketerByModel() {
  //   window.console.log('the selected cricketer is  onAddCricketerByModel :');

  //   const cricketer : Cricketer = {
  //     cricketerName : this.cricketerName,
  //     selected4reason : this.selected4reason
  //   };
  //   window.console.log('the selected cricketer is onAddCricketerByModel :' , cricketer);

  //   this.cricketerCreated2.emit(cricketer);

  //   window.console.log('emmiting the model in evnetlistener');

  // }

  // onAddCricketerByModelForm(formVal : NgForm){
  //   window.console.log('onAddCricketerByModelForm', formVal);
  //   const cricketer : Cricketer = {
  //    cricketerName :  formVal.value.cricketerName ,
  //   selected4reason :  formVal.value.selected4reason
  //   }

  //   window.console.log('onAddCricketerByModelForm cricketer ', cricketer);

  //   this.cricketerCreated2.emit(cricketer);

  //   window.console.log('emmiting the model in evnetlistener');
  // }



}
