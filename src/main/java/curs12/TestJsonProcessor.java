package curs12;

public class TestJsonProcessor {

	public static void main(String[] args) {
		
		JsonProcessor obj = new JsonProcessor();
		obj.writeJson();
		obj.readJson("email");
		obj.readJson("listaObiecte");
		obj.updateJsonFile("email", "altEmail");
		obj.deleteFromJsonFile("email");
	}
}
