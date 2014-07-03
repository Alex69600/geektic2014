<script>
var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
    app.config(function($routeProvider)
			{
				$routeProvider.when('/', 
				{
					templateUrl: 'views/main.html',
					controller: 'MainCtrl'
				})
				$routeProvider.when('/Info',
				{
					templateUrl: 'views/Infodetail.html',
					controller: 'InfoCtrl'
				})
				$routeProvider.when('/Recherche',
				{
					templateUrl: 'views/resultrecherche.html',
					controller: 'RechercheCtrl'
				})
				.otherwise('/');
			}); 
});
</script>