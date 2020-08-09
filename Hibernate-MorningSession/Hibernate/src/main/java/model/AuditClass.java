package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Audit_table")
public class AuditClass 
{
	public Integer getTxnId() {
		return txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public AccountClass getTxnReceiver() {
		return txnReceiver;
	}

	public void setTxnReceiver(AccountClass txnReceiver) {
		this.txnReceiver = txnReceiver;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public void setTxnSender(AccountClass txnSender) {
		this.txnSender = txnSender;
	}

	@Id
    @GeneratedValue
    private Integer txnId;
    @NotNull
    @ManyToOne
    private AccountClass txnSender;
    @NotNull
    @ManyToOne
    private AccountClass txnReceiver;
    @NotNull
    private Integer amount;

    public AccountClass getTxnSender() {
        return txnSender;
    }
	
	
}
