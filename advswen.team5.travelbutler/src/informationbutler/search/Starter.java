package informationbutler.search;

public class Starter {

	public static void main(String[] args) {
		SearchRequest request = new SearchRequest("Huhutest test");
		System.out.println(request.search());
	}

}
