package com.my.target;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes11.dex */
public class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f60718a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f60719b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f60720c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f60721d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f60722e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f60723f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f60724g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f60725h = new Rect();

    public static void a(Rect rect, Rect rect2) {
        rect2.set(kb.c(rect.left), kb.c(rect.top), kb.c(rect.right), kb.c(rect.bottom));
    }

    public static r6 e() {
        return new r6();
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f60722e.set(i10, i11, i12, i13);
        a(this.f60722e, this.f60723f);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f60724g.set(i10, i11, i12, i13);
        a(this.f60724g, this.f60725h);
    }

    public Rect d() {
        return this.f60719b;
    }

    public Rect b() {
        return this.f60723f;
    }

    public Rect c() {
        return this.f60725h;
    }

    public void a(int i10, int i11) {
        this.f60718a.set(0, 0, i10, i11);
        a(this.f60718a, this.f60719b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f60720c.set(i10, i11, i12, i13);
        a(this.f60720c, this.f60721d);
    }

    public Rect a() {
        return this.f60721d;
    }
}
