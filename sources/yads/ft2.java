package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ft2 implements un2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f110909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ it2 f110910c;

    public ft2(it2 it2Var, Context context, t9 t9Var) {
        this.f110910c = it2Var;
        this.f110908a = context;
        this.f110909b = t9Var;
    }

    @Override // yads.un2
    public final void a() {
        it2 it2Var = this.f110910c;
        it2Var.f112125e.a(this.f110908a, this.f110909b, it2Var.f112124d);
        this.f110910c.f112125e.a(this.f110908a, this.f110909b, (r02) null);
    }

    @Override // yads.un2
    public final void a(qz1 qz1Var) {
        t9 t9Var = this.f110909b;
        c4 c4Var = this.f110910c.f112121a.f115507c;
        s02 s02Var = new s02();
        it2 it2Var = this.f110910c;
        it2Var.f112125e.a(this.f110908a, this.f110909b, it2Var.f112124d);
        uq2 uq2Var = this.f110910c.f112125e;
        Context context = this.f110908a;
        t9 t9Var2 = this.f110909b;
        uq2Var.getClass();
        new am2((Map) null, 3);
        am2 am2VarA = s02Var.a(t9Var, c4Var, qz1Var);
        yl2 yl2Var = yl2.f118285c;
        am2VarA.b("success", "status");
        uq2Var.a(context, t9Var2, xl2.f117871h, am2VarA);
    }
}
