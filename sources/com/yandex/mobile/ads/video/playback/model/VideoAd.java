package com.yandex.mobile.ads.video.playback.model;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/mobile/ads/video/playback/model/VideoAd;", "", "adInfo", "Lcom/yandex/mobile/ads/video/playback/model/VideoAdInfo;", "getAdInfo", "()Lcom/yandex/mobile/ads/video/playback/model/VideoAdInfo;", "adPodInfo", "Lcom/yandex/mobile/ads/video/playback/model/AdPodInfo;", "getAdPodInfo", "()Lcom/yandex/mobile/ads/video/playback/model/AdPodInfo;", "duration", "", "getDuration", "()J", "extensions", "Lcom/yandex/mobile/ads/video/playback/model/VideoAdExtensions;", "getExtensions", "()Lcom/yandex/mobile/ads/video/playback/model/VideoAdExtensions;", "info", "", "getInfo$annotations", "()V", "getInfo", "()Ljava/lang/String;", "mediaFile", "Lcom/yandex/mobile/ads/video/playback/model/MediaFile;", "getMediaFile", "()Lcom/yandex/mobile/ads/video/playback/model/MediaFile;", "mediaFiles", "", "getMediaFiles", "()Ljava/util/List;", "skipInfo", "Lcom/yandex/mobile/ads/video/playback/model/SkipInfo;", "getSkipInfo", "()Lcom/yandex/mobile/ads/video/playback/model/SkipInfo;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface VideoAd {
    @NotNull
    VideoAdInfo getAdInfo();

    @NotNull
    AdPodInfo getAdPodInfo();

    long getDuration();

    @NotNull
    VideoAdExtensions getExtensions();

    @Nullable
    String getInfo();

    @NotNull
    MediaFile getMediaFile();

    @NotNull
    List<MediaFile> getMediaFiles();

    @Nullable
    SkipInfo getSkipInfo();
}
