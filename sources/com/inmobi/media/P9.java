package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.P9;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f37527a = lf.i.a(new Function0() { // from class: w3.z3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O9 f37528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4073u5 f37529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final La f37530d;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f37528b = new O9();
        f37530d = new La(a());
        Context context = Ji.f37157a;
        if (context != null) {
            f37529c = new C4073u5(context, a(), (C4155xc) Ji.f37161e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            V4 type = V4.f37880d;
            Intrinsics.checkNotNullParameter(type, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                eaA.a(type.f37985a, jCurrentTimeMillis, true);
            }
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                eaA2.a("s-cnt", 0, false);
            }
        }
        if (AbstractC3760hf.f38713a.getCrashConfig().getReportOOMInfo()) {
            for (X4 type2 : CollectionsKt.listOf((Object[]) new X4[]{W4.f37930d, U4.f37820d})) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    eaA3.a(type2.f37985a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static CrashConfig a() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        return (CrashConfig) Y3.f38021a.a(CrashConfig.class);
    }

    public static final N9 b() {
        return new N9(AbstractC3754h9.b());
    }

    public static void c() {
        Ea eaA;
        if (a().getCrashConfig().getReportSessionInfo() && (eaA = S9.a()) != null) {
            Intrinsics.checkNotNullParameter("s-cnt", C4240b4.i.W);
            eaA.a("s-cnt", eaA.f36783a.getInt("s-cnt", 0) + 1, false);
        }
        C4073u5 c4073u5 = f37529c;
        if (c4073u5 != null) {
            Iterator it = c4073u5.f39637c.iterator();
            while (it.hasNext()) {
                ((AbstractC4048t5) it.next()).a();
            }
        }
        La la2 = f37530d;
        la2.getClass();
        AbstractC3790il.a(new Ia(la2, null));
        ((C4155xc) Ji.f37161e.getValue()).a(new int[]{2, 1, 152, TextFieldImplKt.AnimationDuration, 151}, la2.f37276d);
        C3774i4 c3774i4 = Y3.f38021a;
        Y3.a("crashReporting", f37528b);
    }

    public static void a(L2 incident) {
        Intrinsics.checkNotNullParameter(incident, "event");
        La la2 = f37530d;
        la2.getClass();
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (la2.f37273a.getCatchConfig().getEnabled() && la2.f37275c.f37648b.a()) {
            AbstractC3790il.a(new Ha(la2, incident, null));
        }
    }

    public static void a(JSONObject payload, boolean z10, long j10) throws JSONException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z10) {
            V4 crashType = V4.f37880d;
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Ea eaA = S9.a();
            long j11 = 0;
            if (eaA != null) {
                String key = crashType.f37985a;
                Intrinsics.checkNotNullParameter(key, "key");
                long j12 = eaA.f36783a.getLong(key, 0L);
                String str = crashType.f37986b;
                if (j12 == 0) {
                    eaA.a(str, j10, true);
                } else {
                    eaA.a(str, j10 - j12, true);
                }
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String key2 = crashType.f37986b;
                Intrinsics.checkNotNullParameter(key2, "key");
                j11 = eaA2.f36783a.getLong(key2, 0L);
            }
            payload.put("crashFreeSessionLength", j11);
            Ea eaA3 = S9.a();
            int i10 = 0;
            if (eaA3 != null) {
                Intrinsics.checkNotNullParameter("s-cnt", C4240b4.i.W);
                i10 = eaA3.f36783a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i10);
        }
    }
}
