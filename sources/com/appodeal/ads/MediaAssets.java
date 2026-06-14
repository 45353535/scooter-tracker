package com.appodeal.ads;

import com.appodeal.ads.ImageData;
import com.appodeal.ads.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/MediaAssets;", "", "icon", "Lcom/appodeal/ads/ImageData;", "mainImage", "video", "Lcom/appodeal/ads/VideoData;", "<init>", "(Lcom/appodeal/ads/ImageData;Lcom/appodeal/ads/ImageData;Lcom/appodeal/ads/VideoData;)V", "getIcon", "()Lcom/appodeal/ads/ImageData;", "setIcon", "(Lcom/appodeal/ads/ImageData;)V", "getMainImage", "setMainImage", "getVideo", "()Lcom/appodeal/ads/VideoData;", "setVideo", "(Lcom/appodeal/ads/VideoData;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaAssets {
    private ImageData icon;
    private ImageData mainImage;
    private VideoData video;

    public MediaAssets() {
        this(null, null, null, 7, null);
    }

    public final ImageData getIcon() {
        return this.icon;
    }

    public final ImageData getMainImage() {
        return this.mainImage;
    }

    public final VideoData getVideo() {
        return this.video;
    }

    public final void setIcon(ImageData imageData) {
        this.icon = imageData;
    }

    public final void setMainImage(ImageData imageData) {
        this.mainImage = imageData;
    }

    public final void setVideo(VideoData videoData) {
        this.video = videoData;
    }

    public MediaAssets(ImageData imageData, ImageData imageData2, VideoData videoData) {
        this.icon = imageData;
        this.mainImage = imageData2;
        this.video = videoData;
    }

    public /* synthetic */ MediaAssets(ImageData imageData, ImageData imageData2, VideoData videoData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ImageData.Autoload.INSTANCE : imageData, (i10 & 2) != 0 ? ImageData.Autoload.INSTANCE : imageData2, (i10 & 4) != 0 ? VideoData.Autoload.INSTANCE : videoData);
    }
}
