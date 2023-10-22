package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/*Complete CandidateDAO class. Implement following methods.
Dint save(Candidate c); // add new candidate.
int update(Candidate c); // modify name and party for the id.
List<PartyVotes> getPartywiseVotes(); // get partywise total votes.
// create a POJO class "PartyVotes" with two fields "party" and "votes".*/

public class CandidateDoa implements AutoCloseable {

	private Connection con;

	public CandidateDoa() throws SQLException {
		con = Dbutil.getConnection();
	}

	@Override
	public void close() throws Exception {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addNewCandidate(Candidate c) throws SQLException {
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());

			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	public int updateCandidate(Candidate c1) throws SQLException {
		String sql2 = "update candidates set name =  ?, party = ?, votes = ? where id = ?";
		try (PreparedStatement stmt2 = con.prepareStatement(sql2)) {
			

			stmt2.setString(1, c1.getName());
			stmt2.setString(2, c1.getParty());
			stmt2.setInt(3, c1.getVotes());
			stmt2.setInt(4, c1.getId());

			int cnt = stmt2.executeUpdate();
			System.out.println("Table Updated successfully...  " + cnt);
			return cnt;
		}
		
		
		 public List<PartyVotes> getPartywiseVotes() throws SQLException 
		  {
			List<PartyVotes> list = new ArrayList<PartyVotes>();
			String s = "select party,sum(votes) as vote_sum from candidates group by party";
			try (PreparedStatement stmt = con.prepareStatement(s)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						String party = rs.getString("party");
						int votes = rs.getInt("vote_sum");
						System.out.printf("%s, %d\n", party, votes);
					}
				}
			}
			return list;

		}
		
	}

}
