package rtg.learning.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataServiceStub dataServiceStub=new DataServiceStub();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		
		assertEquals(5,result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAll() {
		return new int[] {2,3,4,5};
	}
	
}
