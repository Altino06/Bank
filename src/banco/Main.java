package banco;

public class Main {
    public static void main(String[] args) {
        ContaBank person1 = new ContaBank();
        person1.abrirConta("CC");
        person1.setNumConta(0001);
        person1.setDono("Jubiloid");

        ContaBank person2 = new ContaBank();
        person2.abrirConta("CP");
        person2.setNumConta(0002);
        person2.setDono("Camila");

        person1.depositar(150);
        person2.sacar(50);

        person1.statusGeral();
        person2.statusGeral();

    }
}
