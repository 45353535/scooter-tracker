package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzatf implements zzatg {
    private static final Logger zzb = Logger.getLogger(zzatf.class.getName());
    final ThreadLocal zza = new zzate(this);

    public abstract zzatj zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzatg
    public final zzatj zzb(zzijs zzijsVar, zzatk zzatkVar) throws IOException {
        int iZza;
        long jZzb;
        long jZzc = zzijsVar.zzc();
        ThreadLocal threadLocal = this.zza;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iZza = zzijsVar.zza((ByteBuffer) threadLocal.get());
            if (iZza == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jZza = zzati.zza((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (jZza < 8 && jZza > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jZza);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZza == 1) {
                        ThreadLocal threadLocal2 = this.zza;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        zzijsVar.zza((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jZzb = zzati.zzd((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        jZzb = jZza == 0 ? zzijsVar.zzb() - zzijsVar.zzc() : jZza - 8;
                    }
                    if (CommonUrlParts.UUID.equals(str)) {
                        ThreadLocal threadLocal3 = this.zza;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzijsVar.zza((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j10 = jZzb;
                    zzatj zzatjVarZza = zza(str, bArr, zzatkVar instanceof zzatj ? ((zzatj) zzatkVar).zza() : "");
                    ThreadLocal threadLocal4 = this.zza;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    zzatjVarZza.zzb(zzijsVar, (ByteBuffer) threadLocal4.get(), j10, this);
                    return zzatjVarZza;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (iZza >= 0);
        zzijsVar.zzd(jZzc);
        throw new EOFException();
    }
}
