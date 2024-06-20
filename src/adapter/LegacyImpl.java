package adapter;

public class LegacyImpl implements Legacy {

	@Override
	public int calc(int num) {
		return num * 10;
	}
}
