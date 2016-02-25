/**
 * ngSurveys - main application script file
 */

(function() {
	'use strict';

	angular
		.module('ngSurveys', ['ui.router', 'ngAnimate', 'common-elements', 'home', 'surveys', 'surveyResponses'])

		//	UI Routing
		.config(function ($urlRouterProvider, $stateProvider){
			$urlRouterProvider.otherwise('/home');
			$stateProvider
				.state('home', {
					url: '/home',
					templateUrl: 'views/home.html',
					controller: 'HomeController'
				})
				.state('surveys', {
					url: '/surveys',
					templateUrl: 'views/surveyList.html',
					controller: 'SurveyController'
				})
				.state('responseInfo', {
					url: '/response/{id:[0-9]{1,4}}',
					templateUrl: 'views/surveyResponse.html',
					controller: 'SurveyResponseController'
				});	
		});
})();