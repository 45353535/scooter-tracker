package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfjz {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, @Nullable String str, @Nullable String str2, boolean z10) {
        if (!z10 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzc(Bundle bundle, @Nullable String str, int i10, boolean z10) {
        if (z10) {
            bundle.putInt(str, i10);
        }
    }

    public static void zzd(Bundle bundle, @Nullable String str, boolean z10, boolean z11) {
        if (z11) {
            bundle.putBoolean(str, z10);
        }
    }

    public static void zze(Bundle bundle, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzf(Bundle bundle, @Nullable String str, @Nullable Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzg(Bundle bundle, @Nullable String str, @Nullable List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zzh(Bundle bundle, @Nullable String str, @Nullable Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }
}
