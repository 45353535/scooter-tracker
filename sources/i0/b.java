package i0;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import d0.c;
import d0.v;
import java.io.IOException;
import java.util.Map;
import q0.g;
import q0.p;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f73857d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f73858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f73860c;

    public b(Drawable.Callback callback, String str, c cVar, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f73859b = str;
        } else {
            this.f73859b = str + IOUtils.DIR_SEPARATOR_UNIX;
        }
        this.f73860c = map;
        d(cVar);
        if (callback instanceof View) {
            this.f73858a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f73858a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f73857d) {
            ((v) this.f73860c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        v vVar = (v) this.f73860c.get(str);
        if (vVar == null) {
            return null;
        }
        Bitmap bitmapB = vVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f73858a;
        if (context == null) {
            return null;
        }
        String strC = vVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, p.m(bitmapDecodeByteArray, vVar.f(), vVar.d()));
                    }
                    g.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    g.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                g.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f73859b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f73859b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, p.m(bitmapDecodeStream, vVar.f(), vVar.d()));
                }
                g.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                g.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            g.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f73858a == null;
        }
        if (this.f73858a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f73858a;
    }

    public void d(c cVar) {
    }
}
