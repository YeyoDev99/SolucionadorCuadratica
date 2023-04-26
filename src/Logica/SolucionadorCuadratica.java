package Logica;


public class SolucionadorCuadratica extends Cuadratica{
	// declaro los atributos privados:

		private String resultado;

		// creo el metodo constructor:

		public SolucionadorCuadratica(double numeroA, double numeroB, double numeroC) {
			super(numeroA, numeroB, numeroC);
		}

		// creo el metodo que calculara la solucion de la cuadratica:
		public void calculadoraCuadratica() {
			valorDentroDeRaiz = (Math.pow(numeroB, 2) - (4 * numeroA * numeroC));
			if (numeroA == 0 & numeroB == 0 & numeroC == 0) {
				resultado = String.format("\n\t0=0 (infinitas soluciones)");
			} else if (numeroA == 0 & numeroB == 0 & numeroC != 0) {
				resultado = ("\n\tabsurdo matemático; " + numeroC + " != 0 " + " ; no tiene solución");
			} else if (numeroA == 0 & numeroB != 0 & numeroC != 0) {
				double x = -numeroC / numeroB;
				resultado = String.format("\n\tLa solucion es X= %.2f" , x);
			} else if (numeroA == 0 & numeroB != 0 & numeroC == 0) {
				resultado = String.format("\n\tla solucion es X=0");

			} else if (numeroA != 0 & numeroB == 0 & numeroC == 0) {
				resultado = String.format("\n\tla solucion es X=0");

			} else if (numeroA != 0 & numeroB == 0 & numeroC != 0) {
				// soluciones reales
				if (valorDentroDeRaiz > 0) {

					resultado = String.format("\n\tLas 2 soluciones son: X1= %.2f" , (Math.sqrt(valorDentroDeRaiz) / (2 * numeroA)))
							+ String.format(" y \n\tX2= %.2f" , (-Math.sqrt(valorDentroDeRaiz) / (2 * numeroA)));

				} else if (valorDentroDeRaiz == 0) {
					resultado = String.format("\n\tla solucion es X= %.2f" , (Math.sqrt(valorDentroDeRaiz) / (2 * numeroA)));

				} else if (valorDentroDeRaiz < 0) {
					valorDentroDeRaiz = valorDentroDeRaiz * -1;
					resultado = String.format("\n\tLas 2 soluciones son: X1= %.2f" , Math.sqrt(valorDentroDeRaiz)) + "i/" +  (2 * numeroA)
							+  String.format(" y \n\tX2= %.2f" , -Math.sqrt(valorDentroDeRaiz) + "i/" , (2 * numeroA));
					System.out.println(resultado);

				}
			} else if (numeroA != 0 & numeroB != 0 & numeroC == 0) {
				resultado = String.format("\n\tLas 2 soluciones son: X1= " , (numeroB + Math.sqrt(Math.pow(numeroB, 2))) / (2 * numeroA))
						+ String.format(" y \n\tX2= " , (numeroB - Math.sqrt(Math.pow(numeroB, 2)) / (2 * numeroA)));

			} else if (numeroA != 0 & numeroB != 0 & numeroC != 0) {
				if (valorDentroDeRaiz > 0) {
					resultado = String.format("\n\tLas 2 soluciones son: X1= %.2f" , (numeroB + Math.sqrt(valorDentroDeRaiz)) / (2 * numeroA))
							+ String.format(" y \n\tX2= %.2f" , (numeroB - Math.sqrt(valorDentroDeRaiz)) / (2 * numeroA));

				} else if (valorDentroDeRaiz == 0) {
					resultado = String.format("\n\tX= %.2f" , (numeroB / (2 * numeroA)));

				} else if (valorDentroDeRaiz < 0) {
					valorDentroDeRaiz = valorDentroDeRaiz * -1;
					resultado = String.format("\n\tLas 2 soluciones son: X1= %.2f" , numeroB , "+" , Math.sqrt(valorDentroDeRaiz)) + "i/"
							+ (2 * numeroA) + String.format(" y \n\tX2= %.2f" , numeroB , "" , (-Math.sqrt(valorDentroDeRaiz))) + "i/"
							+ (2 * numeroA);

				}

			}

		}
		// creo los getters y setters:

		public String getResultado() {
			return resultado;
		}

		public void setResultado(String resultado) {
			this.resultado = resultado;
		}

	}
