# ¿Cómo hacer un CRUD básico en SpringBoot utilizando MongoDB Atlas?

Pasos:

1-Primero crear una cuenta Mongo Atlas en https://www.mongodb.com/cloud/atlas/register .

2-Luego de creada la cuenta completar los datos que se piden a continuación tales como: organización, nombre del proyecto, lenguaje preferido y dar click en el botón Continuar.

3-Luego ir a Crear cluster y dejar por defecto la región y el proveedor.

![2023-01-14_18h41_33](https://user-images.githubusercontent.com/72228855/212498848-9a5c4c56-a537-4e01-9c1d-837c313fddce.png)


4-Se puede dar un nombre al cluster o dejar el nombre por defecto que es Cluster 0 

5-En el momento que se crea el cluster, aparece en pantalla el siguiente mensaje: Your cluster is being created. New clusters take 1-3 minutes to provision

6-Luego nos pide que agreguemos un usuario para la base de datos y allí nos solicita nombre de usuario y contraseña.

7-Continuando con los ajustes tenemos que agregar la dirección IP a través del botón Añadir dirección IP 

8-Una vez que ya tenemos creado el cluster vamos a entrar en Connect

![2023-01-14_18h53_01](https://user-images.githubusercontent.com/72228855/212498833-71ef6508-060c-445f-9bc8-54503b50b73b.png)

9- Aquí es donde vamos a elegir la opción que se muestra señalada en la imagen

![2023-01-14_18h55_15](https://user-images.githubusercontent.com/72228855/212498930-58fb19f9-13c9-4cf6-86fb-c72969ea5044.png)

10- Finalizado se debe poder ver la URI de las siguiente forma:

mongodb+srv://<username>:<password>@<cluster-name>.mongodb.net/<db-name>?retryWrites=true&w=majority.
  
11-Esta línea de código es la que se va a copiar y pegar en el archivo application.properties del proyecto en SpringBoot  y los va a permitir poder conectarnos a la BD.








