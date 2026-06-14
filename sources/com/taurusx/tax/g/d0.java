package com.taurusx.tax.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.taurusx.tax.g.d0;
import com.taurusx.tax.log.LogUtil;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public class d0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66111w = System.getProperty("http.agent");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static String f66112z;

    public static String w(final Context context) {
        if (!TextUtils.isEmpty(f66112z)) {
            return f66112z;
        }
        final String[] strArr = new String[1];
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                LogUtil.d("taurusx", "get user agent in main looper");
                String strZ = z(context);
                strArr[0] = strZ;
                if (!TextUtils.isEmpty(strZ)) {
                    f66112z = strArr[0];
                }
            } else {
                LogUtil.d("taurusx", "get user agent in thread, switch to main looper");
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        d0.z(strArr, context, countDownLatch);
                    }
                });
                countDownLatch.await();
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(f66112z)) {
            LogUtil.d("taurusx", "get empty user agent, use default value");
            f66112z = f66111w;
        }
        return f66112z;
    }

    public static /* synthetic */ void z(String[] strArr, Context context, CountDownLatch countDownLatch) {
        LogUtil.d("taurusx", "switch to main looper done, getting");
        if (TextUtils.isEmpty(f66112z)) {
            try {
                strArr[0] = z(context);
            } catch (Exception unused) {
                strArr[0] = "";
            }
            if (!TextUtils.isEmpty(strArr[0])) {
                f66112z = strArr[0];
            }
        }
        countDownLatch.countDown();
    }

    public static String z(Context context) {
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (TextUtils.isEmpty(defaultUserAgent)) {
            LogUtil.d("taurusx", "do get user agent, result is empty");
            return defaultUserAgent;
        }
        LogUtil.d("taurusx", "do get user agent ok! " + defaultUserAgent);
        return defaultUserAgent;
    }
}
