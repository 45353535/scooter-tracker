package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfut extends AsyncTask {
    private zzfuu zza;
    protected final zzful zzd;

    public zzfut(zzful zzfulVar) {
        this.zzd = zzfulVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfuu zzfuuVar = this.zza;
        if (zzfuuVar != null) {
            zzfuuVar.zzb(this);
        }
    }

    public final void zzb(zzfuu zzfuuVar) {
        this.zza = zzfuuVar;
    }
}
