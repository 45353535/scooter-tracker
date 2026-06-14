package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        q0.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        q0.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        q0.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        q0.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        q0.a("DefaultJSContainerModule", "readyStatus:isReady=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        q0.a("DefaultJSContainerModule", "showMiniCard width = " + i10 + " height = " + i11 + " radius = " + i12);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        q0.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        q0.a("DefaultJSContainerModule", "showEndcard,type=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        q0.a("DefaultJSContainerModule", "showMiniCard top = " + i10 + " left = " + i11 + " width = " + i12 + " height = " + i13 + " radius = " + i14);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        q0.a("DefaultJSContainerModule", "showVideoClickView:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        q0.a("DefaultJSContainerModule", "showVideoEndCover");
    }
}
