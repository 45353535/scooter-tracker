package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q {
    static {
        DrmSessionManager drmSessionManager = DrmSessionManager.DRM_UNSUPPORTED;
    }

    public static DrmSessionManager.DrmSessionReference a(DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionManager.DrmSessionReference.EMPTY;
    }

    public static DrmSessionManager d() {
        return DrmSessionManager.DRM_UNSUPPORTED;
    }

    public static void b(DrmSessionManager drmSessionManager) {
    }

    public static void c(DrmSessionManager drmSessionManager) {
    }
}
