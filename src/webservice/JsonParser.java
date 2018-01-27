package webservice;

import java.util.ArrayList;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {

	private static JSONObject jobject()
	{
		String aaa=GetService.respons();
		
		JSONParser parser=new JSONParser();

			Object object = null;
			try {
				object = parser.parse(aaa);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return (JSONObject) object;
			
	}
	
	private static ArrayList<Object> keySetCollection() {
		System.err.println("jobject = "+jobject());
		
		@SuppressWarnings("unchecked")
			Set<Object> keys=jobject().keySet();
			ArrayList<Object> keySet=new ArrayList<Object>();
			for(Object key:keys)
			{
				keySet.add(key);
			}
			return keySet;		
	}
	
/*	private static ArrayList<Object> valueForKey() {
		System.err.println("jobject = "+jobject());
		
		@SuppressWarnings("unchecked")
			Set<Object> keys=jobject().keySet();
			ArrayList<Object> keySet=new ArrayList<Object>();
			for(Object key:keys)
			{
				keySet.add(key);
			}
			return keySet;		
	}*/
	
	public static void main(String[] args) {
		for(Object key : JsonParser.keySetCollection())
		{
			System.out.println(key+"="+jobject().get(key));
		}
	}

}
