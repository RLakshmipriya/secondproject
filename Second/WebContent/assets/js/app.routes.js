app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider.
when('/Blog',{
	templateUrl:'./ui/components/Blog.html',
}).
when('/bloglist',{
	templateUrl:'./ui/components/bloglist.html',
}).
when('/forums',{
	templateUrl:'./ui/components/forums.html',
}).
when('/forumslist',{
	templateUrl:'./ui/components/forumslist.html',
}).
when('/register',{
	templateUrl:'./ui/components/register.html',
}).
when('/dashboard',{
	templateUrl:'./ui/components/dashboard.html',
}).
when('/events',{
	templateUrl:'./ui/components/events.html',
}).
when('/',{
	templateUrl:'./ui/shared/home.html',
}).
when('/profile',{
	templateUrl:'./ui/components/profile.html',
}).
when('/job',{
	templateUrl:'./ui/components/job.html',
})
}]);