package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.sdk.component.ud.qdl.mml {
    public static volatile to qdl;
    private ExecutorService mml;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<com.bytedance.sdk.component.ud.qdl.ud> f16698ud = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ud.qdl.ud> lnr = new CopyOnWriteArrayList();

    public qdl(ExecutorService executorService) {
        this.mml = executorService;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public List<com.bytedance.sdk.component.ud.qdl.ud> lnr() {
        return this.f16698ud;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public List<com.bytedance.sdk.component.ud.qdl.ud> mml() {
        return this.lnr;
    }

    public boolean mzz() {
        return (qdl == null || qdl.qdl() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public int qdl() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public ExecutorService ud() {
        ExecutorService executorServiceQdl = qdl != null ? qdl.qdl() : null;
        return executorServiceQdl != null ? executorServiceQdl : this.mml;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public void qdl(int i10) {
    }

    public static void qdl(to toVar) {
        qdl = toVar;
    }
}
