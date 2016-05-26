package advswen.team5.travelbutler.starter;

import informationbutler.search.SearchRequest;

public class Starter {

	public static void main(String[] args) {
		SearchRequest request = new SearchRequest("Huhutest test");
		System.out.println(request.search());
	}

}
