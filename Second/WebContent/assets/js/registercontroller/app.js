var app = angular.module('module',["ngRoute","ngStorage","ngCookies"]);

app.directive('navBar',function(){
	return{
		templateUrl:"./ui/navbar.html"
	}
});
/*app.controller('registerController',["$scope", function($scope){
	this.registerUser=function(){
		alert('Hello World');
	}
}]);*/