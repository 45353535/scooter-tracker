package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
final class zzfvt implements zzfvw {
    private static final zzaxg zza;

    static {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzo(ExifInterface.LONGITUDE_EAST);
        zza = (zzaxg) zzawgVarZzj.zzbu();
    }

    zzfvt() {
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final zzaxg zza() {
        return zza;
    }
}
