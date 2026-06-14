package yads;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f114226a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayerDrawable f114227b;

    static {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        int i10 = n9.f113759b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i10, i10});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f114227b = layerDrawable;
    }
}
