package testsystem;

public class givequestion {
	qusetionlist list;
	int num;
	
	public givequestion(qusetionlist qlist){
		list = qlist;
		num = 1;
	}
	
	public qusetion nextqusetion(){
		num = num +1;
		return list.getqusetion(num - 1);
		
	}
	
	public int getnum() {
		return num;
	}

}
