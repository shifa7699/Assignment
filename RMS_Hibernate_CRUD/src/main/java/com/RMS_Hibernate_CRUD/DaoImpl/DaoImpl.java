package com.RMS_Hibernate_CRUD.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.RMS_Hibernate_CRUD.Dao.Dao;
import com.RMS_Hibernate_CRUD.congif.HibernateUtil;
import com.RMS_Hibernate_CRUD.entity.Train;

public class DaoImpl implements Dao  {

public void train_details() {
	 Scanner sc=new Scanner(System.in);
		String tname; 
		int p,tno,tavail;
		System.out.println("Enter the Train name : ");
		tname=sc.nextLine();
		System.out.println("Enter the Train number : ");
		tno=sc.nextInt();
		System.out.println("Enter the Ticket Price : ");
		p=sc.nextInt();
		System.out.println("Enter the No. of tickets available : ");
		tavail=sc.nextInt();
		
		Train t = new Train();
		t.setTrain_no(tno);
		t.setTrain_name(tname);
		t.setTicket_price(p);
		t.setTicket_available(tavail);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tt=session.beginTransaction();
		session.save(t);
		System.out.println(t.getTrain_no()+" "+t.getTrain_name()+" "+t.getTicket_price()+" "+t.getTicket_available());
		tt.commit();
		}
public void train_avail() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Train number  : ");
	int trainno=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Train t1=session.get(Train.class, trainno);
	System.err.println("Train Available on Monday Thursday and Saturday");
	t.commit();
 }
public void fetchPrice() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Train number : ");
	int trainno=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Train t1=session.get(Train.class, trainno);
	System.out.println("The price of the train number : "+t1.getTrain_no()+"is : "+t1.getTicket_price());
	t.commit();
}
public void Tickets_avail() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the train number : ");
	int trainno=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Train t2=session.get(Train.class, trainno);
	System.out.println("The Tickets available for the train number :"+t2.getTrain_no()+"is : "+t2.getTicket_available());
	t.commit();
}
}