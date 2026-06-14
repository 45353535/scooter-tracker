package t2;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f104914g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static t f104915h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f104916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f104917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f104918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f104919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f104920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f104921f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t a() {
            Class clsA = u.a("com.android.billingclient.api.SkuDetailsParams");
            Class clsA2 = u.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsA != null && clsA2 != null) {
                Method methodD = u.d(clsA, "newBuilder", new Class[0]);
                Method methodD2 = u.d(clsA2, "setType", String.class);
                Method methodD3 = u.d(clsA2, "setSkusList", List.class);
                Method methodD4 = u.d(clsA2, "build", new Class[0]);
                if (methodD != null && methodD2 != null && methodD3 != null && methodD4 != null) {
                    t.b(new t(clsA, clsA2, methodD, methodD2, methodD3, methodD4));
                    return t.a();
                }
            }
            return null;
        }

        public final synchronized t b() {
            t tVarA;
            tVarA = t.a();
            if (tVarA == null) {
                tVarA = a();
            }
            return tVarA;
        }

        private a() {
        }
    }

    public t(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f104916a = skuDetailsParamsClazz;
        this.f104917b = builderClazz;
        this.f104918c = newBuilderMethod;
        this.f104919d = setTypeMethod;
        this.f104920e = setSkusListMethod;
        this.f104921f = buildMethod;
    }

    public static final /* synthetic */ t a() {
        if (e3.a.d(t.class)) {
            return null;
        }
        try {
            return f104915h;
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(t tVar) {
        if (e3.a.d(t.class)) {
            return;
        }
        try {
            f104915h = tVar;
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
        }
    }

    public final Object c(u.b productType, List list) {
        Object objE;
        Object objE2;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Object objE3 = u.e(this.f104916a, this.f104918c, null, new Object[0]);
            if (objE3 == null || (objE = u.e(this.f104917b, this.f104919d, objE3, productType.g())) == null || (objE2 = u.e(this.f104917b, this.f104920e, objE, list)) == null) {
                return null;
            }
            return u.e(this.f104917b, this.f104921f, objE2, new Object[0]);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final Class d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return this.f104916a;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }
}
