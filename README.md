**testeNTC

Teste técnico NTConsult.


** O geckodriver deverá estar:

* Configurado em uma pasta de sua preferência.
* Parametrizado no path das variáveis de ambiente.


**Configurar o pom.xml do projeto com as dependecias - ver pom.xml na branch main desse projeto:

* groupId: org.seleniumhq.selenium
* artifactId: selenium-java
* version: 3.4.0


**O Maven deverá:

* Estar instalado.
* Configurado nas variáveis de ambiente
* Copiar a parametrização do pom.properties do respositório - branch main - desse projeto
* Copiar a parametrização do pom.xml do respositório - branch main - desse projeto


**Foi utilizado o editor Eclipse Oxigen - nele configurar:

* Maven
* Selenium
* Git


**Para executar os testes- utilizar:

* Classe SuiteTestes: elenca as classes que são utilizadas na execução de testes.
* Classe TesteNTConsult: possui 2 cenários de testes organizados de forma improvisada - não está no formato de trabalho com objetos.
* Classe DSLNTC: tem o intuito de concentrar código repetido, criando um padrão de codificação, será chamada a partir da TesteNTConsult.
* Classe SimulaInvestimentoPage: tem o intuito de ser a classe de pageobjects, será chamada a partir da TesteNTConsult.
* Foram iniciadas, mas não finalizadas as classes: 
    - TestesUI: tinha o intuito de tratar a entrada de dados - datapool
    - TestesRegras: tinha o intuito de centralizar os testes de aceitação
    - Screenshot: tinha o intuito de gerar evidências ao final da execução de testes


Qualquer dúvida, basta entrar em contato.
