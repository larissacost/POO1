package POO;

public class TesteCliente {

	public static void main(String[] args) {
		cliente cliente1 = new cliente();
		cliente1.setNome("Andreia");
		cliente1.setTelefone(999996666);
		cliente1.setEndere�o("Alameda margaridas,67");
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getEndere�o());

	}

}
