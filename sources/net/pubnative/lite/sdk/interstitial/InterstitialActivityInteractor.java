package net.pubnative.lite.sdk.interstitial;

import android.view.View;
import android.widget.FrameLayout;
import net.pubnative.lite.sdk.views.CloseableContainer;

/* JADX INFO: loaded from: classes3.dex */
public interface InterstitialActivityInteractor {
    void addAdView(View view, FrameLayout.LayoutParams layoutParams);

    void addContentInfoView(View view, FrameLayout.LayoutParams layoutParams);

    void addProgressBarView(FrameLayout.LayoutParams layoutParams);

    void finishActivity();

    void hideInterstitialCloseButton();

    void hideInterstitialSkipButton();

    void hideProgressBar();

    void removeContentInfoView(View view);

    void setCloseSize(int i10);

    void setContentLayout();

    void setSkipSize(int i10);

    void showInterstitialCloseButton(CloseableContainer.OnCloseListener onCloseListener);

    void showInterstitialSkipButton(CloseableContainer.OnSkipListener onSkipListener);

    void showProgressBar();
}
