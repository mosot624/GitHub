package tryWithResourcesTutorial;

public class TryWithResources {

	public static void main(String[] args) {
		try(temp temp1 = new temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close");
	}
	
}