public class CalculadoraTeste{
	public void main(String[] args){
		CalculadoraTeste teste = new CalculadoraTeste();
		teste.testSoma();
		teste.testeSomaComAcumulador();
	}

	public void testSoma(){
		Calculadora calc = new Calculadora();
		if(calc.Soma(1,2) == 3){
			System.out.println("Calculadora.soma(double,double) passou! ");
		}else{
			System.out.println("Teste de Calculadora.soma(double,double) não passou! ");
		}
	}

	public void testeSomaComAcumulador(){
		Calculadora calc = new Calculadora();
		if(calc.Soma(2) == 2){
			System.out.println("Calculadora.soma(double,double) passou! ");
		}else{
			System.out.println("Teste de Calculadora.soma(double,double) não passou! ");
		}	
	}
}