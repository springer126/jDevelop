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
 Vector 与ArrayList的区别 Hashtable与HashMap的区别
 
  
 * vector是线程安全的，而arraylist不是线程安全的，
 * 其实用法倒没什么特别大的区别，如果是要用在对线程
 * 安全不高的环境下还是尽可能用arraylist或linkedlist
 * 比较好，性能稍高，如果要用在线程要求很高的环境下还是用
 * vector比较好，不过性能稍差
 * 
 线性表，链表，哈希表是常用的数据结构，在进行Java开发时，JDK已经为我们提供了一系列相应的类来实现基本的数据结构。这些类均在java.util包中。本文试图通过简单的描述，向读者阐述各个类的作用以及如何正确使用这些类。 
Collection
├List
│├LinkedList
│├ArrayList
│└Vector
│　└Stack
└Set
Map
├Hashtable
├HashMap
└WeakHashMap

Collection接口
　　Collection是最基本的集合接口，一个Collection代表一组Object，即Collection的元素（Elements）。一些Collection允许相同的元素而另一些不行。一些能排序而另一些不行。Java SDK不提供直接继承自Collection的类，Java SDK提供的类都是继承自Collection的“子接口”如List和Set。
　　所有实现Collection接口的类都必须提供两个标准的构造函数：无参数的构造函数用于创建一个空的Collection，有一个Collection参数的构造函数用于创建一个新的Collection，这个新的Collection与传入的Collection有相同的元素。后一个构造函数允许用户复制一个Collection。
　　如何遍历Collection中的每一个元素？不论Collection的实际类型如何，它都支持一个iterator()的方法，该方法返回一个迭代子，使用该迭代子即可逐一访问Collection中每一个元素。典型的用法如下：
　　　　Iterator it = collection.iterator(); // 获得一个迭代子
　　　　while(it.hasNext()) {
　　　　　　Object obj = it.next(); // 得到下一个元素
　　　　}
　　由Collection接口派生的两个接口是List和Set。

List接口
　　List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置。用户能够使用索引（元素在List中的位置，类似于数组下标）来访问List中的元素，这类似于Java的数组。
和下面要提到的Set不同，List允许有相同的元素。
　　除了具有Collection接口必备的iterator()方法外，List还提供一个listIterator()方法，返回一个ListIterator接口，和标准的Iterator接口相比，ListIterator多了一些add()之类的方法，允许添加，删除，设定元素，还能向前或向后遍历。
　　实现List接口的常用类有LinkedList，ArrayList，Vector和Stack。

LinkedList类
　　LinkedList实现了List接口，允许null元素。此外LinkedList提供额外的get，remove，insert方法在LinkedList的首部或尾部。这些操作使LinkedList可被用作堆栈（stack），队列（queue）或双向队列（deque）。
　　注意LinkedList没有同步方法。如果多个线程同时访问一个List，则必须自己实现访问同步。一种解决方法是在创建List时构造一个同步的List：
　　　　List list = Collections.synchronizedList(new LinkedList(...));

ArrayList类
　　ArrayList实现了可变大小的数组。它允许所有元素，包括null。ArrayList没有同步。
size，isEmpty，get，set方法运行时间为常数。但是add方法开销为分摊的常数，添加n个元素需要O(n)的时间。其他的方法运行时间为线性。
　　每个ArrayList实例都有一个容量（Capacity），即用于存储元素的数组的大小。这个容量可随着不断添加新元素而自动增加，但是增长算法并没有定义。当需要插入大量元素时，在插入前可以调用ensureCapacity方法来增加ArrayList的容量以提高插入效率。
　　和LinkedList一样，ArrayList也是非同步的（unsynchronized）。

Vector类
　　Vector非常类似ArrayList，但是Vector是同步的。由Vector创建的Iterator，虽然和ArrayList创建的Iterator是同一接口，但是，因为Vector是同步的，当一个Iterator被创建而且正在被使用，另一个线程改变了Vector的状态（例如，添加或删除了一些元素），这时调用Iterator的方法时将抛出ConcurrentModificationException，因此必须捕获该异常。

Stack 类
　　Stack继承自Vector，实现一个后进先出的堆栈。Stack提供5个额外的方法使得Vector得以被当作堆栈使用。基本的push和pop方法，还有peek方法得到栈顶的元素，empty方法测试堆栈是否为空，search方法检测一个元素在堆栈中的位置。Stack刚创建后是空栈。

Set接口
　　Set是一种不包含重复的元素的Collection，即任意的两个元素e1和e2都有e1.equals(e2)=false，Set最多有一个null元素。
　　很明显，Set的构造函数有一个约束条件，传入的Collection参数不能包含重复的元素。
　　请注意：必须小心操作可变对象（Mutable Object）。如果一个Set中的可变元素改变了自身状态导致Object.equals(Object)=true将导致一些问题。

Map接口
　　请注意，Map没有继承Collection接口，Map提供key到value的映射。一个Map中不能包含相同的key，每个key只能映射一个value。Map接口提供3种集合的视图，Map的内容可以被当作一组key集合，一组value集合，或者一组key-value映射。

Hashtable类
　　Hashtable继承Map接口，实现一个key-value映射的哈希表。任何非空（non-null）的对象都可作为key或者value。
　　添加数据使用put(key, value)，取出数据使用get(key)，这两个基本操作的时间开销为常数。
Hashtable通过initial capacity和load factor两个参数调整性能。通常缺省的load factor 0.75较好地实现了时间和空间的均衡。增大load factor可以节省空间但相应的查找时间将增大，这会影响像get和put这样的操作。
使用Hashtable的简单示例如下，将1，2，3放到Hashtable中，他们的key分别是”one”，”two”，”three”：
　　　　Hashtable numbers = new Hashtable();
　　　　numbers.put(“one”, new Integer(1));
　　　　numbers.put(“two”, new Integer(2));
　　　　numbers.put(“three”, new Integer(3));
　　要取出一个数，比如2，用相应的key：
　　　　Integer n = (Integer)numbers.get(“two”);
　　　　System.out.println(“two = ” + n);
　　由于作为key的对象将通过计算其散列函数来确定与之对应的value的位置，因此任何作为key的对象都必须实现hashCode和equals方法。hashCode和equals方法继承自根类Object，如果你用自定义的类当作key的话，要相当小心，按照散列函数的定义，如果两个对象相同，即obj1.equals(obj2)=true，则它们的hashCode必须相同，但如果两个对象不同，则它们的hashCode不一定不同，如果两个不同对象的hashCode相同，这种现象称为冲突，冲突会导致操作哈希表的时间开销增大，所以尽量定义好的hashCode()方法，能加快哈希表的操作。
　　如果相同的对象有不同的hashCode，对哈希表的操作会出现意想不到的结果（期待的get方法返回null），要避免这种问题，只需要牢记一条：要同时复写equals方法和hashCode方法，而不要只写其中一个。
　　Hashtable是同步的。

HashMap类
　　HashMap和Hashtable类似，不同之处在于HashMap是非同步的，并且允许null，即null value和null key。，但是将HashMap视为Collection时（values()方法可返回Collection），其迭代子操作时间开销和HashMap的容量成比例。因此，如果迭代操作的性能相当重要的话，不要将HashMap的初始化容量设得过高，或者load factor过低。

WeakHashMap类
　　WeakHashMap是一种改进的HashMap，它对key实行“弱引用”，如果一个key不再被外部所引用，那么该key可以被GC回收。

总结
　　如果涉及到堆栈，队列等操作，应该考虑用List，对于需要快速插入，删除元素，应该使用LinkedList，如果需要快速随机访问元素，应该使用ArrayList。
　　如果程序在单线程环境中，或者访问仅仅在一个线程中进行，考虑非同步的类，其效率较高，如果多个线程可能同时操作一个类，应该使用同步的类。
　　要特别注意对哈希表的操作，作为key的对象要正确复写equals和hashCode方法。
　　尽量返回接口而非实际的类型，如返回List而非ArrayList，这样如果以后需要将ArrayList换成LinkedList时，客户端代码不用改变。这就是针对抽象编程。

同步性
Vector是同步的。这个类中的一些方法保证了Vector中的对象是线程安全的。而ArrayList则是异步的，因此ArrayList中的对象并不是线程安全的。因为同步的要求会影响执行的效率，所以如果你不需要线程安全的集合那么使用ArrayList是一个很好的选择，这样可以避免由于同步带来的不必要的性能开销。
数据增长
从内部实现机制来讲ArrayList和Vector都是使用数组(Array)来控制集合中的对象。当你向这两种类型中增加元素的时候，如果元素的数目超出了内部数组目前的长度它们都需要扩展内部数组的长度，Vector缺省情况下自动增长原来一倍的数组长度，ArrayList是原来的50%,所以最后你获得的这个集合所占的空间总是比你实际需要的要大。所以如果你要在集合中保存大量的数据那么使用Vector有一些优势，因为你可以通过设置集合的初始化大小来避免不必要的资源开销。
使用模式
在ArrayList和Vector中，从一个指定的位置（通过索引）查找数据或是在集合的末尾增加、移除一个元素所花费的时间是一样的，这个时间我们用O(1)表示。但是，如果在集合的其他位置增加或移除元素那么花费的时间会呈线形增长：O(n-i)，其中n代表集合中元素的个数，i代表元素增加或移除元素的索引位置。为什么会这样呢？以为在进行上述操作的时候集合中第i和第i个元素之后的所有元素都要执行位移的操作。这一切意味着什么呢？
这意味着，你只是查找特定位置的元素或只在集合的末端增加、移除元素，那么使用Vector或ArrayList都可以。如果是其他操作，你最好选择其他的集合操作类。比如，LinkList集合类在增加或移除集合中任何位置的元素所花费的时间都是一样的?O(1)，但它在索引一个元素的使用缺比较慢－O(i),其中i是索引的位置.使用ArrayList也很容易，因为你可以简单的使用索引来代替创建iterator对象的操作。LinkList也会为每个插入的元素创建对象，所有你要明白它也会带来额外的开销。
最后，在《Practical Java》一书中Peter Haggar建议使用一个简单的数组（Array）来代替Vector或ArrayList。尤其是对于执行效率要求高的程序更应如此。因为使用数组(Array)避免了同步、额外的方法调用和不必要的重新分配空间的操作。

Vector和Hashtable都是jdk1.0的就有了的。后来到java2后，java的容器框架改动很多，为了兼容，就让Vector和Hashtable分别实现了新的容器框架的List和Map。ArrayList和HashMap都是java2(也就是jdk1.2)后才有的。
1. 安全、效率方面：如果要实现同步安全，则要用Vector和Hashtable，否则则用ArrayList和HashMap，因为ArrayList和HashMap不考虑同步安全的问题，所以效率要高些。但Collections类可以解决这个问题。
           Collections.synchronizedList
Collections.synchronizedMap
       2. 资源方面：当两者的容量已满时，它们都会自动增长其容量，但Vector是按其容量的一倍增长，而ArrayList则按其容量的50%增加，所以Vector更能节省资源。
         3.迭代器：Vector和Hashtable使用Enumeration，ArrayList和HashMap使用Iterator
      ARRAY是必须在声明的时候说明长度的; ARRYLIST也是和Vector类似,可以自动增加长度的。
       List和Set的区别：
        List用来处理序列，而Set用来处理集。
        List中的内容可以重复，而Set则不行。
      Vector，ArrayList和Hashtable，HashMap的区别：
              1.Vector和ArrayList是数值联系对象。按照插入的顺序进行排列，可以有重复值。
              2.Hashtable和HashMap是对象联系对象。按照自己的排列方式进行排序，不可以有重复值。
     HashMap：继承了Map接口，实现用Keys来存储和访问Values，Keys和Values都可以为空，它与Hashtable类的区别在于Hashtable类的Keys不能为null,
     Vector内部实际是以Array实现的，也通过元素的整数索引来访问元素，但它只能存放java.lang.Object对象，不能用于存放基本类型数据，比如要存放一个整数10,得用new Integer(10)构造出一个Integer包装类对象再放进去。 
还有一点:
HASHMAP不是同步的,线程不安全的,HASHTABLE是同步的,线程安全的?   
在Hashtable中，所有涉及到更新其中存放的内容的方法都是同步的   
  如：   
  public   synchronized   Object   put(Object   key,   Object   value)   {}   
  public   synchronized   Object   get(Object   key)   {}   
  ...   
    
  以此来保证Hashtable不会被多个线程同时更改
因为HashMap的公共方法上没加synchronized关键字
如何理解synchronized  关键字呢?
比如:
用synchronized和不用synchronized简单的说就是   
  1个房子有2个门，用synchronized的是从有锁的门   
  进入房子，并且进入后锁门，出来后门打开。   
  而不用synchronized的是从没有锁的门进入。   
  从有锁的门进入的人只管把这个门锁上，但没办法干预从无锁的门进入的人   
  所以如果clear()方法是synchronized，他进门后取走所有鸡蛋   
  这时如果一个非synchronized的get()方法想进门取得一个鸡蛋就出错了


 * 
 * */
