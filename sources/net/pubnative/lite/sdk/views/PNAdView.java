package net.pubnative.lite.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.views.HyBidAdView;

/* JADX INFO: loaded from: classes3.dex */
public class PNAdView extends HyBidAdView {

    public interface Listener extends HyBidAdView.Listener {
    }

    public PNAdView(Context context) {
        super(context);
    }

    public PNAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PNAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public PNAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
