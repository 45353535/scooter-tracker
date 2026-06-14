package net.pubnative.lite.sdk.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import net.pubnative.lite.sdk.mraid.MRAIDView;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class MRAIDBanner extends MRAIDView {
    public MRAIDBanner(Context context, String str, String str2, Boolean bool, Boolean bool2, String[] strArr, MRAIDViewListener mRAIDViewListener, MRAIDNativeFeatureListener mRAIDNativeFeatureListener, ViewGroup viewGroup) {
        super(context, str, str2, bool, strArr, mRAIDViewListener, mRAIDNativeFeatureListener, viewGroup, false, bool2.booleanValue());
        WebView webView = this.webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
            addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        } else if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewError(this);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    @Deprecated
    protected void expand(String str, Boolean bool, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        int i10 = this.state;
        if (i10 == 1 || i10 == 3) {
            super.expand(str, bool, onExpandCreativeFailListener);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    protected void expandHelper(WebView webView) {
        this.state = 2;
        super.expandHelper(webView);
        fireStateChangeEvent();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    public boolean onBackPressed() {
        return this.state != 1 && super.onBackPressed();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    protected void onLayoutCompleted() {
        if (this.state == 0 && this.isPageFinished) {
            this.state = 1;
            fireStateChangeEvent();
            fireReadyEvent();
            setViewable(getVisibility());
        }
    }
}
