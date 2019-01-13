import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, tap, catchError } from 'rxjs/operators';
import { People } from 'src/model/people';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PeopleApiService {

  constructor(private http: HttpClient) { }

  API_URL = environment.endpoint;

  getPeople(): Observable<People[]> {
    return this.http.get<People[]>(this.API_URL+'all')
    .pipe(
      tap(people => console.log('fetched people')),
      catchError(this.handleError('getPeople', []))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {  
      return of(result as T);
    };
  }
}
