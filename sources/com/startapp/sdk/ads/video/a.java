package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f63863a;

    public a(c cVar) {
        this.f63863a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f63863a;
        if (cVar.N == null) {
            return;
        }
        ProgressBar progressBar = cVar.R;
        if (progressBar != null && progressBar.isShown()) {
            cVar.I();
        }
        cVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        ActionTrackingLink[] actionTrackingLinkArrP = cVar.x().getVideoTrackingDetails().p();
        cVar.a(cVar.f63873h0, new VideoTrackingParams(cVar.a(cVar.f63873h0), cVar.C, cVar.f65443o, cVar.f63875j0), Reporting.EventType.VIDEO_AD_SKIPPED, actionTrackingLinkArrP);
    }
}
