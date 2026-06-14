package net.pubnative.lite.sdk.interstitial.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.window.OnBackInvokedCallback;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor;
import net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel;
import net.pubnative.lite.sdk.interstitial.viewModel.MraidInterstitialViewModel;
import net.pubnative.lite.sdk.interstitial.viewModel.VastInterstitialViewModel;
import net.pubnative.lite.sdk.receiver.VolumeChangedActionReceiver;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.views.CloseableContainer;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HyBidInterstitialActivity extends Activity implements InterstitialActivityInteractor {
    public static final String EXTRA_BROADCAST_ID = "extra_pn_broadcast_id";
    public static final String EXTRA_SKIP_OFFSET = "extra_pn_skip_offset";
    public static final String EXTRA_ZONE_ID = "extra_pn_zone_id";
    public static final String INTEGRATION_TYPE = "integration_type";
    private CloseableContainer mCloseableContainer;
    private OnBackInvokedCallback mOnBackInvokedCallback;
    private ProgressBar mProgressBar;
    protected InterstitialViewModel mViewModel;
    protected boolean mIsFinishing = false;
    private boolean isSuperBackPressedCalled = false;

    private PNAPIContentInfoView findContentInfoView(View view) {
        PNAPIContentInfoView pNAPIContentInfoViewFindContentInfoView;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof PNAPIContentInfoView) {
                return (PNAPIContentInfoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (pNAPIContentInfoViewFindContentInfoView = findContentInfoView(childAt)) != null) {
                return pNAPIContentInfoViewFindContentInfoView;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBackAction() {
        InterstitialViewModel interstitialViewModel = this.mViewModel;
        if (interstitialViewModel == null || !interstitialViewModel.isAdSkippable()) {
            return;
        }
        dismiss();
    }

    private void initializeViewModel() {
        Intent intent = getIntent();
        if (this instanceof VastInterstitialActivity) {
            this.mViewModel = new VastInterstitialViewModel(this, intent.getStringExtra("extra_pn_zone_id"), intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        } else {
            this.mViewModel = new MraidInterstitialViewModel(this, intent.getStringExtra("extra_pn_zone_id"), intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        }
    }

    private void initializeViews() {
        this.mCloseableContainer = new CloseableContainer(this);
        this.mProgressBar = new ProgressBar(this);
        this.mCloseableContainer.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    private void setupBackHandler() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mOnBackInvokedCallback = new OnBackInvokedCallback() { // from class: net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity.1
                public void onBackInvoked() {
                    HyBidInterstitialActivity.this.handleBackAction();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.mOnBackInvokedCallback);
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void addAdView(View view, FrameLayout.LayoutParams layoutParams) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer == null || view == null) {
            return;
        }
        closeableContainer.addView(view, layoutParams);
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void addContentInfoView(View view, FrameLayout.LayoutParams layoutParams) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setClosePosition(CloseableContainer.ClosePosition.TOP_LEFT);
            if (layoutParams != null) {
                this.mCloseableContainer.addView(view, layoutParams);
            } else {
                this.mCloseableContainer.addView(view);
            }
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void addProgressBarView(FrameLayout.LayoutParams layoutParams) {
        ProgressBar progressBar;
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer == null || (progressBar = this.mProgressBar) == null) {
            return;
        }
        closeableContainer.addView(progressBar, layoutParams);
    }

    protected void dismiss() {
        this.mViewModel.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mIsFinishing = true;
        this.mViewModel.resetVolumeChangeTracker();
        finish();
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void finishActivity() {
        this.mIsFinishing = true;
        InterstitialViewModel interstitialViewModel = this.mViewModel;
        if (interstitialViewModel != null) {
            interstitialViewModel.resetVolumeChangeTracker();
        }
        finish();
    }

    protected CloseableContainer getCloseableContainer() {
        return this.mCloseableContainer;
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void hideInterstitialCloseButton() {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setCloseVisible(false);
            this.mCloseableContainer.setOnCloseListener(null);
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void hideInterstitialSkipButton() {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setSkipVisible(false);
            this.mCloseableContainer.setOnSkipListener(null);
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void hideProgressBar() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @VisibleForTesting
    public boolean isSuperBackPressedCalled() {
        return this.isSuperBackPressedCalled;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        InterstitialViewModel interstitialViewModel = this.mViewModel;
        if (interstitialViewModel == null || !interstitialViewModel.isAdSkippable()) {
            return;
        }
        this.mViewModel.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mIsFinishing = true;
        this.mViewModel.resetVolumeChangeTracker();
        super.onBackPressed();
        this.isSuperBackPressedCalled = true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        getWindow().getDecorView().setSystemUiVisibility(1792);
        initializeViews();
        initializeViewModel();
        setupBackHandler();
        ViewUtils.applyWindowInsets(this.mCloseableContainer);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33 && this.mOnBackInvokedCallback != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.mOnBackInvokedCallback);
        }
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.removeAllViews();
        }
        VolumeObserver.getInstance().reset();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 33 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        handleBackAction();
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        VolumeChangedActionReceiver.getInstance().unregister(this);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        VolumeChangedActionReceiver.getInstance().register(this);
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void removeContentInfoView(View view) {
        PNAPIContentInfoView pNAPIContentInfoViewFindContentInfoView = findContentInfoView(view);
        if (pNAPIContentInfoViewFindContentInfoView != null) {
            pNAPIContentInfoViewFindContentInfoView.setVisibility(8);
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void setCloseSize(int i10) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setCloseSize(Integer.valueOf(i10));
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void setContentLayout() {
        setContentView(this.mCloseableContainer);
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void setSkipSize(int i10) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setSkipSize(Integer.valueOf(i10));
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void showInterstitialCloseButton(CloseableContainer.OnCloseListener onCloseListener) {
        if (this.mCloseableContainer == null || isFinishing()) {
            return;
        }
        this.mCloseableContainer.setCloseVisible(true);
        this.mCloseableContainer.setOnCloseListener(onCloseListener);
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void showInterstitialSkipButton(CloseableContainer.OnSkipListener onSkipListener) {
        if (this.mCloseableContainer == null || isFinishing()) {
            return;
        }
        this.mCloseableContainer.setSkipVisible(true);
        this.mCloseableContainer.setOnSkipListener(onSkipListener);
    }

    @Override // net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor
    public void showProgressBar() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }
}
