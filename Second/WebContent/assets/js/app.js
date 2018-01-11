var app = angular.module('module',["ngRoute","ngStorage","ngCookies"]);

app.directive('navBar',function(){
	return{
		templateUrl:"./ui/shared/navbar.html"
	}
});
