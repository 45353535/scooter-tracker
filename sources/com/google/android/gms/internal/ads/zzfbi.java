package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final class zzfbi implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzecp zzc;

    zzfbi(zzgzy zzgzyVar, Context context, zzecp zzecpVar) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzecpVar;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbg zzc() {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbi.zzc():com.google.android.gms.internal.ads.zzfbg");
    }
}
