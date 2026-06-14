package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgfe {
    private MessageDigest zza;
    private final zzgoe zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgfe(zzgoe zzgoeVar) {
        this.zzb = zzgoeVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgoc zzgocVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (NoSuchAlgorithmException e10) {
                    zzgocVarZza.zzb(e10);
                }
                zzgocVarZza.zzc();
            } catch (Throwable th2) {
                zzgocVarZza.zzb(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            throw th3;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z10) throws UnsupportedEncodingException {
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        zzgrc.zza(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgfh[] zzgfhVarArr = new zzgfu().zzcK;
        int length2 = zzgfhVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzgfhVarArr[i12].zza(bArrArray, bArr3);
        }
        if (!zzgrt.zzc(str)) {
            new zzgfg(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzaxw zzf(byte[] bArr, String str) throws UnsupportedEncodingException {
        zzaxw zzaxwVarZza = zzaxx.zza();
        byte[] bArrZze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zzaxwVarZza.zzb(zzian.zzs(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzaxwVarZza.zza(zzian.zzs(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzaxwVarZza;
    }

    public final String zzg(int i10, String str) throws UnsupportedEncodingException {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzl(i10);
        return Base64.encodeToString(zzd(((zzaxg) zzawgVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
