/**
 * 
 */

sportStore.controller("StoreCtrl", ["$scope, $http", function($scope, $http){
	
	$http.get("http://localhost:7001/AngularPractice/store/stock").success(
			function(resp){
				$scope.theAudits = resp;
			}
	)
}])