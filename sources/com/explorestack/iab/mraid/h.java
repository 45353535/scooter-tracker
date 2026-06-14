package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f18075a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f18076b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f18077c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f18078d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f18079e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f18080f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f18081g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f18082h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f18083i;

    public h(Context context) {
        this.f18083i = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(Rect rect, Rect rect2, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        b(rect, rect2);
        return true;
    }

    Rect a() {
        return this.f18080f;
    }

    void b(Rect rect, Rect rect2) {
        rect2.set(e2.g.D(rect.left, this.f18083i), e2.g.D(rect.top, this.f18083i), e2.g.D(rect.right, this.f18083i), e2.g.D(rect.bottom, this.f18083i));
    }

    boolean c(int i10, int i11) {
        if (this.f18075a.width() == i10 && this.f18075a.height() == i11) {
            return false;
        }
        this.f18075a.set(0, 0, i10, i11);
        b(this.f18075a, this.f18076b);
        return true;
    }

    boolean d(int i10, int i11, int i12, int i13) {
        return e(this.f18079e, this.f18080f, i10, i11, i12, i13);
    }

    Rect f() {
        return this.f18081g;
    }

    boolean g(int i10, int i11, int i12, int i13) {
        return e(this.f18081g, this.f18082h, i10, i11, i12, i13);
    }

    Rect h() {
        return this.f18082h;
    }

    boolean i(int i10, int i11, int i12, int i13) {
        return e(this.f18077c, this.f18078d, i10, i11, i12, i13);
    }

    Rect j() {
        return this.f18078d;
    }

    Rect k() {
        return this.f18076b;
    }
}
