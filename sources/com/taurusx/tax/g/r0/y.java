package com.taurusx.tax.g.r0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.g.c0;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.g.r0.s;
import com.taurusx.tax.log.LogUtil;
import java.net.URISyntaxException;
import java.util.List;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class y {
    public static final y FOLLOW_DEEP_LINK;
    public static final y FOLLOW_DEEP_LINK_WITH_FALLBACK;
    public static final y HANDLE_PHONE_SCHEME;
    public static final y HANDLE_SHARE_TWEET;
    public static final y HANDLE_TAX_SCHEME;
    public static final y IGNORE_ABOUT_SCHEME;
    public static final y NOOP;
    public static final y OPEN_APP_MARKET;
    public static final y OPEN_IN_APP_BROWSER;
    public static final y OPEN_NATIVE_BROWSER;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y[] f66348w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f66349z;

    public enum w extends y {
        public w(String str, int i10, boolean z10) {
            super(str, i10, z10, null);
        }

        @Override // com.taurusx.tax.g.r0.y
        public boolean shouldTryHandlingUrl(Uri uri) {
            return FirebaseAnalytics.Param.TAX.equalsIgnoreCase(uri.getScheme());
        }

        @Override // com.taurusx.tax.g.r0.y
        public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
            String host = uri.getHost();
            s.InterfaceC0805s interfaceC0805sO = sVar.o();
            if ("finishLoad".equalsIgnoreCase(host)) {
                interfaceC0805sO.w();
                return;
            }
            if ("close".equalsIgnoreCase(host)) {
                interfaceC0805sO.y();
            } else {
                if ("failLoad".equalsIgnoreCase(host)) {
                    interfaceC0805sO.z();
                    return;
                }
                throw new c0("Could not handle Taurusx Scheme url: " + uri);
            }
        }
    }

    static {
        boolean z10 = false;
        w wVar = new w("HANDLE_TAX_SCHEME", 0, false);
        HANDLE_TAX_SCHEME = wVar;
        y yVar = new y("IGNORE_ABOUT_SCHEME", 1, z10) { // from class: com.taurusx.tax.g.r0.y.y
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                return "about".equalsIgnoreCase(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                LogUtil.d("taurusx", "Link to about page ignored.");
            }
        };
        IGNORE_ABOUT_SCHEME = yVar;
        y yVar2 = new y("HANDLE_PHONE_SCHEME", 2, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.c
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                return MRAIDNativeFeature.TEL.equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || MRAIDNativeFeature.SMS.equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || "geo".equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme);
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                com.taurusx.tax.g.r0.z.z(context, uri, "Could not handle intent with URI: " + uri + "\n\tIs this intent supported on your phone?");
            }
        };
        HANDLE_PHONE_SCHEME = yVar2;
        y yVar3 = new y("OPEN_NATIVE_BROWSER", 3, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.o
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                return "taxnativebrowser".equalsIgnoreCase(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                String str2 = "Unable to load tax native browser url: " + uri;
                try {
                    com.taurusx.tax.g.r0.z.z(context, com.taurusx.tax.g.r0.z.z(uri), str2);
                } catch (Exception e10) {
                    throw new c0(str2 + "\n\t" + e10.getMessage());
                }
            }
        };
        OPEN_NATIVE_BROWSER = yVar3;
        y yVar4 = new y("OPEN_APP_MARKET", 4, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.s
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                String host = uri.getHost();
                return f0.f66126w.equalsIgnoreCase(host) || f0.f66128z.equalsIgnoreCase(host) || "market".equalsIgnoreCase(scheme) || uri.toString().toLowerCase().startsWith("play.google.com/") || uri.toString().toLowerCase().startsWith("market.android.com/");
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                com.taurusx.tax.g.r0.z.z(context, uri);
            }
        };
        OPEN_APP_MARKET = yVar4;
        y yVar5 = new y("OPEN_IN_APP_BROWSER", 5, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.a
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                if (sVar.s()) {
                    return;
                }
                com.taurusx.tax.g.r0.z.w(context, uri, str);
            }
        };
        OPEN_IN_APP_BROWSER = yVar5;
        y yVar6 = new y("HANDLE_SHARE_TWEET", 6, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.n
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                r.z(uri);
                return "taxshare".equalsIgnoreCase(uri.getScheme()) && "tweet".equalsIgnoreCase(uri.getHost());
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                r.z(context);
                r.z(uri);
                String str2 = "Could not handle share tweet intent with URI " + uri;
                try {
                    com.taurusx.tax.g.r0.z.z(context, Intent.createChooser(com.taurusx.tax.g.r0.z.w(uri), "Share via"), str2);
                } catch (Exception e10) {
                    throw new c0(str2 + "\n\t" + e10.getMessage());
                }
            }
        };
        HANDLE_SHARE_TWEET = yVar6;
        y yVar7 = new y("FOLLOW_DEEP_LINK_WITH_FALLBACK", 7, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.t
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                return "deeplink+".equalsIgnoreCase(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                if (!"navigate".equalsIgnoreCase(uri.getHost())) {
                    throw new c0("Deeplink+ URL did not have 'navigate' as the host.");
                }
                try {
                    String queryParameter = uri.getQueryParameter("primaryUrl");
                    uri.getQueryParameters("primaryTrackingUrl");
                    String queryParameter2 = uri.getQueryParameter("fallbackUrl");
                    List<String> queryParameters = uri.getQueryParameters("fallbackTrackingUrl");
                    if (queryParameter == null) {
                        throw new c0("Deeplink+ did not have 'primaryUrl' query param.");
                    }
                    Uri uri2 = Uri.parse(queryParameter);
                    if (shouldTryHandlingUrl(uri2)) {
                        throw new c0("Deeplink+ had another Deeplink+ as the 'primaryUrl'.");
                    }
                    try {
                        com.taurusx.tax.g.r0.z.z(context, uri2);
                    } catch (c0 unused) {
                        if (queryParameter2 == null) {
                            throw new c0("Unable to handle 'primaryUrl' for Deeplink+ and 'fallbackUrl' was missing.");
                        }
                        if (shouldTryHandlingUrl(Uri.parse(queryParameter2))) {
                            throw new c0("Deeplink+ URL had another Deeplink+ URL as the 'fallbackUrl'.");
                        }
                        sVar.w(context, queryParameter2, true, queryParameters);
                    }
                } catch (UnsupportedOperationException unused2) {
                    throw new c0("Deeplink+ URL was not a hierarchical URI.");
                }
            }
        };
        FOLLOW_DEEP_LINK_WITH_FALLBACK = yVar7;
        y yVar8 = new y("FOLLOW_DEEP_LINK", 8, true ? 1 : 0) { // from class: com.taurusx.tax.g.r0.y.g
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                return !TextUtils.isEmpty(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
                if (!com.taurusx.tax.g.n.f66171o.equalsIgnoreCase(uri.getScheme())) {
                    com.taurusx.tax.g.r0.z.z(context, uri);
                    return;
                }
                try {
                    Intent uri2 = Intent.parseUri(uri.toString(), 1);
                    uri2.addCategory("android.intent.category.BROWSABLE");
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    com.taurusx.tax.g.r0.z.w(context, uri2);
                } catch (URISyntaxException unused) {
                    throw new c0("Intent uri had invalid syntax: " + uri.toString());
                }
            }
        };
        FOLLOW_DEEP_LINK = yVar8;
        y yVar9 = new y("NOOP", 9, z10) { // from class: com.taurusx.tax.g.r0.y.z
            {
                w wVar2 = null;
            }

            @Override // com.taurusx.tax.g.r0.y
            public boolean shouldTryHandlingUrl(Uri uri) {
                return false;
            }

            @Override // com.taurusx.tax.g.r0.y
            public void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0 {
            }
        };
        NOOP = yVar9;
        f66348w = new y[]{wVar, yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9};
    }

    public /* synthetic */ y(String str, int i10, boolean z10, w wVar) {
        this(str, i10, z10);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f66348w.clone();
    }

    public void handleUrl(com.taurusx.tax.g.r0.s sVar, Context context, Uri uri, boolean z10, String str) throws c0 {
        LogUtil.d("taurusx", "Ad event URL: " + uri);
        if (this.f66349z && !z10) {
            throw new c0("Attempted to handle action without user interaction.");
        }
        z(context, uri, sVar, str);
    }

    public abstract boolean shouldTryHandlingUrl(Uri uri);

    public abstract void z(Context context, Uri uri, com.taurusx.tax.g.r0.s sVar, String str) throws c0;

    public y(String str, int i10, boolean z10) {
        this.f66349z = z10;
    }
}
