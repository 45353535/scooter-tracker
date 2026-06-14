package yads;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GradientDrawable f115720a;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f115720a = gradientDrawable;
        new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
