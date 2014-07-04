var app = angular.module("geektic", [ 'ngRoute' ]);

app.controller('MainCtrl', function($scope, $http) {
	$http.get('/api/afficheGeeks').success(function(data) {
		$scope.geeks = data;
	});
});
app.controller('InfoCtrl', function($scope, $http) {
	
});
app.controller('RechercheCtrl', function($scope, $http) {
	$http.get('/api/afficheSexe').success(function(data) {
		$scope.sexes = data;
	});
	$http.get('/api/afficheCentreInteret').success(function(data) {
		$scope.centreinterets = data;
	});
	$scope.rechercher = function()
	{
		$http.get('/api/afficheGeeksCritere?critere='+$scope.interet.idInteret+'&sexe='+$scope.sexe.idSexeGeek).success(function(data) {
			$scope.geeks = data;
			$scope.geeksFound = data.length>0;
		});
	};
});
app.config(function($routeProvider) {
	$routeProvider.when('/Main', {
		templateUrl : 'views/main.html',
		controller : 'MainCtrl'
	})
	$routeProvider.when('/Info', {
		templateUrl : 'views/Infodetail.html',
		controller : 'InfoCtrl'
	})
	$routeProvider.when('/Recherche', {
		templateUrl : 'views/recherche.html',
		controller : 'RechercheCtrl'
	}).otherwise('/');
});