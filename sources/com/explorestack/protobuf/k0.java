package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
class k0 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f19134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f19135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19136d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f19140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19142j;

    k0(Iterable iterable) {
        this.f19134b = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f19136d++;
        }
        this.f19137e = -1;
        if (m()) {
            return;
        }
        this.f19135c = j0.f19130d;
        this.f19137e = 0;
        this.f19138f = 0;
        this.f19142j = 0L;
    }

    private boolean m() {
        this.f19137e++;
        if (!this.f19134b.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f19134b.next();
        this.f19135c = byteBuffer;
        this.f19138f = byteBuffer.position();
        if (this.f19135c.hasArray()) {
            this.f19139g = true;
            this.f19140h = this.f19135c.array();
            this.f19141i = this.f19135c.arrayOffset();
        } else {
            this.f19139g = false;
            this.f19142j = w2.k(this.f19135c);
            this.f19140h = null;
        }
        return true;
    }

    private void n(int i10) {
        int i11 = this.f19138f + i10;
        this.f19138f = i11;
        if (i11 == this.f19135c.limit()) {
            m();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f19137e == this.f19136d) {
            return -1;
        }
        if (this.f19139g) {
            int i10 = this.f19140h[this.f19138f + this.f19141i] & 255;
            n(1);
            return i10;
        }
        int iW = w2.w(((long) this.f19138f) + this.f19142j) & 255;
        n(1);
        return iW;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f19137e == this.f19136d) {
            return -1;
        }
        int iLimit = this.f19135c.limit();
        int i12 = this.f19138f;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f19139g) {
            System.arraycopy(this.f19140h, i12 + this.f19141i, bArr, i10, i11);
            n(i11);
            return i11;
        }
        int iPosition = this.f19135c.position();
        this.f19135c.position(this.f19138f);
        this.f19135c.get(bArr, i10, i11);
        this.f19135c.position(iPosition);
        n(i11);
        return i11;
    }
}
