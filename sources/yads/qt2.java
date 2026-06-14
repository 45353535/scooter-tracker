package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class qt2 implements un2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f115157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f115158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st2 f115159c;

    public qt2(st2 st2Var, Context context, t9 t9Var) {
        this.f115159c = st2Var;
        this.f115157a = t9Var;
        this.f115158b = context.getApplicationContext();
    }

    @Override // yads.un2
    public final void a() {
        t9 t9Var = this.f115157a;
        c4 c4Var = this.f115159c.f115938f;
        s02 s02Var = new s02();
        st2 st2Var = this.f115159c;
        st2Var.f115936d.a(this.f115158b, this.f115157a, st2Var.f115939g);
        uq2 uq2Var = this.f115159c.f115936d;
        Context context = this.f115158b;
        t9 t9Var2 = this.f115157a;
        uq2Var.getClass();
        new am2((Map) null, 3);
        am2 am2VarA = s02Var.a(t9Var, c4Var, null);
        yl2 yl2Var = yl2.f118285c;
        am2VarA.b("success", "status");
        uq2Var.a(context, t9Var2, xl2.f117871h, am2VarA);
    }

    @Override // yads.un2
    public final void a(qz1 qz1Var) {
        t9 t9Var = this.f115157a;
        c4 c4Var = this.f115159c.f115938f;
        s02 s02Var = new s02();
        st2 st2Var = this.f115159c;
        st2Var.f115936d.a(this.f115158b, this.f115157a, st2Var.f115939g);
        uq2 uq2Var = this.f115159c.f115936d;
        Context context = this.f115158b;
        t9 t9Var2 = this.f115157a;
        uq2Var.getClass();
        new am2((Map) null, 3);
        am2 am2VarA = s02Var.a(t9Var, c4Var, qz1Var);
        yl2 yl2Var = yl2.f118285c;
        am2VarA.b("success", "status");
        uq2Var.a(context, t9Var2, xl2.f117871h, am2VarA);
    }
}
