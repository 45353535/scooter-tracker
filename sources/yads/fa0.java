package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class fa0 extends jq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y10 f110669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f110670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f110671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f110673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f110674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f110675i;

    static {
        dn0.a("goog.exo.decoder");
    }

    public fa0(int i10) {
        this(i10, 0);
    }

    public static fa0 d() {
        return new fa0(0, 0);
    }

    public void b() {
        this.f112430b = 0;
        ByteBuffer byteBuffer = this.f110670d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f110673g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f110671e = false;
    }

    public final void c(int i10) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i11 = i10 + this.f110675i;
        ByteBuffer byteBuffer = this.f110670d;
        if (byteBuffer == null) {
            int i12 = this.f110674h;
            if (i12 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i11);
            } else {
                if (i12 != 2) {
                    throw new ea0(byteBuffer != null ? byteBuffer.capacity() : 0, i11);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i11);
            }
            this.f110670d = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i11 + iPosition;
        if (iCapacity >= i13) {
            this.f110670d = byteBuffer;
            return;
        }
        int i14 = this.f110674h;
        if (i14 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i13);
        } else {
            if (i14 != 2) {
                ByteBuffer byteBuffer2 = this.f110670d;
                throw new ea0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i13);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i13);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f110670d = byteBufferAllocateDirect;
    }

    public fa0(int i10, int i11) {
        this.f110669c = new y10();
        this.f110674h = i10;
        this.f110675i = 0;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f110670d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f110673g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
