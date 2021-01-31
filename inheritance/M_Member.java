/*
 	Introduction
 	1. Member 클래스를 부모클래스로 하고 Empolyee와 Company를 자손클래스로 하는 method 클래스를 생성한다
 	2. getter와 setter를 이용하기
 	3. 모든 속성은 private 접근제어자로 생성
 	4. 각 속성값의 조건을 추가해서 입력값 제어하기
 	// 성명은 한글만 가능(정규표현식의 활용)
 	// 비밀번호는 8~15글자의 대소문자, 특수기호, 숫자의 혼합
 	// 아이디, 비밀번호, 성명은 모두 null, 공백이 아니여야 한다.
 */

package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ashare.ShareMethod;

public abstract class M_Member {
	
	public static int ecount;

	private String id=null, passwd=null, name=null;
	
	//private 속성 값을 다른 클래스에서 이용할 수 있도록 getter, setter를 설정한다
	//어떻게 속성값을 get해오고 받은 속성값을 어떻게 set할 것인지를 작성
	
	//※※※ 각 속성 값이 string으로 설정했을 때 showAll 메서드의 연산자 정의를 만족시킬 수 있다. //※※※
	
	public String getId() {
		return id;
	} 

	public void setId(String id) {
		if(id!=null && !id.trim().isEmpty()) {
			// 공백이 들어왔을 때의 값을 배제하기 위해서 trim()으로 앞뒤 공백을 제거하고 isEmpth()로 공백여부를 판단가능
			this.id = id;
		} else
			System.out.println("아이디를 다시 입력해주세요!!");	
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		boolean bool = ShareMethod.isCheckPwd(passwd);
		if(bool) {
			this.passwd = passwd;
		} else 
			System.out.println("비밀번호가 잘못되었습니다\n"
				+ "비밀번호는 대소문자, 숫자, 특수문자가 포함된 8~15글자로 입력해주세요!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null && !name.trim().isEmpty()) {
			Pattern p = Pattern.compile("^[가-힣]{2,5}$");
			Matcher m = p.matcher(name);
			boolean b = m.matches();
			if(b) {
				this.name = name;
			}
		} else
			System.out.println("성명을 다시 입력해주세요!!");	
	}	
	
	public abstract void showAll();
}
