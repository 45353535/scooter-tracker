package yads;

import j$.util.Objects;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f111819m = {ub.a(i1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f111820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f111821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final op0 f111822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l9 f111823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm2 f111824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vp0 f111825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sp0 f111826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f111827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gk2 f111828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h1 f111829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v02 f111830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f111831l;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ i1(android.content.Context r11, yads.c4 r12, yads.es2 r13, yads.t9 r14, yads.g1 r15, yads.op0 r16) {
        /*
            r10 = this;
            r4 = r16
            yads.l9 r5 = new yads.l9
            r5.<init>()
            r0 = r13
            yads.pr3 r0 = (yads.pr3) r0
            r0.d()
            yads.wr3 r1 = yads.wr3.f117545a
            yads.in3 r0 = r0.b()
            yads.mr1 r6 = yads.ve.a(r11, r0)
            if (r4 == 0) goto L20
            yads.vp0 r0 = new yads.vp0
            r0.<init>(r11, r12, r13, r4)
        L1e:
            r7 = r0
            goto L22
        L20:
            r0 = 0
            goto L1e
        L22:
            yads.sp0 r8 = yads.rp0.a(r11)
            java.lang.Object r13 = yads.vt2.f117186j
            yads.vt2 r13 = yads.ut2.a()
            yads.hr2 r11 = r13.a(r11)
            if (r11 == 0) goto L3f
            boolean r11 = r11.h()
            r13 = 1
            if (r11 != r13) goto L3f
        L39:
            r0 = r10
            r1 = r12
            r9 = r13
            r2 = r14
            r3 = r15
            goto L41
        L3f:
            r13 = 0
            goto L39
        L41:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.i1.<init>(android.content.Context, yads.c4, yads.es2, yads.t9, yads.g1, yads.op0):void");
    }

    public final zl2 a(h1 h1Var, String str) {
        am2 am2VarA = this.f111823d.a(this.f111820a.f109198e);
        am2VarA.b(h1Var.f111434b, "type");
        am2VarA.b(this.f111820a.f109194a.f115230b, "ad_type");
        am2VarA.b(this.f111820a.f109196c.f110681a, "ad_unit_id");
        am2VarA.b(str, "interval");
        v02 v02Var = this.f111830k;
        if (v02Var != null) {
            am2VarA = bm2.a(am2VarA, v02Var.a());
        }
        xl2 xl2Var = xl2.f117866c;
        Map map = am2VarA.f108722a;
        t9 t9Var = this.f111821b;
        return new zl2("returned_to_app", MapsKt.toMutableMap(map), t9Var != null ? t9Var.f116116i : null);
    }

    public final void b(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = lb1.f113032a;
        this.f111831l = System.currentTimeMillis();
        this.f111829j = h1Var;
        if (h1Var == h1.f111430c && this.f111827h) {
            Map mapB = a(h1Var, null).b();
            t9 t9Var = this.f111821b;
            this.f111826g.a(new pp0(this.f111820a.a(), this.f111831l, h1Var, this.f111822c, mapB, t9Var != null ? t9Var.a() : null));
        }
    }

    public i1(c4 c4Var, t9 t9Var, g1 g1Var, op0 op0Var, l9 l9Var, dm2 dm2Var, vp0 vp0Var, sp0 sp0Var, boolean z10) {
        this.f111820a = c4Var;
        this.f111821b = t9Var;
        this.f111822c = op0Var;
        this.f111823d = l9Var;
        this.f111824e = dm2Var;
        this.f111825f = vp0Var;
        this.f111826g = sp0Var;
        this.f111827h = z10;
        this.f111828i = hk2.a(g1Var);
    }

    public final void a(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = lb1.f113032a;
        if (this.f111831l == 0 || this.f111829j != h1Var) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f111831l;
        this.f111824e.a(a(h1Var, cc1.a(jCurrentTimeMillis)));
        gk2 gk2Var = this.f111828i;
        KProperty kProperty = f111819m[0];
        g1 g1Var = (g1) gk2Var.f111244a.get();
        if (g1Var != null) {
            g1Var.onReturnedToApplication();
        }
        vp0 vp0Var = this.f111825f;
        if (vp0Var != null) {
            vp0Var.a(jCurrentTimeMillis);
            if (this.f111827h) {
                this.f111826g.a(this.f111831l);
            }
        }
        this.f111831l = 0L;
        this.f111829j = null;
    }
}
