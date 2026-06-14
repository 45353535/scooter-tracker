package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzikd {
    public static List zza(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }

    static HashSet zzb(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzc(int i10) {
        return new LinkedHashMap(zzd(i10));
    }

    private static int zzd(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
