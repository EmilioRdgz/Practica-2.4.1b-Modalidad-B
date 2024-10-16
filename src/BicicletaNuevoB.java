public class BicicletaNuevoB {

    // Clase anidada Rueda
    public class Rueda {
        private String marca;
        private int tamaño;

        public Rueda(String marca, int tamaño) {
            this.marca = marca;
            this.tamaño = tamaño;
        }

        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }

        public int getTamaño() { return tamaño; }
        public void setTamaño(int tamaño) { this.tamaño = tamaño; }
    }

    // Clase anidada Cuadro
    public class Cuadro {
        private String material;
        private String color;

        public Cuadro(String material, String color) {
            this.material = material;
            this.color = color;
        }

        public String getMaterial() { return material; }
        public void setMaterial(String material) { this.material = material; }

        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
    }

    // Clase anidada Asiento
    public class Asiento {
        private String tipo;
        private boolean esAcolchonado;

        public Asiento(String tipo, boolean esAcolchonado) {
            this.tipo = tipo;
            this.esAcolchonado = esAcolchonado;
        }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public boolean getEsAcolchonado() { return esAcolchonado; }
        public void setEsAcolchonado(boolean esAcolchonado) { this.esAcolchonado = esAcolchonado; }
    }

    // Atributos de la clase externa
    private Rueda rueda;
    private Cuadro cuadro;
    private Asiento asiento;

    // Constructor de la clase externa
    public BicicletaNuevoB() {
        this.rueda = new Rueda("Michelin", 26);
        this.cuadro = new Cuadro("Aluminio", "Rojo");
        this.asiento = new Asiento("Deportivo", true);
    }

    // Main para modalidad B
    public static void main(String[] args) {
        BicicletaNuevoB bicicleta = new BicicletaNuevoB();

        // Mostrar valores
        System.out.println("Rueda: Marca = " + bicicleta.rueda.getMarca() + ", Tamaño = " + bicicleta.rueda.getTamaño());
        System.out.println("Cuadro: Material = " + bicicleta.cuadro.getMaterial() + ", Color = " + bicicleta.cuadro.getColor());
        System.out.println("Asiento: Tipo = " + bicicleta.asiento.getTipo() + ", Acolchonado = " + bicicleta.asiento.getEsAcolchonado());
    }
}
