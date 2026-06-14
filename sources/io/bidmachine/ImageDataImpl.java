package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ImageDataImpl implements ImageData {

    @Nullable
    private Drawable image;

    @Nullable
    private Uri localUri;

    @Nullable
    private String remoteUrl;

    public ImageDataImpl() {
    }

    public void destroy() {
        this.remoteUrl = null;
        this.image = null;
        this.localUri = null;
    }

    @Override // io.bidmachine.ImageData
    @Nullable
    public Drawable getImage() {
        return this.image;
    }

    @Override // io.bidmachine.ImageData
    @Nullable
    public Uri getLocalUri() {
        return this.localUri;
    }

    @Override // io.bidmachine.ImageData
    @Nullable
    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public ImageDataImpl setImage(@Nullable Drawable drawable) {
        this.image = drawable;
        return this;
    }

    public ImageDataImpl setLocalUri(@Nullable Uri uri) {
        this.localUri = uri;
        return this;
    }

    public ImageDataImpl setRemoteUrl(@Nullable String str) {
        this.remoteUrl = str;
        return this;
    }

    public ImageDataImpl(@Nullable String str) {
        this.remoteUrl = str;
    }

    public ImageDataImpl(@Nullable Drawable drawable) {
        this.image = drawable;
    }

    public ImageDataImpl(@Nullable ImageData imageData) {
        if (imageData != null) {
            this.remoteUrl = imageData.getRemoteUrl();
            this.image = imageData.getImage();
            this.localUri = imageData.getLocalUri();
        }
    }
}
