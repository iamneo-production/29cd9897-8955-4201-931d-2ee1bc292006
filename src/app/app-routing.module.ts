import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserHomeComponent } from './user-home/user-home.component';
import { WelcomepageComponent } from './welcomepage/welcomepage.component';
import { LogoutComponent } from './logout/logout.component';
import { UserpageComponent } from './userpage/userpage.component';


const routes: Routes = [
  //{ path: 'welcomepage ', component:WelcomepageComponent  },
  //{ path: 'user-home', component:UserHomeComponent},
  {path:'logout',component:LogoutComponent},
  {path:'',component:UserpageComponent},
  //{path:'' , redirectTo:'/home',pathMatch:'full' },
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[
    RouterModule
  ]
 
})

export class AppRoutingModule { }

export const routingComponents =[WelcomepageComponent,UserpageComponent]