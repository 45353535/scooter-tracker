package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfza {

    @NotNull
    private final zzfyw zza;

    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    public final void zzc(@NotNull zziev zzievVar, @NotNull String key, @NotNull zzfyu value) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String key) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
