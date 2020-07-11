package url;
/**
 * 
 * @author 張源
 *@2020年6月30日
 */
public class Zhangyaun {

	public static void main(String[] args) {
		String user = "zy";
		String password = "123456zxcv";
		String ensurepw = "123456zxcv";
		String papers   = "中国居民身份证";
		String name     = "张源";
		String idnumber = "32121212121212000x";
		String email    = "123456@qq.com";
		long  telnumber   = 12345678912L;
		String passengers = "成人";
		boolean readitem = true;
		System.out.println("用户名:"+user+"\n登陆密码:"+password+"\n确认密码:"+ensurepw
				+"\n证件类型"+papers+"\n姓名"+name+"\n证件号码"+idnumber+"\n邮箱"+email+
				"\n电话号码"+telnumber+"\n旅客类型"+passengers+"\n我已阅读并同意遵守"+readitem);
				
				}

}
