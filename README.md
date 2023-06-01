# desafio-dio-academia-digital
 Desafio da DIO de criar uma API para uma academia com banco de dados

Para rodar o código do repositório é necessário realizar as seguintes etapas:
1 - baixe e  instale o postgres
2 - coloque a sua senha do postgres no src/main/resources/application.yml no campo "password"
3 - rode os comandos abaixo no teu postgres:
psql -U postgres
[insira tua senha]
create database academia;

Após realizar esses passos, o código pode ser executado pelo arquivo "AcademiaDigitalApplication.java"