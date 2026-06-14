package com.amazon.aps.ads.util.adview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.device.ads.DtbConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0007H\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSchemeHandler;", "", "webviewClientListener", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewClientListener;", "<init>", "(Lcom/amazon/aps/ads/util/adview/ApsAdWebViewClientListener;)V", "MSHOP_PKG_NAME", "", "MOBILE_SHOPPING_WEB_SCHEME", "MOBILE_SHOPPING_SCHEME", "MARKET_SCHEME", "AMAZON_SCHEME", "openUrl", "", "url", com.taurusx.tax.o.g.f66428y, "Landroid/net/Uri;", "handleMshopWeb", "handleMshopApp", "handleMarketAndAmazonScheme", "launchIntent", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsAdWebViewSchemeHandler {

    @NotNull
    private final String AMAZON_SCHEME;

    @NotNull
    private final String MARKET_SCHEME;

    @NotNull
    private final String MOBILE_SHOPPING_SCHEME;

    @NotNull
    private final String MOBILE_SHOPPING_WEB_SCHEME;

    @NotNull
    private final String MSHOP_PKG_NAME;

    @NotNull
    private final ApsAdWebViewClientListener webviewClientListener;

    public ApsAdWebViewSchemeHandler(@NotNull ApsAdWebViewClientListener webviewClientListener) {
        Intrinsics.checkNotNullParameter(webviewClientListener, "webviewClientListener");
        this.webviewClientListener = webviewClientListener;
        this.MSHOP_PKG_NAME = "com.amazon.mShop.android.shopping";
        this.MOBILE_SHOPPING_WEB_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_WEB_SCHEME;
        this.MOBILE_SHOPPING_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME;
        this.MARKET_SCHEME = "market";
        this.AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;
    }

    protected boolean handleMarketAndAmazonScheme(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                this.webviewClientListener.getAdViewContext().startActivity(intent);
                this.webviewClientListener.onAdLeftApplication();
                return true;
            } catch (ActivityNotFoundException unused) {
                ApsUtils.INSTANCE.directAppStoreLinkToBrowser(this.webviewClientListener.getAdViewContext(), uri);
                this.webviewClientListener.onAdLeftApplication();
                return true;
            }
        } catch (RuntimeException unused2) {
            ApsAdExtensionsKt.d(this, "App stores and browsers not found");
            return false;
        }
    }

    protected boolean handleMshopApp(@NotNull String url, @NotNull Uri uri) {
        int iV0;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (this.webviewClientListener.getAdViewContext().getPackageManager().getLaunchIntentForPackage(this.MSHOP_PKG_NAME) == null && (iV0 = StringsKt.v0(url, "products/", 0, false, 6, null)) > 0) {
            String strSubstring = url.substring(iV0 + 9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            intent.setData(Uri.parse("https://www.amazon.com/dp/" + strSubstring));
        }
        this.webviewClientListener.getAdViewContext().startActivity(intent);
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    protected boolean handleMshopWeb(@NotNull String url) {
        int i10;
        Intrinsics.checkNotNullParameter(url, "url");
        int iV0 = StringsKt.v0(url, "//", 0, false, 6, null);
        if (iV0 < 0 || (i10 = iV0 + 2) >= url.length()) {
            return false;
        }
        String strSubstring = url.substring(i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.webviewClientListener.getAdViewContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(DtbConstants.HTTPS + strSubstring)));
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    protected boolean launchIntent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.webviewClientListener.getAdViewContext().startActivity(intent);
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    public final boolean openUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = uri(url);
            if (uri == null || uri.getScheme() == null) {
                return false;
            }
            String scheme = uri.getScheme();
            if (Intrinsics.areEqual(scheme, this.MOBILE_SHOPPING_WEB_SCHEME)) {
                return handleMshopWeb(url);
            }
            if (Intrinsics.areEqual(scheme, this.MOBILE_SHOPPING_SCHEME)) {
                return handleMshopApp(url, uri);
            }
            if (!Intrinsics.areEqual(scheme, this.MARKET_SCHEME) && !Intrinsics.areEqual(scheme, this.AMAZON_SCHEME)) {
                return launchIntent(uri);
            }
            return handleMarketAndAmazonScheme(uri);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    protected Uri uri(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }
}
