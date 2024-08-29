
public class ReadData {

	public static void main(String[] args) throws IOException {

		// Create an object of FileInputStream
		// Converting physical File into Java Understandable
		FileInputStream fis = new FileInputStream("./data/commondata.properties");

		// create an object for properties class
		Properties property = new Properties();

		// load the property file
		property.load(fis);

		// Fetch the data-By calling getProperty()
		String data = property.getProperty("username");

		// Print The data
		System.out.println(data);

	}
}
}
