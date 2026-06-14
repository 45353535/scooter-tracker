package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbia extends CustomTabsCallback {
    final /* synthetic */ zzbid zza;

    zzbia(zzbid zzbidVar) {
        Objects.requireNonNull(zzbidVar);
        this.zza = zzbidVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
        this.zza.zzc(i10);
    }
}
