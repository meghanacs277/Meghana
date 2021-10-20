package www.wolken.Butterfly.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="butterfly_details")
public class butterflydetails {
	@Id
	@Column(name="type")
	private String type;
	@Column(name="color")
	private String color;
	@Column(name="parts")
	private String parts;
	@Column(name="gender")
	private String gender;

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "butterflydetails [type=" + type + ", color=" + color + ", parts=" + parts + ", gender=" + gender + "]";
	}
	
	
	
	

}
