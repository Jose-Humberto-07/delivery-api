CREATE TABLE CLIENTE (
	ID BIGINT NOT NULL AUTO_INCREMENT,
    NOME VARCHAR(60) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    TELEFONE VARCHAR(20) NOT NULL,
    
    primary key(ID)
);