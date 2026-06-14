package vh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f106879d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f106880e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f106881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106883c;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public m0 a() {
        this.f106881a = false;
        return this;
    }

    public m0 b() {
        this.f106883c = 0L;
        return this;
    }

    public long c() {
        if (this.f106881a) {
            return this.f106882b;
        }
        throw new IllegalStateException("No deadline");
    }

    public m0 d(long j10) {
        this.f106881a = true;
        this.f106882b = j10;
        return this;
    }

    public boolean e() {
        return this.f106881a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f106881a && this.f106882b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public m0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f106883c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f106883c;
    }

    public static final class a extends m0 {
        a() {
        }

        @Override // vh.m0
        public m0 g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // vh.m0
        public void f() {
        }

        @Override // vh.m0
        public m0 d(long j10) {
            return this;
        }
    }
}
