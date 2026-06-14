package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes6.dex */
class rdp implements TTClientBidding {
    private final mo qdl;

    rdp(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.qdl = new mo(context, qdlVar);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.qdl.loss(d10, str, str2);
    }

    public mo qdl() {
        return this.qdl;
    }

    public void ud() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.qdl.win(d10);
    }

    public void qdl(boolean z10) {
        this.qdl.qdl(z10);
    }
}
