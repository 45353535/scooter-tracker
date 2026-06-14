package com.google.android.gms.maps.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zza {
    public static byte zza(@Nullable Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    @Nullable
    public static Boolean zzb(byte b10) {
        if (b10 == 0) {
            return Boolean.FALSE;
        }
        if (b10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
