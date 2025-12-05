package stringManipulation;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//StringBuffer_StringBuilder are mutable
		StringBuffer sb=new StringBuffer("hello");
		sb.append("not");
		System.out.println(sb);
		
		/*1)1.0-legacy class
		2)thread safe - sync-slow
		3)writing purpose
		
		*/
		StringBuilder sbb=new StringBuilder("megha");
		sbb.reverse();
		System.out.println(sbb);
		/*1.4
		 * not thread safe
		 * reading purpose
		 */
		
	}

}
