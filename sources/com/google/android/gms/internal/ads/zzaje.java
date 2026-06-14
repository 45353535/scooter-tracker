package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzaje implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    /* synthetic */ zzaje(long j10, long j11, long j12, byte[] bArr) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzaje) obj).zza);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaje)) {
            return false;
        }
        zzaje zzajeVar = (zzaje) obj;
        return this.zza == zzajeVar.zza && this.zzb == zzajeVar.zzb && this.zzc == zzajeVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    final /* synthetic */ long zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
