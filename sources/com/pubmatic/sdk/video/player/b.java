package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R$dimen;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$integer;

/* JADX INFO: loaded from: classes11.dex */
abstract class b {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f63148a;

        a(View view) {
            this.f63148a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63148a.setVisibility(4);
        }
    }

    public static FrameLayout.LayoutParams a(Context context, int i10, int i11, ImageButton imageButton, boolean z10) {
        int iA = a(context, imageButton, z10);
        int iB = b(context, imageButton, z10);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_min_height);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_max_height);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_min_width);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_max_width);
        int iConvertDpToPixel = POBUtils.convertDpToPixel(i11);
        int iConvertDpToPixel2 = POBUtils.convertDpToPixel(i10);
        int iMin = Math.min(dimensionPixelOffset2, Math.max(dimensionPixelOffset, iConvertDpToPixel));
        int iMin2 = Math.min(dimensionPixelOffset4, Math.max(dimensionPixelOffset3, iConvertDpToPixel2));
        POBLog.debug("POBVastPlayerUIUtil", "Rendered industry icon with size : %dx%d", Integer.valueOf(iMin2), Integer.valueOf(iMin));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin2, iMin);
        layoutParams.leftMargin = iA;
        layoutParams.topMargin = iB;
        return layoutParams;
    }

    private static int b(Context context, ImageButton imageButton, boolean z10) {
        return imageButton != null ? context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_top_margin) + (z10 ? context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_ad_info_icon_margin_fullscreen) : context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_ad_info_icon_margin)) : context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_bottom_margin);
    }

    static void b(View view, int i10) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(i10);
        }
    }

    private static int a(Context context, ImageButton imageButton, boolean z10) {
        int dimensionPixelOffset;
        if (z10) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_ad_info_icon_margin_fullscreen);
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_ad_info_icon_margin);
        }
        if (imageButton != null) {
            return context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_left_margin) + dimensionPixelOffset + imageButton.getLayoutParams().width;
        }
        return context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_left_margin);
    }

    static TextView a(Context context, int i10, String str, int i11) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_control_height));
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(R$dimen.pob_learn_more_bottom_margin);
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_learn_more_right_margin);
        TextView textViewCreateTextView = POBUIUtil.createTextView(context, str, resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_text_size), i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(resources.getDimensionPixelOffset(R$dimen.pob_learn_more_radius));
        gradientDrawable.setColor(i11);
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R$dimen.pob_control_stroke_width), resources.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(R$integer.pob_controls_alpha));
        textViewCreateTextView.setBackground(gradientDrawable);
        int i12 = layoutParams.rightMargin;
        textViewCreateTextView.setPadding(i12, 0, i12, 0);
        textViewCreateTextView.setMaxWidth(resources.getDimensionPixelOffset(R$dimen.pob_learn_more_width_max));
        textViewCreateTextView.setMaxLines(1);
        textViewCreateTextView.setEllipsize(TextUtils.TruncateAt.END);
        textViewCreateTextView.setLayoutParams(layoutParams);
        return textViewCreateTextView;
    }

    static void a(View view, int i10) {
        if (view.getVisibility() == 0) {
            long j10 = i10;
            view.animate().alpha(0.0f).setDuration(j10);
            new Handler().postDelayed(new a(view), j10);
        }
    }
}
