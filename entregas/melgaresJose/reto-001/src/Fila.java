class Fila {

    private int longitud;

    public Fila(int largoInicial) {
        longitud = largoInicial;
    }
    public Fila() {
        this(0);
    }

    public void agregarAFila(int cantidad) {
        this.longitud += cantidad;
    }

    public void mostarFila() {
        System.out.print("☺ []: ");
        for (int i = 0; i <= longitud; i++) {
            System.out.print(" ☻ ");
        }
    }
}