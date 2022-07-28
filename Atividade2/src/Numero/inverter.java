package Numero;

public class inverter {
		private int num1;
		private int num2;
		int troca;

		public int getNum1(){
			return this.num1;
		}
		public int getNum2() {
			return this.num2;
		}

		public void setNum1(int Num1) {
			this.num1 = Num1;
		}

		public void setNum2(int Num2) {
			this.num2 = Num2;
		}
		public void troca (int Aux) {
		Aux = this.num1;
		this.num1 = num2;
		this.num2 = Aux;
		}

		

}
