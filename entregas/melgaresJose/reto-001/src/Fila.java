class Fila {

    private int longitud;

    public Fila(int largoInicial) {
        longitud = largoInicial;
    }

    public Fila() {
        this(0);
    }

    public void aumentarFila() {
        this.longitud++;
    }

    public void mostrarFila() {
        for (int i = 0; i < longitud; i++) {
            System.out.print(" ☻ ");
        }
        System.out.println();
    }
}