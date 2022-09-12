# My first crud on spring

It's a simple RPC crud, with some endpoints that can be called by using postman, I'm using H2 as my database, 
in later practices I'll use MySQL or postgress, also I'm using JPA and of course: Spring boot.

It's just for practicing basic concepts, moderate concepts like beans or more advanced topics will be seen
on later repos.

![image](https://user-images.githubusercontent.com/78714792/189730144-28882428-2c5f-401b-b5d8-d53f24c83490.png)

![image](https://user-images.githubusercontent.com/78714792/189730208-6ae5a51f-95f2-4ea9-859f-78da0f0267f2.png)

![image](https://user-images.githubusercontent.com/78714792/189730244-9697b607-901e-47b3-98ae-13a50f6b6215.png)

Whenever you want to play with the small querys, do it by executing this scripts on H2 console so you can 
have preloaded data

![image](https://user-images.githubusercontent.com/78714792/189730621-0e57d83a-5567-4a45-a010-0cc7fd52a3e1.png)


insert into USUARIO VALUES(1,22,'MOISES NAIN');
insert into USUARIO VALUES(2,34,'RAUL GONZALES');

INSERT INTO DIRECCION VALUES(1,'PARAISO','XALAPA','TABASCO',1);
INSERT INTO DIRECCION VALUES(2,'PERALVILLO','CDMX','TEPITO',1);
INSERT INTO DIRECCION VALUES(3,'PERALVILLO','CDMX','TEPITO',2);
