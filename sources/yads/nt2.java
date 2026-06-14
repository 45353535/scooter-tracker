package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nt2 implements un2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f114029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f114030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt2 f114031c;

    public nt2(pt2 pt2Var, Context context, t9 t9Var) {
        this.f114031c = pt2Var;
        this.f114029a = t9Var;
        this.f114030b = context.getApplicationContext();
    }

    @Override // yads.un2
    public final void a() {
        t9 t9Var = this.f114029a;
        c4 c4Var = this.f114031c.f114776f;
        s02 s02Var = new s02();
        pt2 pt2Var = this.f114031c;
        pt2Var.f114774d.a(this.f114030b, this.f114029a, pt2Var.f114777g);
        uq2 uq2Var = this.f114031c.f114774d;
        Context context = this.f114030b;
        t9 t9Var2 = this.f114029a;
        uq2Var.getClass();
        new am2((Map) null, 3);
        am2 am2VarA = s02Var.a(t9Var, c4Var, null);
        yl2 yl2Var = yl2.f118285c;
        am2VarA.b("success", "status");
        uq2Var.a(context, t9Var2, xl2.f117871h, am2VarA);
    }

    @Override // yads.un2
    public final void a(qz1 qz1Var) {
        t9 t9Var = this.f114029a;
        c4 c4Var = this.f114031c.f114776f;
        s02 s02Var = new s02();
        pt2 pt2Var = this.f114031c;
        pt2Var.f114774d.a(this.f114030b, this.f114029a, pt2Var.f114777g);
        uq2 uq2Var = this.f114031c.f114774d;
        Context context = this.f114030b;
        t9 t9Var2 = this.f114029a;
        uq2Var.getClass();
        new am2((Map) null, 3);
        am2 am2VarA = s02Var.a(t9Var, c4Var, qz1Var);
        yl2 yl2Var = yl2.f118285c;
        am2VarA.b("success", "status");
        uq2Var.a(context, t9Var2, xl2.f117871h, am2VarA);
    }
}
