package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.Qi;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import com.vungle.ads.internal.signals.SignalManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class Qi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f37601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f37602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f37603f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ea f37606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I1 f37607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I1 f37608k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f37599b = {kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(Qi.class, "sessionCnt", "getSessionCnt()I", 0)), kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(Qi.class, "userRetention", "getUserRetention()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qi f37598a = new Qi();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37600c = Qi.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f37604g = CollectionsKt.mutableListOf(0, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f37605h = new AtomicBoolean(false);

    static {
        Ea eaA;
        Context context = Ji.f37157a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            eaA = Da.a(context, "session_pref_file");
        } else {
            eaA = null;
        }
        f37606i = eaA;
        int i10 = 12;
        f37607j = new I1(-1, new Function0() { // from class: w3.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Qi.a());
            }
        }, i10);
        f37608k = new I1(-1, new Function0() { // from class: w3.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Qi.b());
            }
        }, i10);
    }

    public static boolean a(int i10) {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getSession().getSigControlList().contains(Integer.valueOf(i10));
    }

    public static final int b() {
        f37598a.getClass();
        Ea ea2 = f37606i;
        if (ea2 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", C4240b4.i.W);
        return Math.min((int) ((jCurrentTimeMillis - ea2.f36783a.getLong("u-ret", jCurrentTimeMillis)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f37605h.getAndSet(true)) {
            return;
        }
        if (Yi.a().getSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            f37601d = string;
            String TAG = f37600c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
        f37603f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Ea ea2 = f37606i;
            if (ea2 != null) {
                Intrinsics.checkNotNullParameter("cnt", C4240b4.i.W);
                ea2.a("cnt", Math.min(ea2.f36783a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            f37607j.a();
        }
        if (a(6)) {
            Ea ea3 = f37606i;
            if (ea3 != null) {
                Intrinsics.checkNotNullParameter("u-ret", C4240b4.i.W);
                if (!ea3.f36783a.contains("u-ret")) {
                    ea3.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            f37608k.a();
        }
    }

    public static final int a() {
        f37598a.getClass();
        Ea ea2 = f37606i;
        if (ea2 == null) {
            return 0;
        }
        Intrinsics.checkNotNullParameter("cnt", C4240b4.i.W);
        return ea2.f36783a.getInt("cnt", 0);
    }

    public static void a(String adtype, Boolean bool) {
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (Intrinsics.areEqual(adtype, "banner") && a(1)) {
            List list = f37604g;
            list.set(0, Integer.valueOf(Math.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, "int") && !Intrinsics.areEqual(bool, Boolean.TRUE) && a(2)) {
            List list2 = f37604g;
            list2.set(1, Integer.valueOf(Math.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, "native") && a(4)) {
            List list3 = f37604g;
            list3.set(3, Integer.valueOf(Math.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && a(3)) {
            List list4 = f37604g;
            list4.set(2, Integer.valueOf(Math.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
