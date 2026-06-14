package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C4240b4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u00011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0016\u0010*\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0016\u0010,\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0016\u0010.\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0011R\u0016\u00100\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0011¨\u00062"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "", "Landroid/view/View;", "a", "Landroid/view/View;", "getNativeAdView", "()Landroid/view/View;", "nativeAdView", "", "", "b", "Ljava/util/Map;", "getAssetViews", "()Ljava/util/Map;", "assetViews", "Landroid/widget/TextView;", "getAgeView", "()Landroid/widget/TextView;", "ageView", "getBodyView", "bodyView", "getCallToActionView", "callToActionView", "getDomainView", "domainView", "Landroid/widget/ImageView;", "getFaviconView", "()Landroid/widget/ImageView;", "faviconView", "getFeedbackView", "feedbackView", "getIconView", "iconView", "Lcom/yandex/mobile/ads/nativeads/MediaView;", "getMediaView", "()Lcom/yandex/mobile/ads/nativeads/MediaView;", "mediaView", "getPriceView", "priceView", "getRatingView", "ratingView", "getReviewCountView", "reviewCountView", "getSponsoredView", "sponsoredView", "getTitleView", "titleView", "getWarningView", "warningView", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class NativeAdViewBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View nativeAdView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map assetViews;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, map);
    }

    @Nullable
    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @NotNull
    public Map<String, View> getAssetViews() {
        return this.assetViews;
    }

    @Nullable
    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getDomainView() {
        View view = getAssetViews().get(C4240b4.j.D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public MediaView getMediaView() {
        View view = getAssetViews().get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.nativeAdView;
    }

    @Nullable
    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    @Nullable
    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    private NativeAdViewBinder(View view, Map map) {
        this.nativeAdView = view;
        this.assetViews = map;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010\u000eJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "", "Landroid/view/View;", "nativeAdView", "<init>", "(Landroid/view/View;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "(Lcom/yandex/mobile/ads/nativeads/NativeAdView;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "build", "()Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "Landroid/widget/TextView;", "bodyView", "setBodyView", "(Landroid/widget/TextView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "callToActionView", "setCallToActionView", "domainView", "setDomainView", "Landroid/widget/ImageView;", "faviconView", "setFaviconView", "(Landroid/widget/ImageView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "feedbackView", "setFeedbackView", "iconView", "setIconView", "Lcom/yandex/mobile/ads/nativeads/MediaView;", "mediaView", "setMediaView", "(Lcom/yandex/mobile/ads/nativeads/MediaView;)Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder$Builder;", "sponsoredView", "setSponsoredView", "titleView", "setTitleView", "warningView", "setWarningView", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f68287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f68288b;

        public Builder(@NotNull View view) {
            this.f68287a = view;
            this.f68288b = new LinkedHashMap();
        }

        @NotNull
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f68287a, this.f68288b, null);
        }

        @NotNull
        public final Builder setBodyView(@Nullable TextView bodyView) {
            this.f68288b.put("body", bodyView);
            return this;
        }

        @NotNull
        public final Builder setCallToActionView(@Nullable TextView callToActionView) {
            this.f68288b.put("call_to_action", callToActionView);
            return this;
        }

        @NotNull
        public final Builder setDomainView(@Nullable TextView domainView) {
            this.f68288b.put(C4240b4.j.D, domainView);
            return this;
        }

        @NotNull
        public final Builder setFaviconView(@Nullable ImageView faviconView) {
            this.f68288b.put("favicon", faviconView);
            return this;
        }

        @NotNull
        public final Builder setFeedbackView(@Nullable ImageView feedbackView) {
            this.f68288b.put("feedback", feedbackView);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView iconView) {
            this.f68288b.put("icon", iconView);
            return this;
        }

        @NotNull
        public final Builder setMediaView(@Nullable MediaView mediaView) {
            this.f68288b.put("media", mediaView);
            return this;
        }

        @NotNull
        public final Builder setSponsoredView(@Nullable TextView sponsoredView) {
            this.f68288b.put("sponsored", sponsoredView);
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable TextView titleView) {
            this.f68288b.put("title", titleView);
            return this;
        }

        @NotNull
        public final Builder setWarningView(@Nullable TextView warningView) {
            this.f68288b.put("warning", warningView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
            Intrinsics.checkNotNull(nativeAdView, "null cannot be cast to non-null type android.view.View");
        }
    }
}
