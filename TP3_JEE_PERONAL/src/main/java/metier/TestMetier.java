package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
	MetierImpl metier= new MetierImpl();
	List<Game> games = metier.getGamesParMotCle("HP");
	for (Game p : games)
		System.out.println(p.getNomGame());
	}
}