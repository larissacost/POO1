package POO;

public class TesteAviao {

	public static void main(String[] args) {
		aviao aviao1 = new aviao();
		aviao1.setAviacao("Azul");
		aviao1.setFrota(7);
		aviao1.setModelo(274);
		
		System.out.println(aviao1.getAviacao());
		System.out.println(aviao1.getFrota());
		System.out.println(aviao1.getModelo());
	}

}
