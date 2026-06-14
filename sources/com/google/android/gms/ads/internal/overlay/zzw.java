package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class zzw extends zzm {
    public zzw(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzm, com.google.android.gms.internal.ads.zzbxs
    public final void zzh(@Nullable Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}
