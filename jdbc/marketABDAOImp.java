package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import jdbc.matketeEnDTO;

public class marketABDAOImp implements marketABDAO {
	public boolean save(matketeEnDTO dto) {
		Connection c = null;
		PreparedStatement s = null;
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","4MC17IS026");
			s = c.prepareStatement("insert into market_details values (?,?,?,?)");
			s.setInt(1, dto.getId());
			s.setString(2, dto.getName());
			s.setString(3, dto.getLocation());
			s.setInt(4, dto.getNoOfShop());
			
			result = s.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
	@Override
	public void getAll() {
		
		Connection c = null;
		PreparedStatement s = null;
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","4MC17IS026");
			s = c.prepareStatement("select * from market_details");
			ResultSet rs = s.executeQuery();
			System.out.println("Id \t Name \t\t Location \t\t Number of shop");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String location = rs.getString(3);
				int noOfShop = rs.getInt(4);
				System.out.println(id + "\t" + name + "\t\t" + location + "\t\t  " + noOfShop);
			}
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}
	@Override
	public boolean updateByLocation(matketeEnDTO dto) {
	
		Connection c = null;
		PreparedStatement s = null;
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","4MC17IS026");
			s = c.prepareStatement("UPDATE market_details SET location=? WHERE name=?");
			s.setString(1, dto.getLocation());
			s.setString(2, dto.getName());
			
			result = s.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
	
		} catch (SQLException | ClassNotFoundException  e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
public boolean getByLocation(matketeEnDTO dto){
		
		Connection c = null;
		PreparedStatement s = null;
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","4MC17IS026");
			s = c.prepareStatement("select * from market_details where location=?");
			s.setString(1, dto.getLocation());
			ResultSet rs = s.executeQuery();
			System.out.println("Id\t Name \t\t Location \t\t Number of shop");
			System.out.println(" -- ");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String location = rs.getString(3);
				int noOfShop = rs.getInt(4);
				System.out.println(id+ " "+name+" \t\t" + location + "\t\t  "+ noOfShop);
				result=true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}


	@Override
	public boolean deleteById(matketeEnDTO dto) {
		
		Connection c = null;
		PreparedStatement s = null;
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","4MC17IS026");
			s = c.prepareStatement("DELETE FROM market_details WHERE id=?");
			s.setInt(1, dto.getId());
			result = s.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}

	
	
}


	

	
	



	

	


