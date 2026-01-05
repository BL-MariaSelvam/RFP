package Day1617;

public class SpecificWordSearch {

	public static void main(String[] args) {
		String[] sentences= {"Programming language","Java Programs","Python programs","Training Full Stack"};
		String target="Full",temp="";
		int flag=0;
		for(String str:sentences) {
			if(str.contains(target)) {
				flag=1;
				temp=str;
				break;
//				System.out.println("The specific word found at "+str);
			}
			else {
				flag=-1;
//				System.out.println("The sequence not found");
			}
		}
		if(flag==1) {
			System.out.println("The specific word found at "+temp);
		}
		else {
			System.out.println("The sequence not found");
		}
	}

}
