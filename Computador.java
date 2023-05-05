public class Computador extends Equipamento {
    private String processador;
    private int memoria;
    private int memoriaram;

    public Computador(String modelo, double preco, String processador, int memoria, int memoriaram) {
        super(modelo, preco);
        this.processador = processador;
        this.memoria = memoria;
        this.memoriaram = memoriaram;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoriaRAM() {
        return memoriaram;
    }

    public void setMemoriaRAM(int memoriaram) {
        this.memoriaram = memoriaram;
    }
}