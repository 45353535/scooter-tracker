package com.bykv.vk.openvk.qdl.qdl.qdl.mo;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> qdl;

    public mo(SurfaceHolder.Callback callback) {
        this.qdl = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback qdl() {
        return this.qdl.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
