package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface NativeAdDataInterface {

    public static class Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Drawable f43780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Uri f43781b;

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.f43780a = drawable;
            this.f43781b = uri;
        }

        @Nullable
        public final Drawable getDrawable() {
            return this.f43780a;
        }

        @Nullable
        public final Uri getUri() {
            return this.f43781b;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
