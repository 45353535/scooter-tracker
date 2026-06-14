package com.appodeal.ads.nativead;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.appodeal.ads.R$drawable;
import com.appodeal.ads.ext.DensityExtKt;
import com.taurusx.tax.f.t;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    public static final void a(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "<this>");
        if (nativeAdView.isInEditMode()) {
            View titleView = nativeAdView.getTitleView();
            TextView textView = titleView instanceof TextView ? (TextView) titleView : null;
            if (textView != null) {
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    textView.setText("Appodeal");
                }
            }
            View callToActionView = nativeAdView.getCallToActionView();
            Button button = callToActionView instanceof Button ? (Button) callToActionView : null;
            if (button != null) {
                CharSequence text2 = button.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                if (text2.length() == 0) {
                    button.setText("open");
                }
            }
            View descriptionView = nativeAdView.getDescriptionView();
            TextView textView2 = descriptionView instanceof TextView ? (TextView) descriptionView : null;
            if (textView2 != null) {
                CharSequence text3 = textView2.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() == 0) {
                    textView2.setText("This is Appodeal demo ad.");
                }
            }
            View ratingView = nativeAdView.getRatingView();
            RatingBar ratingBar = ratingView instanceof RatingBar ? (RatingBar) ratingView : null;
            if (ratingBar != null) {
                ratingBar.setStepSize(0.1f);
                ratingBar.setRating(5.0f);
            }
            NativeIconView iconView = nativeAdView.getIconView();
            if (iconView != null) {
                iconView.setBackgroundResource(R$drawable.f11836b);
            }
            NativeMediaView mediaView = nativeAdView.getMediaView();
            if (mediaView != null) {
                mediaView.setBackgroundResource(R$drawable.f11837c);
            }
            TextView adAttributionView = nativeAdView.getAdAttributionView();
            if (adAttributionView != null) {
                CharSequence text4 = adAttributionView.getText();
                Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                if (text4.length() == 0) {
                    adAttributionView.setText(t.f66040o);
                }
                if (adAttributionView.getBackground() == null) {
                    adAttributionView.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                }
            }
            ViewGroup adChoiceView = nativeAdView.getAdChoiceView();
            if (adChoiceView != null) {
                ImageView imageView = new ImageView(nativeAdView.getContext());
                imageView.setBackgroundResource(R$drawable.f11835a);
                adChoiceView.addView(imageView);
            }
        }
    }

    public static final void b(NativeAdView nativeAdView, int i10) {
        Intrinsics.checkNotNullParameter(nativeAdView, "<this>");
        FrameLayout frameLayout = new FrameLayout(nativeAdView.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(DensityExtKt.getToPx(15), DensityExtKt.getToPx(15)));
        frameLayout.setElevation(2.0f);
        frameLayout.setId(View.generateViewId());
        nativeAdView.setAdChoiceView(frameLayout);
        nativeAdView.addView(frameLayout);
        for (Position position : Position.values()) {
            if (position.ordinal() == i10) {
                nativeAdView.setAdChoicesPosition(position);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean c(int i10) {
        int iRed;
        int iGreen;
        int iBlue;
        int iAlpha = Color.alpha(i10);
        return iAlpha >= 0 && iAlpha < 256 && (iRed = Color.red(i10)) >= 0 && iRed < 256 && (iGreen = Color.green(i10)) >= 0 && iGreen < 256 && (iBlue = Color.blue(i10)) >= 0 && iBlue < 256;
    }
}
