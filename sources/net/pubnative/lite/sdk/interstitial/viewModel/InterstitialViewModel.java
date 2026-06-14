package net.pubnative.lite.sdk.interstitial.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import java.util.List;
import net.pubnative.lite.sdk.BaseViewModel;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.contentinfo.AdFeedbackFormHelper;
import net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.ContentInfo;
import net.pubnative.lite.sdk.models.ContentInfoIconXPosition;
import net.pubnative.lite.sdk.models.ContentInfoIconYPosition;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.PositionX;
import net.pubnative.lite.sdk.models.PositionY;
import net.pubnative.lite.sdk.mraid.model.HTMLAd;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.URLValidator;
import net.pubnative.lite.sdk.utils.UrlHandler;
import net.pubnative.lite.sdk.views.CloseableContainer;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InterstitialViewModel extends BaseViewModel implements PNAPIContentInfoView.ContentInfoListener {
    private static final int REDUCED_CLOSE_BUTTON_SIZE = 20;
    private static final String TAG = "InterstitialViewModel";
    private final AdFeedbackFormHelper adFeedbackFormHelper;
    protected HTMLAd htmlAd;
    protected Ad mAd;
    protected AdTracker mAdEventTracker;
    protected AdTracker mAdTracker;
    private final HyBidInterstitialBroadcastSender mBroadcastSender;
    private View mContentInfoView;
    protected final Context mContext;
    protected AdTracker mCustomCTATracker;
    protected AdTracker mCustomEndcardTracker;
    protected IntegrationType mIntegrationType;
    protected final InterstitialActivityInteractor mListener;
    protected final int mSkipOffset;
    private final UrlHandler mUrlHandlerDelegate;
    protected final String mZoneId;
    public boolean isLinkClickRunning = false;
    protected boolean mIsFeedbackFormOpen = false;
    private boolean mIsFeedbackFormLoading = false;
    protected boolean mIsSkippable = false;
    protected final CloseableContainer.OnCloseListener mCloseListener = new CloseableContainer.OnCloseListener() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.a
        @Override // net.pubnative.lite.sdk.views.CloseableContainer.OnCloseListener
        public final void onClose() {
            this.f95859a.closeButtonClicked();
        }
    };
    protected final CloseableContainer.OnSkipListener mSkipListener = new CloseableContainer.OnSkipListener() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.b
        @Override // net.pubnative.lite.sdk.views.CloseableContainer.OnSkipListener
        public final void onSkip() {
            this.f95860a.skipButtonClicked();
        }
    };

    public InterstitialViewModel(Context context, String str, String str2, int i10, long j10, InterstitialActivityInteractor interstitialActivityInteractor) {
        this.mContext = context;
        this.mZoneId = str;
        this.mSkipOffset = i10;
        this.mListener = interstitialActivityInteractor;
        validateIntegrationType(str2);
        this.mBroadcastSender = new HyBidInterstitialBroadcastSender(context, j10);
        this.mUrlHandlerDelegate = new UrlHandler(context);
        this.adFeedbackFormHelper = new AdFeedbackFormHelper();
        fetchAd();
    }

    private void fetchAd() {
        if (this.mAd == null) {
            synchronized (this) {
                try {
                    if (HyBid.getAdCache() != null) {
                        this.mAd = HyBid.getAdCache().remove(this.mZoneId);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private View getContentInfo(Context context, ContentInfo contentInfo) {
        return contentInfo == null ? this.mAd.getContentInfoContainer(context, this) : this.mAd.getContentInfoContainer(context, contentInfo, this);
    }

    private void initTrackers() {
        if (this.mAd != null) {
            this.mAdTracker = new AdTracker(this.mAd.getBeacons("impression"), this.mAd.getBeacons("click"));
            this.mCustomEndcardTracker = new AdTracker(this.mAd.getBeacons("custom_endcard_impression"), this.mAd.getBeacons("custom_endcard_click"));
            this.mAdEventTracker = new AdTracker(null, null, null, this.mAd.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), this.mAd.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT));
            this.mCustomCTATracker = new AdTracker(this.mAd.getBeacons("custom_cta_show"), this.mAd.getBeacons("custom_cta_click"), false);
        }
    }

    private void validateIntegrationType(String str) {
        if (str == null) {
            this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
            return;
        }
        IntegrationType integrationType = IntegrationType.HEADER_BIDDING;
        if (str.equals(integrationType.getCode())) {
            this.mIntegrationType = integrationType;
            return;
        }
        IntegrationType integrationType2 = IntegrationType.MEDIATION;
        if (str.equals(integrationType2.getCode())) {
            this.mIntegrationType = integrationType2;
            return;
        }
        IntegrationType integrationType3 = IntegrationType.STANDALONE;
        if (str.equals(integrationType3.getCode())) {
            this.mIntegrationType = integrationType3;
        } else {
            this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        }
    }

    public abstract void closeButtonClicked();

    public abstract void destroyAd();

    protected void dismiss() {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mListener.finishActivity();
    }

    public abstract View getAdView();

    public ViewGroup getContentInfoContainer() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getContentInfoContainer(this.mContext, this);
        }
        return null;
    }

    public void handleURL(String str) {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            this.mUrlHandlerDelegate.handleUrl(str, ad2.getLink(), this.mAd.getNavigationMode());
        }
    }

    public abstract Boolean hasReducedCloseSize();

    public void hideContentInfo() {
        View view = this.mContentInfoView;
        if (view != null) {
            this.mListener.removeContentInfoView(view);
        }
    }

    public boolean isAdSkippable() {
        return this.mIsSkippable;
    }

    public boolean isFeedbackFormOpen() {
        return this.mIsFeedbackFormOpen;
    }

    public boolean isValidAdToRender() {
        return (TextUtils.isEmpty(this.mZoneId) || this.mBroadcastSender.getBroadcastId() == -1) ? false : true;
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                EventTracker.post(this.mContext, list.get(i10), null, false);
            }
        }
        invokeOnContentInfoClick(this.mIntegrationType, this.mAd, "fullscreen");
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public void onLinkClicked(String str) {
        if (this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        if (this.mIsFeedbackFormOpen || this.mIsFeedbackFormLoading) {
            return;
        }
        if (URLValidator.isValidURL(str)) {
            this.adFeedbackFormHelper.showFeedbackForm(this.mContext, str, this.mAd, "rewarded", IntegrationType.STANDALONE, new AdFeedbackLoadListener() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel.1
                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onFormClosed() {
                    InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
                    interstitialViewModel.isLinkClickRunning = false;
                    interstitialViewModel.mIsFeedbackFormOpen = false;
                    interstitialViewModel.mIsFeedbackFormLoading = false;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoad(String str2) {
                    InterstitialViewModel.this.mIsFeedbackFormLoading = true;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFailed(Throwable th2) {
                    InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
                    interstitialViewModel.isLinkClickRunning = false;
                    interstitialViewModel.mIsFeedbackFormLoading = false;
                    if (interstitialViewModel.mIsFeedbackFormOpen) {
                        interstitialViewModel.mIsFeedbackFormOpen = false;
                    }
                    Logger.e(InterstitialViewModel.TAG, th2.getMessage());
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFinished() {
                    InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
                    interstitialViewModel.isLinkClickRunning = false;
                    interstitialViewModel.mIsFeedbackFormLoading = false;
                    interstitialViewModel.mIsFeedbackFormOpen = true;
                }
            });
            return;
        }
        this.isLinkClickRunning = false;
        this.mIsFeedbackFormOpen = false;
        this.mIsFeedbackFormLoading = false;
        Logger.e(TAG, "Content Info URL is invalid");
    }

    public abstract void pauseAd();

    public void processInterstitialAd() {
        Ad ad2;
        FrameLayout contentInfoContainer;
        if (!isValidAdToRender()) {
            this.mListener.finishActivity();
            return;
        }
        View adView = getAdView();
        initTrackers();
        this.mListener.hideInterstitialCloseButton();
        this.mListener.hideInterstitialSkipButton();
        if (adView == null) {
            this.mListener.finishActivity();
            return;
        }
        if (hasReducedCloseSize().booleanValue()) {
            this.mListener.setCloseSize(20);
            this.mListener.setSkipSize(20);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.mListener.hideProgressBar();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.mListener.addProgressBarView(layoutParams2);
        this.mListener.addAdView(adView, layoutParams);
        if ((this instanceof VastInterstitialViewModel) || !shouldShowContentInfo() || (ad2 = this.mAd) == null || (contentInfoContainer = ad2.getContentInfoContainer(this.mContext, this)) == null) {
            return;
        }
        this.mListener.addContentInfoView(contentInfoContainer, null);
    }

    public abstract void resetVolumeChangeTracker();

    public abstract void resumeAd();

    public void sendBroadcast(HyBidInterstitialBroadcastReceiver.Action action) {
        HyBidInterstitialBroadcastSender hyBidInterstitialBroadcastSender = this.mBroadcastSender;
        if (hyBidInterstitialBroadcastSender != null) {
            hyBidInterstitialBroadcastSender.sendBroadcast(action);
        }
    }

    public void setupContentInfo(Icon icon) {
        if (this.mAd != null) {
            ContentInfo contentInfo = Utils.parseContentInfo(icon);
            View contentInfo2 = getContentInfo(this.mContext, contentInfo);
            this.mContentInfoView = contentInfo2;
            if (contentInfo2 != null) {
                if (contentInfo != null) {
                    int i10 = (this.mAd.getContentInfoIconXPosition() == null ? contentInfo.getPositionX() != PositionX.RIGHT : this.mAd.getContentInfoIconXPosition() != ContentInfoIconXPosition.RIGHT) ? GravityCompat.START : GravityCompat.END;
                    int i11 = (this.mAd.getContentInfoIconYPosition() == null ? contentInfo.getPositionY() != PositionY.BOTTOM : this.mAd.getContentInfoIconYPosition() != ContentInfoIconYPosition.BOTTOM) ? 48 : 80;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = i10 | i11;
                    this.mListener.addContentInfoView(this.mContentInfoView, layoutParams);
                } else {
                    this.mListener.addContentInfoView(contentInfo2, null);
                }
                if (contentInfo != null) {
                    postTrackerEvents(this.mContext, contentInfo.getViewTrackers());
                }
            }
        }
    }

    public abstract boolean shouldShowContentInfo();

    public abstract void skipButtonClicked();

    public void sendBroadcast(HyBidInterstitialBroadcastReceiver.Action action, Bundle bundle) {
        HyBidInterstitialBroadcastSender hyBidInterstitialBroadcastSender = this.mBroadcastSender;
        if (hyBidInterstitialBroadcastSender != null) {
            hyBidInterstitialBroadcastSender.sendBroadcast(action, bundle);
        }
    }
}
