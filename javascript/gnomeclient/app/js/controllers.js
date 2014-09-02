'use strict';

/* Controllers */

angular.module('myApp.controllers', []).
  controller('MyCtrl1',['$scope', 'gnomeFactory', function($scope, gnomeFactory) {
  	$scope.items = gnomeFactory.query()
  }])
  .controller('MyCtrl2', [function() {

  }]);