package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wq1 implements bo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo0 f117528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u43 f117529b;

    public wq1(bo0 bo0Var, u43 u43Var) {
        this.f117528a = bo0Var;
        this.f117529b = u43Var;
    }

    @Override // yads.bo0
    public final boolean a(int i10, long j10) {
        return this.f117528a.a(i10, j10);
    }

    @Override // yads.bo0
    public final void b() {
        this.f117528a.b();
    }

    @Override // yads.bo0
    public final u43 c() {
        return this.f117529b;
    }

    @Override // yads.bo0
    public final yv0 d() {
        return this.f117528a.d();
    }

    @Override // yads.bo0
    public final int e() {
        return this.f117528a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq1)) {
            return false;
        }
        wq1 wq1Var = (wq1) obj;
        return this.f117528a.equals(wq1Var.f117528a) && this.f117529b.equals(wq1Var.f117529b);
    }

    @Override // yads.bo0
    public final int f() {
        return this.f117528a.f();
    }

    @Override // yads.bo0
    public final int g() {
        return this.f117528a.g();
    }

    @Override // yads.bo0
    public final Object h() {
        return this.f117528a.h();
    }

    public final int hashCode() {
        return this.f117528a.hashCode() + ((this.f117529b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.bo0
    public final void i() {
        this.f117528a.i();
    }

    @Override // yads.bo0
    public final void j() {
        this.f117528a.j();
    }

    @Override // yads.bo0
    public final void a() {
        this.f117528a.a();
    }

    @Override // yads.bo0
    public final int b(int i10) {
        return this.f117528a.b(i10);
    }

    @Override // yads.bo0
    public final int c(int i10) {
        return this.f117528a.c(i10);
    }

    @Override // yads.bo0
    public final int a(long j10, List list) {
        return this.f117528a.a(j10, list);
    }

    @Override // yads.bo0
    public final boolean b(int i10, long j10) {
        return this.f117528a.b(i10, j10);
    }

    @Override // yads.bo0
    public final yv0 a(int i10) {
        return this.f117528a.a(i10);
    }

    @Override // yads.bo0
    public final int a(yv0 yv0Var) {
        return this.f117528a.a(yv0Var);
    }

    @Override // yads.bo0
    public final void a(boolean z10) {
        this.f117528a.a(z10);
    }

    @Override // yads.bo0
    public final void a(float f10) {
        this.f117528a.a(f10);
    }

    @Override // yads.bo0
    public final boolean a(long j10, tt ttVar, List list) {
        return this.f117528a.a(j10, ttVar, list);
    }

    @Override // yads.bo0
    public final void a(long j10, long j11, long j12, List list, ki1[] ki1VarArr) {
        this.f117528a.a(j10, j11, j12, list, ki1VarArr);
    }
}
