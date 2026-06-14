package t2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import t2.b;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f104807a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104808b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f104809c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f104810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f104811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ServiceConnection f104812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f104813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Intent f104814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f104815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static u.a f104816j;

    public static final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            b bVar = b.f104807a;
            b.f104815i = q.a(com.facebook.s.m(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    /* JADX INFO: renamed from: t2.b$b, reason: collision with other inner class name */
    public static final class C1304b implements Application.ActivityLifecycleCallbacks {
        C1304b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Context contextM = com.facebook.s.m();
            ArrayList arrayListI = q.i(contextM, b.f104815i);
            b bVar = b.f104807a;
            bVar.f(contextM, arrayListI, false);
            bVar.f(contextM, q.j(contextM, b.f104815i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            Context contextM = com.facebook.s.m();
            ArrayList arrayListI = q.i(contextM, b.f104815i);
            if (arrayListI.isEmpty()) {
                arrayListI = q.g(contextM, b.f104815i);
            }
            b.f104807a.f(contextM, arrayListI, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                com.facebook.s.t().execute(new Runnable() { // from class: t2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.C1304b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.areEqual(b.f104811e, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    com.facebook.s.t().execute(new Runnable() { // from class: t2.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.C1304b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private b() {
    }

    private final void e() {
        if (f104810d != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(u.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f104810d = boolValueOf;
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f104811e = Boolean.valueOf(u.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        q.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        f104814h = intent;
        f104812f = new a();
        f104813g = new C1304b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f104808b, "Error parsing in-app purchase data.", e10);
            }
        }
        for (Map.Entry entry : q.k(context, arrayList2, f104815i, z10).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) map.get(str);
            if (str3 != null) {
                v2.k.k(str3, str2, z10, f104816j, false, 16, null);
            }
        }
    }

    public static final void g(u.a billingClientVersion) {
        Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
        b bVar = f104807a;
        bVar.e();
        if (!Intrinsics.areEqual(f104810d, Boolean.FALSE) && v2.k.g()) {
            f104816j = billingClientVersion;
            bVar.h();
        }
    }

    private final void h() {
        if (f104809c.compareAndSet(false, true)) {
            Context contextM = com.facebook.s.m();
            if (contextM instanceof Application) {
                Application application = (Application) contextM;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f104813g;
                ServiceConnection serviceConnection = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f104814h;
                if (intent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(com.taurusx.tax.g.n.f66171o);
                    intent = null;
                }
                ServiceConnection serviceConnection2 = f104812f;
                if (serviceConnection2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                } else {
                    serviceConnection = serviceConnection2;
                }
                contextM.bindService(intent, serviceConnection, 1);
            }
        }
    }
}
