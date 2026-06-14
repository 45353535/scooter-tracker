package t9;

import java.nio.ByteBuffer;
import n9.s;

/* JADX INFO: loaded from: classes12.dex */
public class f extends t9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.bidmachine.media3.common.a f104986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f104987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f104988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f104989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f104990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f104991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f104992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f104993j;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104995c;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f104994b = i10;
            this.f104995c = i11;
        }
    }

    static {
        s.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    private ByteBuffer l(int i10) {
        int i11 = this.f104992i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f104988e;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static f p() {
        return new f(0);
    }

    @Override // t9.a
    public void c() {
        super.c();
        ByteBuffer byteBuffer = this.f104988e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f104991h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f104989f = false;
    }

    public void m(int i10) {
        int i11 = i10 + this.f104993j;
        ByteBuffer byteBuffer = this.f104988e;
        if (byteBuffer == null) {
            this.f104988e = l(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f104988e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i12);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f104988e = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f104988e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f104991h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean o() {
        return d(1073741824);
    }

    public void q(int i10) {
        ByteBuffer byteBuffer = this.f104991h;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f104991h = ByteBuffer.allocate(i10);
        } else {
            this.f104991h.clear();
        }
    }

    public f(int i10, int i11) {
        this.f104987d = new c();
        this.f104992i = i10;
        this.f104993j = i11;
    }
}
