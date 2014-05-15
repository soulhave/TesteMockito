package br.com.soulhave.bo;

/**
 * Classe responsável  
 * @author ramon
 *
 */
public class CalculoDados {

	/**
	 * Metodo realiza soma de a+b
	 * @param a
	 * @param b
	 * @return soma dos dados
	 * @author ramon
	 */
	public Integer somaDados(Integer a, Integer b){
		
		if(isNull(a, b))
			return null;
		
		Integer integer = a+b;
		
		return integer;
	}

	private boolean isNull(Integer a, Integer b) {
		if(a==null || b==null)
			return true;
		return false;
	}
	
	public Integer multiplicar(Integer a, Integer b) {
		if(isNull(a, b))
			return null;

		Integer integer = a*b;
		
		return integer;
		
	}
}
