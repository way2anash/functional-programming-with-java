package programming;

import java.util.stream.LongStream;

public class FP11Parallelizing {

	public static void main(String[] args) {
		
		Long time = System.currentTimeMillis();
		
		//System.out.println(LongStream.range(0, 1000000000).sum()); // Takes 892 milli seconds to process
		
		System.out.println(LongStream.range(0, 1000000000).parallel().sum()); // Takes 397 milli seconds to process
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
