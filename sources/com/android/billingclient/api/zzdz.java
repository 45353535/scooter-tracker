package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzdz {

    @Nullable
    private final List zza;
    private final BillingResult zzb;

    public zzdz(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    public final BillingResult zza() {
        return this.zzb;
    }

    @Nullable
    public final List zzb() {
        return this.zza;
    }
}
