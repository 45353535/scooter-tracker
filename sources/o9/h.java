package o9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o9.f;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected f.a f96398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected f.a f96399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.a f96400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f96401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f96402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f96403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f96404h;

    public h() {
        ByteBuffer byteBuffer = f.f96391a;
        this.f96402f = byteBuffer;
        this.f96403g = byteBuffer;
        f.a aVar = f.a.f96392e;
        this.f96400d = aVar;
        this.f96401e = aVar;
        this.f96398b = aVar;
        this.f96399c = aVar;
    }

    @Override // o9.f
    public final f.a a(f.a aVar) {
        this.f96400d = aVar;
        this.f96401e = c(aVar);
        return isActive() ? this.f96401e : f.a.f96392e;
    }

    protected final boolean b() {
        return this.f96403g.hasRemaining();
    }

    protected abstract f.a c(f.a aVar);

    @Override // o9.f
    public final void flush() {
        this.f96403g = f.f96391a;
        this.f96404h = false;
        this.f96398b = this.f96400d;
        this.f96399c = this.f96401e;
        d();
    }

    protected final ByteBuffer g(int i10) {
        if (this.f96402f.capacity() < i10) {
            this.f96402f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f96402f.clear();
        }
        ByteBuffer byteBuffer = this.f96402f;
        this.f96403g = byteBuffer;
        return byteBuffer;
    }

    @Override // o9.f
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f96403g;
        this.f96403g = f.f96391a;
        return byteBuffer;
    }

    @Override // o9.f
    public boolean isActive() {
        return this.f96401e != f.a.f96392e;
    }

    @Override // o9.f
    public boolean isEnded() {
        return this.f96404h && this.f96403g == f.f96391a;
    }

    @Override // o9.f
    public final void queueEndOfStream() {
        this.f96404h = true;
        e();
    }

    @Override // o9.f
    public final void reset() {
        flush();
        this.f96402f = f.f96391a;
        f.a aVar = f.a.f96392e;
        this.f96400d = aVar;
        this.f96401e = aVar;
        this.f96398b = aVar;
        this.f96399c = aVar;
        f();
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }
}
