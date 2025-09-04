package co.edu.uniquindio.biblioteca.model;

import  co.edu.uniquindio.biblioteca.model.Biblioteca;
import  co.edu.uniquindio.biblioteca.model.Cliente;
import  co.edu.uniquindio.biblioteca.model.Libro;
import  co.edu.uniquindio.biblioteca.model.Empleado;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();


        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese la opción del menú");
            switch (opcion) {
                case 1:
                    String resultado = crearCliente(biblioteca);
                    System.out.println("Información del cliente: "+resultado);
                    break;
                case 2:
                    Cliente cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("Ingrese la edad del cliente a validar");
                    String resultadoValidacion = validarEdadCliente(cliente, edad);
                    System.out.println("Resultado de la operación: "+resultadoValidacion);
                    break;
                case 3:
                    resultado = crearLibro(biblioteca);
                    System.out.println("Información del libro: "+resultado);
                    break;
                case 4:
                    resultado = crearEmpleado(biblioteca);
                    System.out.println("Información del libro: "+resultado);
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }


    private static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente != null){
            if(cliente.getEdad() == edad) {
                return "La edad del cliente es valida";
            }else{
                return "La edad del cliente no es valida";
            }
        }else{
            return "No se puede validar, el cliente no existe";
        }
    }

    private static Cliente obtenerCliente(Biblioteca biblioteca) {
        String idCliente = leerStringConsola("Ingrese el id del cliente a buscar");
        Cliente clienteEncontrado = null;
        for(int i=0; i<biblioteca.getListaClientes().size();i++){
            if(biblioteca.getListaClientes().get(i).getDocumento().equals(idCliente)){
                clienteEncontrado = biblioteca.getListaClientes().get(i);
                break;
            }
        }

        return clienteEncontrado;
    }

    private static Biblioteca inicializarDatos() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellidos("Rodriguez");
        cliente.setEdad(30);
        cliente.setDocumento("1094");
        cliente.setTelefono("87676768");
        biblioteca.getListaClientes().add(cliente);


        Libro libro = new Libro();
        libro.setNombre("El principito");
        libro.setGenero("Infantil");
        libro.setAutor("Sant-Exupéry");
        libro.setEditorial("1094");
        libro.setPaginas(321);
        biblioteca.getListaLibros().add(libro);


        Empleado empleado = new Empleado();
        empleado.setNombre("El principito");
        empleado.setId("Infantil");
        empleado.setEmail("Sant-Exupéry");
        empleado.setCargo("1094");
        empleado.setSalario("321000");
        biblioteca.getListaEmpleados().add(empleado);

        return biblioteca;
    }

    public static String crearCliente(Biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del cliente:");
        String apellidos = leerStringConsola("Ingrese los apellidos del cliente:");
        int edad = leerEntero( "Ingrese la edad del cliente:");
        String documento = leerStringConsola( "Ingrese el id del cliente:");
        String telefono = leerStringConsola("Ingrese el telefono del cliente:");
        Cliente cliente = new Cliente(nombre,apellidos, edad, documento, telefono);
        cliente.setNombre(nombre);
        cliente.setApellidos(apellidos);
        cliente.setEdad(edad);
        cliente.setDocumento(documento);
        cliente.setTelefono(telefono);
        biblioteca.getListaClientes().add(cliente);
        return cliente.toString();
    }


    public static String crearLibro(Biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del libro:");
        String genero = leerStringConsola( "Ingrese el genero del libro:");
        String autor = leerStringConsola("Ingrese el autor del libro:");
        String editorial = leerStringConsola("Ingrese el editorial del libro:");
        int paginas = leerEntero("Ingrese la paginas del libro:");
        Libro libro = new Libro (nombre, genero, autor, editorial, paginas);
        libro.setNombre(nombre);
        libro.setGenero(genero);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setPaginas(paginas);
        biblioteca.getListaLibros().add(libro);
        return libro.toString();
    }

    public static void validarNombreLibro() {
        String nombre = leerStringConsola("Ingrese el nombre del libro:");

        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println("El nombre del libro es válido: " + nombre);
        } else {
            System.out.println("El nombre del libro no puede estar vacío.");
        }
    }

    public static String crearEmpleado(Biblioteca biblioteca) {
        String nombre = leerStringConsola("Ingrese el nombre del empleado:");
        String id = leerStringConsola("Ingrese el id del empleado:");
        String email = leerStringConsola( "Ingrese la edad del empleado:");
        String cargo = leerStringConsola( "Ingrese el cargo del empleado:");
        String salario = leerStringConsola("Ingrese el salario del empleado:");
        Empleado empleado = new Empleado(nombre, id, email, cargo, salario);
        empleado.setNombre(nombre);
        empleado.setId(id);
        empleado.setEmail(email);
        empleado.setCargo(cargo);
        empleado.setSalario(salario);
        return empleado.toString();
    }




    public static String leerStringConsola(String mensaje) {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }
    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;

        }
    public static void mostrarMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Validar edad del cliente");
        System.out.println("3 - Crear libro");
        System.out.println("4 - Crear Empleado");
        System.out.println("5 - Salir");
    }
}

