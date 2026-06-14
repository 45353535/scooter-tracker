package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class h92 implements if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111521a;

    public h92(int i10) {
        this.f111521a = i10;
    }

    @Override // yads.if0
    public final boolean a(Context context) {
        return this.f111521a == context.getResources().getConfiguration().orientation;
    }
}
