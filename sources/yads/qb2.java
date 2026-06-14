package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class qb2 implements k83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x53 f114929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s53 f114930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm2 f114931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i83 f114932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f114933e;

    public /* synthetic */ qb2(Context context, c4 c4Var, es2 es2Var, x53 x53Var) {
        s53 s53Var = new s53(context, c4Var, es2Var);
        Object obj = sm2.f115876a;
        this(context, x53Var, s53Var, rm2.a(), new i83(context));
    }

    @Override // yads.k83
    public final void a(String str) {
        String strA = this.f114932d.a(str);
        Object obj = vt2.f117186j;
        ob2 ob2Var = new ob2(this.f114933e, strA, new pb2(str, ut2.a().a(this.f114933e), this.f114930b, this.f114929a));
        sm2 sm2Var = this.f114931c;
        Context context = this.f114933e;
        synchronized (sm2Var) {
            e72.a(context).a(ob2Var);
        }
    }

    public qb2(Context context, x53 x53Var, s53 s53Var, sm2 sm2Var, i83 i83Var) {
        this.f114929a = x53Var;
        this.f114930b = s53Var;
        this.f114931c = sm2Var;
        this.f114932d = i83Var;
        this.f114933e = context.getApplicationContext();
    }
}
