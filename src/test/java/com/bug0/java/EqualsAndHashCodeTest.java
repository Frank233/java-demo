package com.bug0.java;

/**
 * test equals and hashCode methods
 * @author Paul
 *
 */
public class EqualsAndHashCodeTest {

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public EqualsAndHashCodeTest(String key) {
		super();
		this.key = key;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
//		System.out.println("key.hashCode()");
//		System.out.println(key.hashCode());
//		System.out.println(result);
		return result;
	}

	public EqualsAndHashCodeTest() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashCodeTest other = (EqualsAndHashCodeTest) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

}
