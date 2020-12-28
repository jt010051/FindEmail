package find_email;

public class emaillList {
String [] list;
int nextIndex =0;
int arraySize =0;

public emaillList(int size) {
	
	this.list = new String [size];
	this.arraySize = size;
}
public void addEmail(String list) {
	this.list[this.nextIndex] =list;
	this.nextIndex++;
	if (this.nextIndex >= this.arraySize) {
		this.nextIndex=0;
		
	}

}
public void printEmail() {
for (int i = 0; i < this.list.length;i++) {
	if (null == this .list[i]) {
		continue;
	}
	System.out.println(this.list[i]);

	
}	
	
}
public boolean foundMatch(String input) {
	
	for (int i=0; i <this .list.length;i++) {
		if (null == this .list[i]) {
			continue;
		}
		if (this.list[i].equals(input)) {
		return true;
		}
		
	}
	return false;
}
}
