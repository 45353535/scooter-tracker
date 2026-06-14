package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import com.inmobi.media.Ji;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f37157a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f37158b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f37159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f37160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f37161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f37162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f37163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CoroutineScope f37164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f37165i;

    static {
        String name = Ji.class.getSimpleName();
        f37160d = new AtomicBoolean();
        f37161e = lf.i.a(new Function0() { // from class: w3.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ji.a();
            }
        });
        Intrinsics.checkNotNullExpressionValue(name, "TAG");
        Intrinsics.checkNotNullParameter(name, "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new B9(name, false));
        f37163g = COMPONENT_SERVICE;
        Intrinsics.checkNotNullExpressionValue(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        f37164h = kotlinx.coroutines.i.a(eg.w0.c(COMPONENT_SERVICE));
    }

    public static final C4155xc a() {
        return new C4155xc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e10) {
                try {
                    throw new Zk(e10.getMessage());
                } catch (Zk e11) {
                    Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    e11.getMessage();
                    Lazy lazy = P9.f37527a;
                    P9.a(new L2(e11));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    } catch (Exception e12) {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                        e12.getMessage();
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                        Lazy lazy2 = P9.f37527a;
                        AbstractC3779i9.a(e12);
                    }
                    return str;
                } catch (Exception e13) {
                    Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    e13.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        Intrinsics.checkNotNull(defaultUserAgent);
        return defaultUserAgent;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return f37165i == 2;
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            T6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
            e10.getMessage();
        }
    }

    public static final String c() {
        if (f37158b.length() == 0) {
            f37158b = b(f37157a);
        }
        return f37158b;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = f37157a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "coppa_store");
        Intrinsics.checkNotNullParameter("im_accid", C4240b4.i.W);
        return eaA.f36783a.getString("im_accid", null);
    }
}
