package f1;

import android.content.ActivityNotFoundException;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6 f69597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa f69598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e5 f69599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f69600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zb f69601e;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69602f = new a();

        public a() {
            super(0);
        }

        public final void a() {
            eg.j("Video replay command is run", null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class a0 extends Lambda implements Function0 {
        public a0() {
            super(0);
        }

        public final void a() {
            da.this.D();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69604a;

        static {
            int[] iArr = new int[ta.values().length];
            try {
                iArr[ta.f71158e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ta.f71159f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ta.f71160g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ta.f71161h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ta.f71162i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ta.f71163j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ta.f71164k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ta.f71165l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ta.f71166m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ta.f71167n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ta.f71168o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ta.f71169p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ta.f71170q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ta.f71171r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ta.f71172s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ta.f71173t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ta.f71174u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ta.f71175v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ta.f71176w.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ta.f71177x.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ta.f71178y.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ta.f71179z.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ta.A.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ta.B.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ta.C.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ta.D.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ta.E.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ta.F.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ta.G.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ta.H.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ta.I.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ta.J.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ta.K.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ta.L.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ta.M.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ta.R.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ta.N.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ta.O.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ta.P.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ta.Q.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f69604a = iArr;
        }
    }

    public static final class b0 extends Lambda implements Function0 {
        public b0() {
            super(0);
        }

        public final void a() {
            da.this.z();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f69607g = jSONObject;
        }

        public final void a() {
            da.this.h(this.f69607g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c0 extends Lambda implements Function0 {
        public c0() {
            super(0);
        }

        public final void a() {
            da.this.v();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.u();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template show", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69611g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.f69611g = jSONObject;
        }

        public final void a() {
            da.this.L(this.f69611g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69613g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONObject jSONObject) {
            super(0);
            this.f69613g = jSONObject;
        }

        public final void a() {
            da.this.q(this.f69613g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69615g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.f69615g = jSONObject;
        }

        public final void a() {
            da.this.O(this.f69615g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(0);
            this.f69617g = jSONObject;
        }

        public final void a() {
            da.this.m(this.f69617g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69619g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONObject jSONObject) {
            super(0);
            this.f69619g = jSONObject;
        }

        public final void a() {
            da.this.N(this.f69619g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69621g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(JSONObject jSONObject) {
            super(0);
            this.f69621g = jSONObject;
        }

        public final void a() {
            da.this.y(this.f69621g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69623g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(JSONObject jSONObject) {
            super(0);
            this.f69623g = jSONObject;
        }

        public final void a() {
            da.this.J(this.f69623g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        public final void a() {
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.A();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.q();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template rewarded video completed", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.v();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template play video", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class o extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69628g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(JSONObject jSONObject) {
            super(0);
            this.f69628g = jSONObject;
        }

        public final void a() {
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.g(da.this.f69598b.b(this.f69628g));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.k();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template pause video", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class q extends Lambda implements Function0 {
        public q() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.z();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template close video", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.f();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template mute video", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.b();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template unmute video", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class t extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(JSONObject jSONObject) {
            super(0);
            this.f69634g = jSONObject;
        }

        public final void a() {
            da.this.C(this.f69634g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class u extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ JSONObject f69636g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(JSONObject jSONObject) {
            super(0);
            this.f69636g = jSONObject;
        }

        public final void a() {
            da.this.G(this.f69636g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        public final void a() {
            da.this.n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        public final void a() {
            da.this.k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        public final void a() {
            da.this.r();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        public final void a() {
            Unit unit;
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.t();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in template close", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        public final void a() {
            zb zbVar = da.this.f69601e;
            if (zbVar != null) {
                zbVar.t(s7.f71060k);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public da(t6 uiPost, wa urlParser) {
        Intrinsics.checkNotNullParameter(uiPost, "uiPost");
        Intrinsics.checkNotNullParameter(urlParser, "urlParser");
        this.f69597a = uiPost;
        this.f69598b = urlParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(org.json.JSONObject r9) {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            if (r9 == 0) goto L80
            java.lang.String r2 = "resources"
            java.lang.String r2 = r9.getString(r2)     // Catch: java.lang.Exception -> L17
            if (r2 == 0) goto L80
            int r3 = r2.length()     // Catch: java.lang.Exception -> L17
            if (r3 != 0) goto L1a
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Exception -> L17
            goto L61
        L17:
            r9 = move-exception
            goto L89
        L1a:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L17
            r3.<init>(r2)     // Catch: java.lang.Exception -> L17
            java.util.List r2 = f1.vd.a(r3)     // Catch: java.lang.Exception -> L17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L17
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)     // Catch: java.lang.Exception -> L17
            r3.<init>(r4)     // Catch: java.lang.Exception -> L17
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L17
        L32:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L17
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L17
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = "vendorKey"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Exception -> L17
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> L17
            java.lang.String r7 = "url"
            java.lang.String r7 = r4.getString(r7)     // Catch: java.lang.Exception -> L17
            r6.<init>(r7)     // Catch: java.lang.Exception -> L17
            java.lang.String r7 = "params"
            java.lang.String r4 = r4.getString(r7)     // Catch: java.lang.Exception -> L17
            com.iab.omid.library.chartboost.adsession.VerificationScriptResource r4 = com.iab.omid.library.chartboost.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(r5, r6, r4)     // Catch: java.lang.Exception -> L17
            r3.add(r4)     // Catch: java.lang.Exception -> L17
            goto L32
        L5d:
            java.util.List r2 = kotlin.collections.CollectionsKt.toList(r3)     // Catch: java.lang.Exception -> L17
        L61:
            java.lang.String r3 = "skipOffset"
            int r9 = r9.optInt(r3)     // Catch: java.lang.Exception -> L17
            f1.zb r3 = r8.f69601e     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L75
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L17
            r3.k(r2, r9)     // Catch: java.lang.Exception -> L17
            kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Exception -> L17
            goto L76
        L75:
            r9 = r1
        L76:
            if (r9 != 0) goto L7d
            java.lang.String r9 = "Impression interface is missing in runOmResources"
            f1.eg.e(r9, r1, r0, r1)     // Catch: java.lang.Exception -> L17
        L7d:
            kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Exception -> L17
            goto L81
        L80:
            r9 = r1
        L81:
            if (r9 != 0) goto L8e
            java.lang.String r9 = "Invalid om resources command: missing json"
            f1.eg.j(r9, r1, r0, r1)     // Catch: java.lang.Exception -> L17
            return
        L89:
            java.lang.String r0 = "Invalid om resources command"
            f1.eg.i(r0, r9)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.da.C(org.json.JSONObject):void");
    }

    public final void D() {
        Unit unit;
        e5 e5Var = this.f69599c;
        if (e5Var != null) {
            e5Var.onHideCustomView();
        }
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.q(ue.f71306d);
            zbVar.l();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in videoCompleted", null, 2, null);
        }
    }

    public final void G(JSONObject jSONObject) {
        Unit unit;
        double dOptDouble = 0.0d;
        if (jSONObject != null) {
            try {
                dOptDouble = jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e10) {
                eg.i("Invalid start command", e10);
                return;
            }
        }
        this.f69600d = (float) dOptDouble;
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.t(s7.f71051b);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in runStart", null, 2, null);
        }
    }

    public final void J(JSONObject jSONObject) {
        Unit unit;
        boolean zOptBoolean = true;
        if (jSONObject != null) {
            try {
                zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                eg.j("Invalid set orientation command", null, 2, null);
                return;
            }
        }
        String str = "none";
        String strOptString = jSONObject != null ? jSONObject.optString("forceOrientation", "none") : null;
        if (strOptString != null) {
            str = strOptString;
        }
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.a(zOptBoolean, str);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in setOrientation", null, 2, null);
        }
    }

    public final void L(JSONObject jSONObject) {
        float fOptDouble;
        Unit unit;
        if (jSONObject != null) {
            try {
                fOptDouble = (float) jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e10) {
                O(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Parsing exception unknown field for total player duration: " + e10));
                return;
            }
        } else {
            fOptDouble = 0.0f;
        }
        float f10 = fOptDouble * 1000;
        eg.e("######### JS->Native Video total player duration" + f10, null, 2, null);
        this.f69600d = f10;
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.b(f10);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in totalVideoDuration", null, 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(org.json.JSONObject r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L32
            java.lang.String r2 = "event"
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.Exception -> L16
            if (r5 == 0) goto L32
            f1.zb r2 = r4.f69601e     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L18
            r2.e(r5)     // Catch: java.lang.Exception -> L16
            kotlin.Unit r2 = kotlin.Unit.f93236a     // Catch: java.lang.Exception -> L16
            goto L19
        L16:
            r5 = move-exception
            goto L3b
        L18:
            r2 = r1
        L19:
            if (r2 != 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r2.<init>()     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = "JS->Native Track VAST event message: "
            r2.append(r3)     // Catch: java.lang.Exception -> L16
            r2.append(r5)     // Catch: java.lang.Exception -> L16
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L16
            f1.eg.e(r5, r1, r0, r1)     // Catch: java.lang.Exception -> L16
        L2f:
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Exception -> L16
            goto L33
        L32:
            r5 = r1
        L33:
            if (r5 != 0) goto L40
            java.lang.String r5 = "Tracking command received but event is missing!"
            f1.eg.j(r5, r1, r0, r1)     // Catch: java.lang.Exception -> L16
            return
        L3b:
            java.lang.String r0 = "Exception while parsing webview VAST tracking"
            f1.eg.i(r0, r5)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.da.N(org.json.JSONObject):void");
    }

    public final void O(JSONObject jSONObject) {
        String string;
        eg.e("Javascript warning occurred", null, 2, null);
        if (jSONObject != null) {
            try {
                string = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
            } catch (Exception unused) {
                zb zbVar = this.f69601e;
                if (zbVar != null) {
                    zbVar.c("Warning message is empty");
                    return;
                }
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "Missing message argument";
        }
        eg.e("JS->Native Warning message: " + string, null, 2, null);
        zb zbVar2 = this.f69601e;
        if (zbVar2 != null) {
            zbVar2.c(string);
        }
    }

    public final String b(JSONObject jSONObject, ta taVar) {
        String strJ;
        String strH;
        String strB;
        String strS;
        String strW;
        String strC;
        switch (b.f69604a[taVar.ordinal()]) {
            case 1:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar = this.f69601e;
                return (zbVar == null || (strJ = zbVar.j()) == null) ? "" : strJ;
            case 2:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar2 = this.f69601e;
                return (zbVar2 == null || (strH = zbVar2.h()) == null) ? "" : strH;
            case 3:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar3 = this.f69601e;
                return (zbVar3 == null || (strB = zbVar3.B()) == null) ? "" : strB;
            case 4:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar4 = this.f69601e;
                return (zbVar4 == null || (strS = zbVar4.s()) == null) ? "" : strS;
            case 5:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar5 = this.f69601e;
                return (zbVar5 == null || (strW = zbVar5.w()) == null) ? "" : strW;
            case 6:
                eg.e("JavaScript to native " + taVar.h() + " callback triggered.", null, 2, null);
                zb zbVar6 = this.f69601e;
                return (zbVar6 == null || (strC = zbVar6.C()) == null) ? "" : strC;
            case 7:
                this.f69597a.b(new o(jSONObject));
                return "Native function successfully called.";
            case 8:
                this.f69597a.b(new y());
                return "Native function successfully called.";
            case 9:
                this.f69597a.b(new z());
                return "Native function successfully called.";
            case 10:
                this.f69597a.b(new a0());
                return "Native function successfully called.";
            case 11:
                this.f69597a.b(new b0());
                return "Native function successfully called.";
            case 12:
                this.f69597a.b(new c0());
                return "Native function successfully called.";
            case 13:
                this.f69597a.b(a.f69602f);
                return "Native function successfully called.";
            case 14:
                this.f69597a.b(new c(jSONObject));
                return "Native function successfully called.";
            case 15:
                this.f69597a.b(new e(jSONObject));
                return "Native function successfully called.";
            case 16:
                this.f69597a.b(new d());
                return "Native function successfully called.";
            case 17:
                this.f69597a.b(new f(jSONObject));
                return "Native function successfully called.";
            case 18:
                this.f69597a.b(new g(jSONObject));
                return "Native function successfully called.";
            case 19:
                this.f69597a.b(new h(jSONObject));
                return "Native function successfully called.";
            case 20:
                this.f69597a.b(new i(jSONObject));
                return "Native function successfully called.";
            case 21:
                this.f69597a.b(new j(jSONObject));
                return "Native function successfully called.";
            case 22:
                this.f69597a.b(new k(jSONObject));
                return "Native function successfully called.";
            case 23:
                this.f69597a.b(new l());
                return "Native function successfully called.";
            case 24:
                this.f69597a.b(new m());
                return "Native function successfully called.";
            case 25:
                this.f69597a.b(new n());
                return "Native function successfully called.";
            case 26:
                this.f69597a.b(new p());
                return "Native function successfully called.";
            case 27:
                this.f69597a.b(new q());
                return "Native function successfully called.";
            case 28:
                this.f69597a.b(new r());
                return "Native function successfully called.";
            case 29:
                this.f69597a.b(new s());
                return "Native function successfully called.";
            case 30:
                this.f69597a.b(new t(jSONObject));
                return "Native function successfully called.";
            case 31:
                this.f69597a.b(new u(jSONObject));
                return "Native function successfully called.";
            case 32:
                this.f69597a.b(new v());
                return "Native function successfully called.";
            case 33:
                this.f69597a.b(new w());
                return "Native function successfully called.";
            case 34:
                this.f69597a.b(new x());
                return "Native function successfully called.";
            default:
                return "Native function successfully called.";
        }
    }

    public final String c(JSONObject jSONObject, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        ta taVarA = ta.f71156c.a(functionName);
        if (taVarA == null) {
            eg.p("Native event unknown: " + functionName, null, 2, null);
            return "Function name not recognized.";
        }
        eg.e("TEMPLATE EVENT: " + taVarA.h(), null, 2, null);
        return b(jSONObject, taVarA);
    }

    public final void d() {
        this.f69601e = null;
    }

    public final void e(e5 e5Var) {
        this.f69599c = e5Var;
    }

    public final void g(zb impressionInterface) {
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        this.f69601e = impressionInterface;
    }

    public final void h(JSONObject jSONObject) {
        float f10;
        Unit unit;
        if (jSONObject != null) {
            try {
                f10 = (float) jSONObject.getDouble("duration");
            } catch (Exception e10) {
                O(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Parsing exception unknown field for current player duration: " + e10));
                return;
            }
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.0f) {
            float f11 = f10 * 1000;
            eg.e("######### JS->Native Video current player duration: " + f11, null, 2, null);
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.a(f11);
                zbVar.a(this.f69600d, f11);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in currentVideoDuration", null, 2, null);
            }
        }
    }

    public final String j(JSONObject jSONObject, String str) {
        String string = jSONObject != null ? jSONObject.getString(PglCryptUtils.KEY_MESSAGE) : null;
        if (string == null) {
            string = "";
        }
        eg.e(str + string, null, 2, null);
        return string;
    }

    public final void k() {
        Unit unit;
        try {
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.t(s7.f71055f);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in runBufferEnd", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Invalid buffer end command", e10);
        }
    }

    public final void m(JSONObject jSONObject) {
        try {
            eg.e("Debug message: " + j(jSONObject, "JS->Native Debug message: "), null, 2, null);
        } catch (Exception e10) {
            eg.i("Exception occurred while parsing the message for webview debug track event", e10);
        }
    }

    public final void n() {
        Unit unit;
        try {
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.t(s7.f71054e);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in runBufferStart", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Invalid bufer start command", e10);
        }
    }

    public final void q(JSONObject jSONObject) {
        eg.e("Javascript Error occurred " + jSONObject, null, 2, null);
        u(jSONObject);
        try {
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.i();
                if (zbVar.d(j(jSONObject, "JS->Native Error message: ")) != null) {
                    return;
                }
            }
            eg.e("Impression interface is missing in error", null, 2, null);
            Unit unit = Unit.f93236a;
        } catch (Exception unused) {
            eg.j("Error message is empty", null, 2, null);
            zb zbVar2 = this.f69601e;
            if (zbVar2 != null) {
                zbVar2.d("");
            }
        }
    }

    public final void r() {
        Unit unit;
        try {
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.t(s7.f71059j);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in runVideoFinished", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Invalid buffer end command", e10);
        }
    }

    public final void u(JSONObject jSONObject) {
        String strOptString;
        if (h8.f70006a.g() && jSONObject != null && (strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE)) != null && Intrinsics.areEqual(strOptString, "crash sdk")) {
            throw new RuntimeException("test crash");
        }
    }

    public final void v() {
        Unit unit;
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.q(ue.f71308f);
            zbVar.t(s7.f71053d);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in runVideoResumedCommand", null, 2, null);
        }
    }

    public final void y(JSONObject jSONObject) {
        Unit unit;
        try {
            zb zbVar = this.f69601e;
            if (zbVar != null) {
                zbVar.f(this.f69598b.b(jSONObject));
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Impression interface is missing in openUrl", null, 2, null);
            }
        } catch (ActivityNotFoundException e10) {
            eg.i("ActivityNotFoundException occured when opening a url in a browser", e10);
        } catch (Exception e11) {
            eg.i("Exception while opening a browser view with MRAID url", e11);
        }
    }

    public final void z() {
        Unit unit;
        zb zbVar = this.f69601e;
        if (zbVar != null) {
            zbVar.t(s7.f71052c);
            zbVar.q(ue.f71307e);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Impression interface is missing in runVideoResumedCommand", null, 2, null);
        }
    }
}
