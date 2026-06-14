package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzata extends ByteArrayOutputStream implements AutoCloseable {
    private final zzasp zza;

    public zzata(zzasp zzaspVar, int i10) {
        this.zza = zzaspVar;
        ((ByteArrayOutputStream) this).buf = zzaspVar.zza(Math.max(i10, 256));
    }

    private final void zza(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzasp zzaspVar = this.zza;
        int i12 = i11 + i10;
        byte[] bArrZza = zzaspVar.zza(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZza, 0, ((ByteArrayOutputStream) this).count);
        zzaspVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        zza(1);
        super.write(i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        zza(i11);
        super.write(bArr, i10, i11);
    }
}
