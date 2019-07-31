package ricoom.transport.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name="PASS_STAGE")
	private Passanger passanger;
	@NotEmpty
	@Column(unique = true)
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Min(value=20,message="put valid cost")
	private int cost=0;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Passanger getPassanger() {
		return passanger;
	}
	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Stage [id=" + id + ", passanger=" + passanger + ", cost=" + cost + "]";
	}

	


	

}
