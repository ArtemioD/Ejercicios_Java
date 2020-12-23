import java.util.Scanner;

public class Ejercicios {
    private static Scanner entrada = new Scanner(System.in);
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.print("Ingerese el numero de ejercicio: ");
            int ejercicio = entrada.nextInt();
            System.out.println(ANSI_BLUE + "\n******** Ejercicio " + ejercicio + " *******" + RESET);

            switch (ejercicio) {
                case 1:
                    ejercicio_01(); break;
                case 2:
                    ejercicio_02(); break;
                case 3:
                    ejercicio_03(); break;
                case 4:
                    ejercicio_04(); break;
                case 5:
                    ejercicio_05(); break;
                case 6:
                    ejercicio_06(); break;
                case 7:
                    ejercicio_07(); break;
                case 8:
                    ejercicio_08(); break;
                case 9:
                    ejercicio_09(); break;
                case 10:
                    ejercicio_10(); break;
                case 11:
                    ejercicio_11(); break;
                case 12:
                    ejercicio_12(); break;
                case 13:
                    ejercicio_13(); break;
                case 14:
                    ejercicio_14(); break;
                case 15:
                    ejercicio_15(); break;
                case 16:
                    ejercicio_16(); break;
                case 17:
                    ejercicio_17(); break;
                case 18:
                    ejercicio_18(); break;
                case 19:
                    ejercicio_19(); break;
                case 20:
                    ejercicio_20(); break;
                case 21:
                    ejercicio_21(); break;
                case 22:
                    ejercicio_22(); break;
                case 23:
                    ejercicio_23(); break;
                case 24:
                    ejercicio_24(); break;
                case 25:
                    ejercicio_25(); break;
                case 26:
                    ejercicio_26(); break;
                case 27:
                    ejercicio_27(); break;
                case 28:
                    ejercicio_28(); break;
                case 29:
                    ejercicio_29(); break;
                case 30:
                    ejercicio_30(); break;
            }
            System.out.println(ANSI_BLUE + "************ Fin ************\n" + RESET);
        }
    }

    private static void ejercicio_30() {
        //Realizar un programa que divida dos numeros que introduzca el usuario.
        //Si el segundo numero es cero, se le debera avisar y volver a pedir tantas
        //veces como sea necesario, hasta que introduzca un numero distinto de
        //cero, momento en que se calculara y mostrara el resultado de la division.
        double num1, num2;
        boolean bandera;
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        do {
            System.out.println("Ingrese otro numero");
            num2 = entrada.nextInt();
            if (num2 == 0) {
                bandera = true;
                System.out.println("No se puede dividir por 0 (cero)");
            } else {
                bandera = false;
            }
        } while (bandera);
        System.out.println(num1 / num2);
    }

    private static void ejercicio_29() {
        //Hacer un programa que permita calcular la suma de pares de numeros.
        //Pedira dos numeros al usuario y mostrara su suma, volviendo a repetir
        //hasta que ambos numeros introducidos sean 0.
        int num1, num2;
        do {
            System.out.println("Ingrese 2 numeros para sumar");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("Fin");
            } else {
                System.out.println("La suma es: " + (num1 + num2));
            }
        } while (!(num1 == 0 && num2 == 0));
    }

    private static void ejercicio_28() {
        //Crear un programa que pida al usuario un usuario y una contrasena.
        //Debera repetirse hasta que el usuario sea "admin" y la contrasena sea
        //"1234".
        String usuaruo; int contr;
        do {
            System.out.println("Ingrese usuario");
            usuaruo = entrada.next();
            System.out.println("Ingrese la contrasena");
            contr = entrada.nextInt();
            if (!(usuaruo.equals("admin") && contr == 1234)) {
                System.out.println("Error de acceso:\nNombre de usuario o contrasena incorrecta");
            }
        } while (!(usuaruo.equals("admin") && contr == 1234));
    }

    private static void ejercicio_27() {
        //Desarrollar un algoritmo que permita al usuario ingresar 12 valores, de a
        //uno por vez, pertenecientes a sus sueldos mensuales durante un ano. La
        //computadora muestra su sueldo anual. Si durante la carga de los sueldos
        //mensuales se detecta un valor negativo, esto indica que aun no se ha
        //cobrado el mes en curso, por lo tanto, deben dejar de ingresarse datos y
        //la computadora debe mostrar la sumatoria de sueldos que se llevan
        //cobrados hasta dicho mes.
        int sueldo, totalSueldo = 0;
        for (int i = 12; i > 0; i--) {
            System.out.println("Ingrese sus sueldos");
            sueldo = entrada.nextInt();
            if (sueldo < 0) {
                i = 0;
            } else {
                totalSueldo += sueldo;
            }
        }
        System.out.println("La sumatoria de sueldos es: " + totalSueldo);
    }

    private static void ejercicio_26() {
        //Realizar un programa que lea numeros enteros hasta teclear 0, y nos
        //muestre el maximo, el minimo (sin considerar el 0) y la media (promedio)
        //de todos ellos. Piensa como debemos inicializar las variables. Utilice la
        //instruccion while.
        int max = 0, min = 0, i = 0, num = 1;
        float med = 0;
        boolean bandera = true;
        while (num != 0) {
            System.out.println("Ingrese numeros enteros / 0 (cero) para terminar");
            num = entrada.nextInt();
            if (num !=0) {
                med += num; i++;
                if (bandera) {
                    max = num;
                    min = num;
                    bandera = false;
                } else if (max < num) {
                    max = num;
                } else if (min > num) {
                    min = num;
                }
            }
        }
        System.out.println("El maximo es: " + max + "\nEl minemo es: " + min + "\nEl promedio es: " + (med / i));
    }

    private static void ejercicio_25() {
        //Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que
        //nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos los
        //3 intentos nos mostrara un mensaje indicandonos que hemos agotado
        //esos 3 intentos. Si acertamos la clave, saldremos directamente del
        //programa. Utilice la instruccion while.
        String  clave = "eurika";
        Scanner entrada = new Scanner(System.in);
        int i = 3, intent = 0;
        while (i > 0) {
            System.out.println("Ingrese la clave");
            clave = entrada.next();
            intent += 1;
            if (clave.equals("eurika")) {
                i = 0;
            } else {
                System.out.println("Error!\nLa clave incorrecta!");
            }
            i--;
        } if ((intent == 3) && (!clave.equals("eurika"))) {
            System.out.println("Se agotaron los 3 intentos");
        }
    }

    private static void ejercicio_24() {
        //Ingresar por teclado los pesos (en Kg)
        //de los alumnos de un curso. La carga finaliza cuando el peso ingresado
        //es igual a 0. Se pide averiguar cual es el promedio de los pesos y
        //mostrarlo con 2 decimales Utilice la instruccion do-while.
        double peso, total = 0;
        int i = 0;
        do {
            System.out.println("Ingrese ls pesos de ls alumnos");
            peso = entrada.nextFloat();
            if (peso != 0) {
                total += peso; i++;
            }
        } while (peso != 0);
        System.out.println("El promedio es: " + (total / i) + " Kg");
    }

    private static void ejercicio_23() {
        //Ingresar por teclado numeros enteros, la carga finaliza cuando se ingresa
        //un cero. Se pide calcular y mostrar el numero de valor maximo y el minimo
        //(utilice do-while).
        int num, max = 0, min = 0;
        boolean bandera = true;
        do {
            System.out.println("Ingrese los numeros enteros / 0 (cero) para terminar");
            num = entrada.nextInt();
            if (num != 0) {
                if(bandera == true) {
                    max = num;
                    min = num;
                    bandera = false;
                } else if (max < num) {
                    max = num;
                } else if (min > num) {
                    min = num;
                }
            }
        } while (num != 0);
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
    }

    private static void ejercicio_22() {
    /*
        Crear un programa que muestre en pantalla una escalera de asteriscos.
        La cantidad de filas de la escalera debera ser una constante. Utilice la
        instruccion while.
        Ejemplo:
        Cantidad de filas=5:
        *
        **
        ***
        ****
        *****
    */
        int i = 5;
        int j = i;
        System.out.println("Cantidad de filas = 5");
        while ( i > 0 ) {
            while ( j - i > 0) {
                System.out.print("*");
                j--;
            }
            j = 5;
            System.out.println("*");
            i--;
        }
    }

    private static void ejercicio_21() {
        //Desarrollar un algoritmo que permita ingresar un numero natural. La
        //computadora muestra el factorial del numero. Ejemplo: Se ingresa 5, la
        //computadora muestra: 120.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero natural");
        int num = entrada.nextInt();
        int a = 1;
        for (int i = 1; i  < num + 1; i++) {
            a *= i;
        }
        System.out.println(a);
    }

    private static void ejercicio_20() {
        //Desarrollar un algoritmo que permita ingresar un numero N. Acto seguido,
        //permitir ingresar N numeros enteros, correspondientes a las notas de un
        //curso. La computadora muestra el promedio de las notas ingresadas.
        //Ejemplo: Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75.
        double cont = 0;
        System.out.println("Ingrese cantidad de notas");
        int num = entrada.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la nota");
            int nota = entrada.nextInt();
            cont += nota;
        }
        System.out.println(cont / num);
    }

    private static void ejercicio_19() {
    /*
        Crear un programa que muestre en pantalla una escalera inversa de
        asteriscos. La cantidad de filas de la escalera se ingresa por teclado.
        Utilice la instruccion for.
        Ejemplo:
        Cantidad de filas=5:
        *****
        ****
        ***
        **
        *
     */
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese la cantidad de filas");
        num = entrada.nextInt();
        System.out.println("Cantidad de filas = " + num);
        for (int i = num; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    private static void ejercicio_18() {
        //Ingresar por teclado 1 numero entero y
        //mostrar por pantalla su tabla de multiplicar entre 1 y 10 (usando la
        //instruccion while).
        int num;
        System.out.println("Ingrese un numero entero");
        num = entrada.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }

    private static void ejercicio_17() {
        //Ingresar por teclado 1 numero entero y mostrar por pantalla su tabla de
        //multiplicar entre 1 y 10 (usando la instruccion for).
        int num;
        System.out.println("Ingrese un numero enero");
        num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    private static void ejercicio_16() {
        //Codifique un programa en Java que permita el ingreso de un numero, y a
        //partir de ello, mostrar los diez numeros siguientes al mismo. Resuelva el
        //ejercicio con las siguientes estructuras iterativas: for, while y do-while.
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

    // ******************* for *************************
        for (int i = numero + 1; i <= numero + 10; i++) {
            System.out.println(i);
        }

    // *********** while *******************************
        /*int i = numero + 10; // para while y do-while
        while (i > numero) {
            numero++;
            System.out.println(numero);
        }*/

    //********* do-while *******************************
        /*do {
            numero++;
            System.out.println(numero);
        } while (i - 1 >= numero);
         */
    }

    private static void ejercicio_15() {
        //Desarrollar un algoritmo que simule una calculadora basica que realice
        //operaciones de suma, resta, multiplicacion y division. Se deben recibir
        //como entrada dos numeros reales y un operador, que puede ser '+', '-', '*'
        //o '/'. La salida del programa debe ser el resultado de la operacion. Ayuda:
        //Prever que se puede llegar a intentar hacer una division por cero
        double num1, num2;
        String operador;
        System.out.println("Ingrese primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el operador");
        operador = entrada.next();
        System.out.println("Ingrese segundo numero");
        num2 = entrada.nextInt();
        while (num2 == 0 && operador.equals("/")) {
            System.out.println("Error ! No se puede dividir por cero!\nIngrese segundo numero");
            num2 = entrada.nextInt();
        }
        if (operador.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operador.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operador.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operador.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    private static void ejercicio_14() {
        //Desarrollar un algoritmo que permita el ingreso de una letra,
        //correspondiente a un digito del sistema de numeracion romano. La
        //computadora muestra su correspondiente valor decimal. Si se ingresa una
        //letra inexistente, computadora informa que no existe tal digito. Ejemplo:
        //Se ingresa 'D', la computadora muestra: 500.
        System.out.println("Ingrese una letra del sistema de numeracion romano..");
        String caracter = entrada.next();
        String romano = "";
        switch (caracter) {
            case "I":
                romano = "1"; break;
            case "V":
                romano = "5"; break;
            case "X":
                romano = "10"; break;
            case "L":
                romano = "50"; break;
            case "C":
                romano = "100"; break;
            case "D":
                romano = "500"; break;
            case "M":
                romano = "1000"; break;
            default:
                romano = "no existe tal digito";
        }
        System.out.println(romano);
    }

    private static void ejercicio_13() {
        //Desarrollar un algoritmo que pida al usuario un numero entre 1 y 12. La
        //computadora muestra por pantalla el mes al que pertenece tal numero. Si
        //se ingresa un numero fuera de rango, mostrar un error. Ejemplo: se
        //ingresa un 4, la computadora muestra: “ABRIL” (utilice switch-case).
        System.out.println("Ingrese un numero entre 1 y 12");
        int numero = entrada.nextInt();
        String mes = "";
        switch (numero) {
            case 1:
                mes = "Enero"; break;
            case 2:
                mes = "Febrero"; break;
            case 3:
                mes = "Marzo"; break;
            case 4:
                mes = "Abril"; break;
            case 5:
                mes = "Mayo"; break;
            case 6:
                mes = "Junio"; break;
            case 7:
                mes = "Julio"; break;
            case 8:
                mes = "Agosto"; break;
            case 9:
                mes = "Septiembre"; break;
            case 10:
                mes = "Octubre"; break;
            case 11:
                mes = "Noviembre"; break;
            case 12:
                mes = "Diciembre"; break;
            default:
                mes = "Error";
        }
        System.out.println(mes);
    }

    private static void ejercicio_12() {
        //Desarrollar un algoritmo que permita ingresar un caracter. La
        //computadora indica si es o no una letra vocal (utilice switch-case).
        String letra = "";
        System.out.println("Ingrese una letra...");
        letra = entrada.next().toLowerCase();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonante.");
        }
    }

    private static void ejercicio_11() {
        //Desarrollar un algoritmo que permita ingresar los lados A, B y C de un
        //triangulo. La computadora informa si el triangulo es o no valido. En caso
        //afirmativo, ademas informa si es equilatero, isosceles o escaleno. Ayuda:
        //segun el teorema de desigualdad triangular, un triangulo es valido si se
        //cumple que cada uno de los lados no puede ser mas largo que la suma
        //de los otros dos. Un triangulo equilatero es aquel que tiene sus tres lados
        //iguales. Un triangulo isosceles es aquel que tiene dos de sus lados
        //iguales. Un triangulo escaleno es aquel que tiene sus tres lados
        //desiguales. Ejemplo: Se ingresa un 3, 4 y 5, la computadora muestra:
        //“Es un triangulo escaleno”
        System.out.println("Ingrese los lados A, B y C de un triangulo.");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c =entrada.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangulo es valido");
            if (a == b && b == c) {
                System.out.println("Es un triangulo equilatero");
            } else if (a == b || b == c || c == a) {
                System.out.println("Es un triangulo isosceles ");
            } else {
                System.out.println("Es un triangulo escaleno");
            }
        } else {
            System.out.println("Triangulo no es valido");
        }
    }

    private static void ejercicio_10() {
        //Desarrollar un algoritmo que, dados dos numeros enteros entre 0 y 100,
        //la computadora indique si el mayor es divisible por el menor. Ejemplo:
        //Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se debera validar
        //que los numeros ingresados se encuentren entre 0 y 100.
        int num1; int num2;
        do {
            System.out.println("Ingrese dos numeros enteros entre 0 y 100");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
        } while (!(((num1 > 0) && (num1 < 100)) && ((num2 > 0) && (num2 < 100))));
        if (num1>num2) {
            if (num1 % num2 == 0) {
                System.out.println(num1+" es divisible por "+num2);
            }
            else
            {
                System.out.println("No es divisible");
            }
        } else if (num2>num1) {
            if (num2 % num1 == 0) {
                System.out.println(num2 + " es divisible por " + num1);
            } else {
                System.out.println("No es divisible");
            }
        }
    }

    private static void ejercicio_09() {
        //Desarrollar un algoritmo que, dada la
        //cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
        //computadora indique si alcanzan las sillas, en caso contrario, indique
        //cuantas faltan para que todoo el alumno tenga asiento
        System.out.println("Ingrese la cantidad de alumnos de un curso ");
        int alumnos = entrada.nextInt();
        System.out.println("Ingrese la cantidad de sillas disponibles");
        entrada.nextLine();
        int sillas = entrada.nextInt();
        if (alumnos > sillas) {
            System.out.println("Falta " + (alumnos - sillas) + " sillas");
        } else if (sillas >= alumnos) {
            System.out.println("Alcanza sillas para todos");
        }
    }

    private static void ejercicio_08() {
        //Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120
        //anos) y su genero ('F' para mujeres, 'M' para hombres), la computadora
        //indique si esta en edad de jubilarse. Ayuda: Las mujeres se jubilan con 60
        //anos o mas. Los hombres se jubilan con 65 anos o mas. Ejemplo:
        //Ingresa 62 y 'M', debe devolver “No se jubila”.
        int edad;
        do {
            System.out.println("Ingrese su edad...");
            edad = entrada.nextInt();
            if (!(0 < edad && edad < 120)) {
                System.out.println("ERROR !!\nIngresaste edad incorecta.");
            } else {
                entrada.nextLine();
                String genero = "";
                do {
                    System.out.println("Ingrese su genero ('F' para mujeres, 'M' para hombres)");
                    genero = entrada.nextLine();
                    if (genero.equals("f") || genero.equals("F")) {
                        if ((genero.equals("f") || genero.equals("F")) && edad >= 60) {
                            System.out.println("Es edad de jubilarse");
                        } else if ((genero.equals("f") || genero.equals("F")) && edad < 60) {
                            System.out.println("No se jubila");
                        } }
                    else if (genero.equals("m") || genero.equals("M")) {
                        if ((genero.equals("m") || genero.equals("M")) && edad >= 65) {
                            System.out.println("Es edad de jubilarse");
                        } else if ((genero.equals("m") || genero.equals("M")) && edad < 65) {
                            System.out.println("No se jubila");
                        }
                    }else {
                        System.out.println("Ingresaste genero incorecto.");
                    }
                }while ((!(genero.equals("f") || genero.equals("F"))) && (!(genero.equals("m") || genero.equals("M"))));
            }
        }while (!((0 < edad) && (edad < 120)));
    }

    private static void ejercicio_07() {
        //Codifique un programa en Java que permita saber si un numero ingresado
        //    por teclado es par o impar.
        int bandera = 0;
        int num = 1;
        while ( num != bandera) {
            System.out.println("Ingrese un numero / 0 para terminar... ");
            num = entrada.nextInt();
            if(num == 0) {
                System.out.println("Fin" );
            }
            else if (num % 2 == 0) {
                System.out.println("el numero ingersado es par\n");
            }
            else {
                System.out.println("el numero ingresado es impar\n");
            }

        }
    }

    private static void ejercicio_06() {
        //Ingresar por teclado los lados de un triangulo rectangulo (valores enteros)
        //y calcular el perimetro y su superficie. Para la raiz cuadrada de la
        //hipotenusa debera utilizar la clase Math. Ayuda: la superficie es
        //base*altura/2 y el perimetro del triangulo es base+altura+hipotenusa,
        //donde hipotenusa = v(base2 + altura2)
        System.out.println("Ingrese la base de un triangulo rectangulo...");
        int b = entrada.nextInt();
        System.out.println("Ingrese la altura..");
        int c = entrada.nextInt();
        int S = b * c / 2;
        double h = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        int P= (int) (b+c+h);
        System.out.println("El perimetro es: "+ P + ", y superficie: " + S);
    }

    private static void ejercicio_05() {
        //Ingresar por teclado el radio (tipo de dato entero) de un circulo y calcular
        //su perimetro y superficie (definidos como double). Utilice la Clase Math
        //para obtener el valor de PI. Ejemplo: Ingresa 5, debe devolver
        //perimetro = 31,41592654 y superficie = 78,53981634.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circuito...");
        int a = entrada.nextInt();
        double b=(a*2)* Math.PI;
        double c= Math.pow(a,2) *Math.PI;
        System.out.println("El perimetro del citcuito es: "+ b +", y superficie: "+ c);
    }

    private static void ejercicio_04() {
        //Ingresar por teclado el diametro (tipo de dato entero) de un circulo y
        //calcular su perimetro pero solo debera mostrar la parte entera del
        //resultado. Defina el valor de PI como una constante con valor 3,14.
        //Ejemplo: Ingresa 10, debe devolver perimetro = 31. Realice Casting
        //para obtener la parte entera del resultado
        Scanner entrada = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Ingrese el diametro de un circulo...");
        int a = entrada.nextInt();
        int b = (int) (a * pi);
        System.out.println("El perimetro del circulo es: " + b);
    }

    private static void ejercicio_03() {
        //Desarrollar un algoritmo que permita ingresar dos números enteros por
        //teclado. La computadora deberá mostrar su cociente con decimales.
        //Recuerde utilizar Casting para obtener el resultado con los decimales
        //correspondientes.
        System.out.println("Ingrese un numero entero...");
        int a = entrada.nextInt();
        System.out.println("Ingrese otro entero...");
        int b = entrada.nextInt();
        double c = a / b;
        double x = a - (b * c);
        System.out.println(c + "\n" + x);
    }

    private static void ejercicio_02() {
        //Desarrollar un algoritmo que permita ingresar dos números enteros por
        //teclado utilizando un objeto Scanner. La computadora deberá mostrar su
        //cociente entero. El resto se deberá mostrar en otra línea. Ejemplo:
        //Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3.
        System.out.println("Ingrese un numero entero...");
        int a = entrada.nextInt();
        System.out.println("Ingrese otro entero...");
        int b = entrada.nextInt();
        int c = a / b;
        int x = a - (b * c);
        System.out.println(c + "\n" + x);
    }

    private static void ejercicio_01() {
        //Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
        //Calcular e imprimir el valor del perímetro. Ejemplo: Ingresa 25, debe
        //devolver 20
        System.out.println("Ingrese el area de un cuadrado: ");
        int area = entrada.nextInt();
        int perimetro = (int) (Math.sqrt(area) * 4);
        System.out.println("El perimetro es: " + perimetro);
    }
}
