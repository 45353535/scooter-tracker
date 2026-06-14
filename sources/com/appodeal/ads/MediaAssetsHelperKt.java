package com.appodeal.ads;

import android.widget.ImageView;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"isLoaded", "", "Lcom/appodeal/ads/ImageData;", "Lcom/appodeal/ads/VideoData;", "setImageData", "", "Landroid/widget/ImageView;", "imageData", "public_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MediaAssetsHelperKt {
    public static final boolean isLoaded(ImageData imageData) {
        if (imageData != null) {
            return (imageData instanceof ImageData.Autoload) || (imageData instanceof ImageData.LocalUri) || (imageData instanceof ImageData.LocalDrawable);
        }
        return false;
    }

    public static final void setImageData(ImageView imageView, ImageData imageData) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (imageData instanceof ImageData.LocalDrawable) {
            imageView.setImageDrawable(((ImageData.LocalDrawable) imageData).getDrawable());
            return;
        }
        if (imageData instanceof ImageData.LocalUri) {
            imageView.setImageURI(((ImageData.LocalUri) imageData).getLocalUri());
            return;
        }
        if (!(imageData instanceof ImageData.Remote)) {
            if (!Intrinsics.areEqual(imageData, ImageData.Autoload.INSTANCE) && imageData != null) {
                throw new lf.m();
            }
        } else {
            throw new IllegalStateException(("Unexpected ImageData: " + imageData + ". Image should be downloaded before using").toString());
        }
    }

    public static final boolean isLoaded(VideoData videoData) {
        if (videoData != null) {
            return (videoData instanceof VideoData.Autoload) || (videoData instanceof VideoData.LocalUri);
        }
        return false;
    }
}
