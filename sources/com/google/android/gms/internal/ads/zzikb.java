package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class zzikb {
    final LinkedHashMap zza;

    zzikb(int i10) {
        this.zza = zzikd.zzc(i10);
    }

    final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, C4240b4.i.W);
        zziko.zza(zzikpVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
