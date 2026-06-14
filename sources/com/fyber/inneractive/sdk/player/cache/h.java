package com.fyber.inneractive.sdk.player.cache;

import android.net.Uri;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f21465a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        new CountDownLatch(1);
        new AtomicReference();
        this.f21465a = kVar.f23036a;
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f21465a;
    }
}
