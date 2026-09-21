class Fila {

    private int longitud;

    public Fila(int largoInicial) {
        longitud = largoInicial;
    }

    public Fila() {
        this(0);
    }

    public void aumentarFila() {
        if (evaluarLlegada()) {
            agregarPersona();
        }
    }

    private boolean evaluarLlegada() {
        return Math.random() < 0.6;
    }

    private void agregarPersona() {
        this.longitud++;
    }

    public void mostrarFila() {
        System.out.print("☺ []: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(" ☻ ");
        }
        System.out.println();
    }
}