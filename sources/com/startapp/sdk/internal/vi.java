package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Base64OutputStream;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.D5;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Intent f65409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Boolean f65410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Random f65411d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f65408a = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final si f65412e = new si();

    public static Intent a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getLaunchIntentForPackage(str);
            }
            return null;
        } catch (Throwable th2) {
            g9.a(th2);
            return null;
        }
    }

    public static Intent b(Context context, String str) {
        String packageName;
        Intent intent;
        if (context == null) {
            return null;
        }
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = null;
        }
        if (str == null) {
            str = packageName;
        }
        if (str == null) {
            return null;
        }
        if (str.equals(packageName) && (intent = f65409b) != null) {
            return new Intent(intent);
        }
        long j10 = Thread.currentThread() == Looper.getMainLooper().getThread() ? 100L : 5000L;
        Intent[] intentArr = {null};
        synchronized (intentArr) {
            try {
                new Thread(new qi(intentArr, context, str)).start();
                intentArr.wait(j10);
            } catch (Throwable unused2) {
            }
        }
        Intent intent2 = intentArr[0];
        if (intent2 == null) {
            return null;
        }
        if (!str.equals(packageName)) {
            return intent2;
        }
        f65409b = intent2;
        return new Intent(intent2);
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100 && packageName.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            if (!a(th2, SecurityException.class) && !a(th2, RemoteException.class)) {
                g9.a(th2);
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] strArrSplit = new URL(MetaData.E().f()).getHost().split("\\.");
            if (strArrSplit.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(strArrSplit[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static long e(String str) {
        long j10;
        if (str == null || str.length() < 1) {
            return 0L;
        }
        int length = str.length() - 1;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = true;
        char c10 = 0;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != 'm' || c10 != 's') {
                    if (z10) {
                        if (cCharAt == 's') {
                            j10 = 1000;
                        } else if (cCharAt == 'm') {
                            j10 = 60000;
                        } else if (cCharAt == 'h') {
                            j10 = 3600000;
                        } else if (cCharAt == 'd') {
                            j10 = SignalManager.TWENTY_FOUR_HOURS_MILLIS;
                        }
                        z10 = false;
                    }
                    return ~length;
                }
                j10 = 1;
                j12 = j10;
                length--;
                c10 = cCharAt;
            } else {
                if (j12 == 0) {
                    return ~length;
                }
                j11 += ((long) (cCharAt - '0')) * j12;
                j12 *= 10;
                z10 = true;
                length--;
                c10 = cCharAt;
            }
        }
        return j11;
    }

    public static int[][] f(String str) {
        int i10;
        int i11;
        ArrayList arrayList = null;
        for (String str2 : str.split(StringUtils.COMMA)) {
            int iIndexOf = str2.indexOf("..");
            if (iIndexOf < 0) {
                i11 = Integer.parseInt(str2);
                i10 = i11;
            } else {
                String strSubstring = str2.substring(0, iIndexOf);
                int i12 = strSubstring.length() > 0 ? Integer.parseInt(strSubstring) : Integer.MIN_VALUE;
                String strSubstring2 = str2.substring(iIndexOf + 2);
                i10 = strSubstring2.length() > 0 ? Integer.parseInt(strSubstring2) : Integer.MAX_VALUE;
                i11 = i12;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i11, i10), Math.max(i11, i10)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    public static String g(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 11);
    }

    public static String a(Activity activity) {
        ComponentName component;
        Intent intentB = b(activity, null);
        if (intentB == null || (component = intentB.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    public static boolean e(Context context) {
        try {
            Object systemService = context.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                return ((UiModeManager) systemService).getCurrentModeType() == 4;
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        return false;
    }

    public static boolean d(Context context) {
        Boolean boolValueOf = f65410c;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                boolValueOf = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        f65410c = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static String a(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (str == null || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + iIndexOf, iIndexOf2);
    }

    public static String c(String str) {
        return new String(a(Base64.decode(str, 8)));
    }

    public static boolean c(Context context, String str) {
        if (!str.startsWith("sms:") && !str.startsWith("smsto:")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    public static int a(Activity activity, int i10, boolean z10) {
        if (z10) {
            WeakHashMap weakHashMap = f65408a;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i10 == activity.getResources().getConfiguration().orientation) {
                return q0.a(activity, i10, false);
            }
            return q0.a(activity, i10, true);
        }
        WeakHashMap weakHashMap2 = f65408a;
        if (!weakHashMap2.containsKey(activity)) {
            return -1;
        }
        int iIntValue = ((Integer) weakHashMap2.get(activity)).intValue();
        int i11 = q0.f65128a;
        try {
            activity.setRequestedOrientation(iIntValue);
        } catch (Throwable unused) {
        }
        weakHashMap2.remove(activity);
        return iIntValue;
    }

    public static String b(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(g.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static List a(LinkedList linkedList, Class cls) {
        linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            a(linkedList, cls.getSuperclass());
        }
        return linkedList;
    }

    public static boolean a(Serializable serializable, Serializable serializable2) {
        Object obj;
        boolean z10 = false;
        try {
            Class<?> cls = serializable2.getClass();
            LinkedList<Field> linkedList = new LinkedList();
            linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (cls.getSuperclass() != null) {
                a(linkedList, (Class) cls.getSuperclass());
            }
            for (Field field : linkedList) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers) && !Modifier.isStatic(modifiers)) {
                    field.setAccessible(true);
                    if (field.get(serializable) == null && (obj = field.get(serializable2)) != null) {
                        field.set(serializable, obj);
                        z10 = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z10;
    }

    public static String b(Throwable th2) {
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter printWriter = new PrintWriter(a(byteArrayOutputStream));
                a(th2, printWriter);
                printWriter.close();
                return byteArrayOutputStream.toString();
            } catch (Throwable unused) {
                return th2.getMessage();
            }
        } catch (Throwable unused2) {
            return th2.toString();
        }
    }

    public static String b(Context context) {
        PackageManager packageManager;
        String installingPackageName = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (installingPackageName != null) {
            return installingPackageName;
        }
        try {
            return packageManager.getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused3) {
            return installingPackageName;
        }
    }

    public static String a(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException(e10);
            }
        }
        return "";
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static boolean a(double d10) {
        if (Double.compare(d10, 0.0d) <= 0) {
            return false;
        }
        return Double.compare(d10, 1.0d) >= 0 || Math.random() < d10;
    }

    public static boolean a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.E().w(), str, "text/html", D5.N, null);
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    public static String a(Context context) {
        ActivityInfo activityInfo;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && (str = activityInfo.packageName) != null) {
                return str.toLowerCase(Locale.ROOT);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static void a(WebView webView, boolean z10, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("if (typeof ");
                sb2.append(str);
                sb2.append(" === \"function\") {");
                sb2.append(str);
                sb2.append("(");
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    if (z10 && (objArr[i10] instanceof String)) {
                        sb2.append("\"");
                        sb2.append(((String) objArr[i10]).replaceAll("\"", "\\\\\""));
                        sb2.append("\"");
                    } else {
                        sb2.append(objArr[i10]);
                    }
                    if (i10 < objArr.length - 1) {
                        sb2.append(StringUtils.COMMA);
                    }
                }
                sb2.append(");}");
                webView.loadUrl("javascript:" + ((Object) sb2));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(bArr);
        inflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c10 = (char) length;
        for (int i10 = 0; i10 < length; i10++) {
            c10 = (char) (c10 + iArr[i10]);
            cArr[i10] = c10;
        }
        return new String(cArr);
    }

    public static DeflaterOutputStream a(ByteArrayOutputStream byteArrayOutputStream) {
        return new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static StackTraceElement a(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        StackTraceElement[] stackTraceElementArrA = ui.a();
        if (stackTraceElementArrA == null) {
            return null;
        }
        String name = ui.class.getName();
        int length = stackTraceElementArrA.length;
        for (int i11 = 0; i11 < length; i11++) {
            StackTraceElement stackTraceElement = stackTraceElementArrA[i11];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i12 = i11 + 3 + i10;
                if (i12 < length) {
                    return stackTraceElementArrA[i12];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "none";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static void a(int i10, Context context, String str) {
        boolean zA;
        Log.println(i10, "StartAppSDK", str);
        if (!d(context)) {
            int i11 = q0.f65128a;
            try {
                zA = v6.a(context);
            } catch (Throwable unused) {
                zA = false;
            }
            if (!zA) {
                return;
            }
        }
        g9 g9Var = new g9(h9.f64609d);
        g9Var.f64553d = "Log for a publisher";
        g9Var.f64554e = str;
        g9Var.a();
    }

    public static String a(Ad ad2) {
        if (ad2 instanceof jj) {
            jj jjVar = (jj) ad2;
            if (jjVar.getType() == Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            if (jjVar.getType() == Ad.AdType.REWARDED_VIDEO) {
                return "REWARDED_VIDEO";
            }
            return "INTERSTITIAL";
        }
        if (ad2 instanceof xd) {
            return "OFFER_WALL";
        }
        if (ad2 instanceof wd) {
            return "OFFER_WALL_3D";
        }
        if (ad2 instanceof r1) {
            int i10 = ((r1) ad2).f65182t;
            if (i10 == 0) {
                return "BANNER";
            }
            if (i10 == 1) {
                return "MREC";
            }
            if (i10 == 2) {
                return "COVER";
            }
            return "BANNER_UNDEFINED";
        }
        if (ad2 instanceof b1) {
            return "BANNER_3D";
        }
        if (ad2 instanceof qd) {
            return MobileFuseNativeAdKt.AD_TYPE;
        }
        return "UNDEFINED";
    }

    public static int[] a(Context context, String... strArr) {
        int[] iArr = new int[strArr.length];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int length2 = strArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (strArr[i11].equals(packageInfo.requestedPermissions[i10])) {
                            if ((packageInfo.requestedPermissionsFlags[i10] & 2) == 2) {
                                iArr[i11] = 2;
                            } else {
                                iArr[i11] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i10 && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Object obj, Throwable th2) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            g9.a(th2);
        }
    }

    public static void a(Throwable th2, PrintWriter printWriter) {
        String className;
        di diVar = new di(th2);
        while (diVar.hasNext()) {
            Throwable next = diVar.next();
            if (diVar.f64435d) {
                printWriter.println('-');
            }
            printWriter.println(next.toString().trim());
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i10 = 0;
                int i11 = 0;
                boolean z10 = false;
                while (i10 < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i10];
                    if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                        boolean z11 = i10 < 3;
                        boolean zStartsWith = className.startsWith("com.startapp.");
                        if (z11 || zStartsWith || z10) {
                            if (i11 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i11);
                                i11 = 0;
                            }
                            if (stackTraceElement != null) {
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement.getMethodName());
                                printWriter.println("()");
                                stackTraceElement = null;
                            }
                            printWriter.print(' ');
                            printWriter.print(stackTraceElement2.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElement2.getMethodName());
                            printWriter.println("()");
                        } else {
                            if (stackTraceElement != null) {
                                i11++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z10 = zStartsWith;
                    }
                    i10++;
                }
                if (stackTraceElement != null) {
                    i11++;
                }
                if (i11 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i11);
                }
            }
        }
    }

    public static StackTraceElement a(Throwable th2) {
        String className;
        Throwable cause = th2;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (cause == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i10];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            cause = cause.getCause();
        }
    }

    public static boolean a(Throwable th2, Class cls) {
        while (th2 != null) {
            if (cls.isInstance(th2)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static String a() {
        int iAbs = Math.abs(-2034744135);
        char[] charArray = "st{xI:>B?7=:CH".toCharArray();
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iAbs % (i10 + length);
            char c10 = charArray[i10];
            if (' ' <= c10 && c10 <= '~') {
                charArray[i10] = (char) (((((i11 * (-1)) + (c10 - ' ')) + 95) % 95) + 32);
            }
        }
        return new String(charArray);
    }
}
