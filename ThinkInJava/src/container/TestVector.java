package container;


import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter your number :");
		Vector<Integer> vector = new Vector<Integer>();		
		int b= 0;
		int sum = 0;
		while(true){
			try{
				 b = System.in.read();
			}catch(Exception e){
				e.printStackTrace();
			}
			if(b=='\r'||b=='\n')
				break;
			else{
			  int num = b-'0';
			  vector.add(new Integer(num));
			  }
		}
//	  Enumeration<Integer> e = vector.elements();
//	  while(e.hasMoreElements())
//		sum+= e.nextElement().intValue();
	  
	  Iterator<Integer>  iterator = vector.iterator();
	  while(iterator.hasNext()){
		  sum+= iterator.next().intValue();
	  }
	  System.out.println(sum);
	  
//	 try {
//		System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine());
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	} 
	}
}

/**
 Vector ��ArrayList������ Hashtable��HashMap������
 
  
 * vector���̰߳�ȫ�ģ���arraylist�����̰߳�ȫ�ģ�
 * ��ʵ�÷���ûʲô�ر������������Ҫ���ڶ��߳�
 * ��ȫ���ߵĻ����»��Ǿ�������arraylist��linkedlist
 * �ȽϺã������Ըߣ����Ҫ�����߳�Ҫ��ܸߵĻ����»�����
 * vector�ȽϺã����������Բ�
 * 
 ���Ա�������ϣ���ǳ��õ����ݽṹ���ڽ���Java����ʱ��JDK�Ѿ�Ϊ�����ṩ��һϵ����Ӧ������ʵ�ֻ��������ݽṹ����Щ�����java.util���С�������ͼͨ���򵥵�����������߲���������������Լ������ȷʹ����Щ�ࡣ 
Collection
��List
����LinkedList
����ArrayList
����Vector
������Stack
��Set
Map
��Hashtable
��HashMap
��WeakHashMap

Collection�ӿ�
����Collection��������ļ��Ͻӿڣ�һ��Collection����һ��Object����Collection��Ԫ�أ�Elements����һЩCollection������ͬ��Ԫ�ض���һЩ���С�һЩ���������һЩ���С�Java SDK���ṩֱ�Ӽ̳���Collection���࣬Java SDK�ṩ���඼�Ǽ̳���Collection�ġ��ӽӿڡ���List��Set��
��������ʵ��Collection�ӿڵ��඼�����ṩ������׼�Ĺ��캯�����޲����Ĺ��캯�����ڴ���һ���յ�Collection����һ��Collection�����Ĺ��캯�����ڴ���һ���µ�Collection������µ�Collection�봫���Collection����ͬ��Ԫ�ء���һ�����캯�������û�����һ��Collection��
������α���Collection�е�ÿһ��Ԫ�أ�����Collection��ʵ��������Σ�����֧��һ��iterator()�ķ������÷�������һ�������ӣ�ʹ�øõ����Ӽ�����һ����Collection��ÿһ��Ԫ�ء����͵��÷����£�
��������Iterator it = collection.iterator(); // ���һ��������
��������while(it.hasNext()) {
������������Object obj = it.next(); // �õ���һ��Ԫ��
��������}
������Collection�ӿ������������ӿ���List��Set��

List�ӿ�
����List�������Collection��ʹ�ô˽ӿ��ܹ���ȷ�Ŀ���ÿ��Ԫ�ز����λ�á��û��ܹ�ʹ��������Ԫ����List�е�λ�ã������������±꣩������List�е�Ԫ�أ���������Java�����顣
������Ҫ�ᵽ��Set��ͬ��List��������ͬ��Ԫ�ء�
�������˾���Collection�ӿڱر���iterator()�����⣬List���ṩһ��listIterator()����������һ��ListIterator�ӿڣ��ͱ�׼��Iterator�ӿ���ȣ�ListIterator����һЩadd()֮��ķ�����������ӣ�ɾ�����趨Ԫ�أ�������ǰ����������
����ʵ��List�ӿڵĳ�������LinkedList��ArrayList��Vector��Stack��

LinkedList��
����LinkedListʵ����List�ӿڣ�����nullԪ�ء�����LinkedList�ṩ�����get��remove��insert������LinkedList���ײ���β������Щ����ʹLinkedList�ɱ�������ջ��stack�������У�queue����˫����У�deque����
����ע��LinkedListû��ͬ���������������߳�ͬʱ����һ��List��������Լ�ʵ�ַ���ͬ����һ�ֽ���������ڴ���Listʱ����һ��ͬ����List��
��������List list = Collections.synchronizedList(new LinkedList(...));

ArrayList��
����ArrayListʵ���˿ɱ��С�����顣����������Ԫ�أ�����null��ArrayListû��ͬ����
size��isEmpty��get��set��������ʱ��Ϊ����������add��������Ϊ��̯�ĳ��������n��Ԫ����ҪO(n)��ʱ�䡣�����ķ�������ʱ��Ϊ���ԡ�
����ÿ��ArrayListʵ������һ��������Capacity���������ڴ洢Ԫ�ص�����Ĵ�С��������������Ų��������Ԫ�ض��Զ����ӣ����������㷨��û�ж��塣����Ҫ�������Ԫ��ʱ���ڲ���ǰ���Ե���ensureCapacity����������ArrayList����������߲���Ч�ʡ�
������LinkedListһ����ArrayListҲ�Ƿ�ͬ���ģ�unsynchronized����

Vector��
����Vector�ǳ�����ArrayList������Vector��ͬ���ġ���Vector������Iterator����Ȼ��ArrayList������Iterator��ͬһ�ӿڣ����ǣ���ΪVector��ͬ���ģ���һ��Iterator�������������ڱ�ʹ�ã���һ���̸߳ı���Vector��״̬�����磬��ӻ�ɾ����һЩԪ�أ�����ʱ����Iterator�ķ���ʱ���׳�ConcurrentModificationException����˱��벶����쳣��

Stack ��
����Stack�̳���Vector��ʵ��һ������ȳ��Ķ�ջ��Stack�ṩ5������ķ���ʹ��Vector���Ա�������ջʹ�á�������push��pop����������peek�����õ�ջ����Ԫ�أ�empty�������Զ�ջ�Ƿ�Ϊ�գ�search�������һ��Ԫ���ڶ�ջ�е�λ�á�Stack�մ������ǿ�ջ��

Set�ӿ�
����Set��һ�ֲ������ظ���Ԫ�ص�Collection�������������Ԫ��e1��e2����e1.equals(e2)=false��Set�����һ��nullԪ�ء�
���������ԣ�Set�Ĺ��캯����һ��Լ�������������Collection�������ܰ����ظ���Ԫ�ء�
������ע�⣺����С�Ĳ����ɱ����Mutable Object�������һ��Set�еĿɱ�Ԫ�ظı�������״̬����Object.equals(Object)=true������һЩ���⡣

Map�ӿ�
������ע�⣬Mapû�м̳�Collection�ӿڣ�Map�ṩkey��value��ӳ�䡣һ��Map�в��ܰ�����ͬ��key��ÿ��keyֻ��ӳ��һ��value��Map�ӿ��ṩ3�ּ��ϵ���ͼ��Map�����ݿ��Ա�����һ��key���ϣ�һ��value���ϣ�����һ��key-valueӳ�䡣

Hashtable��
����Hashtable�̳�Map�ӿڣ�ʵ��һ��key-valueӳ��Ĺ�ϣ���κηǿգ�non-null���Ķ��󶼿���Ϊkey����value��
�����������ʹ��put(key, value)��ȡ������ʹ��get(key)������������������ʱ�俪��Ϊ������
Hashtableͨ��initial capacity��load factor���������������ܡ�ͨ��ȱʡ��load factor 0.75�Ϻõ�ʵ����ʱ��Ϳռ�ľ��⡣����load factor���Խ�ʡ�ռ䵫��Ӧ�Ĳ���ʱ�佫�������Ӱ����get��put�����Ĳ�����
ʹ��Hashtable�ļ�ʾ�����£���1��2��3�ŵ�Hashtable�У����ǵ�key�ֱ��ǡ�one������two������three����
��������Hashtable numbers = new Hashtable();
��������numbers.put(��one��, new Integer(1));
��������numbers.put(��two��, new Integer(2));
��������numbers.put(��three��, new Integer(3));
����Ҫȡ��һ����������2������Ӧ��key��
��������Integer n = (Integer)numbers.get(��two��);
��������System.out.println(��two = �� + n);
����������Ϊkey�Ķ���ͨ��������ɢ�к�����ȷ����֮��Ӧ��value��λ�ã�����κ���Ϊkey�Ķ��󶼱���ʵ��hashCode��equals������hashCode��equals�����̳��Ը���Object����������Զ�����൱��key�Ļ���Ҫ�൱С�ģ�����ɢ�к����Ķ��壬�������������ͬ����obj1.equals(obj2)=true�������ǵ�hashCode������ͬ���������������ͬ�������ǵ�hashCode��һ����ͬ�����������ͬ�����hashCode��ͬ�����������Ϊ��ͻ����ͻ�ᵼ�²�����ϣ���ʱ�俪���������Ծ�������õ�hashCode()�������ܼӿ��ϣ��Ĳ�����
���������ͬ�Ķ����в�ͬ��hashCode���Թ�ϣ��Ĳ�����������벻���Ľ�����ڴ���get��������null����Ҫ�����������⣬ֻ��Ҫ�μ�һ����Ҫͬʱ��дequals������hashCode����������Ҫֻд����һ����
����Hashtable��ͬ���ġ�

HashMap��
����HashMap��Hashtable���ƣ���֮ͬ������HashMap�Ƿ�ͬ���ģ���������null����null value��null key�������ǽ�HashMap��ΪCollectionʱ��values()�����ɷ���Collection����������Ӳ���ʱ�俪����HashMap�������ɱ�������ˣ�������������������൱��Ҫ�Ļ�����Ҫ��HashMap�ĳ�ʼ��������ù��ߣ�����load factor���͡�

WeakHashMap��
����WeakHashMap��һ�ָĽ���HashMap������keyʵ�С������á������һ��key���ٱ��ⲿ�����ã���ô��key���Ա�GC���ա�

�ܽ�
��������漰����ջ�����еȲ�����Ӧ�ÿ�����List��������Ҫ���ٲ��룬ɾ��Ԫ�أ�Ӧ��ʹ��LinkedList�������Ҫ�����������Ԫ�أ�Ӧ��ʹ��ArrayList��
������������ڵ��̻߳����У����߷��ʽ�����һ���߳��н��У����Ƿ�ͬ�����࣬��Ч�ʽϸߣ��������߳̿���ͬʱ����һ���࣬Ӧ��ʹ��ͬ�����ࡣ
����Ҫ�ر�ע��Թ�ϣ��Ĳ�������Ϊkey�Ķ���Ҫ��ȷ��дequals��hashCode������
�����������ؽӿڶ���ʵ�ʵ����ͣ��緵��List����ArrayList����������Ժ���Ҫ��ArrayList����LinkedListʱ���ͻ��˴��벻�øı䡣�������Գ����̡�

ͬ����
Vector��ͬ���ġ�������е�һЩ������֤��Vector�еĶ������̰߳�ȫ�ġ���ArrayList�����첽�ģ����ArrayList�еĶ��󲢲����̰߳�ȫ�ġ���Ϊͬ����Ҫ���Ӱ��ִ�е�Ч�ʣ���������㲻��Ҫ�̰߳�ȫ�ļ�����ôʹ��ArrayList��һ���ܺõ�ѡ���������Ա�������ͬ�������Ĳ���Ҫ�����ܿ�����
��������
���ڲ�ʵ�ֻ�������ArrayList��Vector����ʹ������(Array)�����Ƽ����еĶ��󡣵���������������������Ԫ�ص�ʱ�����Ԫ�ص���Ŀ�������ڲ�����Ŀǰ�ĳ������Ƕ���Ҫ��չ�ڲ�����ĳ��ȣ�Vectorȱʡ������Զ�����ԭ��һ�������鳤�ȣ�ArrayList��ԭ����50%,����������õ����������ռ�Ŀռ����Ǳ���ʵ����Ҫ��Ҫ�����������Ҫ�ڼ����б��������������ôʹ��Vector��һЩ���ƣ���Ϊ�����ͨ�����ü��ϵĳ�ʼ����С�����ⲻ��Ҫ����Դ������
ʹ��ģʽ
��ArrayList��Vector�У���һ��ָ����λ�ã�ͨ���������������ݻ����ڼ��ϵ�ĩβ���ӡ��Ƴ�һ��Ԫ�������ѵ�ʱ����һ���ģ����ʱ��������O(1)��ʾ�����ǣ�����ڼ��ϵ�����λ�����ӻ��Ƴ�Ԫ����ô���ѵ�ʱ��������������O(n-i)������n��������Ԫ�صĸ�����i����Ԫ�����ӻ��Ƴ�Ԫ�ص�����λ�á�Ϊʲô�������أ���Ϊ�ڽ�������������ʱ�򼯺��е�i�͵�i��Ԫ��֮�������Ԫ�ض�Ҫִ��λ�ƵĲ�������һ����ζ��ʲô�أ�
����ζ�ţ���ֻ�ǲ����ض�λ�õ�Ԫ�ػ�ֻ�ڼ��ϵ�ĩ�����ӡ��Ƴ�Ԫ�أ���ôʹ��Vector��ArrayList�����ԡ���������������������ѡ�������ļ��ϲ����ࡣ���磬LinkList�����������ӻ��Ƴ��������κ�λ�õ�Ԫ�������ѵ�ʱ�䶼��һ����?O(1)������������һ��Ԫ�ص�ʹ��ȱ�Ƚ�����O(i),����i��������λ��.ʹ��ArrayListҲ�����ף���Ϊ����Լ򵥵�ʹ�����������洴��iterator����Ĳ�����LinkListҲ��Ϊÿ�������Ԫ�ش�������������Ҫ������Ҳ���������Ŀ�����
����ڡ�Practical Java��һ����Peter Haggar����ʹ��һ���򵥵����飨Array��������Vector��ArrayList�������Ƕ���ִ��Ч��Ҫ��ߵĳ����Ӧ��ˡ���Ϊʹ������(Array)������ͬ��������ķ������úͲ���Ҫ�����·���ռ�Ĳ�����

Vector��Hashtable����jdk1.0�ľ����˵ġ�������java2��java��������ܸĶ��ܶ࣬Ϊ�˼��ݣ�����Vector��Hashtable�ֱ�ʵ�����µ�������ܵ�List��Map��ArrayList��HashMap����java2(Ҳ����jdk1.2)����еġ�
1. ��ȫ��Ч�ʷ��棺���Ҫʵ��ͬ����ȫ����Ҫ��Vector��Hashtable����������ArrayList��HashMap����ΪArrayList��HashMap������ͬ����ȫ�����⣬����Ч��Ҫ��Щ����Collections����Խ��������⡣
           Collections.synchronizedList
Collections.synchronizedMap
       2. ��Դ���棺�����ߵ���������ʱ�����Ƕ����Զ���������������Vector�ǰ���������һ����������ArrayList����������50%���ӣ�����Vector���ܽ�ʡ��Դ��
         3.��������Vector��Hashtableʹ��Enumeration��ArrayList��HashMapʹ��Iterator
      ARRAY�Ǳ�����������ʱ��˵�����ȵ�; ARRYLISTҲ�Ǻ�Vector����,�����Զ����ӳ��ȵġ�
       List��Set������
        List�����������У���Set����������
        List�е����ݿ����ظ�����Set���С�
      Vector��ArrayList��Hashtable��HashMap������
              1.Vector��ArrayList����ֵ��ϵ���󡣰��ղ����˳��������У��������ظ�ֵ��
              2.Hashtable��HashMap�Ƕ�����ϵ���󡣰����Լ������з�ʽ�������򣬲��������ظ�ֵ��
     HashMap���̳���Map�ӿڣ�ʵ����Keys���洢�ͷ���Values��Keys��Values������Ϊ�գ�����Hashtable�����������Hashtable���Keys����Ϊnull,
     Vector�ڲ�ʵ������Arrayʵ�ֵģ�Ҳͨ��Ԫ�ص���������������Ԫ�أ�����ֻ�ܴ��java.lang.Object���󣬲������ڴ�Ż����������ݣ�����Ҫ���һ������10,����new Integer(10)�����һ��Integer��װ������ٷŽ�ȥ�� 
����һ��:
HASHMAP����ͬ����,�̲߳���ȫ��,HASHTABLE��ͬ����,�̰߳�ȫ��?   
��Hashtable�У������漰���������д�ŵ����ݵķ�������ͬ����   
  �磺   
  public   synchronized   Object   put(Object   key,   Object   value)   {}   
  public   synchronized   Object   get(Object   key)   {}   
  ...   
    
  �Դ�����֤Hashtable���ᱻ����߳�ͬʱ����
��ΪHashMap�Ĺ���������û��synchronized�ؼ���
������synchronized  �ؼ�����?
����:
��synchronized�Ͳ���synchronized�򵥵�˵����   
  1��������2���ţ���synchronized���Ǵ���������   
  ���뷿�ӣ����ҽ�������ţ��������Ŵ򿪡�   
  ������synchronized���Ǵ�û�������Ž��롣   
  ���������Ž������ֻ�ܰ���������ϣ���û�취��Ԥ���������Ž������   
  �������clear()������synchronized�������ź�ȡ�����м���   
  ��ʱ���һ����synchronized��get()���������ȡ��һ�������ͳ�����


 * 
 * */
