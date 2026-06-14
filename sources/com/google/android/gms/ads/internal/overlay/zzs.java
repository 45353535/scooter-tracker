package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends AnimatorListenerAdapter {
    final /* synthetic */ zzu zza;

    zzs(zzu zzuVar) {
        Objects.requireNonNull(zzuVar);
        this.zza = zzuVar;
    }

    private final void zza(boolean z10) {
        zzu zzuVar = this.zza;
        zzuVar.setEnabled(z10);
        zzuVar.zzb().setEnabled(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
