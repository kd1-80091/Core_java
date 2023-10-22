package com.sunbeam;

import java.util.List;
import java.util.Scanner;


public class CandidateTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Press 1 to Add candidate to database ");
			System.out.println("Press 2 to Update the table");
			System.out.println("Press 3 to show partywise votes");
			System.out.println("press 4 to exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				try (CandidateDoa cd = new CandidateDoa()) {
					System.out.print("enter Name: ");
					String name = sc.next();
					System.out.print("enter party Name: ");
					String party = sc.next();
					System.out.print("enter votes: ");
					int votes = sc.nextInt();
					Candidate c= new Candidate(0,name,party,votes);
					
					int cnt = cd.addNewCandidate(c);
					System.out.println("Rows inserted successfully");
				}
				catch (Exception e) {
					e.printStackTrace();
				    }
				break;
				
				
			case 2:
				try (CandidateDoa cd2 = new CandidateDoa()) {
					System.out.print("enter Name: ");
					String name1 = sc.next();
					System.out.print("enter party Name: ");
					String party1 = sc.next();
					System.out.print("enter votes ");
					int votes1 = sc.nextInt();
					System.out.print("enter id ");
					int id1 = sc.nextInt();
					Candidate c2 = new Candidate(id1,name1,party1,votes1);
					int cnt = cd2.updateCandidate(c2);
				    }
				    catch (Exception e)
				    {
				    	e.printStackTrace();
				    }
				break;
			case 3:
				try(CandidateDoa cdao=new CandidateDoa()){
					List<PartyVotes> list= cdao.getPartyWiseVotes();
					list.forEach(c -> System.out.println(c));
				} catch (SQLException e) {
					e.printStackTrace();	
			}
		}while(choice!=0);
}
}