package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzann implements zzamf {
    private final zzer zza = new zzer();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzcx zzcxVarZzr;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i11 + i10);
        zzerVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() > 0) {
            zzgrc.zzb(zzerVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzerVar.zzB() - 8;
            if (zzerVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcw zzcwVarZzb = null;
                while (iZzB > 0) {
                    zzgrc.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzerVar.zzB();
                    int iZzB3 = zzerVar.zzB();
                    int i12 = iZzB - 8;
                    int i13 = iZzB2 - 8;
                    String strZzj = zzfj.zzj(zzerVar.zzi(), zzerVar.zzg(), i13);
                    zzerVar.zzk(i13);
                    if (iZzB3 == 1937011815) {
                        zzcwVarZzb = zzanw.zzb(strZzj);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzanw.zzc(null, strZzj.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i12 - i13;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcwVarZzb != null) {
                    zzcwVarZzb.zza(charSequenceZzc);
                    zzcxVarZzr = zzcwVarZzb.zzr();
                } else {
                    Pattern pattern = zzanw.zza;
                    zzanv zzanvVar = new zzanv();
                    zzanvVar.zzc = charSequenceZzc;
                    zzcxVarZzr = zzanvVar.zza().zzr();
                }
                arrayList.add(zzcxVarZzr);
            } else {
                zzerVar.zzk(iZzB);
            }
        }
        zzdrVar.zza(new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
