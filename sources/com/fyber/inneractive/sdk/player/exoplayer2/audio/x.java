package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f21694d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f21697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ShortBuffer f21698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f21699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21702l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21695e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f21696f = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21692b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21693c = -1;

    public x() {
        ByteBuffer byteBuffer = c.f21586a;
        this.f21697g = byteBuffer;
        this.f21698h = byteBuffer.asShortBuffer();
        this.f21699i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (this.f21693c == i10 && this.f21692b == i11) {
            return false;
        }
        this.f21693c = i10;
        this.f21692b = i11;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i10;
        w wVar = this.f21694d;
        int i11 = wVar.f21684q;
        float f10 = wVar.f21682o;
        float f11 = wVar.f21683p;
        int i12 = wVar.f21685r + ((int) ((((i11 / (f10 / f11)) + wVar.f21686s) / f11) + 0.5f));
        wVar.a((wVar.f21672e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wVar.f21672e * 2;
            int i14 = wVar.f21669b;
            if (i13 >= i10 * i14) {
                break;
            }
            wVar.f21675h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wVar.f21684q = i10 + wVar.f21684q;
        wVar.a();
        if (wVar.f21685r > i12) {
            wVar.f21685r = i12;
        }
        wVar.f21684q = 0;
        wVar.f21687t = 0;
        wVar.f21686s = 0;
        this.f21702l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        if (!this.f21702l) {
            return false;
        }
        w wVar = this.f21694d;
        return wVar == null || wVar.f21685r == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f21695e - 1.0f) >= 0.01f || Math.abs(this.f21696f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f21692b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f21694d = null;
        ByteBuffer byteBuffer = c.f21586a;
        this.f21697g = byteBuffer;
        this.f21698h = byteBuffer.asShortBuffer();
        this.f21699i = byteBuffer;
        this.f21692b = -1;
        this.f21693c = -1;
        this.f21700j = 0L;
        this.f21701k = 0L;
        this.f21702l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f21693c, this.f21692b);
        this.f21694d = wVar;
        wVar.f21682o = this.f21695e;
        wVar.f21683p = this.f21696f;
        this.f21699i = c.f21586a;
        this.f21700j = 0L;
        this.f21701k = 0L;
        this.f21702l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f21700j += (long) iRemaining;
            w wVar = this.f21694d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = wVar.f21669b;
            int i11 = iRemaining2 / i10;
            wVar.a(i11);
            shortBufferAsShortBuffer.get(wVar.f21675h, wVar.f21684q * wVar.f21669b, ((i10 * i11) * 2) / 2);
            wVar.f21684q += i11;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f21694d.f21685r * this.f21692b * 2;
        if (i12 > 0) {
            if (this.f21697g.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f21697g = byteBufferOrder;
                this.f21698h = byteBufferOrder.asShortBuffer();
            } else {
                this.f21697g.clear();
                this.f21698h.clear();
            }
            w wVar2 = this.f21694d;
            ShortBuffer shortBuffer = this.f21698h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f21669b, wVar2.f21685r);
            shortBuffer.put(wVar2.f21677j, 0, wVar2.f21669b * iMin);
            int i13 = wVar2.f21685r - iMin;
            wVar2.f21685r = i13;
            short[] sArr = wVar2.f21677j;
            int i14 = wVar2.f21669b;
            System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
            this.f21701k += (long) i12;
            this.f21697g.limit(i12);
            this.f21699i = this.f21697g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f21699i;
        this.f21699i = c.f21586a;
        return byteBuffer;
    }
}
