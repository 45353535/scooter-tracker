package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i10);

    void onRenderFail(View view, String str, int i10);

    void onRenderSuccess(View view, float f10, float f11);
}
