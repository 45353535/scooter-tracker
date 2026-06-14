package yads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.R$styleable;

/* JADX INFO: loaded from: classes4.dex */
public final class h10 {
    public static g10 a(Context context, View view, AttributeSet attributeSet, int i10) {
        float dimensionPixelSize;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalRoundImageView, i10, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0.0f;
        }
        float f10 = dimensionPixelSize;
        return new g10(view, f10, f10, f10, f10);
    }
}
