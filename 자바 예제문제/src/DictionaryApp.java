abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key,String value);
	abstract String delete(String key);
	abstract int length();
}


class Dictionary extends PairMap{
	int n;
	int j=0;
	public Dictionary(int n) {
		keyArray=new String[n];
		valueArray=new String[n];
		this.n=n;
	}
	@Override
	public int length() {
		return n;
	}
	
	@Override
	public void put(String key,String value) {
		keyArray[j++]=key;
		valueArray[j++]=value;
		for(int i=0;i<length();i++) {
			if(key.equals(keyArray[i]))
				valueArray[i]=value;
		}
	}
	
	@Override
	public String get(String key) {
		for(int i=0;i<length();i++) {
			if(key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;
	}
	
	@Override
	public String delete(String key) {
		for(int i=0;i<length();i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i]=null;
				return valueArray[i];
			}
		}
		return null;
	}
}
public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic =new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
	}
}
