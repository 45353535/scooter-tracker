package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v10 implements eh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f116835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh3 f116836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af3 f116837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o91 f116838d = new o91(new o10());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f116839e;

    public v10(n10 n10Var, bh3 bh3Var, af3 af3Var) {
        this.f116835a = n10Var;
        this.f116836b = bh3Var;
        this.f116837c = af3Var;
    }

    @Override // yads.eh3
    public final void a(float f10) {
    }

    @Override // yads.eh3
    public final void b() {
        this.f116836b.a(this.f116835a, "complete");
    }

    @Override // yads.eh3
    public final void c() {
        this.f116836b.a(this.f116835a, "resume");
    }

    @Override // yads.eh3
    public final void d() {
        this.f116836b.a(this.f116835a, "pause");
    }

    @Override // yads.eh3
    public final void f() {
    }

    @Override // yads.eh3
    public final void g() {
    }

    @Override // yads.eh3
    public final void h() {
        this.f116836b.a(this.f116835a, "creativeView");
    }

    @Override // yads.eh3
    public final void i() {
        this.f116836b.a(new s10(this.f116835a), "creativeRenderingStart");
    }

    @Override // yads.eh3
    public final void j() {
    }

    @Override // yads.eh3
    public final void k() {
        this.f116839e = false;
    }

    @Override // yads.eh3
    public final void l() {
        this.f116836b.a(this.f116835a, "mute");
    }

    @Override // yads.eh3
    public final void m() {
        if (!this.f116839e) {
            this.f116839e = true;
            this.f116836b.a(this.f116835a, "start");
        }
        this.f116836b.a(this.f116835a, "clickTracking");
    }

    @Override // yads.eh3
    public final void n() {
    }

    @Override // yads.eh3
    public final void a(View view, List list) {
    }

    @Override // yads.eh3
    public final void a(xc3 xc3Var) {
    }

    @Override // yads.eh3
    public final void a(dh3 dh3Var) {
        String str;
        int iOrdinal = dh3Var.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = "midpoint";
        } else {
            if (iOrdinal != 2) {
                throw new lf.m();
            }
            str = "thirdQuartile";
        }
        this.f116836b.a(this.f116835a, str);
    }

    @Override // yads.eh3
    public final void a(float f10, long j10) {
        if (this.f116839e) {
            return;
        }
        this.f116839e = true;
        this.f116836b.a(this.f116835a, "start");
    }

    @Override // yads.eh3
    public final void a() {
        this.f116836b.a(this.f116835a, "unmute");
    }
}
