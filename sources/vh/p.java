package vh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class p extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m0 f106891f;

    public p(m0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f106891f = delegate;
    }

    @Override // vh.m0
    public m0 a() {
        return this.f106891f.a();
    }

    @Override // vh.m0
    public m0 b() {
        return this.f106891f.b();
    }

    @Override // vh.m0
    public long c() {
        return this.f106891f.c();
    }

    @Override // vh.m0
    public m0 d(long j10) {
        return this.f106891f.d(j10);
    }

    @Override // vh.m0
    public boolean e() {
        return this.f106891f.e();
    }

    @Override // vh.m0
    public void f() throws InterruptedIOException {
        this.f106891f.f();
    }

    @Override // vh.m0
    public m0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f106891f.g(j10, unit);
    }

    public final m0 i() {
        return this.f106891f;
    }

    public final p j(m0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f106891f = delegate;
        return this;
    }
}
