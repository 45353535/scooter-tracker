package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4454nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f44461a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.nd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final View a(@NotNull Context context, @Nullable String str, @NotNull U8 imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return a(context);
            }
            Object objA = imageLoader.a(str);
            if (Result.i(objA)) {
                objA = null;
            }
            Drawable drawable = (Drawable) objA;
            if (drawable == null) {
                return a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }

        private a() {
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
            return gradientDrawable;
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }
    }
}
