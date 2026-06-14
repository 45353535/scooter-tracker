package io.bidmachine.core;

import ae.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import com.amazon.device.ads.DtbConstants;
import com.google.common.base.Ascii;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.SimpleContextProvider;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import pd.f0;
import pd.i0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f80042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ce.a f80043c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f80046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f80047g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f80041a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f80044d = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f80045e = "0123456789ABCDEF".toCharArray();

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        f80042b = new Handler(handlerThread.getLooper());
        f80043c = new ce.a(new ce.b() { // from class: io.bidmachine.core.g
            @Override // ce.b
            public final Object get() {
                return Integer.valueOf(h.g0().get(1));
            }
        });
    }

    public static float A(Context context) {
        return ae.c.d(context).density;
    }

    public static Size B(Context context) {
        DisplayMetrics displayMetricsD = ae.c.d(context);
        return new Size(displayMetricsD.widthPixels, displayMetricsD.heightPixels);
    }

    public static int C() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static Rect D(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static void E(String str, Executable executable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executable.execute(str);
    }

    public static void F(Object obj, Executable executable) {
        if (obj != null) {
            executable.execute(obj);
        }
    }

    public static boolean G(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean H() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean I(String str) {
        return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
    }

    public static boolean J(Context context) {
        NetworkInfo networkInfoR = r(context);
        return networkInfoR != null && networkInfoR.isConnected();
    }

    public static boolean K(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean L() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean N(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static boolean O(int i10) {
        return i10 >= 1900 && i10 <= ((Integer) f80043c.get()).intValue();
    }

    public static String P(List list) {
        return Q(list, ", ");
    }

    public static String Q(List list, CharSequence charSequence) {
        return R(list, charSequence, new Function() { // from class: io.bidmachine.core.e
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    public static String R(List list, CharSequence charSequence, Function function) {
        String str;
        if (G(list)) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder(list.size());
            for (Object obj : list) {
                if (obj != null && (str = (String) function.apply(obj)) != null) {
                    if (sb2.length() > 0) {
                        sb2.append(charSequence);
                    }
                    sb2.append(str);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void S(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = f80042b;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void T(Runnable runnable, long j10) {
        f80042b.postDelayed(runnable, j10);
    }

    public static void U(Runnable runnable) {
        if (L()) {
            runnable.run();
        } else {
            f80041a.post(runnable);
        }
    }

    public static void V(Runnable runnable, long j10) {
        f80041a.postDelayed(runnable, j10);
    }

    public static Object W(Object obj, Object obj2) {
        return X(obj, obj2, null);
    }

    public static Object X(Object obj, Object obj2, Object obj3) {
        return obj != null ? obj : obj2 != null ? obj2 : obj3;
    }

    public static Float Y(String str, Float f10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f10;
    }

    public static Integer Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(java.lang.String r3) throws java.lang.Throwable {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            java.net.URLConnection r3 = r1.openConnection()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r0 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            r3.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r0 = io.bidmachine.UserAgentManager.getUserAgent()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r1 != 0) goto L35
            java.lang.String r1 = "User-Agent"
            r3.setRequestProperty(r1, r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            goto L35
        L31:
            r0 = move-exception
            goto L61
        L33:
            r0 = move-exception
            goto L51
        L35:
            r3.getResponseCode()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Exception -> L40
            i(r0)     // Catch: java.lang.Exception -> L40
            goto L44
        L40:
            r0 = move-exception
        L41:
            io.bidmachine.core.a.p(r0)
        L44:
            vd.h.b(r3)
            goto L60
        L48:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L61
        L4d:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L51:
            io.bidmachine.core.a.p(r0)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L44
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Exception -> L5e
            i(r0)     // Catch: java.lang.Exception -> L5e
            goto L44
        L5e:
            r0 = move-exception
            goto L41
        L60:
            return
        L61:
            if (r3 == 0) goto L6f
            java.io.InputStream r1 = r3.getInputStream()     // Catch: java.lang.Exception -> L6b
            i(r1)     // Catch: java.lang.Exception -> L6b
            goto L6f
        L6b:
            r1 = move-exception
            io.bidmachine.core.a.p(r1)
        L6f:
            vd.h.b(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.core.h.a(java.lang.String):void");
    }

    public static int a0(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static Integer b0(String str, Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static Integer c0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
        }
        return null;
    }

    public static boolean d(Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    public static void d0(Map map, Map map2) {
        if (map == null || map2 == null) {
            return;
        }
        map.putAll(map2);
    }

    public static boolean e() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable, java.io.Flushable] */
    public static File e0(Context context, Uri uri, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        ?? r22 = 0;
        if (strExtractMetadata == null) {
            return null;
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(strExtractMetadata), 2);
        try {
            if (frameAtTime != null) {
                try {
                    file = new File(v(context, str), p(uri.toString()));
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    o(r22);
                    i(r22);
                    throw th;
                }
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    o(fileOutputStream);
                    i(fileOutputStream);
                    return file;
                } catch (Exception e11) {
                    e = e11;
                    a.p(e);
                    o(fileOutputStream);
                    i(fileOutputStream);
                    return null;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r22 = context;
        }
    }

    public static void f(Runnable runnable) {
        f80042b.removeCallbacks(runnable);
    }

    public static void f0(l lVar) {
        try {
            lVar.run();
        } catch (Throwable unused) {
        }
    }

    public static void g(Runnable runnable) {
        f80041a.removeCallbacks(runnable);
    }

    private static Calendar g0() {
        try {
            try {
                return Calendar.getInstance();
            } catch (Throwable unused) {
                return Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.US);
            }
        } catch (Throwable unused2) {
            return Calendar.getInstance(Locale.US);
        }
    }

    public static String h(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static void h0(final String str, Executor executor) {
        if (TextUtils.isEmpty(str) || executor == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: io.bidmachine.core.d
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    h.a(str);
                }
            });
        } catch (Exception e10) {
            a.p(e10);
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                a.p(e10);
            }
        }
    }

    public static void i0(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th2) {
            a.p(th2);
        }
    }

    public static Float j(Object obj, Float f10) {
        return obj == null ? f10 : obj instanceof Number ? Float.valueOf(((Number) obj).floatValue()) : Y(obj.toString(), f10);
    }

    public static String j0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        String string = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
            o(byteArrayOutputStream);
            i(byteArrayOutputStream);
            i(inputStream);
            return string;
        }
        string = byteArrayOutputStream.toString("UTF-8");
        o(byteArrayOutputStream);
        i(byteArrayOutputStream);
        i(inputStream);
        return string;
    }

    public static Integer k(Object obj, Integer num) {
        return obj == null ? num : obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : b0(obj.toString(), num);
    }

    public static Map k0(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt.toString());
            }
        }
        return map;
    }

    public static Handler l() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static String l0(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr[i11];
            char[] cArr2 = f80045e;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            int i12 = i10 + 2;
            cArr[i10 + 1] = cArr2[b10 & Ascii.SI];
            if (i11 < bArr.length - 1) {
                i10 += 3;
                cArr[i12] = ':';
            } else {
                i10 = i12;
            }
        }
        return new String(cArr);
    }

    public static Context m(Context context) {
        return n(context, null);
    }

    public static Context n(Context context, View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View viewD = i0.d(view);
        return viewD != null ? viewD.getContext() : view.getContext();
    }

    public static void o(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e10) {
                a.p(e10);
            }
        }
    }

    public static String p(String str) {
        return new BigInteger(x(str.getBytes())).abs().toString(36);
    }

    public static NetworkCapabilities q(Context context) {
        ConnectivityManager connectivityManagerW = w(context);
        if (connectivityManagerW == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManagerW.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManagerW.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th2) {
            a.p(th2);
            return null;
        }
    }

    public static NetworkInfo r(Context context) {
        try {
            ConnectivityManager connectivityManagerW = w(context);
            if (connectivityManagerW != null) {
                return connectivityManagerW.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th2) {
            a.p(th2);
            return null;
        }
    }

    public static String s(Context context) {
        if (f80046f == null) {
            f80046f = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return f80046f;
    }

    public static String t(Context context) {
        if (f80047g == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    f80047g = str;
                }
            } catch (Exception e10) {
                a.p(e10);
            }
        }
        return f80047g;
    }

    public static Location u(Context context, Location location, Location location2) {
        Location location3 = (Location) W(location, location2);
        Location locationK = f0.k(context);
        return (locationK == null || (location3 != null && locationK.getTime() < location3.getTime())) ? location3 : locationK;
    }

    public static File v(Context context, String str) {
        File file = new File(context.getCacheDir(), str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static ConnectivityManager w(Context context) {
        if (!K(context, "android.permission.ACCESS_NETWORK_STATE")) {
            a.e(new ce.b() { // from class: io.bidmachine.core.f
                @Override // ce.b
                public final Object get() {
                    return String.format("Manifest permission not found: %s. Check the integration.", "android.permission.ACCESS_NETWORK_STATE");
                }
            });
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th2) {
            a.p(th2);
            return null;
        }
    }

    public static byte[] x(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            a.p(e10);
            return null;
        }
    }

    public static float y(float f10, float f11, float f12) {
        return f10 == f11 ? f12 : f10;
    }

    public static long z(long j10, long j11, long j12) {
        return j10 == j11 ? j12 : j10;
    }
}
