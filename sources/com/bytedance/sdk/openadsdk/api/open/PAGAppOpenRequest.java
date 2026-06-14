package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes6.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int qdl;

    public int getTimeout() {
        return this.qdl;
    }

    public void setTimeout(int i10) {
        this.qdl = i10;
    }
}
