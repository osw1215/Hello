
public class ���� extends �л�����{
	
	boolean leader = false;
	����(String name, String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	boolean isLeader() {
		if(this.leader==true) {
			System.out.println(name + "�� �����Դϴ�.");
		}else {
			System.out.println(name + "�� ������ �ƴմϴ�.");
		}
		
		return this.leader;
	}
}
