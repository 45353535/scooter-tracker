package net.pubnative.lite.sdk.contentinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class AdFeedbackFormHelper extends ResultReceiver {
    private static final String TAG = "AdFeedbackFormHelper";
    private AdFeedbackLoadListener mListener;

    enum FeedbackFormAction {
        OPEN(1),
        ERROR(-1),
        CLOSE(0);

        final int code;

        FeedbackFormAction(int i10) {
            this.code = i10;
        }
    }

    public AdFeedbackFormHelper() {
        super(null);
    }

    private void handleResult(int i10, Bundle bundle) {
        AdFeedbackLoadListener adFeedbackLoadListener;
        if (i10 == FeedbackFormAction.OPEN.code) {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.mListener;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoad("");
                return;
            }
            return;
        }
        if (i10 == FeedbackFormAction.CLOSE.code) {
            AdFeedbackLoadListener adFeedbackLoadListener3 = this.mListener;
            if (adFeedbackLoadListener3 != null) {
                adFeedbackLoadListener3.onFormClosed();
                return;
            }
            return;
        }
        if (i10 != FeedbackFormAction.ERROR.code || (adFeedbackLoadListener = this.mListener) == null) {
            return;
        }
        adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
    }

    private String parseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null || !TextUtils.isEmpty(uri.getQueryParameter("apptoken"))) {
                return null;
            }
            return uri.buildUpon().appendQueryParameter("apptoken", "token_macro").build().toString().replace("token_macro", FeedbackMacros.MACRO_APP_TOKEN);
        } catch (RuntimeException e10) {
            Logger.e(TAG, e10.getMessage());
            HyBid.reportException((Exception) e10);
            return null;
        }
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i10, Bundle bundle) {
        super.onReceiveResult(i10, bundle);
        handleResult(i10, bundle);
    }

    public void showFeedbackForm(Context context, String str, Ad ad2, String str2, IntegrationType integrationType) {
        showFeedbackForm(context, str, ad2, str2, integrationType, null);
    }

    public synchronized void showFeedbackForm(Context context, String str, Ad ad2, String str2, IntegrationType integrationType, AdFeedbackLoadListener adFeedbackLoadListener) {
        this.mListener = adFeedbackLoadListener;
        String url = parseUrl(str);
        if (url == null) {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.mListener;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
            }
        } else {
            AdFeedbackData adFeedbackDataCollectData = new AdFeedbackDataCollector(integrationType).collectData(ad2, str2, integrationType);
            String strProcessUrl = new FeedbackMacros().processUrl(url, adFeedbackDataCollectData);
            try {
                Intent intent = new Intent(context, (Class<?>) AdFeedbackActivity.class);
                intent.addFlags(268435456);
                intent.putExtra(AdFeedbackActivity.EXTRA_FEEDBACK_FORM_URL, strProcessUrl);
                intent.putExtra(AdFeedbackActivity.EXTRA_FEEDBACK_FORM_CALLBACK, this);
                intent.putExtra(AdFeedbackActivity.EXTRA_FEEDBACK_FORM_DATA, adFeedbackDataCollectData);
                intent.addFlags(65536);
                context.startActivity(intent);
            } catch (Exception unused) {
                AdFeedbackLoadListener adFeedbackLoadListener3 = this.mListener;
                if (adFeedbackLoadListener3 != null) {
                    adFeedbackLoadListener3.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK, "The feedback form requires an Activity context"));
                }
            }
        }
    }
}
