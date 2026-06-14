package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class qo extends fa0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f115104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f115105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115106l;

    public qo() {
        super(2);
        this.f115106l = 32;
    }

    public final boolean a(fa0 fa0Var) {
        ByteBuffer byteBuffer;
        if (fa0Var.b(1073741824)) {
            throw new IllegalArgumentException();
        }
        if (fa0Var.b(268435456)) {
            throw new IllegalArgumentException();
        }
        if (fa0Var.b(4)) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f115105k;
        if (i10 > 0) {
            if (i10 >= this.f115106l || fa0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = fa0Var.f110670d;
            if (byteBuffer2 != null && (byteBuffer = this.f110670d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f115105k;
        this.f115105k = i11 + 1;
        if (i11 == 0) {
            this.f110672f = fa0Var.f110672f;
            if (fa0Var.b(1)) {
                this.f112430b = 1;
            }
        }
        if (fa0Var.b(Integer.MIN_VALUE)) {
            this.f112430b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = fa0Var.f110670d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f110670d.put(byteBuffer3);
        }
        this.f115104j = fa0Var.f110672f;
        return true;
    }

    @Override // yads.fa0
    public final void b() {
        super.b();
        this.f115105k = 0;
    }
}
