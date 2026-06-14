package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabw extends zzum {
    public zzabw(Throwable th2, @Nullable zzun zzunVar, @Nullable Surface surface) {
        super(th2, zzunVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
