class Simulador {

    private int horas;
    private int minutos;
    private final int DURACION_HORAS = 4;
    private Fila laFila;

    public static void main(String[] args) throws InterruptedException {
        Simulador simulador = new Simulador();
        simulador.iniciarSimulacion();
    }

    private void iniciarSimulacion() throws InterruptedException {
        horas = 0;
        minutos = 0;
        laFila = new Fila();

        while (horas < DURACION_HORAS) {
            mostrarReloj();
            laFila.aumentarFila();
            laFila.mostrarFila();
            Thread.sleep(1000);
            avanzarTiempo();
        }
    }

    private void mostrarReloj() {
        System.out.printf("[%02d:%02d] ", horas, minutos);
    }

    private void avanzarTiempo() {
        final int MINUTOS_EN_HORA = 60;
        minutos = minutos + 1;
        
        if (minutos == MINUTOS_EN_HORA) {
            minutos = 0;
            horas = horas + 1;
        }
    }
}