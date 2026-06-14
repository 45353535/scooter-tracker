package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzcgz implements zzijs, AutoCloseable {
    private final ByteBuffer zza;

    zzcgz(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzb() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzc() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final void zzd(long j10) throws IOException {
        this.zza.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final ByteBuffer zze(long j10, long j11) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j11);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }
}
