#language: pt
#encoding: utf-8

Funcionalidade: Preencher todos os campos dentro de Automobile Insurance
Cenário:
	Dado que acesso o site 'sampleapp.tricentis.com/101/app.php' na tela vehicle data
	E preencho todos os campos de forma correta e clico em next
	E preencho todos os campos de enter insurant data e clico em next
	E preencho todos os campos de enter product data e clico em next
	E seleciono o Ultimate e clico em next
	E preencho todos os campos de send quote
	Então recebo a mensagem Sending e-mail success