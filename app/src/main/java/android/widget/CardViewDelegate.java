package android.widget;

import android.graphics.drawable.Drawable;

interface CardViewDelegate {
  Drawable getBackground();
  
  boolean getPreventCornerOverlap();
  
  float getRadius();
  
  boolean getUseCompatPadding();
  
  void setBackgroundDrawable(Drawable paramDrawable);
  
  void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              E:\Android逆向\送给最好的TA\classes-dex2jar.jar!\android\widget\CardViewDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */