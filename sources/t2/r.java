package t2;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f104908a = new r();

    private r() {
    }

    public static final void c() {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.s.m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = com.facebook.s.m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final void d(Map purchaseDetailsMap, Map skuDetailsMap, boolean z10, String packageName, u.a billingClientVersion, boolean z11) {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            r rVar = f104908a;
            rVar.f(rVar.b(rVar.a(purchaseDetailsMap, z10), skuDetailsMap, packageName), z10, billingClientVersion, z11);
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final boolean e() {
        if (e3.a.d(r.class)) {
            return false;
        }
        try {
            return !com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return false;
        }
    }

    private final void f(Map map, boolean z10, u.a aVar, boolean z11) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                v2.k.j((String) entry.getKey(), (String) entry.getValue(), z10, aVar, z11);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void g() {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j10 = Long.parseLong((String) StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j10).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j10);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            c();
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final void h() {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            try {
                com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final void i() {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            h();
            try {
                SharedPreferences sharedPreferences = com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public final Map a(Map purchaseDetailsMap, boolean z10) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = com.facebook.s.m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j10 = z10 ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j11 = jSONObject.getLong("purchaseTime");
                        if (j11 <= j10) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j11);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j10) {
                if (z10) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final Map b(Map purchaseDetailsMap, Map skuDetailsMap, String packageName) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                try {
                    jSONObject.put("packageName", packageName);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "purchaseDetail.toString()");
                        String string2 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }
}
