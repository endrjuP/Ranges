
public class Range {
	private double begin, end;

	public Range() {
		this(0, 0);
	}

	public Range(double begin, double end) {
		this.begin = begin;
		this.end = end;
	}

	public Range(String expression, String separator) {
		String[] splited = expression.split(separator);
		begin = Integer.parseInt(splited[0]);
		end = Integer.parseInt(splited[1]);
	}
	public double getBegin(){
		return begin;
	}
	public void setBegin(double begin){
		this.begin = begin;
	}
	public double getEnd(){
		return end;
	}
	public void setEnd(double end){
		this.end = end;
	}
	public String toString(){
		return begin + ", " + end;
	}
	private static Range getSharedPartOfTwoRanges(Range firstRange, Range secondRange) {
		if(secondRange.getBegin() > firstRange.getBegin() && secondRange.getBegin() < firstRange.getEnd() && secondRange.getEnd() > firstRange.getBegin() && secondRange.getEnd() < firstRange.getEnd()){
			return secondRange;
		}
		else if(firstRange.getBegin() > secondRange.getBegin() && firstRange.getBegin() < secondRange.getEnd() && firstRange.getEnd() > secondRange.getBegin() && firstRange.getEnd() < secondRange.getEnd()){
			return firstRange;
		}
		else if(secondRange.getBegin() > firstRange.getBegin() && secondRange.getBegin() < firstRange.getEnd()){
			return new Range(secondRange.getBegin(), firstRange.getEnd());
		}
		else if(!(secondRange.getBegin() > firstRange.getBegin() && secondRange.getBegin() < firstRange.getEnd())){
			return null;
		}
		else if(firstRange.getBegin() > secondRange.getBegin() && firstRange.getBegin() < secondRange.getEnd()){
			return new Range(firstRange.getBegin(), secondRange.getEnd());
		}
		
		else return null;
	}

	public static Range getSharedRange(Range[] ranges){
		Range result = ranges[0];
		for(int i = 1; i < ranges.length; i++){
			result = getSharedPartOfTwoRanges(result, ranges[i]);
		}
		return result;
	}

}
