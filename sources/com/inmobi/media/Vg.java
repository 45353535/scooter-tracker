package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.Vg;
import com.inmobi.media.Wg;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3811jh f37912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f37913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f37914d = lf.i.a(new Function0() { // from class: w3.e5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(Vg.c());
        }
    });

    public static void a() {
        Ea eaA;
        Context context = Ji.f37157a;
        String string = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            eaA = Da.a(context, "purchase_store");
        } else {
            eaA = null;
        }
        if (eaA != null) {
            Intrinsics.checkNotNullParameter("purchase_pref", C4240b4.i.W);
            string = eaA.f36783a.getString("purchase_pref", null);
        }
        if (string != null) {
            f37911a = string;
        }
    }

    public static void b() {
        try {
            Context context = Ji.f37157a;
            if (context == null) {
                return;
            }
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    f37913c = 1;
                    C3811jh c3811jh = new C3811jh();
                    f37912b = c3811jh;
                    c3811jh.a(context, new Function1() { // from class: w3.f5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Vg.a((Wg) obj);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public static final boolean c() {
        return true;
    }

    public static final Unit a(Wg wg2) throws JSONException {
        Ea eaA;
        f37913c = 2;
        if (wg2 == null) {
            C3811jh c3811jh = f37912b;
            if (c3811jh != null) {
                c3811jh.f38821a = null;
                BillingClient billingClient = c3811jh.f38822b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            f37912b = null;
            return Unit.f93236a;
        }
        wg2.toString();
        JSONObject jSONObject = new JSONObject();
        int i10 = wg2.f37954a;
        if (i10 > 0) {
            jSONObject.put("p", i10);
        }
        int i11 = wg2.f37955b;
        if (i11 > 0) {
            jSONObject.put("s", i11);
        }
        String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            f37911a = nipMapJSON;
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                eaA = Da.a(context, "purchase_store");
            } else {
                eaA = null;
            }
            if (eaA != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
                eaA.a("purchase_pref", nipMapJSON, false);
            }
        }
        C3811jh c3811jh2 = f37912b;
        if (c3811jh2 != null) {
            c3811jh2.f38821a = null;
            BillingClient billingClient2 = c3811jh2.f38822b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        f37912b = null;
        return Unit.f93236a;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            boolean zContains = CollectionsKt.contains(((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!zContains) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                Wj wj = Wj.f37959a;
                Wj.b("BillingClientNotCompatible", linkedHashMap, EnumC3585ak.f38215a);
            }
            return zContains;
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
            return false;
        }
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4148x5.f39893a.getClass();
        if (!C4148x5.v()) {
            return false;
        }
        if (!((Boolean) f37914d.getValue()).booleanValue()) {
            AbstractC3608bh.a(new Yg((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i10 = f37913c;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        AbstractC3608bh.a(new Yg(i10 != 1 ? i10 != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }
}
