package com.nirenr.screencapture;

import android.graphics.Bitmap;

public interface ScreenCaptureListener {
  void onScreenCaptureDone(Bitmap paramBitmap);
  
  void onScreenCaptureError(String paramString);
}


/* Location:              E:\Android逆向\送给最好的TA\classes-dex2jar.jar!\com\nirenr\screencapture\ScreenCaptureListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */