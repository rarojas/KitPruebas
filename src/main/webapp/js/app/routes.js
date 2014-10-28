var Routes = ['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/NuevaPrueba', {
                    templateUrl: '/KitPruebas/templates/Ensamble/Nueva.html',
                    controller: 'EnsambleController'
                }).
                when('/Pruebas', {
                    templateUrl: '/KitPruebas/templates/Ensamble/Pruebas.html',
                    controller: 'PruebasCtrl'
                }).
                when('/Pruebas/:PruebaID', {
                    templateUrl: '/KitPruebas/templates/Ensamble/Prueba.html',
                    controller: 'PruebaCtrl'
                }).
                when('/PruebaSinCarga/:EnsambleID', {
                    templateUrl: '/KitPruebas/templates/PruebaSinCarga.html',
                    controller: 'PruebaSinCargaController'
                }).
                when('/PruebaSinCargaView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitPruebas/templates/PruebaSinCargaView.html',
                    controller: 'PruebaSinCargaCtrl'
                }).
                when('/PruebaConCargaView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitPruebas/templates/PruebaConCargaView.html',
                    controller: 'PruebaSinCargaCtrl'
                }).
                when('/PruebaConCarga/:EnsambleID', {
                    templateUrl: '/KitPruebas/templates/PruebaConCarga.html',
                    controller: 'PruebaConCargaController'
                }).
                when('/PruebaConCargaSubita/:EnsambleID', {
                    templateUrl: '/KitPruebas/templates/PruebaConCargaSubita.html',
                    controller: 'PruebaConCargaSubitaCtrl'
                }).
                when('/Motores', {
                    templateUrl: '/KitPruebas/templates/Motores/Index.html',
                    controller: 'MotoresCtrl'
                }).
                when('/Motores/Edit', {
                    templateUrl: '/KitPruebas/templates/Motores/Edit.html',
                    controller: 'MotoresSaveCtrl'
                }).
                when('/Motores/Create', {
                    templateUrl: '/KitPruebas/templates/Motores/Create.html',
                    controller: 'MotoresSaveCtrl'
                }).
                when('/PruebaControl/:EnsambleID', {
                    templateUrl: '/KitPruebas/templates/PruebaControl.html',
                    controller: 'PruebaControlCtrl'
                }).
                when('/PruebaControlView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitPruebas/templates/PruebaControlView.html',
                    controller: 'PruebaControlViewCtrl'
                }).
                when('/Usuarios', {
                    templateUrl: '/KitPruebas/templates/Usuarios/Index.html',
                    controller: 'UsuariosCtrl'
                }).
                when('/Usuarios/Edit/:id', {
                    templateUrl: '/KitPruebas/templates/Usuarios/Edit.html',
                    controller: 'UsuariosSaveCtrl'
                }).
                when('/Usuarios/Create', {
                    templateUrl: '/KitPruebas/templates/Usuarios/Create.html',
                    controller: 'UsuariosSaveCtrl'
                })
                .when('/Clientes', {
                    templateUrl: '/KitPruebas/templates/Clientes/Index.html',
                    controller: 'ClientesCtrl'
                }).
                when('/Clientes/Edit/:id', {
                    templateUrl: '/KitPruebas/templates/Clientes/Edit.html',
                    controller: 'ClientesSaveCtrl'
                }).
                when('/Clientes/Create', {
                    templateUrl: '/KitPruebas/templates/Clientes/Create.html',
                    controller: 'ClientesSaveCtrl'
                })
                .when('/KitsPruebas', {
                    templateUrl: '/KitPruebas/templates/Kits/Index.html',
                    controller: 'KitsPruebasCtrl'
                }).
                when('/KitsPruebas/Edit/:id', {
                    templateUrl: '/KitPruebas/templates/Kits/Edit.html',
                    controller: 'KitsPruebasSaveCtrl'
                }).
                when('/KitsPruebas/Create', {
                    templateUrl: '/KitPruebas/templates/Ubicaciones/Create.html',
                    controller: 'KitsPruebasSaveCtrl'
                })
                .when('/Ubicaciones', {
                    templateUrl: '/KitPruebas/templates/Ubicaciones/Index.html',
                    controller: 'UbicacionesCtrl'
                }).
                when('/Ubicaciones/Edit/:id', {
                    templateUrl: '/KitPruebas/templates/Ubicaciones/Edit.html',
                    controller: 'UbicacionesSaveCtrl'
                }).
                when('/Ubicaciones/Create', {
                    templateUrl: '/KitPruebas/templates/Ubicaciones/Create.html',
                    controller: 'UbicacionesSaveCtrl'
                })
                .otherwise({
                    redirectTo: '/'
                });
    }];
app.config(Routes);
