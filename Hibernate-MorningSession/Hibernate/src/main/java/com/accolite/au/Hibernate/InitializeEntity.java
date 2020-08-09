package com.accolite.au.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.AccountClass;
import model.UserClass;

public class InitializeEntity
{
	public void initializeEntity(Session session, AccountClass a1, AccountClass a2, AccountClass a3){
        //users
        UserClass u1 = new UserClass();
        u1.setUserId(1);
        u1.setUserName("Vishal");

        UserClass u2 = new UserClass();
        u2.setUserId(2);
        u2.setUserName("Vivek");

        //accounts
        a1.setAccId(11);
        a1.setAmount(2000);
        a1.setUser(u1); //user1

        a2.setAccId(22);
        a2.setAmount(8000);
        a2.setUser(u2); //user2

        a3.setAccId(33);
        a3.setAmount(9000);
        a3.setUser(u2); //user3

        Transaction transaction1 = session.beginTransaction();

        session.save(u1);
        session.save(u2);
        session.save(a1);
        session.save(a2);
        session.save(a3);

        transaction1.commit();
    }
}
