package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzekt implements zzdmc {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzfjk zze;
    private final zzbok zzf;
    private final boolean zzg;
    private final zzejf zzh;
    private final zzdxz zzi;

    zzekt(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z10, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzfjkVar;
        this.zzg = z10;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.google.android.gms.internal.ads.zzdmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.zzdbs r20) {
        /*
            r17 = this;
            r0 = r17
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgzo.zzt(r1)
            com.google.android.gms.internal.ads.zzcti r1 = (com.google.android.gms.internal.ads.zzcti) r1
            com.google.android.gms.internal.ads.zzcjl r6 = r0.zzd
            r2 = 1
            r6.zzag(r2)
            com.google.android.gms.ads.internal.zzl r7 = new com.google.android.gms.ads.internal.zzl
            boolean r3 = r0.zzg
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.ads.zzbok r4 = r0.zzf
            boolean r4 = r4.zzc(r2)
            r8 = r4
            goto L1f
        L1e:
            r8 = r2
        L1f:
            r4 = 0
            if (r3 == 0) goto L2c
            com.google.android.gms.internal.ads.zzbok r5 = r0.zzf
            boolean r5 = r5.zzd()
            if (r5 == 0) goto L2c
            r10 = r2
            goto L2d
        L2c:
            r10 = r4
        L2d:
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.zzbok r3 = r0.zzf
            float r3 = r3.zze()
        L35:
            r11 = r3
            goto L39
        L37:
            r3 = 0
            goto L35
        L39:
            com.google.android.gms.internal.ads.zzfir r3 = r0.zzc
            boolean r14 = r3.zzO
            r15 = 0
            r9 = 1
            r12 = -1
            r13 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r20 == 0) goto L4a
            r20.zzb()
        L4a:
            com.google.android.gms.ads.internal.zzt.zzb()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdlr r1 = r1.zzj()
            int r5 = r3.zzQ
            r8 = -1
            if (r5 == r8) goto L59
            goto L71
        L59:
            com.google.android.gms.internal.ads.zzfjk r8 = r0.zze
            com.google.android.gms.ads.internal.client.zzx r8 = r8.zzk
            if (r8 == 0) goto L6a
            int r8 = r8.zza
            if (r8 != r2) goto L65
            r5 = 7
            goto L71
        L65:
            r9 = 2
            if (r8 != r9) goto L6a
            r5 = 6
            goto L71
        L6a:
            int r8 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r8 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r8)
        L71:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = r0.zza
            java.lang.String r9 = r3.zzB
            com.google.android.gms.internal.ads.zzfiw r10 = r3.zzs
            java.lang.String r11 = r10.zzb
            java.lang.String r12 = r10.zza
            com.google.android.gms.internal.ads.zzfjk r10 = r0.zze
            boolean r3 = r3.zzb()
            if (r3 == 0) goto L87
            com.google.android.gms.internal.ads.zzejf r3 = r0.zzh
        L85:
            r15 = r3
            goto L89
        L87:
            r3 = 0
            goto L85
        L89:
            java.lang.String r13 = r10.zzg
            java.lang.String r16 = r6.zzn()
            r3 = 0
            r10 = r7
            r7 = r5
            r5 = 0
            r14 = r4
            r4 = r1
            r1 = r2
            r2 = r14
            r14 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.zzdxz r3 = r0.zzi
            r4 = r19
            com.google.android.gms.ads.internal.overlay.zzn.zza(r4, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekt.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdbs):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzc;
    }
}
