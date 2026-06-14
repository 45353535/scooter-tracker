package net.pubnative.lite.sdk.rewarded.activity;

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
import net.pubnative.lite.sdk.receiver.VolumeChangedActionReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor;
import net.pubnative.lite.sdk.rewarded.viewModel.MraidRewardedViewModel;
import net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel;
import net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.views.CloseableContainer;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HyBidRewardedActivity extends Activity implements RewardedActivityInteractor {
    public static final String EXTRA_BROADCAST_ID = "extra_pn_broadcast_id";
    public static final String EXTRA_SKIP_OFFSET = "extra_pn_skip_offset";
    public static final String EXTRA_ZONE_ID = "extra_pn_zone_id";
    public static final String INTEGRATION_TYPE = "integration_type";
    private CloseableContainer mCloseableContainer;
    protected HyBidActivityInteractor mInteractor;
    private OnBackInvokedCallback mOnBackInvokedCallback;
    private ProgressBar mProgressBar;
    protected RewardedViewModel mViewModel;
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
        RewardedViewModel rewardedViewModel = this.mViewModel;
        if (rewardedViewModel == null || !rewardedViewModel.isAdSkippable()) {
            return;
        }
        dismiss();
    }

    private void initializeViewModel() {
        Intent intent = getIntent();
        this.mInteractor = HyBidActivityInteractor.getInstance();
        if (this instanceof VastRewardedActivity) {
            this.mViewModel = new VastRewardedViewModel(this, intent.getStringExtra("extra_pn_zone_id"), intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        } else {
            this.mViewModel = new MraidRewardedViewModel(this, intent.getStringExtra("extra_pn_zone_id"), intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        }
        this.mInteractor.activityCreated();
    }

    private void initializeViews() {
        this.mCloseableContainer = new CloseableContainer(this);
        this.mProgressBar = new ProgressBar(this);
        this.mCloseableContainer.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    private void setupBackHandler() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mOnBackInvokedCallback = new OnBackInvokedCallback() { // from class: net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity.1
                public void onBackInvoked() {
                    HyBidRewardedActivity.this.handleBackAction();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.mOnBackInvokedCallback);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void addAdView(View view, FrameLayout.LayoutParams layoutParams) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer == null || view == null) {
            return;
        }
        closeableContainer.addView(view, layoutParams);
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
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

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void addProgressBarView(FrameLayout.LayoutParams layoutParams) {
        ProgressBar progressBar;
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer == null || (progressBar = this.mProgressBar) == null) {
            return;
        }
        closeableContainer.addView(progressBar, layoutParams);
    }

    protected void dismiss() {
        this.mViewModel.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mIsFinishing = true;
        this.mViewModel.resetVolumeChangeTracker();
        finish();
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void finishActivity() {
        this.mIsFinishing = true;
        RewardedViewModel rewardedViewModel = this.mViewModel;
        if (rewardedViewModel != null) {
            rewardedViewModel.resetVolumeChangeTracker();
        }
        finish();
    }

    protected CloseableContainer getCloseableContainer() {
        return this.mCloseableContainer;
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void hideProgressBar() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void hideRewardedCloseButton() {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setCloseVisible(false);
            this.mCloseableContainer.setOnCloseListener(null);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void hideRewardedSkipButton() {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setSkipVisible(false);
            this.mCloseableContainer.setOnSkipListener(null);
        }
    }

    @VisibleForTesting
    public boolean isSuperBackPressedCalled() {
        return this.isSuperBackPressedCalled;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        RewardedViewModel rewardedViewModel = this.mViewModel;
        if (rewardedViewModel == null || !rewardedViewModel.isAdSkippable()) {
            return;
        }
        this.mViewModel.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mIsFinishing = true;
        this.mViewModel.resetVolumeChangeTracker();
        super.onBackPressed();
        this.isSuperBackPressedCalled = true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
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

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void removeContentInfoView(View view) {
        PNAPIContentInfoView pNAPIContentInfoViewFindContentInfoView = findContentInfoView(view);
        if (pNAPIContentInfoViewFindContentInfoView != null) {
            pNAPIContentInfoViewFindContentInfoView.setVisibility(8);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void setCloseSize(int i10) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setCloseSize(Integer.valueOf(i10));
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void setContentLayout() {
        setContentView(this.mCloseableContainer);
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void setSkipSize(int i10) {
        CloseableContainer closeableContainer = this.mCloseableContainer;
        if (closeableContainer != null) {
            closeableContainer.setSkipSize(Integer.valueOf(i10));
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void showProgressBar() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void showRewardedCloseButton(CloseableContainer.OnCloseListener onCloseListener) {
        if (this.mCloseableContainer == null || isFinishing()) {
            return;
        }
        this.mCloseableContainer.setCloseVisible(true);
        this.mCloseableContainer.setOnCloseListener(onCloseListener);
    }

    @Override // net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor
    public void showRewardedSkipButton(CloseableContainer.OnSkipListener onSkipListener) {
        if (this.mCloseableContainer == null || isFinishing()) {
            return;
        }
        this.mCloseableContainer.setSkipVisible(true);
        this.mCloseableContainer.setOnSkipListener(onSkipListener);
    }
}
