package com.baidu.mobstat;

import android.util.Log;
import com.a.a.a.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class cz {
  public static int a = 7;
  
  static  {
  
  }
  
  private static String a() { return "sdkstat"; }
  
  private static void a(int paramInt, String paramString) {
    if (a(paramInt))
      Log.println(paramInt, a(), paramString); 
  }
  
  public static void a(String paramString) { a(3, paramString); }
  
  public static void a(String paramString, Throwable paramThrowable) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append('\n');
    stringBuilder.append(d(paramThrowable));
    a(3, stringBuilder.toString());
  }
  
  public static void a(Throwable paramThrowable) { a(3, d(paramThrowable)); }
  
  private static boolean a(int paramInt) { return (paramInt >= a); }
  
  public static void b(String paramString) { a(5, paramString); }
  
  public static void b(String paramString, Throwable paramThrowable) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append('\n');
    stringBuilder.append(d(paramThrowable));
    a(5, stringBuilder.toString());
  }
  
  public static void b(Throwable paramThrowable) { a(5, d(paramThrowable)); }
  
  public static void c(String paramString) { a(6, paramString); }
  
  public static void c(Throwable paramThrowable) { a(6, d(paramThrowable)); }
  
  private static String d(Throwable paramThrowable) {
    if (paramThrowable == null)
      return ""; 
    for (Throwable throwable = paramThrowable; throwable != null; throwable = throwable.getCause()) {
      if (throwable instanceof java.net.UnknownHostException)
        return ""; 
    } 
    StringWriter stringWriter = new StringWriter();
    a.a(paramThrowable, new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
}


/* Location:              E:\Android逆向\送给最好的TA\classes-dex2jar.jar!\com\baidu\mobstat\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */