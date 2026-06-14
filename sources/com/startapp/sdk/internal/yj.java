package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65624a;

    public yj(com.startapp.sdk.ads.video.c cVar) {
        this.f65624a = cVar;
    }

    public final void a(int i10) {
        com.startapp.sdk.ads.video.c cVar;
        sd sdVar;
        sd sdVar2 = this.f65624a.N;
        int duration = sdVar2 != null ? sdVar2.f65255h.getDuration() : 0;
        com.startapp.sdk.ads.video.c cVar2 = this.f65624a;
        if (cVar2.f63866a0 && duration > 0 && cVar2.C()) {
            com.startapp.sdk.ads.video.c cVar3 = this.f65624a;
            cVar3.Z = i10;
            int currentPosition = (cVar3.N.f65255h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f65624a.R;
            if (progressBar == null || !progressBar.isShown()) {
                int i11 = this.f65624a.Z;
                if (i11 >= 100 || i11 - currentPosition > AdsCommonMetaData.k().F().j() || (sdVar = (cVar = this.f65624a).N) == null) {
                    return;
                }
                sdVar.f65255h.pause();
                ProgressBar progressBar2 = cVar.R;
                if (progressBar2 == null || !progressBar2.isShown()) {
                    cVar.f63876k0.postDelayed(new qj(cVar), AdsCommonMetaData.k().F().h());
                    return;
                }
                return;
            }
            com.startapp.sdk.ads.video.c cVar4 = this.f65624a;
            if (!cVar4.f63867b0 && cVar4.B()) {
                this.f65624a.H();
                return;
            }
            int i12 = this.f65624a.Z;
            if (i12 == 100 || i12 - currentPosition > AdsCommonMetaData.k().F().i()) {
                com.startapp.sdk.ads.video.c cVar5 = this.f65624a;
                sd sdVar3 = cVar5.N;
                if (sdVar3 != null) {
                    sdVar3.f65255h.start();
                    cVar5.f65681v.setBackgroundColor(33554431);
                }
                cVar5.I();
            }
        }
    }
}
