package rtg.learning.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {

		when(dataServiceMock.retrieveAll()).thenReturn(new int[] { 12, 54, 33 });

		assertEquals(54, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAllData_EmptyArray() {
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {});
		assertEquals(0, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAllData_OneElementArray() {
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] { 10 });
		assertEquals(10, businessImpl.findTheGreatestFromAllData());
	}

}
