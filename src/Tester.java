import org.junit.Test;

import junit.framework.Assert;

public class Tester {

	@Test
	public void intervalsTest(){
        Range oper = new Range();
        Range range1 = new Range(1, 100);
        Range range2 = new Range(20,80);
        Range range3 = new Range(40,60);
        Range[] ranges = new Range[3];
        ranges[0] = range1;
        ranges[1] = range2;
        ranges[2] = range3;
        Range actual = oper.getSharedRange(ranges);
        Range expected = new Range(40,60);
        Assert.assertEquals(actual.getBegin(), expected.getBegin(),00.1);
        Assert.assertEquals(actual.getEnd(), expected.getEnd(), 00.1);
    }

}
