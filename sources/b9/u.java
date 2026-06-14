package b9;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
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
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f5951a = new Handler(Looper.getMainLooper());

    class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5952a;

        a(int i10) {
            this.f5952a = i10;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Insets insets = windowInsets.getInsets(this.f5952a);
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            return windowInsets;
        }
    }

    public static MotionEvent A(int i10, int i11, int i12) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
    }

    public static void B(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f5951a.post(runnable);
        }
    }

    public static void C(Runnable runnable, long j10) {
        f5951a.postDelayed(runnable, j10);
    }

    public static int D(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static String E(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED";
    }

    public static void F(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void G(String str) {
        H(str, Executors.newSingleThreadExecutor());
    }

    public static void H(final String str, Executor executor) {
        if (TextUtils.isEmpty(str)) {
            e.a("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: b9.t
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    u.f(str);
                }
            });
        } catch (Exception e10) {
            e.c("Utils", e10);
        }
    }

    public static String I(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    public static String J(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private static double b(Random random, float f10, float f11) {
        double dSqrt = Math.sqrt(Math.log(Math.abs(((random.nextLong() % SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) + 1) / 100000.0d)) * (-2.0d)) * Math.sin(Math.abs(((random.nextLong() % SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) + 1) / 100000.0d) * 6.283185307179586d);
        double d10 = f11;
        return Math.min(1.0d, Math.max(0.0d, (d10 < 0.4d || d10 > 0.6d) ? d10 < 0.4d ? d10 + (((double) f10) / (dSqrt * dSqrt)) : d10 - (((double) f10) / (dSqrt * dSqrt)) : (dSqrt * ((double) f10)) + d10));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x003f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:64), block:B:8:0x003f */
    public static /* synthetic */ void f(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        Exception e10;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                e.a("Utils", "Connection to URL: %s", str);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e11) {
                httpURLConnection = null;
                e10 = e11;
            } catch (Throwable th2) {
                th = th2;
                vd.h.b(httpURLConnection3);
                throw th;
            }
            try {
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setRequestMethod("GET");
                String strC = ec.a.c();
                if (!TextUtils.isEmpty(strC)) {
                    httpURLConnection.setRequestProperty("User-Agent", strC);
                }
                e.a("Utils", "Response code: %d, for URL: %s", Integer.valueOf(httpURLConnection.getResponseCode()), str);
            } catch (Exception e12) {
                e10 = e12;
                e.b("Utils", "%s: %s: %s", str, e10.getMessage(), e10.toString());
            }
            vd.h.b(httpURLConnection);
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection3 = httpURLConnection2;
            vd.h.b(httpURLConnection3);
            throw th;
        }
    }

    public static void g(Activity activity) {
        h(activity, true);
    }

    public static void h(Activity activity, boolean z10) {
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            e(window, z10);
        }
        d(activity);
    }

    public static void i(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            if (window != null) {
                j(window.getDecorView());
            } else {
                j(activity.findViewById(R.id.content));
            }
        }
    }

    public static void j(View view) {
        k(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static void k(View view, int i10) {
        view.setOnApplyWindowInsetsListener(new a(i10));
        view.requestApplyInsets();
    }

    private static float l(int i10) {
        if (i10 == 16 || i10 == 17) {
            return 0.5f;
        }
        return i10 != 80 ? 0.0f : 1.0f;
    }

    public static void m(Runnable runnable) {
        f5951a.removeCallbacks(runnable);
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                e.c("Utils", th2);
            }
        }
    }

    public static Float o(String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int p(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static void q(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th2) {
                e.c("Utils", th2);
            }
        }
    }

    public static Point r(int i10, int i11, int i12, int i13) {
        Random random = new Random();
        return new Point((int) (((double) i10) * b(random, 0.1f, c(i12))), (int) (((double) i11) * b(random, 0.1f, l(i13))));
    }

    public static Point s(int i10, int i11) {
        return new Point(Math.round(i10 * 0.5f), Math.round(i11 * 0.7f));
    }

    public static int t(Context context) {
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

    public static boolean u(Context context) {
        int iT = t(context);
        return iT == 0 || iT == 8 || iT == 6 || iT == 11;
    }

    public static boolean v(Context context) {
        NetworkInfo activeNetworkInfo;
        e.a("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            e.a("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        e.a("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean w(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d10 * d10) + (d11 * d11)) >= 6.6d;
    }

    public static boolean x(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static Float y(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.max(f10.floatValue(), f11.floatValue()));
    }

    public static Float z(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.min(f10.floatValue(), f11.floatValue()));
    }
}
