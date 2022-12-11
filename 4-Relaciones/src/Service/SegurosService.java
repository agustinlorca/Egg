package Service;

import Entity.Cliente;
import Entity.Cuota;
import Entity.Poliza;
import Entity.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class SegurosService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre y apellido del cliente");
        cliente.setNombreApellido(leer.next());
        System.out.println("Ingrese N° de DNI (sin puntos)");
        cliente.setDNI(leer.nextLong());
        System.out.println("Ingrese correo electrónico");
        cliente.setMail(leer.next());
        System.out.println("Ingrese domicilio");
        cliente.setDomicilio(leer.next());
        System.out.println("Ingrese N° de telefono");
        cliente.setTelefono(leer.next());

        return cliente;
    }

    public Vehiculo crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese la marca del vehiculo");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese la patente del vehículo");
        vehiculo.setPatente(leer.next());
        System.out.println("Ingrese el año del vehículo");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese el N° de motor del vehículo");
        vehiculo.setMotor(leer.next());
        System.out.println("Ingrese el N° de chasis del vehículo");
        vehiculo.setChasis(leer.next());
        System.out.println("Ingrese el color del vehículo");
        vehiculo.setColor(leer.next());
        System.out.println("Ingrese el tipo de vehículo");
        vehiculo.setTipo(leer.next());

        return vehiculo;
    }

    public Cuota generarCuota(int mes, double monto) {
        Cuota cuota = new Cuota();
        Date fechaActual = new Date();
        cuota.setNumCuota(mes);

        cuota.setMonto(monto / 12);

        if (mes == 2) {
            cuota.setFechaVto(new Date(fechaActual.getYear() - 1900, mes - 1, 28));
        } else {
            cuota.setFechaVto(new Date(fechaActual.getYear() - 1900, mes - 1, 30));
        }

        return cuota;
    }

    public Poliza crearPoliza(ArrayList<Integer> numPolizas) {
        ArrayList<Cuota> cuotas = new ArrayList();
        Cuota cuota = new Cuota();
        Boolean existe = false;
        Date fechaActual = new Date();
        Poliza poliza = new Poliza();

        //Creamos cliente
        poliza.setCliente(crearCliente());
        //Creamos vehiculo
        poliza.setVehiculo(crearVehiculo());

        //Generacion aleatorio de numero de poliza
        do {

            poliza.setNumPoliza((int) (Math.random() * 1000000000));
            for (int i = 0; i < numPolizas.size(); i++) {
                if (numPolizas.get(i) == poliza.getNumPoliza()) {
                    existe = true;

                }
            }
        } while (existe);

        numPolizas.add(poliza.getNumPoliza());

        //Fechas
        poliza.setFechaInicio(fechaActual);
        poliza.setFechaFinal(fechaActual);

        //Cuotas
        System.out.println("A continuacion se van a generar las cuotas para pagar la póliza de seguro");
        System.out.println("Ingresar el monto total anual correspondiente");
        Double monto = leer.nextDouble();
        System.out.println("Ingrese la forma de pago");
        System.out.println("1- Cuotas");
        System.out.println("2- En 1 solo pago (%15 de descuento)");
        int formaPago = leer.nextInt();
        if (formaPago == 1) {
            for (int i = 0; i < 12; i++) {
                cuotas.add(generarCuota(i + 1, monto));
            }
            poliza.setCuotas(cuotas);
            poliza.setFormaPago("Plan de 12 cuotas");
        } else {
            cuotas.add(new Cuota(1, monto, false, new Date(fechaActual.getYear() - 1900, fechaActual.getMonth() + 2, fechaActual.getDay()), "-"));
            poliza.setFormaPago("Un solo pago (15% desc).");
            poliza.setCuotas(cuotas);
        }

        //
        System.out.println("Ingrese el monto asegurado del vehiculo");
        poliza.setMontoAsegurado(leer.nextDouble());
        System.out.println("¿Desea asegurar contra granizo? (S/N)");
        String respuesta = leer.next();
        while (!respuesta.equalsIgnoreCase("S") & !respuesta.equalsIgnoreCase("N")) {
            System.out.println("¡Respuesta inválida!");
            System.out.println("Debe ingresar 'S' para SI ó 'N' para NO");
            System.out.println("Ingrese nuevamente una opcion");
            respuesta = leer.next();
        }

        if (respuesta.equalsIgnoreCase("S")) {
            poliza.setIncluyeGranizo(true);
            System.out.println("Ingrese el monto asegurado contra granizo");
            poliza.setMontoGranizo(leer.nextDouble());
        }

        System.out.println("Ingrese el tipo de cobertura");
        poliza.setTipoCobertura(leer.next());

        return poliza;
    }

    public void appSeguros() {

        ArrayList<Integer> numPolizas = new ArrayList();
        ArrayList<Poliza> listadoPolizas = new ArrayList();
        Iterator iterator = listadoPolizas.iterator();
        long DNI;

        int opcion = 0;
        do {

            System.out.println("---------------MENU------------------");
            System.out.println("1- Crear poliza");
            System.out.println("2- Pagar una cuota");
            System.out.println("3- Mostrar información de Póliza");
            System.out.println("4- Dar de baja una poliza");
            System.out.println("3- Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    listadoPolizas.add(crearPoliza(numPolizas));

                    break;

                case 2:
                    boolean existe = false;
                    System.out.println("--------------La Tercera Pagos---------------");
                    System.out.println("Ingrese el DNI del cliente");
                    DNI = leer.nextLong();
                    String formaPago;
                    for (int i = 0; i < listadoPolizas.size(); i++) {

                        if (DNI == listadoPolizas.get(i).getCliente().getDNI()) {
                            if (listadoPolizas.get(i).getCuotas().size() == 1) {
                                if (listadoPolizas.get(i).getCuotas().get(0).isEstaPaga()) {
                                    System.out.println("Esta factura ya se encuentra paga.");

                                } else {
                                    System.out.println("Usted va a realizar el pago anual correspondiente a la póliza N° " + listadoPolizas.get(i).getNumPoliza());
                                    System.out.println("Ingrese la forma de pago (Efectivo/Transferencia)");
                                    formaPago = leer.next();
                                    listadoPolizas.get(i).getCuotas().get(0).setFormaPago(formaPago);
                                    listadoPolizas.get(i).getCuotas().get(0).setEstaPaga(true);
                                    System.out.println("Cuota anual pagada correctamente.");
                                }

                            } else {
                                System.out.println("Ingrese el numero de cuota a pagar (1-12)");
                                int cuota = leer.nextInt();
                                while (cuota < 1 || cuota > 12 || listadoPolizas.get(i).getCuotas().get(cuota).isEstaPaga()) {

                                    if (listadoPolizas.get(i).getCuotas().get(cuota).isEstaPaga()) {
                                        System.out.println("La cuota ingresada ya se encuentra paga.");
                                    } else {
                                        System.out.println("La cuota ingresada no es válida.");
                                    }
                                    System.out.println("Por favor, ingrese nuevamente una cuota válida para efectuar el pago.");
                                    cuota = leer.nextInt();
                                }
                                System.out.println("Usted va a realizar el pago correspondiente a la cuota N°" + cuota + ", de la póliza N° " + listadoPolizas.get(i).getNumPoliza());
                                System.out.println("Ingrese la forma de pago (Efectivo/Transferencia)");
                                formaPago = leer.next();
                                listadoPolizas.get(i).getCuotas().get(cuota - 1).setFormaPago(formaPago);
                                listadoPolizas.get(i).getCuotas().get(cuota - 1).setEstaPaga(true);

                                System.out.println("Cuota N°" + cuota + " pagada correctamente.");
                            }
                            existe = true;

                        }

                    }
                    if (!existe) {
                        System.out.println("El DNI ingresado no corresponde a un cliente.");
                    }
                    
                    break;
                case 3:
                    boolean coincide = false;
                    System.out.println("Ingrese el DNI del cliente");
                    DNI = leer.nextLong();

                    for (int i = 0; i < listadoPolizas.size(); i++) {

                        if (DNI == listadoPolizas.get(i).getCliente().getDNI()) {
                            coincide = true;
                            System.out.println(listadoPolizas.get(i));
                        }
                    }
                    if (!coincide) {
                        System.out.println("El DNI ingresado no corresponde a un cliente.");
                    }
                    break;
                case 4:
                    boolean esta = false;
                    System.out.println("Ingrese el numero de poliza");
                    int num = leer.nextInt();
                    for (int i = 0; i < listadoPolizas.size(); i++) {
                        if (listadoPolizas.get(i).getNumPoliza() == num) {
                            listadoPolizas.remove(i);
                            esta = true;
                            System.out.println("Poliza N° " + num + ", eliminada correctamente.");
                        }
                    }
                    if (!esta) {
                        System.out.println("El N° de poliza '" + num + "' no existe.");
                    }
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opcion correcta.");
                    break;
            }
        } while (opcion != 5);

    }
}
