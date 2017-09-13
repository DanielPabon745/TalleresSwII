$(document).ready(function () {
    calcularIframe();
});
$(window).resize(function() {
    calcularIframe();
});

angular.module('datepickerBasicUsage',
    ['ngMaterial', 'ngMessages']).controller('AppCtrl', function($scope) {
  $scope.myDate = new Date();
  $scope.minDate = new Date(
      $scope.myDate.getFullYear(),
      $scope.myDate.getMonth() - 2,
      $scope.myDate.getDate());
  $scope.maxDate = new Date(
      $scope.myDate.getFullYear(),
      $scope.myDate.getMonth() + 2,
      $scope.myDate.getDate());
  $scope.onlyWeekendsPredicate = function(date) {
    var day = date.getDay();
    return day === 0 || day === 6;
  };
});

function calcularIframe(){
    var width=$(window).width()-10;
    var height=$(window).height()-$('.content-header').height()-$('.content-footer').height()-25;
    $('#iframeContenido').width(width);
    $('#iframeContenido').height(height);
}

function accionMenu(url){
    $('#iframeContenido').attr('src',url);
}

