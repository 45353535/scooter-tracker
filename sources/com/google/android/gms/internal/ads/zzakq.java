package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzakq {
    public static void zza(int i10, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzgufVarZzd = zzapVar.zzd(zzfs.class);
            int size = zzgufVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzfs zzfsVar = (zzfs) zzgufVarZzd.get(i11);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i10, zzafn zzafnVar, zzt zztVar) {
        if (i10 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0285 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:9:0x003b, B:11:0x0046, B:15:0x0055, B:18:0x0061, B:21:0x006e, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:40:0x00bf, B:41:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:77:0x0192, B:78:0x0199, B:80:0x01a0, B:85:0x01ab, B:90:0x01b7, B:134:0x0285, B:91:0x01cc, B:93:0x01d3, B:95:0x01df, B:96:0x01f3, B:109:0x021d, B:112:0x022a, B:115:0x0237, B:118:0x0244, B:121:0x0250, B:124:0x025c, B:127:0x0266, B:130:0x0272, B:133:0x027e, B:135:0x02a2, B:136:0x02a9), top: B:141:0x002d }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzer r17) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakq.zzc(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzao");
    }

    @Nullable
    private static zzais zzd(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(iZzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    @Nullable
    private static zzain zze(int i10, String str, zzer zzerVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzerVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z10 ? new zzais(str, null, zzguf.zzj(Integer.toString(iZzf))) : new zzaih("und", str, Integer.toString(iZzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 == 1) {
                return zzerVar.zzs();
            }
            if (i10 == 2) {
                return zzerVar.zzt();
            }
            if (i10 == 3) {
                return zzerVar.zzx();
            }
            if (i10 == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzais zzg(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && iZzB >= 22) {
            zzerVar.zzk(10);
            int iZzt = zzerVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzerVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i10)));
        return null;
    }
}
