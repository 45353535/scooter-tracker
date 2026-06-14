package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfah implements zzfax {
    private final zzccq zza;
    private final zzgzy zzb;
    private final Context zzc;

    public zzfah(zzccq zzccqVar, zzgzy zzgzyVar, Context context) {
        this.zza = zzccqVar;
        this.zzb = zzgzyVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ zzfai zzc() {
        zzccq zzccqVar = this.zza;
        Context context = this.zzc;
        if (!zzccqVar.zza(context)) {
            return new zzfai(null, null, null, null, null);
        }
        String strZzh = zzccqVar.zzh(context);
        String str = strZzh == null ? "" : strZzh;
        String strZzi = zzccqVar.zzi(context);
        String str2 = strZzi == null ? "" : strZzi;
        String strZzj = zzccqVar.zzj(context);
        String str3 = strZzj == null ? "" : strZzj;
        String str4 = true != zzccqVar.zza(context) ? null : "fa";
        return new zzfai(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaR) : null);
    }
}
