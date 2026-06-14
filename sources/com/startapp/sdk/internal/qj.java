package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class qj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65167a;

    public qj(com.startapp.sdk.ads.video.c cVar) {
        this.f65167a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = this.f65167a.R;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.f65167a.f63876k0.postDelayed(new pj(this), AdsCommonMetaData.k().F().d());
        } catch (Throwable th2) {
            this.f65167a.I();
            g9.a(th2);
        }
    }
}
