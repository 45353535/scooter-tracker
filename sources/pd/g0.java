package pd;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import com.amazon.device.ads.DtbConstants;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rd.g f98225a = new rd.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rd.b f98226b = new rd.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final rd.e f98227c = new rd.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final rd.f f98228d = new rd.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final rd.d f98229e = new rd.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final rd.c f98230f = new rd.c();

    public static final void A(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        map.putAll(map2);
    }

    public static final void B(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map2 == null) {
            return;
        }
        map.putAll(map2);
    }

    public static final long C(InputStream inputStream, File file) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long jB = uf.b.b(inputStream, fileOutputStream, 0, 2, null);
                uf.c.a(fileOutputStream, null);
                uf.c.a(inputStream, null);
                return jB;
            } finally {
            }
        } finally {
        }
    }

    public static final Intent D(Context context, BroadcastReceiver receiver, IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(receiver, intentFilter, 2) : context.registerReceiver(receiver, intentFilter);
    }

    public static final void E(Rect rect, Rect rectPx, float f10) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rectPx, "rectPx");
        rect.set(f0.v(f10, rectPx.left), f0.v(f10, rectPx.top), f0.v(f10, rectPx.right), f0.v(f10, rectPx.bottom));
    }

    public static final void F(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.clear();
        a(collection, collection2);
    }

    public static final void G(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.clear();
        B(map, map2);
    }

    public static final Boolean H(Object obj, Boolean bool) {
        return (Boolean) f98226b.d(obj, bool);
    }

    public static /* synthetic */ Boolean I(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return H(obj, bool);
    }

    public static final Double J(Object obj, Double d10) {
        return (Double) f98230f.d(obj, d10);
    }

    public static /* synthetic */ Double K(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return J(obj, d10);
    }

    public static final Integer L(Object obj, Integer num) {
        return (Integer) f98227c.d(obj, num);
    }

    public static /* synthetic */ Integer M(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return L(obj, num);
    }

    public static final JSONArray N(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objI = f0.i(it.next());
            if (objI != null) {
                jSONArray.put(objI);
            }
        }
        return jSONArray;
    }

    public static final JSONObject O(Map map) throws JSONException {
        Object objI;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            Object value = entry.getValue();
            if (string != null && string.length() > 0 && value != null && (objI = f0.i(value)) != null) {
                jSONObject.put(string, objI);
            }
        }
        return jSONObject;
    }

    public static final Long P(Object obj, Long l10) {
        return (Long) f98228d.d(obj, l10);
    }

    public static /* synthetic */ Long Q(Object obj, Long l10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return P(obj, l10);
    }

    public static final float R(Number number, float f10) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return zf.a.d((number.floatValue() / f10) * 100) / 100.0f;
    }

    public static final int S(Context context, int i10, float f10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(i10, f10, g.b(context));
    }

    public static final void a(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    public static final byte[] b(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final String d(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(hashCode())");
        return hexString;
    }

    public static final byte[] e(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return f(bytes, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final byte[] f(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            return Base64.decode(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] g(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return e(str, i10);
    }

    public static /* synthetic */ byte[] h(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return f(bArr, i10);
    }

    public static final String i(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return j(bytes, i10);
    }

    public static final String j(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrF = f(bArr, i10);
        if (bArrF != null) {
            return new String(bArrF, Charsets.UTF_8);
        }
        return null;
    }

    public static final int k(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return S(context, 1, f10);
    }

    public static final p l(p[] pVarArr, String str) {
        String lowerCase;
        String key;
        Intrinsics.checkNotNullParameter(pVarArr, "<this>");
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            for (p pVar : pVarArr) {
                if (pVar == null || (key = pVar.getKey()) == null) {
                    lowerCase = null;
                } else {
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                    lowerCase = key.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                }
                if (StringsKt.O(lowerCase, lowerCase2, false, 2, null)) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public static final Activity m(ContextWrapper contextWrapper, int i10) {
        Intrinsics.checkNotNullParameter(contextWrapper, "<this>");
        if (i10 >= 10) {
            return null;
        }
        Context baseContext = contextWrapper.getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (baseContext instanceof ContextWrapper) {
            return m((ContextWrapper) baseContext, i10 + 1);
        }
        return null;
    }

    public static /* synthetic */ Activity n(ContextWrapper contextWrapper, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m(contextWrapper, i10);
    }

    public static final void o(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final float p(Number number, float f10) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return (f10 * number.floatValue()) / 1.0f;
    }

    public static final ClipboardManager q(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int r(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getColor(i10);
    }

    public static final DownloadManager s(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(NativeAdPresenter.DOWNLOAD);
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InputMethodManager t(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Location u(Context context) {
        LocationManager locationManagerV;
        Location lastKnownLocation;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            if (!y(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManagerV = v(context)) == null) {
                return null;
            }
            String bestProvider = Build.VERSION.SDK_INT >= 34 ? GplLibraryWrapper.FUSED_PROVIDER : locationManagerV.getBestProvider(new Criteria(), false);
            if (bestProvider == null) {
                return null;
            }
            Location lastKnownLocation2 = locationManagerV.getLastKnownLocation(bestProvider);
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            List<String> allProviders = locationManagerV.getAllProviders();
            Intrinsics.checkNotNullExpressionValue(allProviders, "locationManager.allProviders");
            if (allProviders.size() <= 1) {
                return null;
            }
            for (String str : allProviders) {
                if (str != null && !Intrinsics.areEqual(str, bestProvider) && (lastKnownLocation = locationManagerV.getLastKnownLocation(str)) != null) {
                    return lastKnownLocation;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final LocationManager v(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final TelephonyManager w(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean x(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.a0(str, "http://", false, 2, null) || StringsKt.a0(str, DtbConstants.HTTPS, false, 2, null);
    }

    public static final boolean y(Context context, String str) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            boolValueOf = Boolean.valueOf(context.checkPermission(str, Process.myPid(), Process.myUid()) == 0);
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final String z(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
