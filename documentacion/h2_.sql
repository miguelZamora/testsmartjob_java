





DROP TABLE IF EXISTS TEST;
CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));
INSERT INTO TEST VALUES(1, 'Hello');
INSERT INTO TEST VALUES(2, 'World');
SELECT * FROM TEST ORDER BY ID;
UPDATE TEST SET NAME='Hi' WHERE ID=1;
DELETE FROM TEST WHERE ID=2;




DROP TABLE IF EXISTS tbl_usuarios;

CREATE TABLE tbl_usuarios( 
   id int not null auto_increment,
   name VARCHAR(50) NOT NULL, 
   email VARCHAR(50) NOT NULL, 
   password VARCHAR(10) NOT NULL, 
   estado BOOLEAN ,
   primary key (id)
);

INSERT INTO tbl_usuarios VALUES('miguelAngel', 'mzmprog@gmail.com', 'LaKey', 0 );

// 0 = false;
 



DROP TABLE IF EXISTS tbl_phones;

CREATE TABLE tbl_phones (
   id int not null auto_increment,
   numbers varchar(15) not null,
   city varchar(50),
   code char(2) ,
   primary key (id),
   foreign key (usuario_id) references tbl_usuarios(id)
);


