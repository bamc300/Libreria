import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(private _http: HttpClient) {}

  addEmployee(data: any): Observable<any> {
    return this._http.post('http://localhost:8080/libro/post/', data);
    
  }
  addAutor(data: any): Observable<any> {
    return this._http.post('http://localhost:8080/autor/post/', data);
    
  }

  updateEmployee(id: number, data: any): Observable<any> {
    return this._http.put(`http://localhost:8080/libro/upd/${id}`, data);
  }

  getEmployeeList(): Observable<any> {
    return this._http.get('http://localhost:8080/libro/list/');
  }
  getUserList(id: any): Observable<any> {
    return this._http.get('http://localhost:8080/autor/list/');
    
  }


  ClientOrders(id: number): Observable<any> {
    return this._http.delete(`http://localhost:5038/api/DatePrediction/Lista/${id}`);
  }
  deleteEmployee(id: number): Observable<any> {
    return this._http.delete(`http://localhost:8080/autor/del/${id}`);
  }
  deleteEmployee1(id: number): Observable<any> {
    return this._http.delete(`http://localhost:8080/libro/del/${id}`);
  }
}
