package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {

        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    @NonNull
    public final String toString() {
        long jZza = zza();
        int iZzb = zzb();
        String strZzc = zzc();
        int length = String.valueOf(jZza).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(iZzb).length() + 3 + strZzc.length());
        sb2.append(jZza);
        sb2.append("\t");
        sb2.append(iZzb);
        sb2.append("\t-1");
        sb2.append(strZzc);
        return sb2.toString();
    }

    public abstract long zza();

    public abstract int zzb();

    @NonNull
    public abstract String zzc();
}
