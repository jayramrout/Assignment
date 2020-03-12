1) Download and Install mysql database

How to connection mysql from SQL Developer
https://oracle-base.com/articles/mysql/mysql-connections-in-sql-developer
https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.19


Connecting using Docker
1) Install docker first
2) download the docker mysql image
3) run the mysq container
    docker run --name jayram-mysql -p 3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:latest
4) Connect using sql developer

Setup employee database in mysql
    Follow the below link 
    https://dev.mysql.com/doc/employee/en/employees-installation.html    
