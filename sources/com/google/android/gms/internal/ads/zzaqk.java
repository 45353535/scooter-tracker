package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaqk implements zzaeu {
    private zzaex zza;
    private zzagh zzb;
    private zzaqh zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzaqn.zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
        this.zzb = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r19, com.google.android.gms.internal.ads.zzafv r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqk.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzc = j10 == 0 ? 0 : 4;
        zzaqh zzaqhVar = this.zze;
        if (zzaqhVar != null) {
            zzaqhVar.zza(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }
}
