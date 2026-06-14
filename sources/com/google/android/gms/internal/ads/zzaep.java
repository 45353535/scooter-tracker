package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
final class zzaep {
    private final zzaeo zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaep(zzaeo zzaeoVar) {
        this.zza = zzaeoVar;
    }

    @Nullable
    public final zzaeu zza(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.zzb;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorZza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                    constructorZza = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzaeu) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
