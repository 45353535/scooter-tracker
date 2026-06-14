package com.taurusx.tax.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.widget.ImageView;
import com.taurusx.tax.log.LogUtil;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static ExecutorService f66262z = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Map<String, Pair<ImageView, o>> f66260w = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f66261y = (int) (Runtime.getRuntime().maxMemory() / 8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LruCache<String, Bitmap> f66259c = new y(f66261y);

    public static class c extends Exception {
        public c() {
        }

        public /* synthetic */ c(z zVar) {
            this();
        }
    }

    public interface o {
        void z(Bitmap bitmap, com.taurusx.tax.w.w wVar);
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f66263c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.taurusx.tax.w.w f66264o;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ImageView f66265w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f66266y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Bitmap f66267z;

        public w(Bitmap bitmap, ImageView imageView, String str, o oVar, com.taurusx.tax.w.w wVar) {
            this.f66267z = bitmap;
            this.f66265w = imageView;
            this.f66266y = str;
            this.f66263c = oVar;
            this.f66264o = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            if (this.f66267z != null && (imageView = this.f66265w) != null && TextUtils.equals((String) imageView.getTag(), this.f66266y)) {
                this.f66265w.setImageBitmap(this.f66267z);
            }
            o oVar = this.f66263c;
            if (oVar != null) {
                oVar.z(this.f66267z, this.f66264o);
            }
        }
    }

    public class y extends LruCache<String, Bitmap> {
        public y(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            try {
                return bitmap.getByteCount();
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ImageView f66268w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ o f66269y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66270z;

        public z(String str, ImageView imageView, o oVar) {
            this.f66270z = str;
            this.f66268w = imageView;
            this.f66269y = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapW;
            LogUtil.v("taurusx", "image request is starting");
            com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.NETWORK_RESP_NOT_SUCCESS;
            try {
                bitmapW = p.w(this.f66270z);
            } catch (Exception e10) {
                LogUtil.w("taurusx", "Download image exception: " + e10);
                wVar = e10 instanceof FileNotFoundException ? com.taurusx.tax.w.w.NETWORK_FILE_NOT_FOUNT : e10 instanceof SSLException ? com.taurusx.tax.w.w.NETWORK_SSL_EXCEPTION : e10 instanceof c ? com.taurusx.tax.w.w.NETWORK_RESP_NOT_SUCCESS : com.taurusx.tax.w.w.NETWORK_CONNECTION_EXCEPTION;
                bitmapW = null;
            }
            LogUtil.v("taurusx", "image request is complete");
            if (bitmapW != null) {
                wVar = com.taurusx.tax.w.w.SUCCESS;
                p.f66259c.put(this.f66270z, bitmapW);
            }
            p.w(this.f66268w, this.f66270z, bitmapW, wVar, this.f66269y);
        }
    }

    public static Bitmap w(String str) throws Exception {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        z zVar = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(6000);
                httpURLConnection.setReadTimeout(6000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 404 && (responseCode < 200 || responseCode >= 300)) {
                    throw new c(zVar);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return bitmapDecodeStream;
                } finally {
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection == null) {
                    throw th2;
                }
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = null;
        }
    }

    public static void y(String str) {
        z(null, str, null);
    }

    public static Bitmap z(String str) {
        LruCache<String, Bitmap> lruCache = f66259c;
        if (lruCache != null) {
            return lruCache.get(str);
        }
        return null;
    }

    public static void z(ImageView imageView, String str) {
        try {
            z(imageView, str, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void z(ImageView imageView, String str, o oVar) {
        if (TextUtils.isEmpty(str)) {
            if (oVar != null) {
                oVar.z(null, com.taurusx.tax.w.w.EMPTY_URL);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setTag(str);
        }
        Bitmap bitmap = f66259c.get(str);
        if (bitmap != null) {
            w(imageView, str, bitmap, com.taurusx.tax.w.w.SUCCESS, oVar);
            LogUtil.v("taurusx", "show image from cache");
        } else {
            f66262z.execute(new z(str, imageView, oVar));
        }
    }

    public static void w(ImageView imageView, String str, Bitmap bitmap, com.taurusx.tax.w.w wVar, o oVar) {
        m.c(new w(bitmap, imageView, str, oVar, wVar));
    }
}
