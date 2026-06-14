package e2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.amazon.device.ads.DtbConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f68841a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f68842b = new AtomicInteger(1);

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f68843b;

        a(String str) {
            this.f68843b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r11 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                java.lang.String r3 = "Utils"
                r4 = 0
                java.lang.String r5 = "Connection to URL: %s"
                java.lang.String r6 = r11.f68843b     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                r7[r1] = r6     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                e2.i.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.lang.String r6 = r11.f68843b     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.net.HttpURLConnection.setFollowRedirects(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
                r4 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                java.lang.String r4 = "Connection"
                java.lang.String r6 = "close"
                r5.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                java.lang.String r4 = "GET"
                r5.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                int r4 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                java.lang.String r6 = "Response code: %d, for URL: %s"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                java.lang.String r7 = r11.f68843b     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                r8[r1] = r4     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                r8[r2] = r7     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                e2.i.a(r3, r6, r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
                r5.disconnect()     // Catch: java.lang.Exception -> L73
                return
            L4b:
                r0 = move-exception
                r4 = r5
                goto L74
            L4e:
                r4 = move-exception
                goto L56
            L50:
                r0 = move-exception
                goto L74
            L52:
                r5 = move-exception
                r10 = r5
                r5 = r4
                r4 = r10
            L56:
                java.lang.String r6 = "%s: %s: %s"
                java.lang.String r7 = r11.f68843b     // Catch: java.lang.Throwable -> L4b
                java.lang.String r8 = r4.getMessage()     // Catch: java.lang.Throwable -> L4b
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4b
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L4b
                r9[r1] = r7     // Catch: java.lang.Throwable -> L4b
                r9[r2] = r8     // Catch: java.lang.Throwable -> L4b
                r9[r0] = r4     // Catch: java.lang.Throwable -> L4b
                e2.i.c(r3, r6, r9)     // Catch: java.lang.Throwable -> L4b
                if (r5 == 0) goto L73
                r5.disconnect()     // Catch: java.lang.Exception -> L73
            L73:
                return
            L74:
                if (r4 == 0) goto L79
                r4.disconnect()     // Catch: java.lang.Exception -> L79
            L79:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e2.g.a.run():void");
        }
    }

    public static void A(Runnable runnable, long j10) {
        f68841a.postDelayed(runnable, j10);
    }

    public static int B(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static String C(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED";
    }

    public static int D(float f10, float f11) {
        return (int) (b(f10, f11) + 0.5f);
    }

    public static void E(Runnable runnable) {
        f68841a.post(runnable);
    }

    public static void F(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static String G(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    public static String H(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private static double a(Random random, float f10, float f11) {
        double dSqrt = Math.sqrt(Math.log(Math.abs(((random.nextLong() % SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) + 1) / 100000.0d)) * (-2.0d)) * Math.sin(Math.abs(((random.nextLong() % SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) + 1) / 100000.0d) * 6.283185307179586d);
        double d10 = f11;
        return Math.min(1.0d, Math.max(0.0d, (d10 < 0.4d || d10 > 0.6d) ? d10 < 0.4d ? d10 + (((double) f10) / (dSqrt * dSqrt)) : d10 - (((double) f10) / (dSqrt * dSqrt)) : (dSqrt * ((double) f10)) + d10));
    }

    private static float b(float f10, float f11) {
        return f10 / f11;
    }

    private static float c(int i10) {
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 != 3) {
            return i10 != 17 ? 1.0f : 0.5f;
        }
        return 0.0f;
    }

    private static void d(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private static void e(Window window, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController == null) {
                return;
            }
            windowInsetsController.setSystemBarsBehavior(2);
            if (z10) {
                windowInsetsController.hide(WindowInsets.Type.statusBars());
                return;
            }
            return;
        }
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static void f(Activity activity) {
        g(activity, true);
    }

    public static void g(Activity activity, boolean z10) {
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            e(window, z10);
        }
        d(activity);
    }

    private static float h(int i10) {
        if (i10 == 16 || i10 == 17) {
            return 0.5f;
        }
        return i10 != 80 ? 0.0f : 1.0f;
    }

    public static void i(Runnable runnable) {
        f68841a.removeCallbacks(runnable);
    }

    public static Float j(String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int k(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static void l(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static int m() {
        return View.generateViewId();
    }

    public static Point n(int i10, int i11, int i12, int i13) {
        Random random = new Random();
        return new Point((int) (((double) i10) * a(random, 0.1f, c(i12))), (int) (((double) i11) * a(random, 0.1f, h(i13))));
    }

    public static Point o(int i10, int i11) {
        return new Point(Math.round(i10 * 0.5f), Math.round(i11 * 0.7f));
    }

    public static int p(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i10 == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static void q(String str) {
        if (TextUtils.isEmpty(str)) {
            i.a("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            Executors.newSingleThreadExecutor().execute(new a(str));
        } catch (Exception e10) {
            i.b("Utils", e10);
        }
    }

    public static boolean r(String str) {
        return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
    }

    public static boolean s(Context context) {
        int iP = p(context);
        return iP == 0 || iP == 8 || iP == 6 || iP == 11;
    }

    public static boolean t(Context context) {
        NetworkInfo activeNetworkInfo;
        i.a("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            i.a("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        i.a("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean u(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d10 * d10) + (d11 * d11)) >= 6.6d;
    }

    public static boolean v(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static Float w(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.max(f10.floatValue(), f11.floatValue()));
    }

    public static Float x(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.min(f10.floatValue(), f11.floatValue()));
    }

    public static MotionEvent y(int i10, int i11, int i12) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
    }

    public static void z(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f68841a.post(runnable);
        }
    }
}
