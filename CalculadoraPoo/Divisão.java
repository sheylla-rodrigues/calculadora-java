package programa;

import interfaces.ICalculadora;

public class Divisão implements ICalculadora{
	

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Float calcula(Float n1, Float n2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double calcula(Double n1, Double n2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer calcula(Integer[] numeros) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Float calcula(Float[] numeros) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double calcula(Double[] numeros) {
	Double divisor = numeros[0];
	for (int i = 1; i < numeros.length; i++ ) {
		divisor /= numeros[i];
	}
	return divisor; }
}
	