package t2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.n0;
import com.facebook.appevents.o0;
import com.facebook.internal.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f104912d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f104909a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f104910b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f104911c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f104913e = new AtomicBoolean(false);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[u.a.values().length];
            try {
                iArr[u.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.a.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.a.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private s() {
    }

    public static final void a() {
        if (e3.a.d(s.class)) {
            return;
        }
        try {
            if (!v2.k.g()) {
                r.i();
            } else {
                f104913e.set(true);
                h();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
        }
    }

    private final u.a b() {
        try {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                Context contextM = com.facebook.s.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return u.a.NONE;
                }
                List listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return u.a.V5_V7;
                }
                g("GPBL." + string);
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                if (intOrNull == null) {
                    return u.a.V5_V7;
                }
                int iIntValue = intOrNull.intValue();
                return iIntValue == 1 ? u.a.V1 : iIntValue < 5 ? u.a.V2_V4 : u.a.V5_V7;
            } catch (Exception unused) {
                return u.a.V5_V7;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static /* synthetic */ String d(s sVar, Bundle bundle, n0 n0Var, Bundle bundle2, n0 n0Var2, boolean z10, boolean z11, int i10, Object obj) {
        if (e3.a.d(s.class)) {
            return null;
        }
        try {
            return sVar.c(bundle, n0Var, bundle2, n0Var2, z10, (i10 & 32) != 0 ? false : z11);
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
            return null;
        }
    }

    public static final String e() {
        if (e3.a.d(s.class)) {
            return null;
        }
        try {
            return f104912d;
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle f(List list, long j10, boolean z10, List list2) {
        Bundle bundle;
        ?? r62;
        ?? ValueOf;
        ?? r11;
        boolean z11;
        List purchases = list;
        List purchaseParameters = list2;
        synchronized (s.class) {
            Bundle bundle2 = null;
            if (e3.a.d(s.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters, "purchaseParameters");
                if (purchaseParameters.isEmpty()) {
                    return null;
                }
                if (purchases.size() != purchaseParameters.size()) {
                    return null;
                }
                ArrayList<Pair> arrayList = new ArrayList();
                int size = purchases.size();
                ?? bundle3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    t2.a aVar = (t2.a) purchases.get(i10);
                    Pair pair = (Pair) purchaseParameters.get(i10);
                    Bundle bundle4 = (Bundle) pair.component1();
                    n0 n0Var = (n0) pair.component2();
                    bundle = bundle2;
                    try {
                        int i11 = i10;
                        t2.a aVar2 = new t2.a(aVar.c(), new BigDecimal(String.valueOf(aVar.a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), aVar.b());
                        List<Pair> list3 = z10 ? (List) f104910b.get(aVar2) : (List) f104911c.get(aVar2);
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            r62 = bundle;
                            ValueOf = r62;
                            r11 = ValueOf;
                            z11 = false;
                        } else {
                            r62 = bundle;
                            ValueOf = r62;
                            r11 = ValueOf;
                            z11 = false;
                            for (Pair pair2 : list3) {
                                long jLongValue = ((Number) pair2.getFirst()).longValue();
                                Pair pair3 = (Pair) pair2.getSecond();
                                Bundle bundle5 = (Bundle) pair3.component1();
                                n0 n0Var2 = (n0) pair3.component2();
                                if (Math.abs(j10 - jLongValue) <= p.f104897a.e() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    s sVar = f104909a;
                                    String strD = d(sVar, bundle4, n0Var, bundle5, n0Var2, !z10, false, 32, null);
                                    String strC = sVar.c(bundle4, n0Var, bundle5, n0Var2, !z10, true);
                                    r62 = r62;
                                    if (strC != null) {
                                        r62 = strC;
                                    }
                                    if (strD != null) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new Pair(aVar2, Long.valueOf(jLongValue)));
                                        z11 = true;
                                    }
                                    r11 = strD;
                                }
                            }
                        }
                        if (r62 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r62);
                        }
                        if (z11) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / ((long) 1000) : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", r11);
                        }
                        if (z10 && !z11) {
                            ConcurrentHashMap concurrentHashMap = f104911c;
                            if (concurrentHashMap.get(aVar2) == null) {
                                concurrentHashMap.put(aVar2, new ArrayList());
                            }
                            List list5 = (List) concurrentHashMap.get(aVar2);
                            if (list5 != null) {
                                list5.add(new Pair(Long.valueOf(j10), new Pair(bundle4, n0Var)));
                            }
                        } else if (!z10 && !z11) {
                            ConcurrentHashMap concurrentHashMap2 = f104910b;
                            if (concurrentHashMap2.get(aVar2) == null) {
                                concurrentHashMap2.put(aVar2, new ArrayList());
                            }
                            List list6 = (List) concurrentHashMap2.get(aVar2);
                            if (list6 != null) {
                                list6.add(new Pair(Long.valueOf(j10), new Pair(bundle4, n0Var)));
                            }
                        }
                        i10 = i11 + 1;
                        purchases = list;
                        purchaseParameters = list2;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                for (Pair pair4 : arrayList) {
                    List list7 = z10 ? (List) f104910b.get(pair4.getFirst()) : (List) f104911c.get(pair4.getFirst());
                    if (list7 != null) {
                        Iterator it = list7.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i13 = i12 + 1;
                            if (((Number) ((Pair) it.next()).getFirst()).longValue() == ((Number) pair4.getSecond()).longValue()) {
                                list7.remove(i12);
                                break;
                            }
                            i12 = i13;
                        }
                        if (z10) {
                            if (list7.isEmpty()) {
                                f104910b.remove(pair4.getFirst());
                            } else {
                                f104910b.put(pair4.getFirst(), list7);
                            }
                        } else if (list7.isEmpty()) {
                            f104911c.remove(pair4.getFirst());
                        } else {
                            f104911c.put(pair4.getFirst(), list7);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            e3.a.b(th, s.class);
            return bundle;
        }
    }

    private static final void g(String str) {
        if (e3.a.d(s.class)) {
            return;
        }
        try {
            f104912d = str;
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
        }
    }

    public static final void h() {
        if (e3.a.d(s.class)) {
            return;
        }
        try {
            if (f104913e.get()) {
                u.a aVarB = f104909a.b();
                int i10 = a.$EnumSwitchMapping$0[aVarB.ordinal()];
                if (i10 == 2) {
                    b.g(u.a.V1);
                    return;
                }
                if (i10 != 3) {
                    if (i10 == 4 && com.facebook.internal.e.g(e.b.IapLoggingLib5To7)) {
                        h.e(com.facebook.s.m(), aVarB);
                        return;
                    }
                    return;
                }
                if (com.facebook.internal.e.g(e.b.IapLoggingLib2)) {
                    h.e(com.facebook.s.m(), aVarB);
                } else {
                    b.g(u.a.V2_V4);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
        }
    }

    public final String c(Bundle bundle, n0 n0Var, Bundle bundle2, n0 n0Var2, boolean z10, boolean z11) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            List<Pair> listF = z11 ? p.f104897a.f(z10) : p.f104897a.d(z10);
            if (listF == null) {
                return null;
            }
            for (Pair pair : listF) {
                Object objC = n0.f19693b.c(o0.IAPParameters, (String) pair.getFirst(), bundle, n0Var);
                String str = objC instanceof String ? (String) objC : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : (List) pair.getSecond()) {
                        Object objC2 = n0.f19693b.c(o0.IAPParameters, str2, bundle2, n0Var2);
                        String str3 = objC2 instanceof String ? (String) objC2 : null;
                        if (str3 != null && str3.length() != 0 && Intrinsics.areEqual(str3, str)) {
                            return z10 ? (String) pair.getFirst() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }
}
