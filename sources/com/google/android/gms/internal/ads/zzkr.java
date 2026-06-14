package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.RequiresApi;
import j$.util.Objects;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(34)
final class zzkr {
    final /* synthetic */ zzks zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzkr(zzks zzksVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzksVar);
        this.zza = zzksVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i10) {
                zzks zzksVar2 = this.zza.zza;
                if (zzksVar2.zzae()) {
                    return;
                }
                zzksVar2.zzT(1, 19, Integer.valueOf(i10));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return IntConsumer$CC.$default$andThen(this, intConsumer2);
            }
        };
        this.zzc = intConsumer;
        final zzdx zzdxVarZzd = zzksVar.zzY().zzd(zzksVar.zzX(), null);
        Objects.requireNonNull(zzdxVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzdxVarZzd.zzn(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
