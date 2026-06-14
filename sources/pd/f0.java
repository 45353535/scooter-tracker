package pd;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import java.io.Closeable;
import java.io.Flushable;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f98222a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f98223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f98224c;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        f98223b = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
        f98224c = charArray2;
    }

    private f0() {
    }

    public static final float a(int i10) {
        return g0.R(Integer.valueOf(Color.blue(i10)), 255.0f);
    }

    public static final void b(Closeable closeable) {
        g0.c(closeable);
    }

    public static final byte[] c(String base64, int i10) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return g0.e(base64, i10);
    }

    public static /* synthetic */ byte[] d(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return c(str, i10);
    }

    public static final String e(String data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        return g0.i(data, i10);
    }

    public static /* synthetic */ String f(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return e(str, i10);
    }

    public static final int g(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g0.k(context, f10);
    }

    public static final void h(Flushable flushable) {
        g0.o(flushable);
    }

    public static final Object i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? g0.N((List) obj) : obj instanceof Map ? g0.O((Map) obj) : obj;
    }

    public static final DownloadManager j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g0.s(context);
    }

    public static final Location k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g0.u(context);
    }

    public static final float l(Rect mainRect, Rect coverRect) {
        Intrinsics.checkNotNullParameter(mainRect, "mainRect");
        Intrinsics.checkNotNullParameter(coverRect, "coverRect");
        int iWidth = mainRect.width() * mainRect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(mainRect.right, coverRect.right) - Math.max(mainRect.left, coverRect.left)) * Math.max(0, Math.min(mainRect.bottom, coverRect.bottom) - Math.max(mainRect.top, coverRect.top)))) / iWidth;
    }

    public static final Uri m(String str) {
        try {
            return Uri.parse(n(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String n(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (s(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return str;
        }
    }

    public static final float o(int i10) {
        return g0.R(Integer.valueOf(Color.green(i10)), 255.0f);
    }

    public static final void p(Object obj, h action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (obj != null) {
            action.execute(obj);
        }
    }

    public static final boolean q(Uri uri) {
        String string;
        return (uri == null || (string = uri.toString()) == null || !g0.x(string)) ? false : true;
    }

    public static final boolean r(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return g0.x(url);
    }

    public static final boolean s(String str) {
        Boolean bool;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            new URL(str);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static final Integer t(String str) {
        if (str != null && str.length() != 0) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final Integer u(String str) {
        if (str != null && str.length() != 0) {
            try {
                if (str.charAt(0) == '#' && str.length() == 9) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('#');
                    String strSubstring = str.substring(7, 9);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring);
                    String strSubstring2 = str.substring(1, 7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring2);
                    str = sb2.toString();
                }
                return Integer.valueOf(Color.parseColor(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final int v(float f10, int i10) {
        return (int) ((i10 / f10) + 0.5f);
    }

    public static final float w(int i10) {
        return g0.R(Integer.valueOf(Color.red(i10)), 255.0f);
    }

    public static final Intent x(BroadcastReceiver receiver, Context context, IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        return g0.D(context, receiver, intentFilter);
    }
}
