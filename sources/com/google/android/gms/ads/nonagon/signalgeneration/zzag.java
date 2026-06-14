package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgzl;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzag implements zzgzl {
    final /* synthetic */ zzau zza;

    zzag(zzau zzauVar) {
        Objects.requireNonNull(zzauVar);
        this.zza = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        zzau zzauVar = this.zza;
        zzaa.zze(zzauVar.zzA(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlg)).booleanValue() || zzauVar.zzN().get() || zzauVar.zzO().getAndIncrement() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlh)).intValue()) {
            return;
        }
        zzauVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlg)).booleanValue()) {
            zzau zzauVar = this.zza;
            zzaa.zze(zzauVar.zzA(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
            zzauVar.zzN().set(true);
        }
    }
}
