package com.bug0.java;

import java.util.HashSet;
import java.util.Set;

public class BaseTest {

	public static void main(String[] args) {
		
		// else if
//		int i = 5;
//		if (i < 5) {
//			System.out.println("i < 5");
//		} else if (i < 6){
//			System.out.println("i < 6");
//		}

		// int 和 char 互转
//		int i = 97;
//		char c = (char)i;
//		System.out.println(c);

		// BigDecimal 小数位数
//		String str = "1.239";
//		BigDecimal bd1 = new BigDecimal(str);
//		System.out.println(bd1);
//		BigDecimal bd2 = bd1.setScale(2, BigDecimal.ROUND_DOWN);
//		System.out.println(bd2);
//		System.out.println(bd1);
//		System.out.println(bd2.compareTo(bd1));

		// 强制转换null
//		Map<String, Object> map = new HashMap<>();
//		Object result = map.get("123");
//		System.out.println(result);
//		List list = (List)map.get("123");
//		System.out.println(list);

		// 强制转换null
//		String test = "111";
//		String result = String.valueOf(test);
//		System.out.println(result);

		// 科学计数法
//		System.out.println("科学计数法数字");
//		double num1 = 50123.12E25;
//		System.out.println(num1);
//		BigDecimal bd1 = new BigDecimal(num1);
//		System.out.println(bd1.toPlainString());
//		System.out.println(bd1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
//		System.out.println("普通数字");
//		double num2 = 50123.12;
//		System.out.println(num2);
//		BigDecimal bd2 = new BigDecimal(num2);
//		System.out.println(bd2.toPlainString());
//		System.out.println(bd2.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

		// 货币格式化
//		NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(Locale.CHINA); // 建立货币格式化引用
//
//		System.out.println(CURRENCY_FORMAT.format(new BigDecimal(num2)));
//
//		NumberFormat nf = new DecimalFormat("#,###.##");
//		System.out.println(nf.format(bd1));
//		System.out.println(nf.format(bd2));
		
		// for 循环各个部分执行顺序
//		int i = 1;
//		for ( ; i<10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("i=" + i);
		
		// Integer 比较
//		Integer i1 = 233;
//		Integer i2 = 233;
//		System.out.println(i1 == i2);
//		System.out.println(i1.equals(i2));
//		System.out.println(Objects.equals(i1, i2));
		
		// new array
//		String[] a1 = new String[] {"1","2","3"};
//		System.out.println(a1[0]);
		
		// split
//		String s1 = "a,b,c";
//		String s2 = "a,b,c,";
//		String s3 = "a,b,c,,";
//		System.out.println(s1.split(",").length);
//		System.out.println(s2.split(",").length);
//		System.out.println(s3.split(",").length);
		
		// 菱形语法 java7以后
//		List<String> testList = new ArrayList<String>();
//		List<String> testList2 = new ArrayList<>();
		
		// equals和hashCode, 常说的是覆写equals时也要覆写hashCode, 那么覆写hashCode时也必须要覆写equals吗? 
		// : 要，因为equals和hashCode要保持一致，equals就是普通比较之用，使用较为明显，而hashCode的用处在Map和Set的Key值相等判断，相对不易察觉，两处应保持一致。
		// equals默认使用==来比较内存地址, 和hashCode是一回事吗?
		// : 不是, hashCode一样了, 内存地址仍不同
		EqualTest a = new EqualTest();
		EqualTest b = new EqualTest();
		a.setKey("1");
		b.setKey("1");
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		// 内部类
		
		
		// lamda表达式
		/*
		 * (参数类型 参数名) -> { 方法体; return 返回值; }
		 */
//		Runnable r1 = () -> System.out.println("1"); // 没有入参时,小括号不可省略
//		Runnable r1 = (int a, int b) -> a + b;
//		Runnable r1 = (a) -> System.out.println(a);
//		r1.run();
		
		// stream
//		List<Map<String, Double>> pairArrayList = new ArrayList<>(3);
//		HashMap<String, Double> m1 = new HashMap<String, Double>();
//		m1.put("version", 12.10);
//		HashMap<String, Double> m2 = new HashMap<String, Double>();
//		m1.put("version", 12.19);
//		HashMap<String, Double> m3 = new HashMap<String, Double>();
//		m1.put("version", 6.28);
//		pairArrayList.add(m1);
//		pairArrayList.add(m2);
//		pairArrayList.add(m3);
//		Map<String, Double> map = pairArrayList.stream().collect();
		
		// set
//		HashSet set = new HashSet<>();
//		set.add("1");
	}

}
