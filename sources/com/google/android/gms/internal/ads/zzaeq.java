package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaeq implements zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaep zzc = new zzaep(zzaen.zza);
    private static final zzaep zzd = new zzaep(zzaem.zza);

    @Nullable
    private zzguf zze;
    private final zzamd zzf = new zzaly();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzaoc());
                break;
            case 1:
                list.add(new zzaof());
                break;
            case 2:
                list.add(new zzaoi(0));
                break;
            case 3:
                list.add(new zzagp(0));
                break;
            case 4:
                zzaeu zzaeuVarZza = zzc.zza(0);
                if (zzaeuVarZza == null) {
                    list.add(new zzahg(0));
                } else {
                    list.add(zzaeuVarZza);
                }
                break;
            case 5:
                list.add(new zzahj());
                break;
            case 6:
                list.add(new zzajh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzajp(0));
                break;
            case 8:
                zzamd zzamdVar = this.zzf;
                list.add(new zzako(zzamdVar, 0, null, null, zzguf.zzi(), null));
                list.add(new zzakw(zzamdVar, 0));
                break;
            case 9:
                list.add(new zzalm());
                break;
            case 10:
                list.add(new zzapm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzguf.zzi();
                }
                list.add(new zzapx(1, 0, this.zzf, new zzfg(0L), new zzaok(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqk());
                break;
            case 14:
                list.add(new zzahq(0));
                break;
            case 15:
                zzaeu zzaeuVarZza2 = zzd.zza(new Object[0]);
                if (zzaeuVarZza2 != null) {
                    list.add(zzaeuVarZza2);
                }
                break;
            case 16:
                list.add(new zzagt(0, this.zzf));
                break;
            case 17:
                list.add(new zzalw());
                break;
            case 18:
                list.add(new zzaqp());
                break;
            case 19:
                list.add(new zzahb());
                break;
            case 20:
                list.add(new zzahp(0));
                break;
            case 21:
                list.add(new zzaha());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzafa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzaeu[] zzb(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzaeu[]");
    }
}
