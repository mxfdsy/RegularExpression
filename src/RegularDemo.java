/**
 * @author  没想法的岁月
 * Created by 平凡的世界 on 2018/3/26.
 * 需求 验证输入正确的手机号码
 */
public class RegularDemo {
    public static void main(String[] args) {
        isTrueNumber("13068547186");
    }

    private static void isTrueNumber(String imput) {
        boolean  T = imput.matches("^1[3|5|6|8|4|7]\\d{9}$");
        if (T) {
            System.out.println("成功登录");
        }
        throw new DiyException("请输入正确的手机号码");
    }
}
