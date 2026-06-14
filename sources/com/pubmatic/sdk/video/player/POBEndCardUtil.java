package com.pubmatic.sdk.video.player;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.utility.POBUtils;

/* JADX INFO: loaded from: classes11.dex */
public class POBEndCardUtil {
    public static void updateEndCardView(@NonNull View view, @NonNull View view2, @NonNull POBAdDescriptor pOBAdDescriptor) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(POBUtils.convertDpToPixel(pOBAdDescriptor.getContentWidth()), view2.getWidth()), Math.min(POBUtils.convertDpToPixel(pOBAdDescriptor.getContentHeight()), view2.getHeight()));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(view2.getResources().getColor(R.color.white));
    }
}
