package com.mbridge.msdk.out;

import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(com.mbridge.msdk.util.a.a(1000, str), str);
    }

    public abstract void onAdLoadErrorWithCode(int i10, String str);
}
