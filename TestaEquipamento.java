public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento("Samsung", 1500);
        Computador computador = new Computador("Dell", 4500, "i7", 1000, 4);

        System.out.println("Equipamento:");
        System.out.println("Marca: " + equipamento.getNome());
        System.out.println("Preço: " + equipamento.getPreco());

        System.out.println("\nComputador:");
        System.out.println("Marca: " + computador.getNome());
        System.out.println("Modelo: " + computador.getPreco());
        System.out.println("Memoria RAM: " + computador.getMemoriaRAM());
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("HD: " + computador.getMemoria());
    }
}
