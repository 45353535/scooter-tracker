package com.pubmatic.sdk.webrendering;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.GravityCompat;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
public class POBUIUtil {
    private static InsetDrawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R$color.pob_controls_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), resources.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(R$integer.pob_controls_alpha));
        return new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R$dimen.pob_control_padding));
    }

    public static void bringViewsToFront(@NonNull View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.bringToFront();
            }
        }
    }

    @NonNull
    public static ImageButton createAdInfoIconButton(@NonNull Context context, @IdRes int i10, @DrawableRes int i11, boolean z10, boolean z11) {
        FrameLayout.LayoutParams layoutParams;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_margin);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i10);
        Resources resources = context.getResources();
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setBackgroundColor(0);
        imageButton.setImageResource(i11);
        imageButton.setPadding(0, 0, 0, 0);
        if (z10) {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_ad_info_icon_width_full_screen), resources.getDimensionPixelOffset(R$dimen.pob_ad_info_icon_height_full_screen));
            layoutParams.leftMargin = dimensionPixelOffset;
            if (z11) {
                layoutParams.bottomMargin = dimensionPixelOffset;
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = dimensionPixelOffset;
                layoutParams.gravity = 8388659;
            }
        } else {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_ad_info_icon_width), resources.getDimensionPixelOffset(R$dimen.pob_ad_info_icon_height));
            layoutParams.setMargins(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            layoutParams.gravity = GravityCompat.START;
        }
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static ImageButton createSkipButton(@NonNull Context context, @IdRes int i10, @DrawableRes int i11) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i10);
        Resources resources = context.getResources();
        imageButton.setBackground(a(context));
        imageButton.setPadding(0, 0, 0, 0);
        imageButton.setImageResource(i11);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_control_width), resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_close_button_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R$dimen.pob_close_button_top_margin);
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static TextView createSkipDurationTextView(@NonNull Context context, int i10) {
        TextView textViewCreateTextView = createTextView(context, "", context.getResources().getDimensionPixelOffset(R$dimen.pob_text_size), i10);
        textViewCreateTextView.setBackground(a(context));
        textViewCreateTextView.setPadding(0, 0, 0, 0);
        return textViewCreateTextView;
    }

    @NonNull
    public static TextView createTextView(@NonNull Context context, @Nullable String str, float f10, int i10) {
        TextView textView = new TextView(context);
        textView.setAllCaps(false);
        textView.setGravity(17);
        textView.setTextColor(context.getResources().getColor(R.color.white));
        textView.setTextSize(0, f10);
        textView.setTextAlignment(4);
        textView.setText(str);
        try {
            textView.setTypeface(Typeface.SANS_SERIF, 1);
        } catch (Exception unused) {
            POBLog.warn("POBUIUtil", "SANS_SERIF font not found!", new Object[0]);
        }
        textView.setId(i10);
        return textView;
    }

    @Nullable
    public static ImageView createWatermarkView(@NonNull Context context, @NonNull String str) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.pob_watermark);
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
            imageView.setElevation(Float.MAX_VALUE);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            return imageView;
        } catch (IllegalArgumentException e10) {
            POBLog.error("POBUIUtil", "Invalid Base64 encoded string encountered while creating watermark view", e10.getMessage());
            return null;
        }
    }

    @NonNull
    public static FrameLayout.LayoutParams getLayoutParamsForTopRightPosition(@NonNull Context context) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_control_width), resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_skip_control_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R$dimen.pob_skip_control_top_margin);
        return layoutParams;
    }

    @NonNull
    public static String getLocalizedStringForKey(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
        if (identifier != 0) {
            String string = resources.getString(identifier);
            if (!string.isEmpty()) {
                return string;
            }
        }
        return str2;
    }

    public static void resizeAdInfoIconBtn(@NonNull Context context, @NonNull ImageButton imageButton, boolean z10) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_margin);
        FrameLayout.LayoutParams layoutParams = imageButton.getLayoutParams() != null ? (FrameLayout.LayoutParams) imageButton.getLayoutParams() : new FrameLayout.LayoutParams(-2, -2);
        imageButton.setPadding(0, 0, 0, 0);
        if (z10) {
            layoutParams.height = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_height_full_screen);
            layoutParams.width = context.getResources().getDimensionPixelOffset(R$dimen.pob_ad_info_icon_width_full_screen);
            layoutParams.leftMargin = dimensionPixelOffset;
            layoutParams.bottomMargin = dimensionPixelOffset;
            layoutParams.gravity = 80;
        } else {
            Resources resources = context.getResources();
            int i10 = R$dimen.pob_ad_info_icon_height;
            layoutParams.height = resources.getDimensionPixelOffset(i10);
            layoutParams.width = context.getResources().getDimensionPixelOffset(i10);
            layoutParams.leftMargin = dimensionPixelOffset2;
            layoutParams.topMargin = dimensionPixelOffset2;
            layoutParams.gravity = GravityCompat.START;
        }
        imageButton.setLayoutParams(layoutParams);
    }

    public static void updateSkipBtnColor(@NonNull Context context, @NonNull ImageView imageView, @ColorRes int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R$color.pob_skip_button_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), resources.getColor(i10));
        imageView.setBackground(new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R$dimen.pob_control_padding)));
    }

    public static void updateSkipButtonToCloseButton(@NonNull ImageButton imageButton) {
        imageButton.setImageResource(R$drawable.pob_ic_close_black_24dp);
        imageButton.setId(com.pubmatic.sdk.common.R$id.pob_close_btn);
    }
}
