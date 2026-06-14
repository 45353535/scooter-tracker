package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5598zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5498vf f78633a;

    public C5598zf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z10) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f78633a = new C5498vf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z10, Y7.f76695c);
            }
        }
    }
}
