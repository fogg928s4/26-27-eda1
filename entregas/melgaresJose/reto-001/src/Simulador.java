class Simulador {

    private int horas;
    private int minutos;
    private final int DURACION_HORAS = 4;
    
    private Fila laFila;

    public static void main(String[] args) {
        iniciarSimulacion();
    }

    private static void iniciarSimulacion() {
        horas = 0;
        minutos = 0;
        laFila = new Fila();

        while (horas < DURACION_HORAS) {
            avanzarTiempo();
        }
    }

    private static void avanzarTiempo() {
        final int MINUTOS_EN_HORA = 60;
        minutos = minutos + 1;
        
        if(minutos == MINUTOS_EN_HORA ) {
            minutos = 0;
            horas = horas + 1;
        }
    }
}