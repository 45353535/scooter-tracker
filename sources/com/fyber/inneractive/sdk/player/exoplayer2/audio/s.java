package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f21654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f21655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f21656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21657i;

    public s() {
        ByteBuffer byteBuffer = c.f21586a;
        this.f21655g = byteBuffer;
        this.f21656h = byteBuffer;
        this.f21650b = -1;
        this.f21651c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        boolean zEquals = Arrays.equals(this.f21652d, this.f21654f);
        boolean z10 = !zEquals;
        int[] iArr = this.f21652d;
        this.f21654f = iArr;
        if (iArr == null) {
            this.f21653e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (zEquals && this.f21651c == i10 && this.f21650b == i11) {
            return false;
        }
        this.f21651c = i10;
        this.f21650b = i11;
        this.f21653e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f21654f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new b(i10, i11, i12);
            }
            this.f21653e = (i14 != i13) | this.f21653e;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f21657i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f21657i && this.f21656h == c.f21586a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f21653e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f21654f;
        return iArr == null ? this.f21650b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f21586a;
        this.f21656h = byteBuffer;
        this.f21657i = false;
        this.f21655g = byteBuffer;
        this.f21650b = -1;
        this.f21651c = -1;
        this.f21654f = null;
        this.f21653e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f21656h = c.f21586a;
        this.f21657i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f21650b * 2)) * this.f21654f.length * 2;
        if (this.f21655g.capacity() < length) {
            this.f21655g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f21655g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f21654f) {
                this.f21655g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f21650b * 2;
        }
        byteBuffer.position(iLimit);
        this.f21655g.flip();
        this.f21656h = this.f21655g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f21656h;
        this.f21656h = c.f21586a;
        return byteBuffer;
    }
}
