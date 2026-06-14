package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final ListenableFuture zzh(zzgdu zzgduVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzi(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzd.zze(20302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, listenableFutureZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(listenableFutureZzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzb = this.zzb.zzb();
        this.zzd.zze(20304, listenableFutureZzb);
        return listenableFutureZzb;
    }

    final /* synthetic */ ListenableFuture zzf(zzgdu zzgduVar, Void r22) {
        return zzh(zzgduVar);
    }

    final /* synthetic */ ListenableFuture zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
