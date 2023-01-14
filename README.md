# ¿Cómo hacer un CRUD básico en SpringBoot utilizando MongoDB Atlas?

Pasos:

1-Primero crear una cuenta Mongo Atlas en https://www.mongodb.com/cloud/atlas/register .

2-Luego de creada la cuenta completar los datos que se piden a continuación tales como: organización, nombre del proyecto, lenguaje preferido y dar click en el botón Continuar.

3-Luego ir a Crear cluster y dejar por defecto la región y el proveedor.

![2023-01-14_19h06_10](https://user-images.githubusercontent.com/72228855/212499131-e510c3bf-1888-4c15-9178-d78076c148df.png)



![2023-01-14_18h41_33](https://user-images.githubusercontent.com/72228855/212498848-9a5c4c56-a537-4e01-9c1d-837c313fddce.png)


4-Se puede dar un nombre al cluster o dejar el nombre por defecto que es Cluster 0 

5-En el momento que se crea el cluster, aparece en pantalla el siguiente mensaje: Your cluster is being created. New clusters take 1-3 minutes to provision

6-Luego nos pide que agreguemos un usuario para la base de datos y allí nos solicita nombre de usuario y contraseña.

![2023-01-14_19h31_57](https://user-images.githubusercontent.com/72228855/212500035-0f25acfc-90c3-4b35-8275-f84cb9f0363c.png)


7-Continuando con los ajustes tenemos que agregar la dirección IP a través del botón Añadir dirección IP

![2023-01-14_19h37_15](https://user-images.githubusercontent.com/72228855/212500207-66c88903-158a-49e7-b53f-a0175dd686ce.png)


8-Una vez que ya tenemos creado el cluster vamos a entrar en Connect

![2023-01-14_18h53_01](https://user-images.githubusercontent.com/72228855/212498833-71ef6508-060c-445f-9bc8-54503b50b73b.png)

9- Aquí es donde vamos a elegir la opción que se muestra señalada en la imagen

![2023-01-14_18h55_15](https://user-images.githubusercontent.com/72228855/212498930-58fb19f9-13c9-4cf6-86fb-c72969ea5044.png)

10- Finalizado se debe poder ver la URI de las siguiente forma:

![2023-01-14_19h24_12](https://user-images.githubusercontent.com/72228855/212499788-6eb548b4-7ebb-4894-bc1d-193c1f2ef8cf.png)

  
11-Esta línea de código es la que se va a copiar y pegar en el archivo application.properties del proyecto en SpringBoot y nos va a permitir poder conectarnos a la BD.
  
 ![2023-01-14_19h12_30](https://user-images.githubusercontent.com/72228855/212499625-4d0cc8ff-b4f0-4723-9f2f-d03d002eb1e1.png)
 
 
 12-Para crear la base de datos desde Mongo Atlas de forma manual voy a All Clusters y luego a Collections como se señala en la imagen:
 
 ![2023-01-14_19h43_49](https://user-images.githubusercontent.com/72228855/212500422-d844e7fd-d16d-43e8-8dfb-38b65d0f885c.png)


14- Ir al botón create database y luego completar lo que indica el formulario

![2023-01-14_19h59_51](https://user-images.githubusercontent.com/72228855/212500864-0cbfe484-dd70-4bb9-8e4b-faaf779c1ad8.png)

  
15-Una vez que terminamos con los ajustes de MongoDB realizamos todo el CRUD en SpringBoot y una vez finalizado pasamos a probar con Postman:












