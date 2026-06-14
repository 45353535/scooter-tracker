package com.appodeal.ads.nativead;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.R$styleable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.y2;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010*\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010.\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R$\u00102\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001f0S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/appodeal/ads/nativead/NativeAdView;", "Lcom/appodeal/ads/nativead/f;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isViewValid", "()Z", "Lcom/appodeal/ads/NativeAd;", "nativeAd", "", "placementName", "registerView", "(Lcom/appodeal/ads/NativeAd;Ljava/lang/String;)Z", "", "unregisterView", "()V", "destroy", "color", "setAdAttributionTextColor", "(I)V", "setAdAttributionBackground", "Lcom/appodeal/ads/nativead/Position;", C4240b4.i.L, "setAdChoicesPosition", "(Lcom/appodeal/ads/nativead/Position;)V", "Landroid/view/View;", CampaignEx.JSON_KEY_AD_K, "Landroid/view/View;", "getTitleView", "()Landroid/view/View;", "setTitleView", "(Landroid/view/View;)V", "titleView", CmcdData.Factory.STREAM_TYPE_LIVE, "getCallToActionView", "setCallToActionView", "callToActionView", "m", "getDescriptionView", "setDescriptionView", "descriptionView", "n", "getRatingView", "setRatingView", "ratingView", "Lcom/appodeal/ads/nativead/NativeIconView;", "o", "Lcom/appodeal/ads/nativead/NativeIconView;", "getIconView", "()Lcom/appodeal/ads/nativead/NativeIconView;", "setIconView", "(Lcom/appodeal/ads/nativead/NativeIconView;)V", "iconView", "Lcom/appodeal/ads/nativead/NativeMediaView;", "p", "Lcom/appodeal/ads/nativead/NativeMediaView;", "getMediaView", "()Lcom/appodeal/ads/nativead/NativeMediaView;", "setMediaView", "(Lcom/appodeal/ads/nativead/NativeMediaView;)V", "mediaView", "Landroid/widget/TextView;", CampaignEx.JSON_KEY_AD_Q, "Landroid/widget/TextView;", "getAdAttributionView", "()Landroid/widget/TextView;", "setAdAttributionView", "(Landroid/widget/TextView;)V", "adAttributionView", "Landroid/view/ViewGroup;", "r", "Landroid/view/ViewGroup;", "getAdChoiceView", "()Landroid/view/ViewGroup;", "setAdChoiceView", "(Landroid/view/ViewGroup;)V", "adChoiceView", "", "getClickableViews", "()Ljava/util/List;", "clickableViews", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NativeAdView extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeAd f13819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public View titleView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public View callToActionView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public View descriptionView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public View ratingView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public NativeIconView iconView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public NativeMediaView mediaView;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public TextView adAttributionView;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ViewGroup adChoiceView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ boolean registerView$default(NativeAdView nativeAdView, NativeAd nativeAd, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerView");
        }
        if ((i10 & 2) != 0) {
            str = "default";
        }
        return nativeAdView.registerView(nativeAd, str);
    }

    public final void destroy() {
        y2.f15272d.a(null);
        unregisterView();
        setVisibility(8);
        NativeAd nativeAd = this.f13819c;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f13819c = null;
        this.titleView = null;
        this.callToActionView = null;
        this.descriptionView = null;
        this.ratingView = null;
        this.iconView = null;
        this.mediaView = null;
        this.adChoiceView = null;
        this.adAttributionView = null;
    }

    @Nullable
    public final TextView getAdAttributionView() {
        return this.adAttributionView;
    }

    @Nullable
    public final ViewGroup getAdChoiceView() {
        return this.adChoiceView;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.callToActionView;
    }

    @NotNull
    public final List<View> getClickableViews() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        View view = this.titleView;
        if (view != null) {
            listCreateListBuilder.add(view);
        }
        View view2 = this.descriptionView;
        if (view2 != null) {
            listCreateListBuilder.add(view2);
        }
        View view3 = this.callToActionView;
        if (view3 != null) {
            listCreateListBuilder.add(view3);
        }
        NativeIconView nativeIconView = this.iconView;
        if (nativeIconView != null) {
            listCreateListBuilder.add(nativeIconView);
        }
        NativeMediaView nativeMediaView = this.mediaView;
        if (nativeMediaView != null) {
            listCreateListBuilder.add(nativeMediaView);
        }
        View view4 = this.ratingView;
        if (view4 != null) {
            listCreateListBuilder.add(view4);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    @Nullable
    public final View getDescriptionView() {
        return this.descriptionView;
    }

    @Nullable
    public final NativeIconView getIconView() {
        return this.iconView;
    }

    @Nullable
    public final NativeMediaView getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getRatingView() {
        return this.ratingView;
    }

    @Nullable
    public final View getTitleView() {
        return this.titleView;
    }

    public boolean isViewValid() {
        y2.f15271c.a(null);
        if (this.titleView == null) {
            Log.log(LogConstants.EVENT_ASSETS_ERROR, "NativeAdView is invalid", "titleView was not provided");
            return false;
        }
        if (this.callToActionView == null) {
            Log.log(LogConstants.EVENT_ASSETS_ERROR, "NativeAdView is invalid", "callToActionView was not provided");
            return false;
        }
        if (this.adAttributionView == null) {
            Log.log(LogConstants.EVENT_ASSETS_ERROR, "NativeAdView is invalid", "adAttributionView was not provided");
            return false;
        }
        if (this.iconView != null || this.mediaView != null) {
            return true;
        }
        Log.log(LogConstants.EVENT_ASSETS_ERROR, "NativeAdView is invalid", "NativeAdView must contain a NativeMediaView or NativeIconView");
        return false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f13820d;
        if (i10 != -1 && this.titleView == null) {
            this.titleView = findViewById(i10);
        }
        int i11 = this.f13821e;
        if (i11 != -1 && this.callToActionView == null) {
            this.callToActionView = findViewById(i11);
        }
        int i12 = this.f13822f;
        if (i12 != -1 && this.descriptionView == null) {
            this.descriptionView = findViewById(i12);
        }
        int i13 = this.f13823g;
        if (i13 != -1 && this.ratingView == null) {
            this.ratingView = findViewById(i13);
        }
        int i14 = this.f13824h;
        if (i14 != -1 && this.iconView == null) {
            this.iconView = (NativeIconView) findViewById(i14);
        }
        int i15 = this.f13825i;
        if (i15 != -1 && this.mediaView == null) {
            this.mediaView = (NativeMediaView) findViewById(i15);
        }
        int i16 = this.f13826j;
        if (i16 != -1 && this.adAttributionView == null) {
            this.adAttributionView = (TextView) findViewById(i16);
        }
        g.a(this);
    }

    public final boolean registerView(@NotNull NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        return registerView$default(this, nativeAd, null, 2, null);
    }

    public final void setAdAttributionBackground(@ColorInt int color) {
        if (!g.c(color)) {
            Log.log(LogConstants.EVENT_ASSETS_ERROR, "setAdAttributionBackground", "provided color should be ColorInt. Use android.graphics.Color");
            return;
        }
        TextView textView = this.adAttributionView;
        if (textView != null) {
            textView.setBackgroundColor(color);
        }
    }

    public final void setAdAttributionTextColor(@ColorInt int color) {
        if (!g.c(color)) {
            Log.log(LogConstants.EVENT_ASSETS_ERROR, "setAdAttributionTextColor", "provided color should be ColorInt. Use android.graphics.Color");
            return;
        }
        TextView textView = this.adAttributionView;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setAdAttributionView(@Nullable TextView textView) {
        this.adAttributionView = textView;
    }

    public final void setAdChoiceView(@Nullable ViewGroup viewGroup) {
        this.adChoiceView = viewGroup;
    }

    public final void setAdChoicesPosition(@NotNull Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        ViewGroup viewGroup = this.adChoiceView;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = position.getGravity();
        }
    }

    public final void setCallToActionView(@Nullable View view) {
        this.callToActionView = view;
    }

    public final void setDescriptionView(@Nullable View view) {
        this.descriptionView = view;
    }

    public final void setIconView(@Nullable NativeIconView nativeIconView) {
        this.iconView = nativeIconView;
    }

    public final void setMediaView(@Nullable NativeMediaView nativeMediaView) {
        this.mediaView = nativeMediaView;
    }

    public final void setRatingView(@Nullable View view) {
        this.ratingView = view;
    }

    public final void setTitleView(@Nullable View view) {
        this.titleView = view;
    }

    public final void unregisterView() {
        y2.f15270b.a(null);
        NativeAd nativeAd = this.f13819c;
        h hVar = nativeAd instanceof h ? (h) nativeAd : null;
        if (hVar != null) {
            hVar.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean registerView(@NotNull NativeAd nativeAd, @NotNull String placementName) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        y2.f15269a.a(null);
        if (!isViewValid()) {
            return false;
        }
        NativeAd nativeAd2 = this.f13819c;
        h hVar = nativeAd2 instanceof h ? (h) nativeAd2 : null;
        if (hVar != null) {
            hVar.b();
        }
        h hVar2 = nativeAd instanceof h ? (h) nativeAd : null;
        if (hVar2 != null) {
            hVar2.b();
        }
        this.f13819c = nativeAd;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!nativeAd.canShow(context, placementName)) {
            return false;
        }
        setVisibility(0);
        ((h) nativeAd).a(this, placementName);
        return true;
    }

    public /* synthetic */ NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13820d = -1;
        this.f13821e = -1;
        this.f13822f = -1;
        this.f13823g = -1;
        this.f13824h = -1;
        this.f13825i = -1;
        this.f13826j = -1;
        int iOrdinal = Position.END_BOTTOM.ordinal();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f11838a, i10, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                if (!isInEditMode()) {
                    setVisibility(8);
                }
                this.f13820d = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11846i, -1);
                this.f13821e = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11841d, -1);
                this.f13822f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11842e, -1);
                this.f13823g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11845h, -1);
                this.f13824h = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11843f, -1);
                this.f13825i = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11844g, -1);
                this.f13826j = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f11839b, -1);
                iOrdinal = typedArrayObtainStyledAttributes.getInt(R$styleable.f11840c, iOrdinal);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        g.b(this, iOrdinal);
    }
}
