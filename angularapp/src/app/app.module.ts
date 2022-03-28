import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
// import {MatLinkPreviewModule} from '@angular-material-extensions/link-preview';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DocpreviewComponent } from './docpreview/docpreview.component';


@NgModule({
  declarations: [
    AppComponent,
    DocpreviewComponent,
   
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
