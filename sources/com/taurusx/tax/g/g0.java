package com.taurusx.tax.g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class g0 {
    public static final g0 FOLLOW_DEEP_LINK;
    public static final g0 FOLLOW_DEEP_LINK_WITH_FALLBACK;
    public static final g0 HANDLE_PHONE_SCHEME;
    public static final g0 NOOP;
    public static final g0 OPEN_APP_MARKET;
    public static final g0 OPEN_NATIVE_BROWSER;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g0[] f66129z;

    public enum z extends g0 {
        public z(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.taurusx.tax.g.g0
        public boolean shouldTryHandlingUrl(Uri uri) {
            String scheme = uri.getScheme();
            return MRAIDNativeFeature.TEL.equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || MRAIDNativeFeature.SMS.equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || "geo".equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme);
        }

        @Override // com.taurusx.tax.g.g0
        public void z(Context context, Uri uri, i0 i0Var) {
            try {
                com.taurusx.tax.g.r0.z.z(context, uri, "Could not handle intent with URI: " + uri + "\n\tIs this intent supported on your phone?");
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    static {
        z zVar = new z("HANDLE_PHONE_SCHEME", 0);
        HANDLE_PHONE_SCHEME = zVar;
        g0 g0Var = new g0("OPEN_NATIVE_BROWSER", 1) { // from class: com.taurusx.tax.g.g0.w
            {
                z zVar2 = null;
            }

            @Override // com.taurusx.tax.g.g0
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
            }

            @Override // com.taurusx.tax.g.g0
            public void z(Context context, Uri uri, i0 i0Var) {
                try {
                    com.taurusx.tax.g.r0.z.z(context, uri, "Could not handle intent with URI: " + uri + "\n\tIs this intent supported on your phone?");
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
        OPEN_NATIVE_BROWSER = g0Var;
        g0 g0Var2 = new g0("OPEN_APP_MARKET", 2) { // from class: com.taurusx.tax.g.g0.y
            {
                z zVar2 = null;
            }

            @Override // com.taurusx.tax.g.g0
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                String host = uri.getHost();
                return f0.f66126w.equalsIgnoreCase(host) || f0.f66128z.equalsIgnoreCase(host) || "market".equalsIgnoreCase(scheme) || uri.toString().toLowerCase().startsWith("play.google.com/") || uri.toString().toLowerCase().startsWith("market.android.com/");
            }

            @Override // com.taurusx.tax.g.g0
            public void z(Context context, Uri uri, i0 i0Var) {
                try {
                    com.taurusx.tax.g.r0.z.z(context, uri);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
        OPEN_APP_MARKET = g0Var2;
        g0 g0Var3 = new g0("FOLLOW_DEEP_LINK_WITH_FALLBACK", 3) { // from class: com.taurusx.tax.g.g0.c
            {
                z zVar2 = null;
            }

            @Override // com.taurusx.tax.g.g0
            public boolean shouldTryHandlingUrl(Uri uri) {
                return "deeplink+".equalsIgnoreCase(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.g0
            public void z(Context context, Uri uri, i0 i0Var) {
                if (!"navigate".equalsIgnoreCase(uri.getHost())) {
                    LogUtil.d("UriAction", "Deeplink+ URL did not have 'navigate' as the host.");
                    return;
                }
                try {
                    String queryParameter = uri.getQueryParameter("primaryUrl");
                    uri.getQueryParameters("primaryTrackingUrl");
                    String queryParameter2 = uri.getQueryParameter("fallbackUrl");
                    uri.getQueryParameters("fallbackTrackingUrl");
                    if (queryParameter == null) {
                        LogUtil.v("taurusx", "Deeplink+ did not have 'primaryUrl' query param.");
                        return;
                    }
                    Uri uri2 = Uri.parse(queryParameter);
                    if (shouldTryHandlingUrl(uri2)) {
                        LogUtil.v("taurusx", "Deeplink+ had another Deeplink+ as the 'primaryUrl'.");
                        return;
                    }
                    try {
                        com.taurusx.tax.g.r0.z.z(context, uri2);
                    } catch (Exception unused) {
                        if (queryParameter2 == null) {
                            LogUtil.v("taurusx", "Unable to handle 'primaryUrl' for Deeplink+ and 'fallbackUrl' was missing.");
                        } else if (shouldTryHandlingUrl(Uri.parse(queryParameter2))) {
                            LogUtil.v("taurusx", "Deeplink+ URL had another Deeplink URL as the 'fallbackUrl'.");
                        } else {
                            i0Var.z(context, queryParameter2);
                        }
                    }
                } catch (Exception unused2) {
                    LogUtil.v("taurusx", "Deeplink+ URL was not a hierarchical URI.");
                }
            }
        };
        FOLLOW_DEEP_LINK_WITH_FALLBACK = g0Var3;
        g0 g0Var4 = new g0("FOLLOW_DEEP_LINK", 4) { // from class: com.taurusx.tax.g.g0.o
            {
                z zVar2 = null;
            }

            @Override // com.taurusx.tax.g.g0
            public boolean shouldTryHandlingUrl(Uri uri) {
                return !TextUtils.isEmpty(uri.getScheme());
            }

            @Override // com.taurusx.tax.g.g0
            public void z(Context context, Uri uri, i0 i0Var) {
                if (!n.f66171o.equalsIgnoreCase(uri.getScheme())) {
                    try {
                        com.taurusx.tax.g.r0.z.z(context, uri);
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    try {
                        com.taurusx.tax.g.r0.z.w(context, Intent.parseUri(uri.toString(), 1));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        };
        FOLLOW_DEEP_LINK = g0Var4;
        g0 g0Var5 = new g0("NOOP", 5) { // from class: com.taurusx.tax.g.g0.s
            {
                z zVar2 = null;
            }

            @Override // com.taurusx.tax.g.g0
            public boolean shouldTryHandlingUrl(Uri uri) {
                return false;
            }

            @Override // com.taurusx.tax.g.g0
            public void z(Context context, Uri uri, i0 i0Var) {
            }
        };
        NOOP = g0Var5;
        f66129z = new g0[]{zVar, g0Var, g0Var2, g0Var3, g0Var4, g0Var5};
    }

    public /* synthetic */ g0(String str, int i10, z zVar) {
        this(str, i10);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f66129z.clone();
    }

    public void handleUrl(i0 i0Var, Context context, Uri uri) {
        LogUtil.v("taurusx", "Ad event URL: " + uri);
        z(context, uri, i0Var);
    }

    public abstract boolean shouldTryHandlingUrl(Uri uri);

    public abstract void z(Context context, Uri uri, i0 i0Var);

    public g0(String str, int i10) {
    }
}
