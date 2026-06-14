package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
final class zzaqx implements zzaqy {
    private final ByteBuffer zza;

    public zzaqx(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.zza;
        synchronized (byteBuffer) {
            int i11 = (int) j10;
            byteBuffer.position(i11);
            byteBuffer.limit(i11 + i10);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
