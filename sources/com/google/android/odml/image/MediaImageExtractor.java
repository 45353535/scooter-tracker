package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(19)
public class MediaImageExtractor {
    @NonNull
    public static Image extract(@NonNull MlImage mlImage) {
        zzg zzgVarM = mlImage.m();
        if (zzgVarM.zzb().getStorageType() == 3) {
            return ((zzi) zzgVarM).zza();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
