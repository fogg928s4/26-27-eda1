class Caja {
    private Fila laFila;
    private int numeroCaja;

    public Caja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        laFila = new Fila();
    }

    public void dibujarCaja() {
        System.out.print("☺ ["+ numeroCaja +"]: ");
        laFila.mostrarFila();
    }
}