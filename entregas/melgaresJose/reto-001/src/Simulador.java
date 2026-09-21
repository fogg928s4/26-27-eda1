class Simulador {

    private final int DURACION_HORAS = 4;
    private final int MAXIMO_CAJAS = 7;

    private int horas;
    private int minutos;
    private int cajasActivas;

    private Caja[] cajas;

    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        simulador.iniciarSimulacion();
    }

    public Simulador() {
        horas = 0;
        minutos = 0;
        cajasActivas = 1;
        cajas = new Caja[MAXIMO_CAJAS];
        cajas[0] = new Caja(cajasActivas);
    }

    private void iniciarSimulacion() {
        while (horas < DURACION_HORAS) {
            mostrarReloj();
            simular();
            dibujarSimulacion();
            avanzarTiempo();
        }
    }

    private void simular() {
        if(llegaAlguien()) {
            System.out.print(" Llego alguien: ☻");
        }
        abrioCaja();
    }

    private void dibujarSimulacion() {
        for(int i = 0; i < cajasActivas; i++) {
            cajas[i].dibujarCaja();
        }
    }


    private void abrioCaja() {
        final double PROBABILIDAD_DE_APERTURA = 0.4;
        if( Math.random() < PROBABILIDAD_DE_APERTURA ) {
            cajasActivas++;
            cajas[cajasActivas - 1] = new Caja(cajasActivas);
        }
    }

    private boolean llegaAlguien() {
        final double PROBABILIDAD_DE_LLEGADA = 0.6;
        return Math.random() < PROBABILIDAD_DE_LLEGADA;
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