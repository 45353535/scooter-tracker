package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21662b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21663c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21664d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f21665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f21666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21667g;

    public v() {
        ByteBuffer byteBuffer = c.f21586a;
        this.f21665e = byteBuffer;
        this.f21666f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new b(i10, i11, i12);
        }
        if (this.f21662b == i10 && this.f21663c == i11 && this.f21664d == i12) {
            return false;
        }
        this.f21662b = i10;
        this.f21663c = i11;
        this.f21664d = i12;
        if (i12 != 2) {
            return true;
        }
        this.f21665e = c.f21586a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f21667g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f21667g && this.f21666f == c.f21586a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        int i10 = this.f21664d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f21663c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f21586a;
        this.f21666f = byteBuffer;
        this.f21667g = false;
        this.f21665e = byteBuffer;
        this.f21662b = -1;
        this.f21663c = -1;
        this.f21664d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f21666f = c.f21586a;
        this.f21667g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
  0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f21664d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 3
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r6) goto L23
            if (r3 == r5) goto L20
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L25
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 * 2
            goto L25
        L23:
            int r2 = r2 / r5
            goto L20
        L25:
            java.nio.ByteBuffer r3 = r7.f21665e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3c
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f21665e = r2
            goto L41
        L3c:
            java.nio.ByteBuffer r2 = r7.f21665e
            r2.clear()
        L41:
            int r2 = r7.f21664d
            if (r2 == r6) goto L83
            if (r2 == r5) goto L6a
            if (r2 != r4) goto L64
        L49:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f21665e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f21665e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L49
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L6a:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f21665e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f21665e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L6a
        L83:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f21665e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f21665e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L83
        L9e:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f21665e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f21665e
            r7.f21666f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.v.a(java.nio.ByteBuffer):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f21666f;
        this.f21666f = c.f21586a;
        return byteBuffer;
    }
}
