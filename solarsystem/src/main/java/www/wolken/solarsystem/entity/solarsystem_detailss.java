package www.wolken.solarsystem.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="solarsystem_detailss")
public class solarsystem_detailss {
	@Id
	@Column
	private int id;
	
	@Column
	private int distance;
	@Column
	private String color;
	@Column
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String toString() {
		//return "solarsystem_details [id=" + id + ", distance=" + distance + ", color=" + color + ", name=" + name + "]";
	//}
	public String toString() {
		return "solarsystem_detailss [id=" + id + ", distance=" + distance + ", color=" + color + ", name=" + name
				+ "]";
	}
	
	
	
	

}
