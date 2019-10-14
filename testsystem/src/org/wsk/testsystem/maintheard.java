package org.wsk.testsystem;
import java.util.*;

public class maintheard {
	public void test(){
		List<qusetion> qlist = new ArrayList<>();
		qusetion q1 = new qusetion();
		try {
			q1.setawnser("q1");
		} catch (TestSystemException e3) {
			// TODO 自动生成的 catch 块
			e3.printStackTrace();
		}
		q1.setcanawnserbeempty(true);
		try {
			q1.setname("q1");
		} catch (TestSystemException e2) {
			// TODO 自动生成的 catch 块
			e2.printStackTrace();
		}
		q1.setNum(1);
		q1.setIsmarked(true);
		qusetion q2 = new qusetion();
		try {
			q2.setawnser("q2");
		} catch (TestSystemException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		q2.setcanawnserbeempty(false);
		try {
			q2.setname("q2");
		} catch (TestSystemException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		q2.setNum(2);
		q2.setIsmarked(false);
		qlist.add(q1);
		qlist.add(q2);
		qusetionlist l = new qusetionlist("list");
		l.addqusetion(qlist);
		System.out.println(l.getqusetion(0).checkawnser());
	}
		

	public static void main(String[] args) {
		new maintheard().test();
		// TODO 自动生成的方法存根

	}

}
