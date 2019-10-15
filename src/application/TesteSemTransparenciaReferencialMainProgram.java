package application;

import java.util.Arrays;

/**
 * Programa Sem Transparência Referencial  pois o método que realiza a alteração nos valores depende de algo externo que no caso é a propriedade globalValue.
 * Isto não ocorre na programação Funcional pois as funções apresentam resultado previsíveis e bem definidos, se executármos N vezes uma função ela sempre irá apresentar
 * o mesmo valor.
 * @author julian
 *
 */
public class TesteSemTransparenciaReferencialMainProgram {

	public static int globalValue = 10;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));

	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				numbers[i] += globalValue;
			}
		}
	}

}
