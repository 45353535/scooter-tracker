package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f104902a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f104903b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f104904c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f104905d = com.facebook.s.m().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SharedPreferences f104906e = com.facebook.s.m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final SharedPreferences f104907f = com.facebook.s.m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private q() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (e3.a.d(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f104902a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
            return null;
        }
    }

    public static final void b() {
        if (e3.a.d(q.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f104906e;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j10 > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
        }
    }

    private final ArrayList c(ArrayList arrayList) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = f104907f.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !Intrinsics.areEqual(f104907f.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final Class d(Context context, String str) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            HashMap map = f104904c;
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            Class clsB = u.b(context, str);
            if (clsB == null) {
                return clsB;
            }
            map.put(str, clsB);
            return clsB;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method e(java.lang.Class r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.q.e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList f(android.content.Context r18, java.lang.Object r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = 0
            r1 = 1
            boolean r2 = e3.a.d(r17)
            r3 = 0
            if (r2 == 0) goto La
            return r3
        La:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            boolean r4 = r17.o(r18, r19, r20)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L9d
            r5 = r0
            r6 = r5
            r4 = r3
        L18:
            r7 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L89
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L89
            r8.<init>()     // Catch: java.lang.Throwable -> L89
            r9 = 5
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L89
            r15[r0] = r7     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = t2.q.f104905d     // Catch: java.lang.Throwable -> L89
            r15[r1] = r7     // Catch: java.lang.Throwable -> L89
            r7 = 2
            r15[r7] = r20     // Catch: java.lang.Throwable -> L89
            r7 = 3
            r15[r7] = r4     // Catch: java.lang.Throwable -> L89
            r4 = 4
            r15[r4] = r8     // Catch: java.lang.Throwable -> L89
            java.lang.String r12 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r13 = "getPurchaseHistory"
            r10 = r17
            r11 = r18
            r14 = r19
            java.lang.Object r4 = r10.n(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L94
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L89
            java.lang.String r11 = "RESPONSE_CODE"
            int r11 = r4.getInt(r11)     // Catch: java.lang.Throwable -> L89
            if (r11 != 0) goto L94
            java.lang.String r11 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r11 = r4.getStringArrayList(r11)     // Catch: java.lang.Throwable -> L89
            if (r11 != 0) goto L5e
            goto L94
        L5e:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L89
        L62:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r12 == 0) goto L8d
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L89
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L89
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L89
            r13.<init>(r12)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L89
            java.lang.String r14 = "purchaseTime"
            long r13 = r13.getLong(r14)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L89
            long r13 = r13 / r9
            long r13 = r7 - r13
            r15 = 1200(0x4b0, double:5.93E-321)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L84
            r6 = r1
            goto L8d
        L84:
            r2.add(r12)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L89
            int r5 = r5 + r1
            goto L62
        L89:
            r0 = move-exception
            r10 = r17
            goto L9e
        L8d:
            java.lang.String r7 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r4 = r4.getString(r7)     // Catch: java.lang.Throwable -> L89
            goto L95
        L94:
            r4 = r3
        L95:
            r7 = 30
            if (r5 >= r7) goto L9d
            if (r4 == 0) goto L9d
            if (r6 == 0) goto L18
        L9d:
            return r2
        L9e:
            e3.a.b(r0, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.q.f(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList g(Context context, Object obj) {
        q qVar;
        Class clsD;
        if (e3.a.d(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList arrayList = new ArrayList();
            if (obj != null && (clsD = (qVar = f104902a).d(context, "com.android.vending.billing.IInAppBillingService")) != null && qVar.e(clsD, "getPurchaseHistory") != null) {
                return qVar.c(qVar.f(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList h(android.content.Context r15, java.lang.Object r16, java.lang.String r17) {
        /*
            r14 = this;
            r0 = 3
            r1 = 0
            boolean r2 = e3.a.d(r14)
            r3 = 0
            if (r2 == 0) goto La
            return r3
        La:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            if (r16 != 0) goto L12
            goto L66
        L12:
            boolean r4 = r14.o(r15, r16, r17)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L66
            r5 = r1
            r4 = r3
        L1a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5c
            r7 = 4
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r13[r1] = r6     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = t2.q.f104905d     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            r13[r7] = r6     // Catch: java.lang.Throwable -> L5c
            r6 = 2
            r13[r6] = r17     // Catch: java.lang.Throwable -> L5c
            r13[r0] = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r11 = "getPurchases"
            r8 = r14
            r9 = r15
            r12 = r16
            java.lang.Object r4 = r8.n(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L5f
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "RESPONSE_CODE"
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L5f
            java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r6 = r4.getStringArrayList(r6)     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L66
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L5c
            int r5 = r5 + r7
            r2.addAll(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r4 = r4.getString(r6)     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r15 = r0
            goto L67
        L5f:
            r4 = r3
        L60:
            r6 = 30
            if (r5 >= r6) goto L66
            if (r4 != 0) goto L1a
        L66:
            return r2
        L67:
            e3.a.b(r15, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.q.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList i(Context context, Object obj) {
        if (e3.a.d(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = f104902a;
            return qVar.c(qVar.h(context, obj, "inapp"));
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        if (e3.a.d(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = f104902a;
            return qVar.c(qVar.h(context, obj, "subs"));
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList skuList, Object obj, boolean z10) {
        if (e3.a.d(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map mapP = f104902a.p(skuList);
            ArrayList arrayList = new ArrayList();
            Iterator it = skuList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!mapP.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapP.putAll(f104902a.l(context, arrayList, obj, z10));
            return mapP;
        } catch (Throwable th2) {
            e3.a.b(th2, q.class);
            return null;
        }
    }

    private final Map l(Context context, ArrayList arrayList, Object obj, boolean z10) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Map linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, f104905d, z10 ? "subs" : "inapp", bundle});
                if (objN != null) {
                    Bundle bundle2 = (Bundle) objN;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                Object obj2 = arrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                String str = stringArrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodE;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Class clsD = d(context, str);
            if (clsD == null || (methodE = e(clsD, str2)) == null) {
                return null;
            }
            return u.e(clsD, methodE, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (e3.a.d(this) || obj == null) {
            return false;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f104905d, str});
            if (objN != null) {
                if (((Integer) objN).intValue() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            e3.a.b(th, this);
            return false;
        }
    }

    private final Map p(ArrayList arrayList) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f104906e.getString(sku, null);
                if (string != null) {
                    List listSplit$default = StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, listSplit$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void q(Map map) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f104906e.edit();
            for (Map.Entry entry : map.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final boolean m(String skuDetail) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (strOptString != null) {
                    if (strOptString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }
}
