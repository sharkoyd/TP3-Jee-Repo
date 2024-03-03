package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Game> getGamesParMotCle(String mc) {

	List<Game> games= new ArrayList<Game>();
	Connection conn=SingletonConnection.getConnection();
	try {
	
	PreparedStatement ps= conn.prepareStatement("select * from game where name LIKE ?");
	
	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getString("name"));
		System.out.println("--------------------------------------------------");
		Game p = new Game();
			p.setIdGame(rs.getLong("id"));
			p.setNomGame(rs.getString("name"));
			p.setType(rs.getString("type"));
			p.setAgeRating(rs.getString("age_rating"));
		games.add(p);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return games;
	}
	@Override
	public void addProduit(Game p) {
	// TODO Auto-generated method stub
	}
}