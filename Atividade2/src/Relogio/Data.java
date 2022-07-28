package Relogio;

public class Data {
private int dia;
private int mes;
private int ano;
String mostrarData = "";


public int getDia(){
	return this.dia;
}

public int getMes() {
	return this.mes;
}

public int getAno() {
	return this.ano;
}

public void setDia(int Dia) {
	this.dia = Dia;
}

public void setMes(int Mes) {
	this.mes = Mes;
}

public void setAno(int Ano) {
	this.ano = Ano;
}

public String mostrarData() {
	return this.dia + "/"+ this.mes + "/"+ this.ano;
}

}
