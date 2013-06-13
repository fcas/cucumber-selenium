Feature: Login
A autenticação será feita informando no formulário login e senha. 

	@Selenium
 	Scenario: Autenticação administrador  
 	 	Given Navegador aberto
 		When  Quando A pagina home estiver carregada
 		Then Faça o login como administrador
 		And Verifique os menus visiveis para administrador
 		
 	@Selenium
 	Scenario: Autenticação engajador 
 	 	Given Navegador aberto
 		When  Quando A pagina home estiver carregada
 		Then Faça o login como engajador
 		And Verifique os menus visiveis para engajador
 		
 	@Selenium
 	Scenario: Autenticação sem usuário e senha 
 	 	Given Navegador aberto
 		When  Quando A pagina home estiver carregada
 		Then Faça o login sem informar usuario e senha
 		And Verifique os menus visiveis o usuário não autenticado
 		
 	@Selenium
 	Scenario: Autenticação com usuário inválido 
 	 	Given Navegador aberto
 		When  Quando A pagina home estiver carregada
 		Then Faça o login informando usuário inválido
 		And Verifique os menus visiveis o usuário não autenticado
 		
 	@Selenium
 	Scenario: Autenticação com senha incorreta 
 	 	Given Navegador aberto
 		When  Quando A pagina home estiver carregada
 		Then Faça o login informando senha incorreta
 		And Verifique os menus visiveis o usuário não autenticado