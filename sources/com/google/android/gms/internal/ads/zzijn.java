package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzijn implements zzatj {
    private static final zzijy zzg = zzijy.zzb(zzijn.class);
    protected final String zza;
    long zzd;
    zzijs zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    protected zzijn(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzijy zzijyVar = zzg;
                String str = this.zza;
                zzijyVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final void zzb(zzijs zzijsVar, ByteBuffer byteBuffer, long j10, zzatg zzatgVar) throws IOException {
        this.zzd = zzijsVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzijsVar;
        zzijsVar.zzd(zzijsVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzijy zzijyVar = zzg;
            String str = this.zza;
            zzijyVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
