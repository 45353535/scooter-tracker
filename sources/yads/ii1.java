package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ii1 implements if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci1 f112002b;

    public ii1(int i10, ci1 ci1Var) {
        this.f112001a = i10;
        this.f112002b = ci1Var;
    }

    @Override // yads.if0
    public final boolean a(Context context) {
        int iC = qi3.c(context);
        int i10 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f112002b.a();
        return i10 - (fA != null ? zf.a.d(fA.floatValue() * ((float) iC)) : 0) >= this.f112001a;
    }
}
