package com.accolite.au.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.AccountClass;
import model.AuditClass;

public class TxnOperation 
{
	public void auditTxn(int amt, AccountClass acc1, AccountClass acc2, Session session){

        Transaction txn = session.beginTransaction();

        AuditClass audit = new AuditClass();
        audit.setTxnSender(acc1);
        audit.setTxnReceiver(acc2);
        audit.setAmount(amt);
        session.save(audit);

        if(acc1.getAmount() > amt) {
            //Only completed txn will be saved.
            System.out.println("Amount can be debited.");
            int temp = acc1.getAmount() - amt;
            acc1.setAmount(temp);

            try {
                if (acc2.getAmount() > 0) {
                    int temp1 = acc2.getAmount() + amt;
                    acc2.setAmount(temp1);
                    System.out.println(">>>Txn committed.<<<");
                    txn.commit();
                }
            }
            catch(Exception e){
                //Assuming failed txn should not be saved.
                System.out.println("Check the receiver's account number.");
                txn.rollback();
                System.out.println(">>>Txn failed.<<<");
            }
        }
        else {
            //Assuming failed txn should not be saved.
            System.out.println("Amount can't be debited. Credit money first.");
            txn.rollback();
            System.out.println(">>>Txn failed.<<<");
        }
    }
}
