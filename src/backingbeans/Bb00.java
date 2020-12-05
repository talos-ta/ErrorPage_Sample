package backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb00 {

	public void button() {
		String str = null;
		str.equals("aaa");
	}
}
