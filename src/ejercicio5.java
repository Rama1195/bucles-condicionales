public class ejercicio5 {
    //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
    //Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
    //También habrá que poner un default para cuando el valor de la variable no sea una estación.
    public static void main(String[] args) {
        var estacion = "HOLA";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estación");
        }

    }
}
