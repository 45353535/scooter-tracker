package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.K4;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class K4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K4 f37202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f37203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinkedList f37204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static LinkedList f37205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f37206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f37207f;

    static {
        K4 k42 = new K4();
        f37202a = k42;
        f37203b = lf.i.a(new Function0() { // from class: w3.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return K4.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        f37204c = linkedList;
        Object objClone = linkedList.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f37205d = (LinkedList) objClone;
        H4 h42 = new H4();
        E4 e42 = new E4();
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        C3774i4 c3774i42 = Y3.f38021a;
        f37206e = X5.a(((SignalsConfig) c3774i42.a(SignalsConfig.class)).getKA());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(L4.f37255j);
        arrayList.removeAll(skipFields);
        f37207f = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        Context context = Ji.f37157a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Ea eaA = Da.a(context, "c_data_store");
            Context context2 = Ji.f37157a;
            int i10 = 1;
            if (context2 != null) {
                Ea eaA2 = Da.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", C4240b4.i.W);
                i10 = eaA2.f36783a.getInt("akv", 1);
            }
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) c3774i42.a(SignalsConfig.class)).getVAK() != i10) {
                Intrinsics.checkNotNullExpressionValue("K4", "TAG");
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                eaA.a("akv", ((SignalsConfig) c3774i42.a(SignalsConfig.class)).getVAK(), false);
                k42.f();
            }
        }
        Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, e42);
        Y3.a("signals", h42);
    }

    public static final C4 b() {
        return new C4(AbstractC3754h9.b());
    }

    public static AdConfig c() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) Y3.f38021a.a(AdConfig.class);
    }

    public static String d() {
        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
        if (f37207f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        LinkedList linkedList = f37205d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((W5) obj).f37932b >= jCurrentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(StringsKt.v1(((W5) it.next()).f37931a).toString());
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static boolean e() {
        boolean z10;
        AdConfig.ContextualDataConfig contextualData;
        Context context = Ji.f37157a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Ea eaA = Da.a(context, "c_data_store");
            Intrinsics.checkNotNullParameter("isEnabled", C4240b4.i.W);
            z10 = eaA.f36783a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            return false;
        }
        AdConfig adConfigC = c();
        boolean z11 = ((adConfigC == null || (contextualData = adConfigC.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
        return z11;
    }

    public final void a(boolean z10) {
        Context context = Ji.f37157a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            if (z10 != e()) {
                Intrinsics.checkNotNullExpressionValue("K4", "TAG");
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea.a(Da.a(context, "c_data_store"), "isEnabled", z10);
                if (z10) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            eg.h.b(null, new G4(null), 1, null);
            LinkedList linkedList = new LinkedList();
            f37204c = linkedList;
            Object objClone = linkedList.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f37205d = (LinkedList) objClone;
            Unit unit = Unit.f93236a;
        }
    }

    public static final void a() {
        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        a(jCurrentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object objClone = f37204c.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f37205d = (LinkedList) objClone;
        eg.h.b(null, new J4(jCurrentTimeMillis, null), 1, null);
    }

    public static void a(long j10, int i10) {
        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
        for (int size = f37204c.size(); size > i10; size--) {
            f37204c.remove();
        }
        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
        Iterator it = f37204c.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((W5) next).f37932b >= j10) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
