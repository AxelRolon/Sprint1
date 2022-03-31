package tasca123;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicicleta = new Bicycle();
		Unicycle uniciclo = new Unicycle();
		Tricycle triciclo = new Tricycle();
		
		bicicleta.montar();
		uniciclo.montar();
		triciclo.montar();
		bicicleta.ride();
		uniciclo.ride();
		
		Cycle[] tipos = new Cycle []{bicicleta, triciclo,uniciclo};
		


        for(int i = 0; i < tipos.length; i++){
            if (tipos[i] instanceof Unicycle){
                tipos[i].balance();
            }else if(tipos[i] instanceof Bicycle){
                tipos[i].balance();
            }
        }


	}

}
