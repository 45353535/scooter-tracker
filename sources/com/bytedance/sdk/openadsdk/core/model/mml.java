package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class mml {

    @NonNull
    private com.bytedance.sdk.openadsdk.core.fs.mml qdl = new com.bytedance.sdk.openadsdk.core.fs.mml();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Set<com.bytedance.sdk.openadsdk.core.fs.to> f17388ud = new HashSet();

    @NonNull
    public com.bytedance.sdk.openadsdk.core.fs.mml qdl() {
        return this.qdl;
    }

    public Set<com.bytedance.sdk.openadsdk.core.fs.to> ud() {
        return this.f17388ud;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) {
        if (mmlVar == null) {
            mmlVar = new com.bytedance.sdk.openadsdk.core.fs.mml();
        }
        this.qdl = mmlVar;
    }

    public void ud(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.f17388ud.addAll(set);
    }

    public void qdl(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
        this.f17388ud = set;
    }

    public void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(ljhVar);
        }
    }
}
