package com.bytedance.sdk.component.jpc.qdl;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.koa;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends koa implements lnr {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final HandlerThread f16506ud;

    ud(HandlerThread handlerThread, koa.qdl qdlVar) {
        super(handlerThread.getLooper(), qdlVar);
        this.f16506ud = handlerThread;
    }

    @Override // com.bytedance.sdk.component.jpc.qdl.lnr
    public void qdl() {
        removeCallbacksAndMessages(null);
        WeakReference<koa.qdl> weakReference = this.qdl;
        if (weakReference != null) {
            weakReference.clear();
            this.qdl = null;
        }
    }

    public void ud() {
        HandlerThread handlerThread = this.f16506ud;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void qdl(koa.qdl qdlVar) {
        this.qdl = new WeakReference<>(qdlVar);
    }
}
