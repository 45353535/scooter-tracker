package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vn implements tk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rk f117125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rk f117126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rk f117127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rk f117128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f117129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f117130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f117131h;

    public vn() {
        ByteBuffer byteBuffer = tk.f116269a;
        this.f117129f = byteBuffer;
        this.f117130g = byteBuffer;
        rk rkVar = rk.f115468e;
        this.f117127d = rkVar;
        this.f117128e = rkVar;
        this.f117125b = rkVar;
        this.f117126c = rkVar;
    }

    @Override // yads.tk
    public final rk a(rk rkVar) {
        this.f117127d = rkVar;
        this.f117128e = b(rkVar);
        return isActive() ? this.f117128e : rk.f115468e;
    }

    public abstract rk b(rk rkVar);

    @Override // yads.tk
    public final void b() {
        this.f117131h = true;
        f();
    }

    @Override // yads.tk
    public boolean c() {
        return this.f117131h && this.f117130g == tk.f116269a;
    }

    @Override // yads.tk
    public final void d() {
        flush();
        this.f117129f = tk.f116269a;
        rk rkVar = rk.f115468e;
        this.f117127d = rkVar;
        this.f117128e = rkVar;
        this.f117125b = rkVar;
        this.f117126c = rkVar;
        g();
    }

    public void e() {
    }

    public void f() {
    }

    @Override // yads.tk
    public final void flush() {
        this.f117130g = tk.f116269a;
        this.f117131h = false;
        this.f117125b = this.f117127d;
        this.f117126c = this.f117128e;
        e();
    }

    public void g() {
    }

    @Override // yads.tk
    public boolean isActive() {
        return this.f117128e != rk.f115468e;
    }

    @Override // yads.tk
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f117130g;
        this.f117130g = tk.f116269a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i10) {
        if (this.f117129f.capacity() < i10) {
            this.f117129f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f117129f.clear();
        }
        ByteBuffer byteBuffer = this.f117129f;
        this.f117130g = byteBuffer;
        return byteBuffer;
    }
}
