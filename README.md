# java-aplicacao-lembretes_crud
<h2>Aplicação de lembretes a ser persistido em banco de dados relacional com o Framework Hibernate.</h2>

<h3>Implementação</h3>

<p>Nessa aplicação utilizaremos o Framework Hibernate para persistir objetos Java, implementando a especificação JPA. Estaremos utilizando a abordagem Code First para gerar uma tabela na base de dados MySQL à partir do POJO Lembrete e implementar nesta classe as anotações para configuração do mapeamento objeto-relacional(MOR).</p>
	
<p>A documentação JSR 338 é referente à JPA 2.2, portanto a Java Specification Requests (JSR) da Java Community Process (JCP) é relativo a release da JPA.</p>
	
<p>Persistência que abrange:</p>
<ul>
	<li>a API definida no pacote javax.persistence;</li>
	<li>o Java Persistence Query Language (JPQL);</li>
	<li>objeto / metadados relacional.</li>
</ul>
	
<p>Os servidores de aplicação podem ser o GlassFish, Tomcat, WildFLy, entre outros. </p>

<p>O Hibernate é um Framework para mapeamento objeto-relacional escrito na linguagem Java, contendo uma API nativa e é uma implementação da especificação JPA, sendo amplamento utilizado pela comunidade Java.</p>

<p>Será utilizado o Maven (MVN) como ferramenta de gerenciamento e automação de construção (buid) de projetos, para gerenciar dependências através da arquitetura transparente orientada a plugins, para publicar projetos em um servidor web, para automatizar procedimentos legados, entre outros.

<h3>Arquitetura da Aplicação</h3>
<p>Projeto que desenvolve uma aplicação de Lembretes com ação de CRUD persistido em banco de dados.</p>

<p> Serão implementadas 2 classes:</p>
<ul>
	<li>Lembrete como classe POJO (Plain Old Java Objects), que modela a entidade;</li>
	<li>Main como entry point com o método executor main( ).</li>
</ul>

<p> Será implementado o arquivo de configuração do Maven:</p>
<ul>
	<li>pox.xml</li>
</ul>

<p> Será implementado o arquivo de configuração JPA para acesso ao Schema do MySQL:</p>
<ul>
	<li>persistence.xml</li>
</ul>
