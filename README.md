# TestOne


Hey guys,
welcome to project TestOne projetc.

In addition to performing the test on the platform, I ran the tests using Selenium with Java. The tests are running using the Google Chrome browser.
In addition, the project uses PageObject and best practices.
To run in your browser, you will need to download ChromeDrive and point to its directory in the "constants" class.

TrustlyTest/src/main/java/Home

Classes:

Constante:
Possui dados que podem ser alterados ao longo da vida do projeto e que estão alocados em uma classe especifica, para melhor manutenção. Dados de login, diretórios, por exemplo estão alocados neste local.

DSL:
Nesta classe estão métodos bem descritidos que vão facilitar a interação com os métodos do selenium. Com isso troquei métodos genericos, por especificos, para a ação que desejemos executar naquele momento.

LoginPage:
Classe onde está localizado todos os elementos da tela. Centralizando os locators em uma Page, a manutenção do código será muito mais fácil. Isso irá auxiliar também quando utilizamos o mesmo elemento em vários testes.

TestLogin:
Classe principal com as chamadas do teste.

Hope you like it!
