package com.google.android.odml.image;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferExtractor {
    @NonNull
    public static ByteBuffer extract(@NonNull MlImage mlImage) {
        zzg zzgVarM = mlImage.m();
        if (zzgVarM.zzb().getStorageType() == 2) {
            return ((zzf) zzgVarM).zza().asReadOnlyBuffer();
        }
        throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }
}
