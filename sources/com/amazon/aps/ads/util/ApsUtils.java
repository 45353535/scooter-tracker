package com.amazon.aps.ads.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.taurusx.tax.o.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/ads/util/ApsUtils;", "", "<init>", "()V", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "ApsUtils";

    @NotNull
    private static final String AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;

    @NotNull
    private static final String AMAZON_APP_STORE_LINK = ApsAdWebViewSupportClient.AMAZON_APP_STORE_LINK;

    @NotNull
    private static final String GOOGLE_PLAY_STORE_LINK = ApsAdWebViewSupportClient.GOOGLE_PLAY_STORE_LINK;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/amazon/aps/ads/util/ApsUtils$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "AMAZON_SCHEME", "getAMAZON_SCHEME", "AMAZON_APP_STORE_LINK", "getAMAZON_APP_STORE_LINK", "GOOGLE_PLAY_STORE_LINK", "getGOOGLE_PLAY_STORE_LINK", "setupMetrics", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "directAppStoreLinkToBrowser", g.f66428y, "Landroid/net/Uri;", "isNullOrEmpty", "", "s", "fireAAXImpressionPixel", "apsAd", "Lcom/amazon/aps/ads/ApsAd;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean fireAAXImpressionPixel$lambda$1(ApsAd apsAd) {
            return Boolean.valueOf(DtbCommonUtils.fireAAXImpressionCall(apsAd.getImpressionUrl()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fireAAXImpressionPixel$lambda$2(ApsAd apsAd, ApsResult apsResult, Boolean bool) {
            a1 a1Var = a1.f93282a;
            String str = String.format("%s_AAX_IMP_PXL", Arrays.copyOf(new Object[]{apsAd.getBidder()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            ApsMetrics.INSTANCE.customEvent(str, apsResult.toString(), null);
        }

        public final void directAppStoreLinkToBrowser(@NotNull Context context, @NotNull Uri uri) throws ActivityNotFoundException, NullPointerException {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (Intrinsics.areEqual(getAMAZON_SCHEME(), uri.getScheme())) {
                ApsLog.d(getTAG(), "Amazon app store unavailable in the device");
                str = getAMAZON_APP_STORE_LINK() + uri.getQuery();
            } else {
                ApsLog.d(getTAG(), "App store unavailable in the device");
                str = getGOOGLE_PLAY_STORE_LINK() + uri.getHost() + "?" + uri.getQuery();
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }

        public final void fireAAXImpressionPixel(@NotNull final ApsAd apsAd) {
            Intrinsics.checkNotNullParameter(apsAd, "apsAd");
            if (apsAd.bidderRenderingFlowEnabled()) {
                a1 a1Var = a1.f93282a;
                String str = String.format("Firing Impression for bidder : %s", Arrays.copyOf(new Object[]{apsAd.getBidder()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ApsLog.d(str);
                ApsAsyncUtil.getInstance().runAsyncAndCallback(new ApsAsyncUtil.ApsReturnRunnable() { // from class: v0.b
                    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
                    public final Object run() {
                        return ApsUtils.Companion.fireAAXImpressionPixel$lambda$1(apsAd);
                    }
                }, new ApsAsyncUtil.ApsExecutionListener() { // from class: v0.c
                    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsExecutionListener
                    public final void onExecutionCompleted(ApsResult apsResult, Object obj) {
                        ApsUtils.Companion.fireAAXImpressionPixel$lambda$2(apsAd, apsResult, (Boolean) obj);
                    }
                });
            }
        }

        @NotNull
        public final String getAMAZON_APP_STORE_LINK() {
            return ApsUtils.AMAZON_APP_STORE_LINK;
        }

        @NotNull
        public final String getAMAZON_SCHEME() {
            return ApsUtils.AMAZON_SCHEME;
        }

        @NotNull
        public final String getGOOGLE_PLAY_STORE_LINK() {
            return ApsUtils.GOOGLE_PLAY_STORE_LINK;
        }

        @NotNull
        public final String getTAG() {
            return ApsUtils.TAG;
        }

        public final boolean isNullOrEmpty(@Nullable String s10) {
            return StringsKt.O(s10, null, false, 2, null) || StringsKt.O(s10, "", false, 2, null);
        }

        public final void setupMetrics(@Nullable Context context) {
            if (context != null) {
                ApsMetrics.INSTANCE.init(context, new ApsMetricsDeviceInfo(DtbCommonUtils.getSDKFramework(), DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), "portrait"), DtbDeviceDataRetriever.isTablet() ? "tablet" : "phone", DtbDeviceData.getConnectionType(), null, 16, null), new ApsMetricsSdkInfo(Aps.getSdkVersion(), AdRegistration.getAppKey()));
            }
        }

        private Companion() {
        }
    }

    private ApsUtils() {
    }
}
