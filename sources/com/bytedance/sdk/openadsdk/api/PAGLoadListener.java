package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.mo;

/* JADX INFO: loaded from: classes6.dex */
public interface PAGLoadListener<Ad> extends mo {
    @MainThread
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.mo
    @MainThread
    void onError(int i10, String str);
}
