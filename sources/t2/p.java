package t2;

import android.os.Bundle;
import com.facebook.appevents.n0;
import com.facebook.appevents.o0;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f104897a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f104898b = CollectionsKt.listOf("fb_currency");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f104899c = CollectionsKt.listOf("_valueToSum");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f104900d = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f104901e = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.to("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.to("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.to("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    private p() {
    }

    public final Pair a(Bundle bundle, Bundle bundle2, n0 n0Var) {
        Bundle bundle3;
        n0 n0Var2;
        if (bundle == null) {
            return new Pair(bundle2, n0Var);
        }
        try {
            bundle3 = bundle2;
            n0Var2 = n0Var;
            for (String key : bundle.keySet()) {
                try {
                    String string = bundle.getString(key);
                    if (string != null) {
                        n0.a aVar = n0.f19693b;
                        o0 o0Var = o0.IAPParameters;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Pair pairB = aVar.b(o0Var, key, string, bundle3, n0Var2);
                        Bundle bundle4 = (Bundle) pairB.component1();
                        n0Var2 = (n0) pairB.component2();
                        bundle3 = bundle4;
                    }
                } catch (Exception unused) {
                    bundle2 = bundle3;
                    n0Var = n0Var2;
                    bundle3 = bundle2;
                    n0Var2 = n0Var;
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair(bundle3, n0Var2);
    }

    public final Currency b(Bundle bundle) {
        Iterator it = c().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (string != null && string.length() != 0) {
                return Currency.getInstance(string);
            }
        }
    }

    public final List c() {
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(com.facebook.s.n());
        return ((iVarF != null ? iVarF.e() : null) == null || iVarF.e().isEmpty()) ? f104898b : iVarF.e();
    }

    public final List d(boolean z10) {
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(com.facebook.s.n());
        if ((iVarF != null ? iVarF.k() : null) == null || iVarF.k().isEmpty()) {
            return f104901e;
        }
        if (!z10) {
            return iVarF.k();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : iVarF.k()) {
            Iterator it = ((List) pair.getSecond()).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    public final long e() {
        Long lF;
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(com.facebook.s.n());
        return ((iVarF != null ? iVarF.f() : null) == null || ((lF = iVarF.f()) != null && lF.longValue() == 0)) ? f104900d : iVarF.f().longValue();
    }

    public final List f(boolean z10) {
        List listV;
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(com.facebook.s.n());
        if (iVarF == null || (listV = iVarF.v()) == null || listV.isEmpty()) {
            return null;
        }
        if (!z10) {
            return iVarF.v();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : iVarF.v()) {
            Iterator it = ((List) pair.getSecond()).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    public final Double g(Double d10, Bundle bundle) {
        if (d10 != null) {
            return d10;
        }
        Iterator it = h().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final List h() {
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(com.facebook.s.n());
        return ((iVarF != null ? iVarF.m() : null) == null || iVarF.m().isEmpty()) ? f104899c : iVarF.m();
    }
}
