package net.pubnative.lite.sdk.contentinfo;

import android.app.Activity;
import android.content.Context;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.URLValidator;
import net.pubnative.lite.sdk.utils.UrlHandler;

/* JADX INFO: loaded from: classes3.dex */
public class AdFeedbackView implements MRAIDViewListener, MRAIDNativeFeatureListener {
    private static final String TAG = "AdFeedbackView";
    private AdFeedbackData mAdFeedbackData;
    private boolean mIsReady = false;
    private AdFeedbackLoadListener mListener;
    private UrlHandler mUrlHandlerDelegate;
    private MRAIDInterstitial mViewContainer;

    public interface AdFeedbackLoadListener {
        void onFormClosed();

        void onLoad(String str);

        void onLoadFailed(Throwable th2);

        void onLoadFinished();
    }

    public static /* synthetic */ void a(AdFeedbackView adFeedbackView) {
        adFeedbackView.mViewContainer.showDefaultContentInfoURL(Ad.CONTENT_INFO_LINK_URL);
        adFeedbackView.mListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        this.mUrlHandlerDelegate.handleUrl(str, null, null);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onFormClosed();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        this.mIsReady = false;
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        new FeedbackJSInterface().submitData(this.mAdFeedbackData, mRAIDView);
        this.mIsReady = true;
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFinished();
            Logger.d(TAG, "Feedback form loaded");
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    public void prepare(Context context, String str, AdFeedbackLoadListener adFeedbackLoadListener) {
        prepare(context, str, null, null, null, adFeedbackLoadListener);
    }

    public void showFeedbackForm(Context context, String str) {
        if (context instanceof Activity) {
            showFeedbackForm((Activity) context, str);
            return;
        }
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK, "The feedback form requires an Activity context"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepare(android.content.Context r18, java.lang.String r19, net.pubnative.lite.sdk.models.Ad r20, java.lang.String r21, net.pubnative.lite.sdk.models.IntegrationType r22, net.pubnative.lite.sdk.contentinfo.AdFeedbackView.AdFeedbackLoadListener r23) {
        /*
            r17 = this;
            r7 = r17
            r1 = r22
            r10 = r23
            java.lang.String r0 = "apptoken"
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L4a
            android.net.Uri r2 = android.net.Uri.parse(r19)     // Catch: java.lang.RuntimeException -> L39
            if (r2 == 0) goto L4a
            java.lang.String r3 = r2.getQueryParameter(r0)     // Catch: java.lang.RuntimeException -> L39
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.RuntimeException -> L39
            if (r3 == 0) goto L4a
            java.lang.String r3 = "token_macro"
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch: java.lang.RuntimeException -> L39
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r3)     // Catch: java.lang.RuntimeException -> L39
            android.net.Uri r0 = r0.build()     // Catch: java.lang.RuntimeException -> L39
            java.lang.String r2 = r0.toString()     // Catch: java.lang.RuntimeException -> L39
            java.lang.String r0 = "[APPTOKEN]"
            java.lang.String r0 = r2.replace(r3, r0)     // Catch: java.lang.RuntimeException -> L37
            goto L4c
        L37:
            r0 = move-exception
            goto L3c
        L39:
            r0 = move-exception
            r2 = r19
        L3c:
            java.lang.String r3 = net.pubnative.lite.sdk.contentinfo.AdFeedbackView.TAG
            java.lang.String r4 = r0.getMessage()
            net.pubnative.lite.sdk.utils.Logger.e(r3, r4)
            net.pubnative.lite.sdk.HyBid.reportException(r0)
            r0 = r2
            goto L4c
        L4a:
            r0 = r19
        L4c:
            net.pubnative.lite.sdk.utils.UrlHandler r2 = new net.pubnative.lite.sdk.utils.UrlHandler
            r3 = r18
            r2.<init>(r3)
            r7.mUrlHandlerDelegate = r2
            net.pubnative.lite.sdk.contentinfo.AdFeedbackDataCollector r2 = new net.pubnative.lite.sdk.contentinfo.AdFeedbackDataCollector
            r2.<init>(r1)
            r4 = r20
            r5 = r21
            net.pubnative.lite.sdk.contentinfo.AdFeedbackData r1 = r2.collectData(r4, r5, r1)
            r7.mAdFeedbackData = r1
            net.pubnative.lite.sdk.contentinfo.FeedbackMacros r1 = new net.pubnative.lite.sdk.contentinfo.FeedbackMacros
            r1.<init>()
            net.pubnative.lite.sdk.contentinfo.AdFeedbackData r2 = r7.mAdFeedbackData
            java.lang.String r1 = r1.processUrl(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L77
            r2 = r1
            goto L78
        L77:
            r2 = r0
        L78:
            net.pubnative.lite.sdk.mraid.MRAIDInterstitial r0 = new net.pubnative.lite.sdk.mraid.MRAIDInterstitial
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r15 = "tel"
            java.lang.String r16 = "location"
            java.lang.String r11 = "calendar"
            java.lang.String r12 = "inlineVideo"
            java.lang.String r13 = "sms"
            java.lang.String r14 = "storePicture"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12, r13, r14, r15, r16}
            r3 = 0
            r9 = 0
            r5 = r4
            r8 = r17
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r7.mViewContainer = r0
            r0.markCreativeAdComingFromFeedbackForm()
            r7.mListener = r10
            r10.onLoad(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.contentinfo.AdFeedbackView.prepare(android.content.Context, java.lang.String, net.pubnative.lite.sdk.models.Ad, java.lang.String, net.pubnative.lite.sdk.models.IntegrationType, net.pubnative.lite.sdk.contentinfo.AdFeedbackView$AdFeedbackLoadListener):void");
    }

    public synchronized void showFeedbackForm(Activity activity, String str) {
        MRAIDInterstitial mRAIDInterstitial = this.mViewContainer;
        if (mRAIDInterstitial != null && mRAIDInterstitial.isLoaded() && this.mIsReady) {
            if (URLValidator.isValidURL(str)) {
                this.mViewContainer.show(activity, new MRAIDView.OnExpandCreativeFailListener() { // from class: net.pubnative.lite.sdk.contentinfo.c
                    @Override // net.pubnative.lite.sdk.mraid.MRAIDView.OnExpandCreativeFailListener
                    public final void onExpandFailed() {
                        AdFeedbackView.a(this.f95848a);
                    }
                }, str);
                return;
            }
            AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
            if (adFeedbackLoadListener != null) {
                adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
            }
        } else {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.mListener;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
            }
        }
    }
}
