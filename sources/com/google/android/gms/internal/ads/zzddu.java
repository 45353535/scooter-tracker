package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzddu extends zzdhd implements zzdbz, zzdde {
    private final zzfir zzb;
    private final AtomicBoolean zzc;
    private final zzfjc zzd;

    public zzddu(Set set, zzfir zzfirVar, zzfjc zzfjcVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfirVar;
        this.zzd = zzfjcVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjb)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzddt
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdds
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
