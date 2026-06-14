package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.qs3;
import yads.ze3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/common/VideoController;", "", "Lcom/yandex/mobile/ads/common/VideoEventListener;", "videoEventListener", "", "setVideoEventListener", "(Lcom/yandex/mobile/ads/common/VideoEventListener;)V", "Lyads/ze3;", "videoEventController", "<init>", "(Lyads/ze3;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
@MainThread
public final class VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ze3 f68250a;

    public VideoController(@NotNull ze3 ze3Var) {
        this.f68250a = ze3Var;
    }

    public final void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.f68250a.f118644b = new qs3(videoEventListener);
        } else {
            this.f68250a.f118644b = null;
        }
    }
}
