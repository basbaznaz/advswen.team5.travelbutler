// *************************************************************************************
// File:         [ConcreteStrategyFoo.java]
// Created:      [2016/05/24 Tuesday]
// Last Changed: $Date: 2016/05/24 18:19:00 $
// Author:       <A HREF="mailto:[al-161385@hs-weingarten.de]">[Alexander Lohr]</A>
//**************************************************************************************
//Description: 	Klasse für die Zusammenführung verschiedener APIs
//				
//**************************************************************************************
package advswen.team5.strategy;


import java.util.*;

import advswen.team5.api.APIContainerFoo;
import advswen.team5.api.APIContainerFoo2;
import advswen.team5.api.IAPIContainer;

public class ConcreteStrategyFoo implements ISearchStrategy {

	private List<IAPIContainer> apilist = new ArrayList<IAPIContainer>();

	public List<IAPIContainer> getApilist() {
		return apilist;
	}

	public void setApilist(List<IAPIContainer> apilist) {
		this.apilist = apilist;

	}


	@Override
	public String executeSearch(String requestString) {
		String result = "";
		apilist.add(new APIContainerFoo());
		apilist.add(new APIContainerFoo2());
		
		for(IAPIContainer elem: apilist)
		result = result + elem.processSearch(requestString);
		
		return result;
		
	}

}
