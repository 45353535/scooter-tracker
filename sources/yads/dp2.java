package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class dp2 implements wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv f110012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f110013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110014d;

    public dp2(Context context, mh0 mh0Var, wy wyVar) {
        this.f110011a = context;
        this.f110012b = mh0Var;
        this.f110013c = wyVar;
    }

    @Override // yads.wy
    public final void e() {
        if (this.f110014d) {
            this.f110013c.e();
            return;
        }
        ((mh0) this.f110012b).a(this.f110011a);
    }
}
