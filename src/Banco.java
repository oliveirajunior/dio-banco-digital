import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final String NOME_BANCO = "DIO  Bank";

    private String nome;
    private List<Conta> contaList;

    public Banco(){
        nome = NOME_BANCO;
        contaList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void abrirConta(Conta conta){
        contaList.add(conta);
    }

    public List<Conta> pesquisarContaCPF(int cpf){
        List<Conta> contasPorCPF = new ArrayList<>();
        if(!contaList.isEmpty()){
            for(Conta conta : contaList){
                if(conta.getCliente().getCpf() == cpf){
                    contasPorCPF.add(conta);
                }
            }
        }
        return contasPorCPF;
    }

    public List<Conta> pesquisarContaNome(String nome){
        List<Conta> contasPorNome = new ArrayList<>();
        if(!contaList.isEmpty()){
            for(Conta conta : contaList){
                if(conta.getCliente().getNome().equalsIgnoreCase(nome)){
                    contasPorNome.add(conta);
                }
            }
        }
        return contasPorNome;
    }

    //Função com Stream e Method Reference
    public void listarClientes(){
        List<Cliente> listaClientes = this.getContaList().stream().map(Conta::getCliente).toList();
        listaClientes.forEach(System.out::println);
    }


}
