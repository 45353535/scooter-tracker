package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f56376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f56377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f56378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f56379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f56380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f56381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f56382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f56383i;

    public b0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f56375a = applicationContext;
        this.f56376b = new Rect();
        this.f56377c = new Rect();
        this.f56378d = new Rect();
        this.f56379e = new Rect();
        this.f56380f = new Rect();
        this.f56381g = new Rect();
        this.f56382h = new Rect();
        this.f56383i = new Rect();
    }

    public final void a(int i10, int i11) {
        this.f56376b.set(0, 0, i10, i11);
        c(this.f56376b, this.f56377c);
    }

    public final void b(int i10, int i11, int i12, int i13) {
        this.f56380f.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f56380f, this.f56381g);
    }

    public final void c(Rect rect, Rect rect2) {
        d dVar = d.f56392a;
        rect2.set(dVar.c(rect.left, this.f56375a), dVar.c(rect.top, this.f56375a), dVar.c(rect.right, this.f56375a), dVar.c(rect.bottom, this.f56375a));
    }

    public final Rect d() {
        return this.f56381g;
    }

    public final void e(int i10, int i11, int i12, int i13) {
        this.f56382h.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f56382h, this.f56383i);
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f56378d.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f56378d, this.f56379e);
    }

    public final Rect g() {
        return this.f56383i;
    }

    public final Rect h() {
        return this.f56379e;
    }

    public final Rect i() {
        return this.f56377c;
    }
}
