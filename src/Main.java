//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Banco banco = new Banco("BancoLv");
            Cliente lavs = new Cliente();
            lavs.setNome("Lavínia");
            lavs.setCpf("3908057843");

            Conta corrente = new ContaCorrente(lavs);
            Conta poupanca = new ContaPoupanca(lavs);

            banco.adicionarConta(corrente);
            banco.listarContas();
        try {
            corrente.depositar(200);
            corrente.imprimirExtrato();
            corrente.transferir(150,poupanca);
            corrente.sacar(120);
            corrente.imprimirExtrato();
            poupanca.imprimirExtrato();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}