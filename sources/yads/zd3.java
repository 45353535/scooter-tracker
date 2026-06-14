package yads;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zd3 implements eh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib3 f118635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh3 f118636b;

    public zd3(ib3 ib3Var, bh3 bh3Var) {
        this.f118635a = ib3Var;
        this.f118636b = bh3Var;
    }

    @Override // yads.eh3
    public final void a() {
    }

    @Override // yads.eh3
    public final void b() {
    }

    @Override // yads.eh3
    public final void c() {
    }

    @Override // yads.eh3
    public final void d() {
    }

    @Override // yads.eh3
    public final void f() {
    }

    @Override // yads.eh3
    public final void g() {
    }

    @Override // yads.eh3
    public final void h() {
        this.f118636b.a(this.f118635a, "render_impression");
    }

    @Override // yads.eh3
    public final void i() {
        this.f118636b.a(new tb3(this.f118635a), "renderingStart");
    }

    @Override // yads.eh3
    public final void j() {
    }

    @Override // yads.eh3
    public final void k() {
    }

    @Override // yads.eh3
    public final void l() {
    }

    @Override // yads.eh3
    public final void m() {
    }

    @Override // yads.eh3
    public final void n() {
        this.f118636b.a(this.f118635a, "impression");
    }

    @Override // yads.eh3
    public final void a(float f10) {
    }

    @Override // yads.eh3
    public final void a(float f10, long j10) {
    }

    @Override // yads.eh3
    public final void a(View view, List list) {
    }

    @Override // yads.eh3
    public final void a(dh3 dh3Var) {
    }

    @Override // yads.eh3
    public final void a(xc3 xc3Var) {
        int i10;
        switch (xc3Var.f117790a.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i10 = 405;
                break;
            case 7:
                i10 = 402;
                break;
            case 8:
            case 12:
            case 28:
                i10 = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i10 = 400;
                break;
            case 19:
                i10 = 401;
                break;
            case 23:
                i10 = 403;
                break;
            case 29:
            case 31:
                i10 = 901;
                break;
            case 30:
                i10 = 902;
                break;
            default:
                throw new lf.m();
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(com.taurusx.tax.n.z.f66398w, String.valueOf(i10)));
        bh3 bh3Var = this.f118636b;
        ib3 ib3Var = this.f118635a;
        bh3Var.getClass();
        List list = (List) ib3Var.a().get("error");
        if (list != null) {
            bh3Var.f109007a.a(list, mapMapOf);
        }
    }
}
