Feature: Singup
O cadastro será realizado quando os dados obrigatórios serem inseridos. 

	@Selenium
 	Scenario: Cadastro válido  
 	 	Given Navegador aberto
 		When  Quando a página de cadastro estiver carregada
 		Then  Insira os valores para os campos do formulário
 		And   Verifica se o cadastro foi realizado com sucesso
 		
 	@Selenium
 	Scenario: Cadastro inválido  
 	 	Given Navegador aberto
 		When  Quando a página de cadastro estiver carregada
 		Then  Insira no campo login, um login já existente
 		And   Verifica se a validação foi realizada
