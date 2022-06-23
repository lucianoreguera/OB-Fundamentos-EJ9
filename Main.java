class Main {
  public static void main(String[] args) {
    System.out.println("Cliente");
    Cliente cliente = new Cliente("Elsa Bor", 40, "123456789", 35000.25);
    System.out.println("Nombre: " + cliente.getNombre());
    System.out.println("Edad: " + cliente.getEdad());
    System.out.println("Teléfono: " + cliente.getTelefono());
    System.out.println("Crédito: $" + cliente.getCredito());
    System.out.println("Trabajador");
    Trabajador trabajador = new Trabajador("Esteban Quito", 41, "987654321", 80000.75);
    System.out.println("Nombre: " + trabajador.getNombre());
    System.out.println("Edad: " + trabajador.getEdad());
    System.out.println("Teléfono: " + trabajador.getTelefono());
    System.out.println("Crédito: $" + trabajador.getSalario());
  }
}

class Persona {
  private String nombre;
  private int edad;
  private String telefono;

  public Persona(String nombre, int edad, String telefono) {
    this.nombre = nombre;
    this. edad = edad;
    this. telefono = telefono;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getTelefono() {
    return this.telefono;
  }
}

class Cliente extends Persona {
  private double credito;

  public Cliente(String nombre, int edad, String telefono, double credito) {
    super(nombre, edad, telefono);
    this.credito = credito;
  }

  public void setCredito(float credito) {
    this.credito = credito;
  }

  public double getCredito() {
    return this.credito;
  }
}

class Trabajador extends Persona {
  private double salario;

  public Trabajador(String nombre, int edad, String telefono, double salario) {
    super(nombre, edad, telefono);
    this.salario = salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return this.salario;
  }
}