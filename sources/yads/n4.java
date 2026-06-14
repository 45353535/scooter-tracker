package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sm2 f113717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f113719c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(Context context) {
        this(context, rm2.a());
        Object obj = sm2.f115876a;
    }

    public final void a(hn hnVar) {
        hnVar.f112777q = this.f113718b;
        sm2 sm2Var = this.f113717a;
        Context context = this.f113719c;
        synchronized (sm2Var) {
            e72.a(context).a(hnVar);
        }
    }

    public n4(Context context, sm2 sm2Var) {
        this.f113717a = sm2Var;
        this.f113718b = rb.a(this);
        this.f113719c = context.getApplicationContext();
    }
}
