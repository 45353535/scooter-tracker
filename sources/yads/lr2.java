package yads;

import android.content.Context;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class lr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd f113194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl0 f113195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f113196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wr2 f113197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rr2 f113198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sm2 f113199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tr2 f113200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c13 f113201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f113202i;

    public lr2(Context context, pd pdVar, hl0 hl0Var, v5 v5Var, wr2 wr2Var, rr2 rr2Var, sm2 sm2Var, tr2 tr2Var, c13 c13Var) {
        this.f113194a = pdVar;
        this.f113195b = hl0Var;
        this.f113196c = v5Var;
        this.f113197d = wr2Var;
        this.f113198e = rr2Var;
        this.f113199f = sm2Var;
        this.f113200g = tr2Var;
        this.f113201h = c13Var;
        this.f113202i = context.getApplicationContext();
    }

    public final void a(bv2 bv2Var, z41 z41Var, nr2 nr2Var) {
        String str;
        String libraryVersion;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(this.f113202i);
        if (hr2VarA != null && !this.f113197d.a()) {
            jy jyVar = jy.f112504d;
            if (nr2Var.f114005a.isActive()) {
                CancellableContinuation cancellableContinuation = nr2Var.f114005a;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(new bs2(hr2VarA, jyVar)));
                return;
            }
            return;
        }
        xr2 xr2Var = new xr2(this.f113202i, this.f113198e, nr2Var, this.f113196c);
        dm2 dm2Var = this.f113201h.f109180a;
        xl2 xl2Var = xl2.f117866c;
        dm2Var.a(new zl2("sdk_configuration_request", MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("call_source", z41Var.f118546b))), null));
        fl0 fl0Var = this.f113195b.f111627a;
        Context context = this.f113202i;
        String str2 = fl0Var.f110764e;
        if (str2 == null || str2.length() == 0) {
            str = null;
        } else {
            tr2 tr2Var = this.f113200g;
            pd pdVar = this.f113194a;
            tr2Var.getClass();
            boolean zB = bv2Var.b(context);
            ft0 ft0Var = new ft0(zB);
            ft0Var.f110894t = fl0Var.b();
            ft0Var.f110878l = fl0Var.f110763d;
            rd rdVar = pdVar.f114621a;
            boolean z10 = pdVar.f114623c;
            if (rdVar != null) {
                ft0Var.M = Boolean.valueOf(rdVar.f115404b);
                ft0Var.N = Boolean.valueOf(z10);
                String str3 = rdVar.f115403a;
                ft0Var.f110864e.getClass();
                boolean z11 = (str3 == null || str3.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", str3)) ? false : true;
                if (!zB && Intrinsics.areEqual(ft0Var.M, Boolean.FALSE) && z11) {
                    ft0Var.O = str3;
                }
            }
            rd rdVar2 = pdVar.f114622b;
            if (rdVar2 != null) {
                ft0Var.P = Boolean.valueOf(rdVar2.f115404b);
                String str4 = rdVar2.f115403a;
                ft0Var.f110864e.getClass();
                boolean z12 = (str4 == null || str4.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", str4)) ? false : true;
                if (!zB && Intrinsics.areEqual(ft0Var.P, Boolean.FALSE) && z12) {
                    ft0Var.Q = str4;
                }
            }
            ft0Var.f110860c.f108999a.getClass();
            try {
                libraryVersion = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                boolean z13 = lb1.f113032a;
                libraryVersion = null;
            }
            ft0Var.C0 = libraryVersion;
            ft0Var.B = Integer.valueOf(qi3.d(context));
            ft0Var.C = Integer.valueOf(qi3.b(context));
            ft0Var.D = Float.valueOf(context.getResources().getDisplayMetrics().density);
            ft0Var.f110891r0 = qi3.a(context);
            dg0 dg0VarB = bm3.b(context);
            ft0Var.f110893s0 = dg0VarB.f109914a;
            ft0Var.f110895t0 = dg0VarB.f109915b;
            ft0Var.f110897u0 = dg0VarB.f109916c;
            ft0Var.f110899v0 = dg0VarB.f109917d;
            ft0Var.f110901w0 = dg0VarB.f109918e;
            ft0Var.f110903x0 = dg0VarB.f109919f;
            ft0Var.f110876k = ut2.a().b();
            ft0Var.f110868g = bv2.a(context);
            ft0 ft0VarA = ft0Var.a(context, fl0Var.f110760a);
            ft0VarA.f110883n0 = context.getPackageName();
            ft0VarA.f110885o0 = hg.a(context);
            ft0VarA.f110887p0 = hg.b(context);
            ft0VarA.A0 = ft0VarA.f110862d.a("%d.%d%d");
            ft0VarA.B0 = ft0VarA.f110862d.a("%d.%d.%d");
            ft0VarA.f110874j = ut2.a().d();
            ft0VarA.f110866f = true;
            String[] strArr = {new jt0(ft0VarA).toString(), CollectionsKt.joinToString$default(fl0Var.f110761b, C4240b4.j.f42670c, null, null, 0, null, sr2.f115915b, 30, null)};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str5 = strArr[i10];
                if (!StringsKt.y0(str5)) {
                    arrayList.add(str5);
                }
            }
            String strA = tr2Var.f116349a.a(context, CollectionsKt.joinToString$default(arrayList, C4240b4.j.f42670c, null, null, 0, null, null, 62, null));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (!Intrinsics.areEqual(String.valueOf(StringsKt.E1(sb2)), "/")) {
                sb2.append("/");
            }
            sb2.append("v1/startup");
            sb2.append("?");
            sb2.append(strA);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            str = string;
        }
        if (str == null || str.length() == 0) {
            xr2Var.a((oj3) new g4(l4.f112950j, null));
            return;
        }
        vr2 vr2Var = new vr2(this.f113202i, str, this.f113197d, fl0Var.f110762c, xr2Var, xr2Var);
        vr2Var.f112777q = this;
        this.f113196c.a(u5.f116508l, null);
        sm2 sm2Var = this.f113199f;
        Context context2 = this.f113202i;
        synchronized (sm2Var) {
            e72.a(context2).a(vr2Var);
        }
    }

    public /* synthetic */ lr2(Context context, mr1 mr1Var, pd pdVar, hl0 hl0Var, v5 v5Var) {
        wr2 wr2Var = new wr2(context, mr1Var);
        Object obj = rr2.f115559b;
        rr2 rr2VarA = qr2.a();
        Object obj2 = sm2.f115876a;
        this(context, pdVar, hl0Var, v5Var, wr2Var, rr2VarA, rm2.a(), new tr2(), new c13(mr1Var));
    }
}
