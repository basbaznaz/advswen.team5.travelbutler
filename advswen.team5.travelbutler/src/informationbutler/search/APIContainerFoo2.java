// *************************************************************************************
// File:         [APIContainerFoo2.java]
// Created:      [2016/05/24 Tuesday]
// Last Changed: $Date: 2016/05/24 18:19:00 $
// Author:       <A HREF="mailto:[al-161385@hs-weingarten.de]">[Alexander Lohr]</A>
//**************************************************************************************
//Description: 	Klasse f�r die Beschaffung von Informationen durch eine API
//				
//**************************************************************************************
package informationbutler.search;

public class APIContainerFoo2 implements IAPIContainer {

	@Override
	public String processSearch(String requestString) {
		return "ClassTest Foo2 succesful" + requestString;

	}
}
