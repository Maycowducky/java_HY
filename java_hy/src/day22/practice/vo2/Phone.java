package day22.practice.vo2;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
	String num, name;
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getNum() != ((Phone) obj).getNum())
			return false;
		Phone other = (Phone) obj;
		return num == other.getNum() && name == other.name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(num, name);
		
	}
}
