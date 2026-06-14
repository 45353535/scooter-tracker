package t2;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static l f104835s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f104840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f104841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f104842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f104843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f104844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f104845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f104846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f104847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Method f104848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Method f104849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Method f104850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Method f104851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Method f104852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Method f104853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Method f104854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t f104855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f104833q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f104834r = l.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f104836t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f104837u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map f104838v = new ConcurrentHashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f104839w = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f104856a;

        public a(Runnable runnable) {
            this.f104856a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            Method methodD;
            if (e3.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), "onBillingSetupFinished")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 0) : null;
                    Class clsA = u.a("com.android.billingclient.api.BillingResult");
                    if (clsA != null && (methodD = u.d(clsA, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(u.e(clsA, methodD, orNull, new Object[0]), (Object) 0)) {
                        l.f104833q.g().set(true);
                        Runnable runnable = this.f104856a;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m10.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.M(name, "onBillingServiceDisconnected", false, 2, null)) {
                        l.f104833q.g().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls) {
            Object objE;
            Object objE2;
            Object objE3;
            Class clsA = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class clsA2 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsA != null && clsA2 != null) {
                Method methodD = u.d(cls, "newBuilder", Context.class);
                Method methodD2 = u.d(clsA, "enablePendingPurchases", new Class[0]);
                Method methodD3 = u.d(clsA, "setListener", clsA2);
                Method methodD4 = u.d(clsA, "build", new Class[0]);
                if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || (objE = u.e(cls, methodD, null, context)) == null || (objE2 = u.e(clsA, methodD3, objE, Proxy.newProxyInstance(clsA2.getClassLoader(), new Class[]{clsA2}, new d()))) == null || (objE3 = u.e(clsA, methodD2, objE2, new Object[0])) == null) {
                    return null;
                }
                return u.e(clsA, methodD4, objE3, new Object[0]);
            }
            return null;
        }

        private final l b(Context context) {
            t tVarB = t.f104914g.b();
            if (tVarB == null) {
                return null;
            }
            Class clsA = u.a("com.android.billingclient.api.BillingClient");
            Class clsA2 = u.a("com.android.billingclient.api.Purchase");
            Class clsA3 = u.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class clsA4 = u.a("com.android.billingclient.api.SkuDetails");
            Class clsA5 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsA6 = u.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class clsA7 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsA == null || clsA3 == null || clsA2 == null || clsA4 == null || clsA6 == null || clsA5 == null || clsA7 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodD = u.d(clsA, "queryPurchases", String.class);
            Method methodD2 = u.d(clsA3, "getPurchasesList", new Class[0]);
            Method methodD3 = u.d(clsA2, "getOriginalJson", new Class[0]);
            Method methodD4 = u.d(clsA4, "getOriginalJson", new Class[0]);
            Method methodD5 = u.d(clsA5, "getOriginalJson", new Class[0]);
            Method methodD6 = u.d(clsA, "querySkuDetailsAsync", tVarB.d(), clsA6);
            Method methodD7 = u.d(clsA, "queryPurchaseHistoryAsync", String.class, clsA7);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objA = a(context, clsA);
            if (objA == null) {
                Log.w(l.l(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            l.o(new l(objA, clsA, clsA3, clsA2, clsA4, clsA5, clsA6, clsA7, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, tVarB, null));
            return l.g();
        }

        public final Map c() {
            return l.f();
        }

        public final synchronized l d(Context context) {
            l lVarG;
            Intrinsics.checkNotNullParameter(context, "context");
            lVarG = l.g();
            if (lVarG == null) {
                lVarG = b(context);
            }
            return lVarG;
        }

        public final Map e() {
            return l.j();
        }

        public final Map f() {
            return l.k();
        }

        public final AtomicBoolean g() {
            return l.m();
        }

        private b() {
        }
    }

    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u.b f104857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f104858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f104859c;

        public c(l lVar, u.b skuType, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f104859c = lVar;
            this.f104857a = skuType;
            this.f104858b = completionHandler;
        }

        public void a(Object proxy, Method method, Object[] objArr) {
            if (e3.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objE = u.e(l.h(this.f104859c), l.d(this.f104859c), it.next(), new Object[0]);
                                String str = objE instanceof String ? (String) objE : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                        String skuID = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                        Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                        arrayList.add(skuID);
                                        if (this.f104857a == u.b.INAPP) {
                                            l.f104833q.c().put(skuID, jSONObject);
                                        } else {
                                            l.f104833q.f().put(skuID, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.f104858b.run();
                        } else {
                            l.n(this.f104859c, this.f104857a, arrayList, this.f104858b);
                        }
                    }
                }
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return Unit.f93236a;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                return null;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f104860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f104861b;

        public e(l lVar, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f104861b = lVar;
            this.f104860a = completionHandler;
        }

        public void a(Object proxy, Method m10, Object[] objArr) {
            if (e3.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), "onSkuDetailsResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objE = u.e(l.i(this.f104861b), l.e(this.f104861b), it.next(), new Object[0]);
                                String str = objE instanceof String ? (String) objE : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                        String skuID = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                        Map mapE = l.f104833q.e();
                                        Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                        mapE.put(skuID, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.f104860a.run();
                    }
                }
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return Unit.f93236a;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, tVar);
    }

    public static final /* synthetic */ Method d(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f104852m;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Method e(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f104851l;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104837u;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l g() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104835s;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Class h(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f104845f;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(l lVar) {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f104844e;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map j() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104839w;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104838v;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String l() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104834r;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean m() {
        if (e3.a.d(l.class)) {
            return null;
        }
        try {
            return f104836t;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void n(l lVar, u.b bVar, List list, Runnable runnable) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            lVar.s(bVar, list, runnable);
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    public static final /* synthetic */ void o(l lVar) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            f104835s = lVar;
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    private final void p(Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (f104836t.get()) {
                runnable.run();
            } else {
                u(runnable);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(l this$0, u.b productType, Runnable completionHandler) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            u.e(this$0.f104841b, this$0.f104854o, this$0.q(), productType.g(), Proxy.newProxyInstance(this$0.f104847h.getClassLoader(), new Class[]{this$0.f104847h}, new c(this$0, productType, completionHandler)));
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    private final void s(final u.b bVar, final List list, final Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            p(new Runnable() { // from class: t2.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.t(this.f104829b, runnable, bVar, list);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l this$0, Runnable completionHandler, u.b skuType, List skuIDs) {
        if (e3.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(skuType, "$skuType");
            Intrinsics.checkNotNullParameter(skuIDs, "$skuIDs");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.f104846g.getClassLoader(), new Class[]{this$0.f104846g}, new e(this$0, completionHandler));
            u.e(this$0.f104841b, this$0.f104853n, this$0.q(), this$0.f104855p.c(skuType, skuIDs), objNewProxyInstance);
        } catch (Throwable th2) {
            e3.a.b(th2, l.class);
        }
    }

    private final void u(Runnable runnable) {
        Method methodD;
        if (e3.a.d(this)) {
            return;
        }
        try {
            Class clsA = u.a("com.android.billingclient.api.BillingClientStateListener");
            if (clsA == null || (methodD = u.d(this.f104841b, "startConnection", clsA)) == null) {
                return;
            }
            u.e(this.f104841b, methodD, q(), Proxy.newProxyInstance(clsA.getClassLoader(), new Class[]{clsA}, new a(runnable)));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // t2.i
    public void a(final u.b productType, final Runnable completionHandler) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            p(new Runnable() { // from class: t2.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.r(this.f104826b, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public Object q() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return this.f104840a;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar) {
        this.f104840a = obj;
        this.f104841b = cls;
        this.f104842c = cls2;
        this.f104843d = cls3;
        this.f104844e = cls4;
        this.f104845f = cls5;
        this.f104846g = cls6;
        this.f104847h = cls7;
        this.f104848i = method;
        this.f104849j = method2;
        this.f104850k = method3;
        this.f104851l = method4;
        this.f104852m = method5;
        this.f104853n = method6;
        this.f104854o = method7;
        this.f104855p = tVar;
    }
}
