package t2;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.json.JSONObject;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements i {
    private static o Q;
    private final Method A;
    private final Method B;
    private final Method C;
    private final Method D;
    private final Method E;
    private final Method F;
    private final Method G;
    private final Method H;
    private final Method I;
    private final Method J;
    private final Method K;
    private final Method L;
    private final Method M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f104869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f104870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f104871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f104872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f104873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f104874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f104875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f104876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f104877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f104878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Class f104879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class f104880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f104881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f104882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Class f104883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Class f104884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f104885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Class f104886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Method f104887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Method f104888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Method f104889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Method f104890v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Method f104891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Method f104892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Method f104893y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Method f104894z;
    public static final a N = new a(null);
    private static final String O = o.class.getCanonicalName();
    private static final AtomicBoolean P = new AtomicBoolean(false);
    private static final Map R = new ConcurrentHashMap();
    private static final Map S = new ConcurrentHashMap();
    private static final Map T = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls, Class cls2, Class cls3) {
            Object objE;
            Method methodD = u.d(cls, "newBuilder", Context.class);
            Method methodD2 = u.d(cls2, "setListener", cls3);
            Method methodD3 = u.d(cls2, "enablePendingPurchases", new Class[0]);
            Method methodD4 = u.d(cls2, "build", new Class[0]);
            if (methodD4 == null || methodD2 == null || methodD == null || methodD3 == null || (objE = u.e(cls2, methodD2, u.e(cls, methodD, null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return u.e(cls2, methodD4, u.e(cls2, methodD3, objE, new Object[0]), new Object[0]);
        }

        private final o b(Context context) {
            Class clsA = u.a("com.android.billingclient.api.BillingClient");
            Class clsA2 = u.a("com.android.billingclient.api.Purchase");
            Class clsA3 = u.a("com.android.billingclient.api.ProductDetails");
            Class clsA4 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsA5 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class clsA6 = u.a("com.android.billingclient.api.BillingResult");
            Class clsA7 = u.a("com.android.billingclient.api.QueryProductDetailsParams");
            Class clsA8 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class clsA9 = u.a("com.android.billingclient.api.QueryPurchasesParams");
            Class clsA10 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class clsA11 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class clsA12 = u.a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class clsA13 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class clsA14 = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class clsA15 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class clsA16 = u.a("com.android.billingclient.api.BillingClientStateListener");
            Class clsA17 = u.a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class clsA18 = u.a("com.android.billingclient.api.PurchasesResponseListener");
            Class clsA19 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsA == null || clsA2 == null || clsA3 == null || clsA4 == null || clsA5 == null || clsA6 == null || clsA7 == null || clsA8 == null || clsA9 == null || clsA10 == null || clsA11 == null || clsA12 == null || clsA13 == null || clsA14 == null || clsA15 == null || clsA16 == null || clsA17 == null || clsA18 == null || clsA19 == null) {
                Log.w(o.h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodD = u.d(clsA, BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, clsA9, clsA18);
            Method methodD2 = u.d(clsA9, "newBuilder", new Class[0]);
            Method methodD3 = u.d(clsA12, "build", new Class[0]);
            Method methodD4 = u.d(clsA12, "setProductType", String.class);
            Method methodD5 = u.d(clsA2, "getOriginalJson", new Class[0]);
            Method methodD6 = u.d(clsA, "queryPurchaseHistoryAsync", clsA8, clsA19);
            Method methodD7 = u.d(clsA8, "newBuilder", new Class[0]);
            Method methodD8 = u.d(clsA11, "build", new Class[0]);
            Method methodD9 = u.d(clsA11, "setProductType", String.class);
            Method methodD10 = u.d(clsA4, "getOriginalJson", new Class[0]);
            Method methodD11 = u.d(clsA, BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, clsA7, clsA17);
            Method methodD12 = u.d(clsA7, "newBuilder", new Class[0]);
            Method methodD13 = u.d(clsA10, "build", new Class[0]);
            Method methodD14 = u.d(clsA10, "setProductList", List.class);
            Method methodD15 = u.d(clsA5, "newBuilder", new Class[0]);
            Method methodD16 = u.d(clsA13, "build", new Class[0]);
            Method methodD17 = u.d(clsA13, "setProductId", String.class);
            Method methodD18 = u.d(clsA13, "setProductType", String.class);
            Method methodD19 = u.d(clsA3, "toString", new Class[0]);
            Method methodD20 = u.d(clsA, "startConnection", clsA16);
            Method methodD21 = u.d(clsA6, "getResponseCode", new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null || methodD8 == null || methodD9 == null || methodD10 == null || methodD11 == null || methodD12 == null || methodD13 == null || methodD14 == null || methodD15 == null || methodD16 == null || methodD17 == null || methodD18 == null || methodD19 == null || methodD20 == null || methodD21 == null) {
                Log.w(o.h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objA = a(context, clsA, clsA14, clsA15);
            if (objA == null) {
                Log.w(o.h(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            o.n(new o(objA, clsA, clsA2, clsA3, clsA4, clsA5, clsA6, clsA7, clsA8, clsA9, clsA10, clsA11, clsA12, clsA13, clsA16, clsA17, clsA18, clsA19, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, methodD8, methodD9, methodD10, methodD11, methodD12, methodD13, methodD14, methodD15, methodD16, methodD17, methodD18, methodD19, methodD20, methodD21, null));
            return o.e();
        }

        public final Map c() {
            return o.d();
        }

        public final synchronized o d(Context context) {
            o oVarE;
            Intrinsics.checkNotNullParameter(context, "context");
            oVarE = o.e();
            if (oVarE == null) {
                oVarE = b(context);
            }
            return oVarE;
        }

        public final Map e() {
            return o.f();
        }

        public final Map f() {
            return o.g();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m10, "m");
            return null;
        }

        private a() {
        }
    }

    public final class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f104895a;

        public b(Object[] objArr) {
            this.f104895a = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m10, "m");
            String name = m10.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse")) {
                        o.l(o.this, this.f104895a, objArr);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse")) {
                        o.m(o.this, this.f104895a, objArr);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished")) {
                        o.j(o.this, this.f104895a, objArr);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected")) {
                        o.i(o.this, this.f104895a, objArr);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals(ProductDetailsResponseListenerProxy.onProductDetailsResponseMethodName)) {
                        o.k(o.this, this.f104895a, objArr);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    public /* synthetic */ o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(o this$0, u.b productType, Runnable completionHandler) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            u.e(this$0.f104870b, this$0.f104892x, this$0.p(), this$0.s(productType), Proxy.newProxyInstance(this$0.f104886r.getClassLoader(), new Class[]{this$0.f104886r}, this$0.new b(new Object[]{productType, completionHandler})));
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    private final void B(Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            u.e(this.f104870b, this.L, p(), Proxy.newProxyInstance(this.f104883o.getClassLoader(), new Class[]{this.f104883o}, new b(new Object[]{runnable})));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final /* synthetic */ Map d() {
        if (e3.a.d(o.class)) {
            return null;
        }
        try {
            return R;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ o e() {
        if (e3.a.d(o.class)) {
            return null;
        }
        try {
            return Q;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        if (e3.a.d(o.class)) {
            return null;
        }
        try {
            return T;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map g() {
        if (e3.a.d(o.class)) {
            return null;
        }
        try {
            return S;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ String h() {
        if (e3.a.d(o.class)) {
            return null;
        }
        try {
            return O;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ void i(o oVar, Object[] objArr, Object[] objArr2) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            oVar.t(objArr, objArr2);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void j(o oVar, Object[] objArr, Object[] objArr2) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            oVar.u(objArr, objArr2);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void k(o oVar, Object[] objArr, Object[] objArr2) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            oVar.v(objArr, objArr2);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void l(o oVar, Object[] objArr, Object[] objArr2) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            oVar.w(objArr, objArr2);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void m(o oVar, Object[] objArr, Object[] objArr2) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            oVar.x(objArr, objArr2);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void n(o oVar) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            Q = oVar;
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    private final void o(Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (P.get()) {
                runnable.run();
            } else {
                B(runnable);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final Object r(u.b bVar, List list) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object objE = u.e(this.f104882n, this.H, u.e(this.f104882n, this.J, u.e(this.f104882n, this.I, u.e(this.f104874f, this.G, null, new Object[0]), str), bVar.g()), new Object[0]);
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
            return u.e(this.f104879k, this.E, u.e(this.f104879k, this.F, u.e(this.f104876h, this.D, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final Object s(u.b bVar) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return u.e(this.f104880l, this.f104894z, u.e(this.f104880l, this.A, u.e(this.f104877i, this.f104893y, null, new Object[0]), bVar.g()), new Object[0]);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void t(Object[] objArr, Object[] objArr2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            P.set(false);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void u(Object[] objArr, Object[] objArr2) {
        Runnable runnable;
        if (e3.a.d(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.areEqual(u.e(this.f104875g, this.M, objArr2[0], new Object[0]), (Object) 0)) {
                P.set(true);
                if (objArr != null && objArr.length != 0) {
                    Object obj = objArr[0];
                    if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                        return;
                    }
                    runnable.run();
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void v(Object[] objArr, Object[] objArr2) {
        Object orNull;
        String strQ;
        if (e3.a.d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return;
            }
        } else {
            orNull = null;
        }
        Object orNull2 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
        if (orNull2 != null && (orNull2 instanceof List)) {
            Iterator it = ((List) orNull2).iterator();
            while (it.hasNext()) {
                try {
                    Object objE = u.e(this.f104872d, this.K, it.next(), new Object[0]);
                    String str = objE instanceof String ? (String) objE : null;
                    if (str != null && (strQ = q(str)) != null) {
                        JSONObject jSONObject = new JSONObject(strQ);
                        if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                            String productId = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                            Map map = T;
                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                            map.put(productId, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (orNull == null || !(orNull instanceof Runnable)) {
                return;
            }
            ((Runnable) orNull).run();
        }
    }

    private final void w(Object[] objArr, Object[] objArr2) {
        Object orNull;
        if (e3.a.d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof u.b)) {
            Object orNull2 = ArraysKt.getOrNull(objArr, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objE = u.e(this.f104873e, this.B, it.next(), new Object[0]);
                            String str = objE instanceof String ? (String) objE : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                    String productId = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                    if (!T.containsKey(productId)) {
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        arrayList.add(productId);
                                    }
                                    if (orNull == u.b.INAPP) {
                                        Map map = R;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map.put(productId, jSONObject);
                                    } else {
                                        Map map2 = S;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map2.put(productId, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        y((u.b) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    private final void x(Object[] objArr, Object[] objArr2) {
        Object orNull;
        if (e3.a.d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof u.b)) {
            Object orNull2 = ArraysKt.getOrNull(objArr, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        Object objE = u.e(this.f104871c, this.f104891w, it.next(), new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                String productId = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                if (!T.containsKey(productId)) {
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    arrayList.add(productId);
                                }
                                if (orNull == u.b.INAPP) {
                                    Map map = R;
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    map.put(productId, jSONObject);
                                } else {
                                    Map map2 = S;
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    map2.put(productId, jSONObject);
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        y((u.b) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    private final void y(final u.b bVar, final List list, final Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            o(new Runnable() { // from class: t2.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.z(this.f104865b, runnable, bVar, list);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(o this$0, Runnable completionHandler, u.b productType, List productIds) {
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(productIds, "$productIds");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.f104884p.getClassLoader(), new Class[]{this$0.f104884p}, this$0.new b(new Object[]{completionHandler}));
            Object objR = this$0.r(productType, productIds);
            if (objR != null) {
                u.e(this$0.f104870b, this$0.C, this$0.p(), objR, objNewProxyInstance);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
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
            o(new Runnable() { // from class: t2.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.A(this.f104862b, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public Object p() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return this.f104869a;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String q(String productDetailsString) {
        List listC;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productDetailsString, "productDetailsString");
            MatchResult matchResultC = Regex.c(new Regex("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
            if (matchResultC == null || (listC = matchResultC.c()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(listC, 1);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.f104869a = obj;
        this.f104870b = cls;
        this.f104871c = cls2;
        this.f104872d = cls3;
        this.f104873e = cls4;
        this.f104874f = cls5;
        this.f104875g = cls6;
        this.f104876h = cls7;
        this.f104877i = cls8;
        this.f104878j = cls9;
        this.f104879k = cls10;
        this.f104880l = cls11;
        this.f104881m = cls12;
        this.f104882n = cls13;
        this.f104883o = cls14;
        this.f104884p = cls15;
        this.f104885q = cls16;
        this.f104886r = cls17;
        this.f104887s = method;
        this.f104888t = method2;
        this.f104889u = method3;
        this.f104890v = method4;
        this.f104891w = method5;
        this.f104892x = method6;
        this.f104893y = method7;
        this.f104894z = method8;
        this.A = method9;
        this.B = method10;
        this.C = method11;
        this.D = method12;
        this.E = method13;
        this.F = method14;
        this.G = method15;
        this.H = method16;
        this.I = method17;
        this.J = method18;
        this.K = method19;
        this.L = method20;
        this.M = method21;
    }
}
