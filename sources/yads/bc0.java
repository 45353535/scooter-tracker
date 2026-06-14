package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class bc0 implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f108961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f108962b;

    public bc0(Context context, b30 b30Var) {
        this.f108961a = context.getApplicationContext();
        this.f108962b = b30Var;
    }

    @Override // yads.b30
    public final c30 a() {
        return new cc0(this.f108961a, this.f108962b.a());
    }
}
