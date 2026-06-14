package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.z0;
import io.bidmachine.Executable;
import jd.j;
import od.i;
import pd.t;
import pd.u;

/* JADX INFO: loaded from: classes12.dex */
class MraidFullScreenAdListener implements io.bidmachine.iab.mraid.g {

    @NonNull
    private final Context applicationContext;

    @NonNull
    private final i callback;

    @Nullable
    private final m9.a mraidOMSDKAdMeasurer;

    MraidFullScreenAdListener(@NonNull Context context, @NonNull i iVar, @Nullable m9.a aVar) {
        this.applicationContext = context;
        this.callback = iVar;
        this.mraidOMSDKAdMeasurer = aVar;
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onCalendarEvent(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull String str, @NonNull final b9.f fVar2) {
        this.callback.onAdClicked();
        j.b(this.applicationContext, str, new u() { // from class: io.bidmachine.ads.networks.mraid.h
            @Override // pd.u
            public final void a(Object obj) {
                fVar2.a();
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
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onClose(@NonNull io.bidmachine.iab.mraid.f fVar) {
        if (fVar.s()) {
            m9.a aVar = this.mraidOMSDKAdMeasurer;
            if (aVar != null) {
                aVar.j();
            }
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onExpired(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull y8.b bVar) {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onLoadFailed(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull y8.b bVar) {
        this.callback.onAdLoadFailed(ae.e.a(bVar));
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onLoaded(@NonNull io.bidmachine.iab.mraid.f fVar) {
        this.callback.onAdLoaded();
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onOpenPrivacySheet(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull final z0 z0Var) {
        Context contextV = fVar.v();
        if (contextV == null) {
            contextV = this.applicationContext;
        }
        io.bidmachine.core.h.F(io.bidmachine.core.h.m(contextV), new Executable() { // from class: io.bidmachine.ads.networks.mraid.g
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                ld.a.k((Context) obj, z0Var);
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onOpenUrl(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull String str, @NonNull final b9.f fVar2) {
        this.callback.onAdClicked();
        j.c(this.applicationContext, str, new u() { // from class: io.bidmachine.ads.networks.mraid.e
            @Override // pd.u
            public final void a(Object obj) {
                fVar2.a();
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
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onPlayVideo(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull String str) {
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onShowFailed(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull y8.b bVar) {
        this.callback.onAdShowFailed(ae.e.a(bVar));
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onShown(@NonNull io.bidmachine.iab.mraid.f fVar) {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.g
    public void onStorePicture(@NonNull io.bidmachine.iab.mraid.f fVar, @NonNull String str, @NonNull final b9.f fVar2) {
        this.callback.onAdClicked();
        j.e(this.applicationContext, str, new u() { // from class: io.bidmachine.ads.networks.mraid.f
            @Override // pd.u
            public final void a(Object obj) {
                fVar2.a();
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
    }
}
