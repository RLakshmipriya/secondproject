app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider.
when('/blog',{
	templateUrl:'./ui/Blog.html',
}).
when('/',{
	templateUrl:'./ui/main.html',
})
}]);