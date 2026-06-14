package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fh3 implements eh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh3 f110731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f110732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110733c;

    public fh3(fy fyVar) {
        this.f110731a = fyVar;
    }

    @Override // yads.eh3
    public final void a(View view, List list) {
        this.f110731a.a(view, list);
        this.f110732b = false;
        this.f110733c = false;
    }

    @Override // yads.eh3
    public final void b() {
        this.f110731a.b();
        k();
    }

    @Override // yads.eh3
    public final void c() {
        this.f110731a.c();
    }

    @Override // yads.eh3
    public final void d() {
        this.f110731a.d();
    }

    @Override // yads.eh3
    public final void f() {
        this.f110731a.f();
    }

    @Override // yads.eh3
    public final void g() {
        this.f110731a.g();
        k();
    }

    @Override // yads.eh3
    public final void h() {
        if (this.f110732b) {
            return;
        }
        this.f110732b = true;
        this.f110731a.h();
    }

    @Override // yads.eh3
    public final void i() {
        this.f110731a.i();
    }

    @Override // yads.eh3
    public final void j() {
        this.f110731a.j();
    }

    @Override // yads.eh3
    public final void k() {
        this.f110731a.k();
        this.f110732b = false;
        this.f110733c = false;
    }

    @Override // yads.eh3
    public final void l() {
        this.f110731a.l();
    }

    @Override // yads.eh3
    public final void m() {
        this.f110731a.m();
        h();
        n();
    }

    @Override // yads.eh3
    public final void n() {
        if (this.f110733c) {
            return;
        }
        this.f110733c = true;
        this.f110731a.n();
    }

    @Override // yads.eh3
    public final void a(xc3 xc3Var) {
        this.f110731a.a(xc3Var);
        k();
    }

    @Override // yads.eh3
    public final void a(dh3 dh3Var) {
        this.f110731a.a(dh3Var);
    }

    @Override // yads.eh3
    public final void a(float f10, long j10) {
        this.f110731a.a(f10, j10);
    }

    @Override // yads.eh3
    public final void a() {
        this.f110731a.a();
    }

    @Override // yads.eh3
    public final void a(float f10) {
        this.f110731a.a(f10);
    }
}
