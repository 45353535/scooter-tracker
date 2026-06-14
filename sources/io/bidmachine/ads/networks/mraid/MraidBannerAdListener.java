package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import id.z0;
import io.bidmachine.Executable;
import io.bidmachine.iab.mraid.s;
import io.bidmachine.iab.mraid.t;
import jd.j;
import pd.u;

/* JADX INFO: loaded from: classes12.dex */
class MraidBannerAdListener implements t {

    @NonNull
    private final od.f callback;

    MraidBannerAdListener(@NonNull od.f fVar) {
        this.callback = fVar;
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onCalendarEvent(@NonNull s sVar, @NonNull String str, @NonNull final b9.f fVar) {
        this.callback.onAdClicked();
        j.b(sVar.getContext(), str, new u() { // from class: io.bidmachine.ads.networks.mraid.c
            @Override // pd.u
            public final void a(Object obj) {
                fVar.a();
            }

            @Override // pd.u
            public /* synthetic */ void c(Throwable th2) {
                pd.t.b(this, th2);
            }

            @Override // pd.h
            public /* synthetic */ void execute(Object obj) {
                pd.t.a(this, obj);
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onClose(@NonNull s sVar) {
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onExpand(@NonNull s sVar) {
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onExpired(@NonNull s sVar, @NonNull y8.b bVar) {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onLoadFailed(@NonNull s sVar, @NonNull y8.b bVar) {
        this.callback.onAdLoadFailed(ae.e.a(bVar));
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onLoaded(@NonNull s sVar) {
        this.callback.onAdLoaded(sVar);
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onOpenPrivacySheet(@NonNull s sVar, @NonNull final z0 z0Var) {
        io.bidmachine.core.h.F(io.bidmachine.core.h.n(sVar.t0(), sVar), new Executable() { // from class: io.bidmachine.ads.networks.mraid.d
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                ld.a.k((Context) obj, z0Var);
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onOpenUrl(@NonNull s sVar, @NonNull String str, @NonNull final b9.f fVar) {
        this.callback.onAdClicked();
        j.c(sVar.getContext(), str, new u() { // from class: io.bidmachine.ads.networks.mraid.a
            @Override // pd.u
            public final void a(Object obj) {
                fVar.a();
            }

            @Override // pd.u
            public /* synthetic */ void c(Throwable th2) {
                pd.t.b(this, th2);
            }

            @Override // pd.h
            public /* synthetic */ void execute(Object obj) {
                pd.t.a(this, obj);
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onPlayVideo(@NonNull s sVar, @NonNull String str) {
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onShowFailed(@NonNull s sVar, @NonNull y8.b bVar) {
        this.callback.onAdShowFailed(ae.e.a(bVar));
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onShown(@NonNull s sVar) {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.t
    public void onStorePicture(@NonNull s sVar, @NonNull String str, @NonNull final b9.f fVar) {
        this.callback.onAdClicked();
        j.e(sVar.getContext(), str, new u() { // from class: io.bidmachine.ads.networks.mraid.b
            @Override // pd.u
            public final void a(Object obj) {
                fVar.a();
            }

            @Override // pd.u
            public /* synthetic */ void c(Throwable th2) {
                pd.t.b(this, th2);
            }

            @Override // pd.h
            public /* synthetic */ void execute(Object obj) {
                pd.t.a(this, obj);
            }
        });
    }
}
