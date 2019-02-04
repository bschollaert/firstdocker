import { HttpHeaders } from '@angular/common/http';

export const environment = {
  production: true,
  endpoint:'http://localhost:8088/member/',
  httpOptions: {
    headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    }
};