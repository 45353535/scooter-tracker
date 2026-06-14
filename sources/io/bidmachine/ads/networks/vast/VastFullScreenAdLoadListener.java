package io.bidmachine.ads.networks.vast;

import ae.e;
import androidx.annotation.NonNull;
import c9.g;
import c9.h;
import od.i;
import y8.b;

/* JADX INFO: loaded from: classes12.dex */
class VastFullScreenAdLoadListener implements h {

    @NonNull
    private final i callback;

    VastFullScreenAdLoadListener(@NonNull i iVar) {
        this.callback = iVar;
    }

    @Override // c9.h
    public void onVastLoadFailed(@NonNull g gVar, @NonNull b bVar) {
        if (bVar.c() == 6) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(e.a(bVar));
        }
    }

    @Override // c9.h
    public void onVastLoaded(@NonNull g gVar) {
        this.callback.onAdLoaded();
    }
}
