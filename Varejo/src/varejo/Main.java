package varejo;

public class Main {

	public static void main(String[] args) {
Clientes cli1 = new Clientes();
Vendedores ven1 = new Vendedores();
Vendas ven2 = new Vendas();
Estoque est1 = new Estoque();
Produtos pro1 = new Produtos ();
Transportadora trans1 = new Transportadora ();
Fornecedores forn1 = new Fornecedores ();

cli1.nome = "Julia kines";
cli1.cpf = "550.457.684-68";
cli1.endereco = "rua professor pontes de miranda";
cli1.telefone = "984481977";

ven1.nome = "lucia scheneider";
ven1.pis = "47568548";
ven1.telefone = "989471644";
ven1.endereco = "joao de oliveira remiao";

ven2.devoluçoes = "devolução";
ven2.notaFiscal = "nota fiscal";

est1.estoquista = "Marcelo";

trans1.inscricaoestadual = "45681";
trans1.cnpj = "00.428.307/0003-00";
trans1.razaoSocial ="Expresso são miguel";

pro1.bebidas = "coca-cola";

forn1.razaoSocial = "Ambev";
forn1.cnpj = "07.526.557/0001-00";
forn1.inscricaoestadual = "4561814";
forn1.telefone = "(51)3345-4587";

System.out.printf("A cliente %s do cpf:%s,endereço:%s e telfone:%s veio fazer uma %s de %s com a fiscal %s do pis:%s telefone:%s.",cli1.nome,cli1.cpf,cli1.endereco,cli1.telefone,ven2.notaFiscal,ven2.devoluçoes,ven1.nome,ven1.pis,ven1.pis);

System.out.printf("O estoquista %s recebeu os produtos da %s cnpj:%s, que veio atraves da transportadora %s cnpj:%s, dentro do transporte contia uma carga valiosa de %s",est1.estoquista,forn1.razaoSocial,forn1.cnpj,trans1.razaoSocial,trans1.cnpj,pro1.bebidas);

	}

}
