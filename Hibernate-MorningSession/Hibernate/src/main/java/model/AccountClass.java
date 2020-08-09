package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vishal_acc")
public class AccountClass 
{
	@Id
	private Integer accId;
	
	@Column
	private Integer amount;
	@ManyToOne
	private UserClass user;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public UserClass getUser() {
		return user;
	}
	public void setUser(UserClass user) {
		this.user = user;
	}
	
}
