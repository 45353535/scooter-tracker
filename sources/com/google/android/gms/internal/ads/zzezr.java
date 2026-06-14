package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezr implements zzfax {
    private final Context zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;

    zzezr(Context context, zzgzy zzgzyVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzezs zzc() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezr.zzc():com.google.android.gms.internal.ads.zzezs");
    }
}
