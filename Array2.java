
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,25,39,46,52,61,73,82,};
		
		for (int i=0; i<number.length; i++){
			if(number[i]%2 == 0){
				if(number[i]>20)
					System.out.println(number[i] +" adalah genap dan lebih dari 20");
				else System.out.println(number[i]+" adalah genap");
			}else{
				if(number[i]>20)
					System.out.println(number[i] +" adalah ganjil dan lebih dari 20");
				else System.out.println(number[i]+" adalah ganjil");
			}
		}
		
		
	}

}
