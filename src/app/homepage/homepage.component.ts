import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  filterTerm!: string;
  name = new FormControl('');
  //category = new FormControl(''); 

  array = [
    {
      id:'grid1',
      name: 'Angular',
      catName: 'Front-End Development',
      year:'2020',
      image:'./../assets/image/animg1.png',
      link:'/angular'
    },
    {
      id:'grid2',
      name: 'React',
      catName: 'Front-End Development',
      year:'2021',
      image:'./../assets/image/react-logo.jpg',
      link:'/react'
      
    },
    {
      id:'grid3',
      name: 'Node js',
      catName: 'Back-End Technology',
      year:'2020',
      image:'./../assets/image/nodejs.png',
      link:'/nodejs'
    },
    {
      id:'grid4',
      name: 'Mongo DB',
      catName: 'Back-End Technology',
      year:'2019',
      image:'./../assets/image/mongo.png',
      link:'/mongodb'
    },
    {
      id:'grid5',
      name: 'My SQL',
      catName: 'Back-End Technology',
      year:'2021',
      image:'./../assets/image/mysql.png',
      link:'/mysql'
    },
    {
      id:'grid6',
      name: 'Spring Boot',
      catName: 'Back-End Technology',
      year:'2020',
      image:'./../assets/image/spring.png',
      link:'/springboot'
    },
  ]

}
