package sg.bigo.ads.common.aa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 3;
            }
            if (type != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
            }
            return 0;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "NetworkUtil", "exception on get network info:" + th2.getMessage());
            return 0;
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String c(Context context) {
        String property;
        String strC = sg.bigo.ads.common.x.a.c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = jCurrentTimeMillis - sg.bigo.ads.common.x.a.d();
        if (!TextUtils.isEmpty(strC) && jD > 0 && jD < r.f102831d.a(1) * 7) {
            return strC;
        }
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb2 = new StringBuilder();
        int length = property.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = property.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        sg.bigo.ads.common.x.a.a(string);
        sg.bigo.ads.common.x.a.b(jCurrentTimeMillis);
        return string;
    }
}
