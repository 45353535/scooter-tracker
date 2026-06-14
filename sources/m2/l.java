package m2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.d0;
import com.facebook.internal.o;
import com.facebook.internal.r;
import com.facebook.internal.z;
import com.facebook.s;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import m2.l;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f94450e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f94451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static l f94452g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f94453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f94454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f94455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94456d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            r.f19964e.b(d0.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final GraphRequest b(String str, AccessToken accessToken, String str2, String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.c cVar = GraphRequest.f19547n;
            a1 a1Var = a1.f93282a;
            String str3 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
            GraphRequest graphRequestA = cVar.A(accessToken, str3, null, null);
            Bundle bundleU = graphRequestA.u();
            if (bundleU == null) {
                bundleU = new Bundle();
            }
            bundleU.putString("tree", str);
            bundleU.putString("app_version", v2.h.c());
            bundleU.putString("platform", "android");
            bundleU.putString(Reporting.Key.REQUEST_TYPE, requestType);
            if (Intrinsics.areEqual(requestType, "app_indexing")) {
                bundleU.putString("device_session_id", e.g());
            }
            graphRequestA.G(bundleU);
            graphRequestA.C(new GraphRequest.b() { // from class: m2.k
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    l.a.c(a0Var);
                }
            });
            return graphRequestA;
        }

        private a() {
        }
    }

    private static final class b implements Callable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f94457b;

        public b(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f94457b = new WeakReference(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f94457b.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View viewD = v2.h.d(activity);
                if (activity != null && viewD != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (o.b()) {
                            n2.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewD));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e10) {
                            Log.e(l.d(), "Failed to take screenshot.", e10);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(n2.f.d(viewD));
                            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                        l.f(l.this, string);
                    }
                }
            } catch (Exception e11) {
                Log.e(l.d(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f94451f = canonicalName;
    }

    public l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f94454b = new WeakReference(activity);
        this.f94456d = null;
        this.f94453a = new Handler(Looper.getMainLooper());
        f94452g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f94454b;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f94451f;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f94453a;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l this$0, TimerTask indexingTask) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f94455c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f94456d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f94455c = timer2;
            } catch (Exception e10) {
                Log.e(f94451f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    private final void j(final String str) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            s.t().execute(new Runnable() { // from class: m2.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String tree, l this$0) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String strC0 = z.c0(tree);
            AccessToken accessTokenE = AccessToken.INSTANCE.e();
            if (strC0 == null || !Intrinsics.areEqual(strC0, this$0.f94456d)) {
                this$0.g(f94450e.b(tree, accessTokenE, s.n(), "app_indexing"), strC0);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    public final void g(GraphRequest graphRequest, String str) {
        if (e3.a.d(this) || graphRequest == null) {
            return;
        }
        try {
            a0 a0VarK = graphRequest.k();
            try {
                JSONObject jSONObjectC = a0VarK.c();
                if (jSONObjectC == null) {
                    Log.e(f94451f, "Error sending UI component tree to Facebook: " + a0VarK.b());
                    return;
                }
                if (Intrinsics.areEqual("true", jSONObjectC.optString("success"))) {
                    r.f19964e.b(d0.APP_EVENTS, f94451f, "Successfully send UI component tree to server");
                    this.f94456d = str;
                }
                if (jSONObjectC.has("is_app_indexing_enabled")) {
                    e.n(jSONObjectC.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f94451f, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void h() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                s.t().execute(new Runnable() { // from class: m2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(this.f94446b, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f94451f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void l() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (((Activity) this.f94454b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f94455c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f94455c = null;
            } catch (Exception e10) {
                Log.e(f94451f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
