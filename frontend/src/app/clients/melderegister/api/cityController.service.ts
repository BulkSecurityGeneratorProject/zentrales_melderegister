/**
 * Zentrales Melderegister
 * Zentrales Melderegister
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { CityDTO } from '../model/cityDTO';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class CityControllerService {

    protected basePath = '//localhost:8080/';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * createCity
     * 
     * @param coordinatesLatitude 
     * @param coordinatesLongitude 
     * @param countryId 
     * @param id 
     * @param name 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createCityUsingPOST(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'body', reportProgress?: boolean): Observable<CityDTO>;
    public createCityUsingPOST(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<CityDTO>>;
    public createCityUsingPOST(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<CityDTO>>;
    public createCityUsingPOST(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {






        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (coordinatesLatitude !== undefined && coordinatesLatitude !== null) {
            queryParameters = queryParameters.set('coordinatesLatitude', <any>coordinatesLatitude);
        }
        if (coordinatesLongitude !== undefined && coordinatesLongitude !== null) {
            queryParameters = queryParameters.set('coordinatesLongitude', <any>coordinatesLongitude);
        }
        if (countryId !== undefined && countryId !== null) {
            queryParameters = queryParameters.set('countryId', <any>countryId);
        }
        if (id !== undefined && id !== null) {
            queryParameters = queryParameters.set('id', <any>id);
        }
        if (name !== undefined && name !== null) {
            queryParameters = queryParameters.set('name', <any>name);
        }

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<CityDTO>('post',`${this.basePath}/v1/city`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * deleteCity
     * 
     * @param cityId city-id
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteCityUsingDELETE(cityId: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteCityUsingDELETE(cityId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteCityUsingDELETE(cityId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteCityUsingDELETE(cityId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (cityId === null || cityId === undefined) {
            throw new Error('Required parameter cityId was null or undefined when calling deleteCityUsingDELETE.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('delete',`${this.basePath}/v1/city/${encodeURIComponent(String(cityId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * getAllByCountryId
     * 
     * @param countryId country-id
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllByCountryIdUsingGET(countryId: number, observe?: 'body', reportProgress?: boolean): Observable<Array<CityDTO>>;
    public getAllByCountryIdUsingGET(countryId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<CityDTO>>>;
    public getAllByCountryIdUsingGET(countryId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<CityDTO>>>;
    public getAllByCountryIdUsingGET(countryId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (countryId === null || countryId === undefined) {
            throw new Error('Required parameter countryId was null or undefined when calling getAllByCountryIdUsingGET.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<CityDTO>>('get',`${this.basePath}/v1/city/country/${encodeURIComponent(String(countryId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * getAllCitiesByUser
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllCitiesByUserUsingGET(observe?: 'body', reportProgress?: boolean): Observable<Array<CityDTO>>;
    public getAllCitiesByUserUsingGET(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<CityDTO>>>;
    public getAllCitiesByUserUsingGET(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<CityDTO>>>;
    public getAllCitiesByUserUsingGET(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<CityDTO>>('get',`${this.basePath}/v1/city/user`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * getAllCities
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllCitiesUsingGET(observe?: 'body', reportProgress?: boolean): Observable<Array<CityDTO>>;
    public getAllCitiesUsingGET(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<CityDTO>>>;
    public getAllCitiesUsingGET(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<CityDTO>>>;
    public getAllCitiesUsingGET(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<CityDTO>>('get',`${this.basePath}/v1/city`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * getCity
     * 
     * @param cityId city-id
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getCityUsingGET(cityId: number, observe?: 'body', reportProgress?: boolean): Observable<CityDTO>;
    public getCityUsingGET(cityId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<CityDTO>>;
    public getCityUsingGET(cityId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<CityDTO>>;
    public getCityUsingGET(cityId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (cityId === null || cityId === undefined) {
            throw new Error('Required parameter cityId was null or undefined when calling getCityUsingGET.');
        }

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<CityDTO>('get',`${this.basePath}/v1/city/${encodeURIComponent(String(cityId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * updateCity
     * 
     * @param coordinatesLatitude 
     * @param coordinatesLongitude 
     * @param countryId 
     * @param id 
     * @param name 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateCityUsingPUT(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public updateCityUsingPUT(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public updateCityUsingPUT(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public updateCityUsingPUT(coordinatesLatitude?: number, coordinatesLongitude?: number, countryId?: number, id?: number, name?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {






        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (coordinatesLatitude !== undefined && coordinatesLatitude !== null) {
            queryParameters = queryParameters.set('coordinatesLatitude', <any>coordinatesLatitude);
        }
        if (coordinatesLongitude !== undefined && coordinatesLongitude !== null) {
            queryParameters = queryParameters.set('coordinatesLongitude', <any>coordinatesLongitude);
        }
        if (countryId !== undefined && countryId !== null) {
            queryParameters = queryParameters.set('countryId', <any>countryId);
        }
        if (id !== undefined && id !== null) {
            queryParameters = queryParameters.set('id', <any>id);
        }
        if (name !== undefined && name !== null) {
            queryParameters = queryParameters.set('name', <any>name);
        }

        let headers = this.defaultHeaders;

        // authentication (JWT) required
        if (this.configuration.apiKeys["X-Melderegister-Authorization"]) {
            headers = headers.set('X-Melderegister-Authorization', this.configuration.apiKeys["X-Melderegister-Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('put',`${this.basePath}/v1/city`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
