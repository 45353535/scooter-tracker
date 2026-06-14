package o9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o9.f;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f96428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f96430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f96431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.a f96432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f.a f96433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f.a f96434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f.a f96435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f96436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f96437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f96438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f96439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f96440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f96441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f96442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f96443q;

    public j() {
        this(false);
    }

    private boolean b() {
        return Math.abs(this.f96430d - 1.0f) < 1.0E-4f && Math.abs(this.f96431e - 1.0f) < 1.0E-4f && this.f96433g.f96393a == this.f96432f.f96393a;
    }

    @Override // o9.f
    public f.a a(f.a aVar) throws f.b {
        if (aVar.f96395c != 2) {
            throw new f.b(aVar);
        }
        int i10 = this.f96429c;
        if (i10 == -1) {
            i10 = aVar.f96393a;
        }
        this.f96432f = aVar;
        f.a aVar2 = new f.a(i10, aVar.f96394b, 2);
        this.f96433g = aVar2;
        this.f96436j = true;
        return aVar2;
    }

    public long c(long j10) {
        if (this.f96442p < 1024) {
            return (long) (((double) this.f96430d) * j10);
        }
        long jL = this.f96441o - ((long) ((i) q9.a.e(this.f96437k)).l());
        int i10 = this.f96435i.f96393a;
        int i11 = this.f96434h.f96393a;
        return i10 == i11 ? o0.c1(j10, jL, this.f96442p) : o0.c1(j10, jL * ((long) i10), this.f96442p * ((long) i11));
    }

    public void d(float f10) {
        q9.a.a(f10 > 0.0f);
        if (this.f96431e != f10) {
            this.f96431e = f10;
            this.f96436j = true;
        }
    }

    public void e(float f10) {
        q9.a.a(f10 > 0.0f);
        if (this.f96430d != f10) {
            this.f96430d = f10;
            this.f96436j = true;
        }
    }

    @Override // o9.f
    public void flush() {
        if (isActive()) {
            f.a aVar = this.f96432f;
            this.f96434h = aVar;
            f.a aVar2 = this.f96433g;
            this.f96435i = aVar2;
            if (this.f96436j) {
                this.f96437k = new i(aVar.f96393a, aVar.f96394b, this.f96430d, this.f96431e, aVar2.f96393a);
            } else {
                i iVar = this.f96437k;
                if (iVar != null) {
                    iVar.i();
                }
            }
        }
        this.f96440n = f.f96391a;
        this.f96441o = 0L;
        this.f96442p = 0L;
        this.f96443q = false;
    }

    @Override // o9.f
    public ByteBuffer getOutput() {
        int iK;
        i iVar = this.f96437k;
        if (iVar != null && (iK = iVar.k()) > 0) {
            if (this.f96438l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f96438l = byteBufferOrder;
                this.f96439m = byteBufferOrder.asShortBuffer();
            } else {
                this.f96438l.clear();
                this.f96439m.clear();
            }
            iVar.j(this.f96439m);
            this.f96442p += (long) iK;
            this.f96438l.limit(iK);
            this.f96440n = this.f96438l;
        }
        ByteBuffer byteBuffer = this.f96440n;
        this.f96440n = f.f96391a;
        return byteBuffer;
    }

    @Override // o9.f
    public boolean isActive() {
        if (this.f96433g.f96393a != -1) {
            return this.f96428b || !b();
        }
        return false;
    }

    @Override // o9.f
    public boolean isEnded() {
        if (!this.f96443q) {
            return false;
        }
        i iVar = this.f96437k;
        return iVar == null || iVar.k() == 0;
    }

    @Override // o9.f
    public void queueEndOfStream() {
        i iVar = this.f96437k;
        if (iVar != null) {
            iVar.s();
        }
        this.f96443q = true;
    }

    @Override // o9.f
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            i iVar = (i) q9.a.e(this.f96437k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f96441o += (long) iRemaining;
            iVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // o9.f
    public void reset() {
        this.f96430d = 1.0f;
        this.f96431e = 1.0f;
        f.a aVar = f.a.f96392e;
        this.f96432f = aVar;
        this.f96433g = aVar;
        this.f96434h = aVar;
        this.f96435i = aVar;
        ByteBuffer byteBuffer = f.f96391a;
        this.f96438l = byteBuffer;
        this.f96439m = byteBuffer.asShortBuffer();
        this.f96440n = byteBuffer;
        this.f96429c = -1;
        this.f96436j = false;
        this.f96437k = null;
        this.f96441o = 0L;
        this.f96442p = 0L;
        this.f96443q = false;
    }

    j(boolean z10) {
        this.f96430d = 1.0f;
        this.f96431e = 1.0f;
        f.a aVar = f.a.f96392e;
        this.f96432f = aVar;
        this.f96433g = aVar;
        this.f96434h = aVar;
        this.f96435i = aVar;
        ByteBuffer byteBuffer = f.f96391a;
        this.f96438l = byteBuffer;
        this.f96439m = byteBuffer.asShortBuffer();
        this.f96440n = byteBuffer;
        this.f96429c = -1;
        this.f96428b = z10;
    }
}
