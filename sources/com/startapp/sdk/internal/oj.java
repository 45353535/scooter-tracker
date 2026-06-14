package com.startapp.sdk.internal;

import android.view.View;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes11.dex */
public final class oj implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65046a;

    public oj(com.startapp.sdk.ads.video.c cVar) {
        this.f65046a = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f65046a;
        cVar.U = true;
        if (cVar.T && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f65046a;
            if (!cVar2.f63867b0 || (videoView = cVar2.O) == null) {
                return;
            }
            cVar2.a(videoView);
        }
    }
}
