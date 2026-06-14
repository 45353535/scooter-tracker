package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes6.dex */
public class PAGRewardItem {
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16928ud;

    public PAGRewardItem(int i10, String str) {
        this.qdl = i10;
        this.f16928ud = str;
    }

    public int getRewardAmount() {
        return this.qdl;
    }

    public String getRewardName() {
        return this.f16928ud;
    }
}
