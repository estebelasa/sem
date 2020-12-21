Para poder probar la aplicación:
1.- ejecutar comando -> mvn clean package
2.- ejecutar comando -> mvn
3.- Desde postman o aplicación similar ejecutar:
    petición post
        url: localhost:8080/api/getSemList
        body: Una lista de numeros. Ejemplo: [4,5,3,8]
