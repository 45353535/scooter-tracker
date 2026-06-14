package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    zabn(zabq zabqVar, int i10) {
        this.zab = zabqVar;
        this.zaa = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
