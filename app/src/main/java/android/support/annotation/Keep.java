package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
public @interface Keep {}


/* Location:              E:\Android逆向\送给最好的TA\classes-dex2jar.jar!\android\support\annotation\Keep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */