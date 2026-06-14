package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f119476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f119477b;

    public r(b0 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f119476a = writer;
        this.f119477b = true;
    }

    public final boolean a() {
        return this.f119477b;
    }

    public void b() {
        this.f119477b = true;
    }

    public void c() {
        this.f119477b = false;
    }

    public void d() {
        this.f119477b = false;
    }

    public void e(byte b10) {
        this.f119476a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f119476a.a(c10);
    }

    public void g(double d10) {
        this.f119476a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f119476a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f119476a.writeLong(i10);
    }

    public void j(long j10) {
        this.f119476a.writeLong(j10);
    }

    public final void k(String v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f119476a.c(v10);
    }

    public void l(short s10) {
        this.f119476a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f119476a.c(String.valueOf(z10));
    }

    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119476a.b(value);
    }

    protected final void o(boolean z10) {
        this.f119477b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
