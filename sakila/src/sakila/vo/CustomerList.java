package sakila.vo;

public class CustomerList {
	private int customer_id;	// customer 고유번호
	private String name;		// customer 이름
	private String phone;		// customer 연락처
	private String notes;		// 계정 활성화 여부
	private String overdue;		// 연체 여부 (Y면 연체, N이면 연체 아님)
	
	public int getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOverdue() {
		return overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	@Override
	public String toString() {
		return "CustomerList [customer_id=" + customer_id + ", name=" + name + ", phone=" + phone + ", notes=" + notes
				+ ", overdue=" + overdue + "]";
	}
}