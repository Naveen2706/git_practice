class UC1{

private String type;


public String getType() {    // to get data from type
		return type;
	}


public void setType(String type) {    // to set data to type
		this.type = type;
	}
public static void main(String[] args) {
UC1 obj = new UC1();
obj.setType("NAVEEN");
System.out.println(obj.getType());
  }
}
