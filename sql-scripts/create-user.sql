CREATE USER 'amy'@'localhost' IDENTIFIED BY 'amy';

GRANT ALL PRIVILEGES ON * . * TO 'amy'@'localhost';

ALTER USER 'amy'@'localhost' IDENTIFIED WITH mysql_native_password BY 'amy';