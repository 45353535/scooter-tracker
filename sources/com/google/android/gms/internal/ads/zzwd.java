package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzwd extends zzvy {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    private zzwd(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzwd zzp(zzak zzakVar) {
        return new zzwd(new zzwe(zzakVar), zzbe.zza, zzc);
    }

    public static zzwd zzq(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzwd(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        this.zzb.zzd(i10, zzbdVar, z10);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z10) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        Object objZzf = this.zzb.zzf(i10);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzwd zzr(zzbf zzbfVar) {
        return new zzwd(zzbfVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
