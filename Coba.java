
public class Coba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nama = {"budi","anto","aan","bebe","citra","titi"};
		
		for(int i=0; i<nama.length; i++){
			String team = "";
			if(nama[i].charAt(0) == 'A'){
				team = "team A";
			}else if(nama[i].charAt(0) ==  'B'){
				team = "team B";
			}else{
				team = "no team";
			}
				System.out.println(nama[i]+" - "+team);
			
		}
	}
}


