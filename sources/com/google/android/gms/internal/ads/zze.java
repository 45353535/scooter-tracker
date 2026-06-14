package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zze {
    public final int zza = 0;

    public zze(int i10, float f10) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zze.class == obj.getClass()) {
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
