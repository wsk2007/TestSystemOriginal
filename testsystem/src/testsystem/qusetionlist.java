package testsystem;
import java.util.*;
public class qusetionlist {
	private List<qusetion> qlist = new ArrayList<>();
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) throws TestSystemException{
		if(this.name == ""){
			throw new TestSystemException("列表名称不能为空！");
		}else{
			this.name = name;
		}
			
		
	}

	
	public qusetionlist(String name){
		try {
			setName(this.name);
		} catch (TestSystemException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	public void addqusetion(qusetion q){
		qlist.add(q);
	}
	public void addqusetion(Collection c){
		qlist.addAll(c);
	}
	public void removequsetion(Object o){
		qlist.remove(o);
	}
	public qusetion getqusetion(int index){
		return qlist.get(index);
	}

}
