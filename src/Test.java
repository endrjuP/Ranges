
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Range range1 = new Range(1, 100);
		Range range2 = new Range(20, 80);
		Range range4 = new Range(45, 55);
		Range range3 = new Range(40, 60);
		Range[] ranges = new Range[4];
		ranges[0] = range1;
		ranges[1] = range2;
		ranges[2] = range4;
		ranges[3] = range3;
		System.out.println(Range.getSharedRange(ranges));
	}

}
