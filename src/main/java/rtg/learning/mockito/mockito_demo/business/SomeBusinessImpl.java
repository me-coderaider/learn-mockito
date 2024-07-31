package rtg.learning.mockito.mockito_demo.business;

public class SomeBusinessImpl {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAll();

		int max = Integer.MIN_VALUE;
		for (int ele : data) {
			if (ele > max) {
				max=ele;
			}
		}
		return max;
	}
}

interface DataService {
	int[] retrieveAll();
}