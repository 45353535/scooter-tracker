package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f11722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f11727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f11728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f11729h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f11730i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f11731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f11732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f11733l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f11722a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f11724c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f11725d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f11726e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f11727f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f11728g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f11731j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f11732k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f11730i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f11729h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f11733l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f11723b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f11722a;
        this.title = builder.f11723b;
        this.advertiser = builder.f11724c;
        this.body = builder.f11725d;
        this.callToAction = builder.f11726e;
        this.icon = builder.f11727f;
        this.iconView = builder.f11728g;
        this.optionsView = builder.f11729h;
        this.mediaView = builder.f11730i;
        this.mainImage = builder.f11731j;
        this.mediaContentAspectRatio = builder.f11732k;
        Double d10 = builder.f11733l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f11734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f11735b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f11734a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f11734a;
        }

        @Nullable
        public Uri getUri() {
            return this.f11735b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f11735b = uri;
        }
    }
}
