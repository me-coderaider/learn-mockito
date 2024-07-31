package rtg.learning.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		DataService dataServiceMock = mock(DataService.class);
		// when this called; dataServiceMock.retrieveAllData() => return this; new int[]{25,15,5};
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {12,54,33});
		
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		assertEquals(54,businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_EmptyArray() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {});
		
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		assertEquals(0,businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_OneElementArray() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {10});
		
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		assertEquals(10,businessImpl.findTheGreatestFromAllData());
	}

}
