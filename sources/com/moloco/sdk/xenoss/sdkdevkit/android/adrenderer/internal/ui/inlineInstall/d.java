package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.moloco.sdk.internal.MolocoLogger;
import com.taurusx.tax.g.f0;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57056b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57057c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f57058a = new Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean a(String bundleId) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return this.f57058a.g(bundleId);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public String b(String url) {
        String lowerCase;
        String lowerCase2;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String host = uri.getHost();
            if (host != null) {
                lowerCase2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (Intrinsics.areEqual(lowerCase, "market")) {
                return uri.getQueryParameter("id");
            }
            if (lowerCase2 == null || !StringsKt.g0(lowerCase2, f0.f66126w, false, 2, null)) {
                return null;
            }
            return uri.getQueryParameter("id");
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for bundle ID", e10, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public String d(String url) {
        String lowerCase;
        String lowerCase2;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            String host = uri.getHost();
            if (host != null) {
                lowerCase2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (Intrinsics.areEqual(lowerCase, "market")) {
                return uri.getQueryParameter(Constants.REFERRER);
            }
            if (lowerCase2 == null || !StringsKt.g0(lowerCase2, f0.f66126w, false, 2, null)) {
                return null;
            }
            return uri.getQueryParameter(Constants.REFERRER);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BundleExtractor", "Failed to parse URL for referrer", e10, false, 8, null);
            return null;
        }
    }
}
