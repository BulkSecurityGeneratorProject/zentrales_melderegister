import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree} from '@angular/router';
import {Observable} from 'rxjs';
import {AuthService} from '../services/auth.service';
import {UserAccountApiControllerService} from '../clients/melderegister';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserGuard implements CanActivate {

  constructor(private authService: AuthService,
              private userAccountApiControllerService: UserAccountApiControllerService) {
  }

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    return this.userAccountApiControllerService.getCurrentUserUsingGET().pipe(map((user) => {
      console.log(user);
      return user.authorities.includes('USER');
    }));
  }

}
