package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes5.dex */
@VisibleForTesting
class AdContainer extends LinearLayout {
    View adView;
    int orientation;

    AdContainer(Context context) {
        super(context);
        setOrientation(1);
        this.orientation = AdRegistration.getContext().getResources().getConfiguration().orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.orientation == AdRegistration.getContext().getResources().getConfiguration().orientation) {
            View view = this.adView;
            if (view instanceof DTBAdView) {
                ((DTBAdView) view).onAdRemoved();
            }
            this.adView = null;
        }
        this.adView = null;
    }

    void setAdView(View view) {
        this.adView = view;
    }
}
