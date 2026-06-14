package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i53 extends ho {
    public final pe A;
    public final m9 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c4 f111872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f111873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final an2 f111874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final dm2 f111875z;

    public /* synthetic */ i53(Context context, c4 c4Var, int i10, String str, go goVar, Object obj, an2 an2Var, pm2 pm2Var, mr1 mr1Var, int i11) {
        this(context, c4Var, i10, str, goVar, obj, an2Var, (i11 & 128) != 0 ? null : pm2Var, mr1Var, new pe(context), new m9());
    }

    @Override // yads.ho, yads.km2
    public oj3 a(oj3 oj3Var) {
        try {
            r62 r62Var = oj3Var.f114340b;
            this.f111875z.a(this.f111874y.a(null, r62Var != null ? r62Var.f115340a : -1, this.f111873x));
            return oj3Var;
        } catch (Throwable th2) {
            this.f111875z.reportError("Failed to parse network error", th2);
            int i10 = g4.f111053d;
            return new g4(l4.f112955o, null);
        }
    }

    public abstract qn2 a(r62 r62Var, int i10);

    @Override // yads.km2
    public Map d() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(this.f111872w.f109195b.f108850a.f110762c);
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final void n() {
        zl2 zl2VarA = this.f111874y.a(this.f111873x);
        this.f111875z.a(zl2VarA);
        String str = zl2VarA.f118733a;
        xl2 xl2Var = xl2.f117874k;
        if (Intrinsics.areEqual(str, Reporting.Key.AD_REQUEST)) {
            this.A.a(xl2Var, zl2VarA.f118734b, null, null);
        }
    }

    public i53(Context context, c4 c4Var, int i10, String str, go goVar, Object obj, an2 an2Var, pm2 pm2Var, mr1 mr1Var, pe peVar, m9 m9Var) {
        super(context, i10, str, goVar, pm2Var);
        this.f111872w = c4Var;
        this.f111873x = obj;
        this.f111874y = an2Var;
        this.f111875z = mr1Var;
        this.A = peVar;
        this.B = m9Var;
        a(context);
        l();
        m();
        n();
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        try {
            int i10 = r62Var.f115340a;
            qn2 qn2VarA = a(r62Var, i10);
            a(r62Var, qn2VarA, i10);
            return qn2VarA;
        } catch (Throwable th2) {
            this.f111875z.reportError("Failed to parse network response", th2);
            int i11 = g4.f111053d;
            return new qn2(new g4(l4.f112955o, null));
        }
    }

    public final void a(r62 r62Var, qn2 qn2Var, int i10) {
        zl2 zl2VarA = this.f111874y.a(qn2Var, i10, this.f111873x);
        Map linkedHashMap = zl2VarA.f118734b;
        if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strC = ez0.c(r62Var.f115342c, f01.f110558q);
        if (strC != null) {
            linkedHashMap.put("server_log_id", strC);
        }
        Map map = r62Var.f115342c;
        if (map != null) {
            u9.a(map);
        }
        this.f111875z.a(zl2VarA);
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && (num2 = hr2VarA.f111754t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = i01.f111815a;
        }
        this.B.f113350a.getClass();
        hr2 hr2VarA2 = ut2.a().a(context);
        this.f112775o = new zd0(1.0f, iIntValue, (hr2VarA2 == null || (num = hr2VarA2.J) == null) ? 0 : num.intValue());
    }
}
