package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfzd implements zzikg {
    private final zzikp zza;

    private zzfzd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfzd zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfzd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcmh) this.zza).zza();
        zzfzh coroutineScopeProvider = zzcml.zzc();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        DataStore dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, zzfzb.zza, null, null, coroutineScopeProvider.zza(), new Function0() { // from class: com.google.android.gms.internal.ads.zzfzc
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zziko.zzb(dataStoreCreate$default);
        return dataStoreCreate$default;
    }
}
