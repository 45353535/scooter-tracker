package com.appodeal.ads.nativead;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.AppodealException;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/nativead/NativeAdViewAppWall;", "Lcom/appodeal/ads/nativead/j;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAdViewAppWall extends j {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdViewAppWall(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.appodeal.ads.nativead.j
    public final void b(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "relativeLayout");
        super.b(relativeLayout);
        NativeIconView iconView = getIconView();
        Integer numValueOf = iconView != null ? Integer.valueOf(iconView.getId()) : null;
        View descriptionView = getDescriptionView();
        Integer numValueOf2 = descriptionView != null ? Integer.valueOf(descriptionView.getId()) : null;
        View callToActionView = getCallToActionView();
        Integer numValueOf3 = callToActionView != null ? Integer.valueOf(callToActionView.getId()) : null;
        if (numValueOf == null || numValueOf2 == null || numValueOf3 == null) {
            Log.log(new AppodealException("NativeAdViewAppWall: IconView or DescriptionView or CallToActionView can not be null"));
            return;
        }
        RatingBar ratingBar = new RatingBar(getContext(), null, R.attr.ratingBarStyleSmall);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(17, numValueOf.intValue());
        layoutParams.addRule(3, numValueOf2.intValue());
        int i10 = k.f13889a;
        layoutParams.setMargins(i10, i10, 0, 0);
        ratingBar.setLayoutParams(layoutParams);
        ratingBar.setNumStars(5);
        ratingBar.setMax(5);
        ratingBar.setId(View.generateViewId());
        setRatingView(ratingBar);
        relativeLayout.addView(ratingBar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdViewAppWall(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NativeAdViewAppWall(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdViewAppWall(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 70);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
