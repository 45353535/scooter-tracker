package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class BitmapExtractor {
    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        zzg zzgVarM = mlImage.m();
        if (zzgVarM.zzb().getStorageType() == 1) {
            return ((zze) zzgVarM).zza();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
