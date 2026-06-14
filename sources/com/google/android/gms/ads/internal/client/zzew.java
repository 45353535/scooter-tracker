package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzew extends zzbqm {
    final /* synthetic */ zzex zza;

    /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzw()) {
            zzexVar.zzy(false);
            zzexVar.zzz(true);
            arrayList = new ArrayList(zzexVar.zzx());
            zzexVar.zzx().clear();
        }
        InitializationStatus initializationStatusZzB = zzex.zzB(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(initializationStatusZzB);
        }
    }
}
