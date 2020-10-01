import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { ApCricketerpComponent } from './app.component';
import { SelectCriketerComponent } from './cricketer/select-Cricketer/select-Cricketer.component';
import { CricHeaderComponent } from './cricketer/haeader/cricHeader-component';
import { SelectedCricketersComponent } from './cricketer/selectedCricketers-list/selectedCricketers-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatInputModule } from '@angular/material' ;
import { MatCardModule } from '@angular/material' ;
import { MatButtonModule } from '@angular/material' ;
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatExpansionModule} from '@angular/material/expansion';
import { CricketerService } from './cricketer/Cricketer.service';
import { HttpClientModule } from '@angular/common/http';




@NgModule({
  declarations: [
    ApCricketerpComponent,
    SelectCriketerComponent,
    CricHeaderComponent,
    SelectedCricketersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatCardModule,
    MatButtonModule,
    MatToolbarModule,
    MatExpansionModule,
    HttpClientModule
  ],
  providers: [CricketerService],
  bootstrap: [ApCricketerpComponent]
})
export class AppModule { }
