app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider) {
	$routeProvider.
	when('/user',{
		templateUrl:'./ui/user.html',
		/*controller:HomeController,
		controllerAs:homeCtrl*/
	}).
	when('/',{
		templateUrl:'./ui/main.html',
		/*controller:HomeController,
		controllerAs:homeCtrl*/
	}).
		when('/register',{
		templateUrl:'./ui/register.html',
		controller:'registerController',
		controllerAs:'registerCtrl'
	})
}]);