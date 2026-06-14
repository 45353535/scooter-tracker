package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzzi extends zzzs implements Comparable {
    private final int zze;
    private final int zzf;

    public zzzi(int i10, zzbg zzbgVar, int i11, zzzl zzzlVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = p1.c(i12, zzzlVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzi zzziVar) {
        return Integer.compare(this.zzf, zzziVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
