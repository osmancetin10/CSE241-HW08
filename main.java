package hw8;

public class main {

	public static void main(String[] args) {
		
		int i;
		
		
		ArrayList<Integer> trying =new ArrayList<Integer>();
		trying.add(5);
		trying.add(2);
		trying.add(3);
		trying.add(9);
		System.out.printf("Example of <Integer>ArrayList that made by default constructor\n");
		for(i=0;i<trying.size();i++) {
			
			System.out.printf("%d ",trying.get_element(i));
		}
		
		ArrayList<Integer> trying2 =new ArrayList<Integer>(trying);
		trying2.add(87);
		trying2.add(871);
		trying2.add(872);
		trying2.add(873);
		trying2.add(875);
		trying2.add(95);
		
		System.out.printf("\n\nExample of <Integer>ArrayList that made by object taken constructor\n");
		for(i=0;i<trying2.size();i++) {
			
			System.out.printf("%d ",trying2.get_element(i));
		}
		
		trying2.remove(87);
		
		
		trying2.addAll(trying);
		System.out.printf("\n\nExample of <Integer>ArrayList that add object to another object and remove function\n");
		for(i=0;i<trying2.size();i++) {
			
			System.out.printf("%d ",trying2.get_element(i));
		}
		System.out.printf("\n\n****************************************************************");
		
		//----------------------------------------------------------------------
		
		ArrayList<String> trying_char =new ArrayList<String>();
		trying_char.add("osman");
		trying_char.add("cetin");
		trying_char.add("161044069");
		
		System.out.printf("\n\nExample of <String>ArrayList that made by default constructor\n");
		for(i=0;i<trying_char.size();i++) {
			
			System.out.printf("%s ",trying_char.get_element(i));
		}
		
		ArrayList<String> trying_char2 =new ArrayList<String>(trying_char);
		trying_char2.add("this");
		trying_char2.add("is");
		trying_char2.add("my");
		trying_char2.add("project");
		
		System.out.printf("\n\nExample of <String>ArrayList that made by object taken constructor\n");
		for(i=0;i<trying_char2.size();i++) {
			
			System.out.printf("%s ",trying_char2.get_element(i));
		}
		
		trying_char2.remove("161044069");
		
		
		trying_char2.addAll(trying_char);
		System.out.printf("\n\nExample of <String>ArrayList that add object to another object and remove function\n");
		for(i=0;i<trying_char2.size();i++) {
			
			System.out.printf("%s ",trying_char2.get_element(i));
		}
		System.out.printf("\n\n****************************************************************");
		
		//----------------------------------------------------------------------------------
		
		HashSet<Integer> trying_set =new HashSet<Integer>();
		trying_set.add(2);
		trying_set.add(6);
		trying_set.add(8);
		trying_set.add(1);
		trying_set.add(8);//can't added 
		
		System.out.printf("\n\nExample of <Integer>HashSet that made by default constructor\n");
		for(i=0;i<trying_set.size();i++) {
			
			System.out.printf("%d ",trying_set.get_element(i));
		}
		
		HashSet<Integer> trying_set2 =new HashSet<Integer>(trying_set);
		trying_set2.add(871);
		trying_set2.add(872);
		trying_set2.add(875);
		trying_set2.add(878);
		trying_set2.add(874);
		trying_set2.add(95);
		
		System.out.printf("\n\nExample of <Integer>HashSet that made by object taken constructor\n");
		for(i=0;i<trying_set2.size();i++) {
			
			System.out.printf("%d ",trying_set2.get_element(i));
		}
		
		trying_set2.remove(6);
		
		
		//trying_set2.addAll(trying_set);
		System.out.printf("\n\nExample of <Integer>HashSet that add object to another object and remove function\n");
		for(i=0;i<trying_set2.size();i++) {
			
			System.out.printf("%d ",trying_set2.get_element(i));
		}
		
		System.out.printf("\n\n****************************************************************");
		
		//-----------------------------------------------------------------
		
		HashSet<String> trying_setchar =new HashSet<String>();
		trying_setchar.add("osman");
		trying_setchar.add("cetin");
		trying_setchar.add("161044069");
		
		System.out.printf("\n\nExample of <String>HashSet that made by default constructor\n");
		for(i=0;i<trying_setchar.size();i++) {
			
			System.out.printf("%s ",trying_setchar.get_element(i));
		}
		
		HashSet<String> trying_setchar2 =new HashSet<String>(trying_setchar);
		trying_setchar2.add("this");
		trying_setchar2.add("is");
		trying_setchar2.add("my");
		trying_setchar2.add("project");
		
		System.out.printf("\n\nExample of <String>HashSet that made by object taken constructor\n");
		for(i=0;i<trying_setchar2.size();i++) {
			
			System.out.printf("%s ",trying_setchar2.get_element(i));
		}
		
		trying_setchar2.remove("161044069");
		
		
		trying_setchar2.addAll(trying_setchar);
		System.out.printf("\n\nExample of <String>HashSet that add object to another object and remove function\n");
		for(i=0;i<trying_setchar2.size();i++) {
			
			System.out.printf("%s ",trying_setchar2.get_element(i));
		}
		System.out.printf("\n\n****************************************************************");
		
		//-----------------------------------------------------------------------------
		
		
		LinkedList<Integer> trying_linked =new LinkedList<Integer>();
		trying_linked.add(5);
		trying_linked.add(2);
		trying_linked.add(3);
		trying_linked.add(9);
		
		System.out.printf("\n\nExample of <Integer>Linked that made by default constructor\n");
		for(i=0;i<trying_linked.size();i++) {
			
			System.out.printf("%d ",trying_linked.get_element(i));
		}
		
		LinkedList<Integer> trying_linked2 =new LinkedList<Integer>(trying_linked);
		trying_linked2.add(87);
		trying_linked2.add(871);
		trying_linked2.add(872);
		trying_linked2.add(873);
		trying_linked2.add(875);
		trying_linked2.add(95);
		
		System.out.printf("\n\nExample of <Integer>LinkedList that made by object taken constructor\n");
		for(i=0;i<trying_linked2.size();i++) {
			
			System.out.printf("%d ",trying_linked2.get_element(i));
		}
		
		trying_linked2.remove(87);
		
		
		trying_linked2.addAll(trying_linked);
		System.out.printf("\n\nExample of <Integer>ArrayList that add object to another object and remove function\n");
		for(i=0;i<trying_linked2.size();i++) {
			
			System.out.printf("%d ",trying_linked2.get_element(i));
			
		}
		
		System.out.printf("\n\n****************************************************************");
		//-------------------------------------------------------------------------
		
		LinkedList<String> trying_linkedchar =new LinkedList<String>();
		trying_linkedchar.add("osman");
		trying_linkedchar.add("cetin");
		trying_linkedchar.add("161044069");
		
		System.out.printf("\n\nExample of <String>LinkedList that made by default constructor\n");
		for(i=0;i<trying_linkedchar.size();i++) {
			
			System.out.printf("%s ",trying_linkedchar.get_element(i));
		}
		
		LinkedList<String> trying_linkedchar2 =new LinkedList<String>(trying_linkedchar);
		trying_linkedchar2.add("this");
		trying_linkedchar2.add("is");
		trying_linkedchar2.add("my");
		trying_linkedchar2.add("project");
		
		System.out.printf("\n\nExample of <String>LinkedList that made by object taken constructor\n");
		for(i=0;i<trying_linkedchar2.size();i++) {
			
			System.out.printf("%s ",trying_linkedchar2.get_element(i));
		}
		
		trying_linkedchar2.remove("161044069");
		
		
		trying_linkedchar2.addAll(trying_linkedchar);
		System.out.printf("\n\nExample of <String>LinkedList that add object to another object and remove function\n");
		for(i=0;i<trying_linkedchar2.size();i++) {
			
			System.out.printf("%s ",trying_linkedchar2.get_element(i));
		}
		System.out.printf("\n\n****************************************************************");
		
		//-----------------------------------------------------------------------------
		
		
	}

}