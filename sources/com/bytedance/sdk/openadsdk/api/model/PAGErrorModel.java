package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes6.dex */
public class PAGErrorModel {
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16924ud;

    public PAGErrorModel(int i10, String str) {
        this.qdl = i10;
        this.f16924ud = str;
    }

    public int getErrorCode() {
        return this.qdl;
    }

    public String getErrorMessage() {
        return this.f16924ud;
    }
}
