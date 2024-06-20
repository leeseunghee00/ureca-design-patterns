package adapter;

public class AdapterImpl implements Adapter {

	private Legacy legacy;

	public AdapterImpl(Legacy legacy) {
		this.legacy = legacy;
	}

	// legacy 의 결과를 이어서 추가로 처리할 내용
	public int convertLegacyData(int legacyResult) {
		System.out.println(legacyResult);
		return legacyResult * 2;
	}

	@Override
	public int calc(int num) {
		// return num * 10;
		return convertLegacyData(legacy.calc(num));
	}
}
