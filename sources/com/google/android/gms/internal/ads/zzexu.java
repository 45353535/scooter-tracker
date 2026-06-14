package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* JADX INFO: loaded from: classes8.dex */
public final class zzexu implements zzfav {
    public final String zza;
    public final boolean zzb;

    public zzexu(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzdah) obj).zzb.putString("gct", this.zza);
    }
}
