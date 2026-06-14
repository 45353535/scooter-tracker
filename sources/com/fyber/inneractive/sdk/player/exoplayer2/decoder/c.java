package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21719a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f21721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21722d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21720b = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21723e = 0;

    public final void a() {
        this.f21719a = 0;
        ByteBuffer byteBuffer = this.f21721c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f21719a & i10) == i10;
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f21723e;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f21721c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }
}
