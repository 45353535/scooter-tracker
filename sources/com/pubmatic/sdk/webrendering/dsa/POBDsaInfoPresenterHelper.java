package com.pubmatic.sdk.webrendering.dsa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/webrendering/dsa/POBDsaInfoPresenterHelper;", "", "<init>", "()V", "Landroid/content/Context;", "mContext", "Lcom/pubmatic/sdk/common/base/POBAdDescriptor;", "mDescriptor", "", "webPageData", "", C4424m2.f43623v, "(Landroid/content/Context;Lcom/pubmatic/sdk/common/base/POBAdDescriptor;Ljava/lang/String;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "url", "data", "Lcom/pubmatic/sdk/common/view/POBWebView;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pubmatic/sdk/common/view/POBWebView;", "webrendering_release"}, k = 1, mv = {1, 7, 1})
public final class POBDsaInfoPresenterHelper {

    @NotNull
    public static final POBDsaInfoPresenterHelper INSTANCE = new POBDsaInfoPresenterHelper();

    private POBDsaInfoPresenterHelper() {
    }

    private final POBWebView a(Context context, String url, String data) {
        POBWebView pOBWebViewCreateInstance = POBWebView.createInstance(POBUtils.resolveWebViewContext(context));
        if (pOBWebViewCreateInstance != null) {
            WebSettings settings = pOBWebViewCreateInstance.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            pOBWebViewCreateInstance.loadDataWithBaseURL(url, data, "text/html", "UTF-8", null);
        }
        return pOBWebViewCreateInstance;
    }

    public static final void show(@NotNull final Context mContext, @Nullable POBAdDescriptor mDescriptor, @NotNull String webPageData) {
        String strEncodeToUTF8;
        String str;
        String strEncodeToUTF82;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(webPageData, "webPageData");
        if (mDescriptor != null) {
            strEncodeToUTF8 = "";
            if (mDescriptor.enableDsaInfoIcon()) {
                String strEncodeToUTF83 = POBDsaInfoPresenterHelperKt.encodeToUTF8(mDescriptor.getDisplayedOnBehalfOf());
                strEncodeToUTF82 = POBDsaInfoPresenterHelperKt.encodeToUTF8(mDescriptor.getPaidBy());
                List<POBDSATransparencyInfo> transparencyData = mDescriptor.getTransparencyData();
                POBLog.debug("POBDsaInfoUtil", "DSA Icon clicked: Advertiser: %s Paid By: %s Transparency: %s", strEncodeToUTF83, strEncodeToUTF82, transparencyData);
                strEncodeToUTF8 = transparencyData != null ? POBDsaInfoPresenterHelperKt.encodeToUTF8(POBDSATransparencyInfo.INSTANCE.getCombinedListOfParams(transparencyData)) : "";
                POBLog.debug("POBDsaInfoUtil", "Combined Params: %s", strEncodeToUTF8);
                str = strEncodeToUTF8;
                strEncodeToUTF8 = strEncodeToUTF83;
            } else {
                str = "";
                strEncodeToUTF82 = str;
            }
            a1 a1Var = a1.f93282a;
            String str2 = String.format("file:///android_asset/dsa_page.html?advertiser=%s&paidBy=%s&params=%s", Arrays.copyOf(new Object[]{strEncodeToUTF8, strEncodeToUTF82, str}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            final POBWebView pOBWebViewA = INSTANCE.a(mContext, str2, webPageData);
            final int iHashCode = pOBWebViewA != null ? pOBWebViewA.hashCode() : 0;
            if (pOBWebViewA != null) {
                POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(mContext, pOBWebViewA, false, true);
                pOBMraidViewContainer.setMraidViewContainerListener(new POBMraidViewContainerListener() { // from class: com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper.show.1
                    @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
                    public void onClose() {
                        POBFullScreenActivity.closeActivity(mContext, iHashCode);
                    }

                    @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
                    public void onForward() {
                    }
                });
                POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(iHashCode), new POBAdViewCacheService.AdViewConfig(pOBMraidViewContainer, new POBFullScreenActivityListener() { // from class: com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper.show.2
                    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
                    public void onCreate(@NotNull Activity context) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        pOBWebViewA.setBaseContext(context);
                    }

                    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
                    public void onDestroy() {
                        pOBWebViewA.setBaseContext(mContext);
                    }
                }));
                Intent intent = new Intent();
                intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, iHashCode);
                try {
                    POBFullScreenActivity.startActivity(mContext, intent);
                } catch (Exception e10) {
                    POBLog.error("POBDsaInfoUtil", "Error while starting full screen activity for DSA detail screen. Error: %s", e10.getMessage());
                }
            }
        }
    }
}
