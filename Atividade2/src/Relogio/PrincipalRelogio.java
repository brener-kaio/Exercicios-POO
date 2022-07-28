package Relogio;

public class PrincipalRelogio {

	public static void main(String[] args) {
		Data dadosData = new Data ();
		Hora dadosHora = new Hora();
		Contato dadosContato = new Contato();
	
		
       dadosData.setDia(8);
       dadosData.setMes(11);
       dadosData.setAno(2000);
       dadosData.mostrarData();
       
       System.out.println(dadosData.mostrarData());
       
       
       dadosHora.setHora(14);
       dadosHora.setMinuto(45);
       dadosHora.setSegundo(23);
       dadosHora.mostrarHora(); 
       
       System.out.println(dadosHora.mostrarHora());
       
      
       dadosContato.setNome("Hugo");
       dadosContato.setTelefone("997347780");
       dadosContato.mostrarContato();
       
       System.out.println(dadosContato.mostrarContato());
       
   		
     }
	
	

}
