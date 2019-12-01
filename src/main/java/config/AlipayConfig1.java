package config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig1 {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101700707111";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCdGpDivx/otCp5QcSEA3lkvnUSsyQE8c6fLaErOhl3vy5CBCWUcbiUNzkXnbl3MRnp5QE5qbRuBSY40dZXLS4wLHcayFyG1o7rgw02F2OBjTiMwjbbyXVkTNjqfCg/iilLxMaUxxxjSBXOOcSj2DKV5aE224JSRhLNv1VvDci/wBkGpBG1w3bKqBIIaPHyeFTAZmsFddIGbCot1Te2Pt1OOv1Z8X3/xq+s1ariWG2+rEV3f4CCGAhWP/aBb9AyiYahInb39xTeyOLw0OsjCkyZXvseB+gtRV8AOOrNN/FJD69kaGEFLWQ+IyX0kBnCiQPYBi/kpSXEilXULHq04T+nAgMBAAECggEAaCoeGIl6obMbWkyV/KXFDlwNibmHT1P4mKgLbXrXOgNjq1fOhu8j3/oBe7wTJYlD0kYJmu7/d9coMZJH2INXVY+V5Qcl+i02k8bPsqatTk+RSBrZfr7DfB5L0KVDlmWH3fn5ZNnj45v/AT5iN/R4DdU0IAhJDz3w58RN5BUynpe38fOkX+LWnuKzX1neNnI/ipwMfMZmATs+YLLsSLndga6jGs1phcLnkaKaHzrifXrztz6Xqd3lMofEx0347r2uoZLj8vWyhhhgUUQgV0TiD3CkFsMXVaBUnpOjMHOquNW+RNNAUVm6usMuXWdMZUQng+XZlvu1RZnmAbOSWRoiEQKBgQDZZNNluZ1dDG/fEzA1P7g2UHghGv1zvomz6GWBajbXW+JS6uweoyIEcrlyHJNF2Yhx5pS0+qv4wgj91RGPEH1F7Fh7ckAQ1aqn+36aGGhcy6FxWrDRsB0UBOBiizG7oMOBnXj5U6MeXK44usMUk7hke6lwyntGFys4KSm+3KUF/wKBgQC5ANQaxqRErm26HNuSnSxhN6QD1qVu3gmwfBbemi+iwubhTEOyKjFFiC6v2dkbGMUPzgJojOXZFK7swSkVO1eOAw8yoCzk9ylf276IVIiDZ82HvWsSLBHf5NtUQPh1Pxj7U1Mg2fwGKv53khR1+Ii1CnmqJDlv99gRsW9P+YHWWQKBgQCYCj8a9w0Kxab8IgRmSXFBc1gA90pph8nw7EkJkMpYJigMi8alyrwA1mfCWh/aC0C1QGmihWp+6N23ASxtnT+wBpL/izEpVPYs0+SASy+6LqRzjdT6YiyEEsEHyof2zIHPhd3Uqlz74B/tBxlmq8WbaS1g+AvtQkj01z0eAlzb6wKBgHK5ic7k+j9BL/hnJt7fqwLKn2Jl/IcpGDcibIg0c2/qj4SNZ7mXoqBs2A7i+FhuXt3zMdkl7u9UfTmCe3iYKS5+xTDu1YhToYu5WIlwaoualoEjvL8zJw6B/GVeOPV0YIiSXo2TwE8O4GjD5P5XVmd2jIYvGpNNzecC8nVU0+hZAoGAO9EdIljJUNQeU/e1nmRXBGX5w2OlEyuMULWO0Hz4urUVZV0jSB2QCyfNMR9aQuFLF2An/wIWl+WEdN+WPFltuioaFEkqBdQzPA+t/wAnqb4u2FmK8OHpM30TDBwbscgv3Ao6qi7LWzzb515ISZ39aF3G4gh4D1Iz/F/sbDo34N8=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvRr3XEC5hlMq5vGIMAQT4oiQY2qaHJUU1Qs0OFHHslEYNJwoo5WjUFUpgOBuvDkOaufKgGjKXCox4ijDDcBTdEKa7PkWZTR4cke1SX2QteclaVPpRMu0DEfx+3bu4lAkkTK96P7RS35mJ8rkMjo7JfRIK9EuaL+oIJ39CLLdhVAzCylPzw616W+HlKmMSp/gYjQNHiLMVD6EPQO3pFph1RcQnC0ZXYlAAPEAXF8rFOc4Qbdd8ZSGwwuyZc6NHGHy99AzDC7WDKuKrTMW7FnE+K8LB6cxVuf6gjSVBlLcCckEgZVIojbUUMwOAmfpR0v0J/YcPw+oNkKVxjNICcbGvwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://airsystemsunny.free.idcfengye.com/air_system/successful";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


