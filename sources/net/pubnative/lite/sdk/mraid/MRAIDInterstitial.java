package net.pubnative.lite.sdk.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import net.pubnative.lite.sdk.mraid.MRAIDView;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class MRAIDInterstitial extends MRAIDView {
    private Boolean isCreatedByFeedbackForm;

    public MRAIDInterstitial(Context context, String str, String str2, Boolean bool, Boolean bool2, String[] strArr, MRAIDViewListener mRAIDViewListener, MRAIDNativeFeatureListener mRAIDNativeFeatureListener, ViewGroup viewGroup) {
        super(context, str, str2, bool, strArr, mRAIDViewListener, mRAIDNativeFeatureListener, viewGroup, true, bool2.booleanValue());
        this.isCreatedByFeedbackForm = Boolean.FALSE;
        this.webView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        addView(this.webView);
    }

    public static /* synthetic */ void t0(MRAIDInterstitial mRAIDInterstitial) {
        mRAIDInterstitial.fireStateChangeEvent();
        MRAIDViewListener mRAIDViewListener = mRAIDInterstitial.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewClose(mRAIDInterstitial);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    public void closeFromExpanded() {
        if (this.state == 1) {
            this.state = 4;
            clearView();
            this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.a
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDInterstitial.t0(this.f95918b);
                }
            });
        }
        super.closeFromExpanded();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    @Deprecated
    protected void expand(String str, Boolean bool, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        if (this.state != 0) {
            return;
        }
        super.expand(str, bool, onExpandCreativeFailListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    protected void expandHelper(WebView webView) {
        super.expandHelper(webView);
        this.isLaidOut = true;
        this.state = 1;
        fireStateChangeEvent();
    }

    public void hide() {
        close();
    }

    public void markCreativeAdComingFromFeedbackForm() {
        this.isCreatedByFeedbackForm = Boolean.TRUE;
    }

    public void show(Activity activity, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        showAsInterstitial(activity, this.isCreatedByFeedbackForm, onExpandCreativeFailListener);
    }

    public void showDefaultContentInfoURL(String str) {
        expandContentInfo(str);
    }

    public void show(Activity activity, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener, String str) {
        showAsInterstitial(activity, this.isCreatedByFeedbackForm, onExpandCreativeFailListener, str);
    }
}
