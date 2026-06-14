package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzanx implements zzamf {
    private final zzer zza = new zzer();
    private final zzano zzb = new zzano();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i11 + i10);
        zzerVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzerVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzerVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzerVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzerVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b10 = -1;
                int iZzg2 = 0;
                while (b10 == -1) {
                    iZzg2 = zzerVar.zzg();
                    String strZzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                    b10 = strZzN2 == null ? (byte) 0 : "STYLE".equals(strZzN2) ? (byte) 2 : strZzN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                }
                zzerVar.zzh(iZzg2);
                if (b10 == 0) {
                    zzalz.zza(new zzaoa(arrayList2), zzameVar, zzdrVar);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b10 != 2) {
                    zzanq zzanqVarZza = zzanw.zza(zzerVar, arrayList);
                    if (zzanqVarZza != null) {
                        arrayList2.add(zzanqVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
