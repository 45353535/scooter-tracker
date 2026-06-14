package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.b1;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.sj2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ColorizedRatingView;", "Lyads/sj2;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setProgressDrawable", "(Landroid/graphics/drawable/Drawable;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class ColorizedRatingView extends sj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f59015a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    b1.a();
                    drawable2.setColorFilter(a1.a(-3355444, BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i11 = f59015a;
                if (i10 >= 29) {
                    b1.a();
                    drawable3.setColorFilter(a1.a(i11, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i10 < 29) {
                    drawable4.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                } else {
                    b1.a();
                    drawable4.setColorFilter(a1.a(i11, BlendMode.SRC_ATOP));
                }
            }
        }
    }
}
