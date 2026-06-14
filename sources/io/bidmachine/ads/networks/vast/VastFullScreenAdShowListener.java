package io.bidmachine.ads.networks.vast;

import ae.e;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b9.f;
import c9.b;
import c9.g;
import io.bidmachine.iab.vast.activity.VastActivity;
import jd.j;
import m9.d;
import od.i;
import pd.t;
import pd.u;

/* JADX INFO: loaded from: classes12.dex */
class VastFullScreenAdShowListener implements b {

    @NonNull
    private final i callback;

    @Nullable
    private final m9.a postBannerAdMeasurer;

    @Nullable
    private final d vastOMSDKAdMeasurer;

    VastFullScreenAdShowListener(@NonNull i iVar, @Nullable d dVar, @Nullable m9.a aVar) {
        this.callback = iVar;
        this.vastOMSDKAdMeasurer = dVar;
        this.postBannerAdMeasurer = aVar;
    }

    @Override // c9.b
    public void onVastClick(@NonNull VastActivity vastActivity, @NonNull g gVar, @NonNull final f fVar, @Nullable String str) {
        this.callback.onAdClicked();
        if (str != null) {
            j.c(vastActivity, str, new u() { // from class: io.bidmachine.ads.networks.vast.a
                @Override // pd.u
                public final void a(Object obj) {
                    fVar.a();
                }

                @Override // pd.u
                public /* synthetic */ void c(Throwable th2) {
                    t.b(this, th2);
                }

                @Override // pd.h
                public /* synthetic */ void execute(Object obj) {
                    t.a(this, obj);
                }
            });
        } else {
            fVar.d();
        }
    }

    @Override // c9.b
    public void onVastComplete(@NonNull VastActivity vastActivity, @NonNull g gVar) {
        d dVar = this.vastOMSDKAdMeasurer;
        if (dVar != null) {
            dVar.j();
        }
        this.callback.onAdFinished();
    }

    @Override // c9.b
    public void onVastDismiss(@NonNull VastActivity vastActivity, @Nullable g gVar, boolean z10) {
        m9.a aVar = this.postBannerAdMeasurer;
        if (aVar != null) {
            aVar.j();
        }
        this.callback.onAdClosed();
    }

    @Override // c9.b
    public void onVastShowFailed(@Nullable g gVar, @NonNull y8.b bVar) {
        this.callback.onAdShowFailed(e.a(bVar));
    }

    @Override // c9.b
    public void onVastShown(@NonNull VastActivity vastActivity, @NonNull g gVar) {
        this.callback.onAdShown();
    }
}
