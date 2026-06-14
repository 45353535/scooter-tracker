package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
final class zzepl extends zzcue {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzepl(zzepp zzeppVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        super(view, null, zzcwdVar, zzfisVar);
        Objects.requireNonNull(zzeppVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    public final zzdcr zze(Set set) {
        return new zzdcr(Collections.EMPTY_SET);
    }
}
