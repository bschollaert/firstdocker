import { Component, OnInit } from '@angular/core';
import { People } from 'src/model/people';
import { PeopleApiService } from 'src/service/people-api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'firstdocker-angular';
  peopleTab : People[];


  constructor(private peopleApiService: PeopleApiService){

  }

  ngOnInit(){
    this.peopleApiService.getPeople().subscribe(res =>{
      this.peopleTab = res;
    });
  }
}
