package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Game> getGamesParMotCle(String mc);
	public void addProduit(Game p);
}