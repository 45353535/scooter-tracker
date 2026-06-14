package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.Ua;
import com.inmobi.media.ads.network.common.model.InlineParams;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Ua {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37834j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Va f37836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rh f37837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ma f37838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3911nh f37839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Za f37840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3878m9 f37841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f37842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37843i;

    public /* synthetic */ Ua(Context context, Va va2, C3758hd c3758hd, InterfaceC3911nh interfaceC3911nh, Za za2, InterfaceC3878m9 interfaceC3878m9, int i10) {
        this(context, va2, null, (i10 & 8) != 0 ? null : c3758hd, interfaceC3911nh, za2, interfaceC3878m9, null);
    }

    public static /* synthetic */ Ta a(Ua ua2, String str, String str2, String str3, Ya ya2, int i10) {
        if ((i10 & 8) != 0) {
            ya2 = null;
        }
        return ua2.a(str, str2, str3, ya2, (i10 & 16) == 0);
    }

    public final Ta b(String str, String str2, String str3, Ya ya2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).c("Ua", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ma ma2 = this.f37838d;
            if (ma2 != null) {
                ma2.a(str2, "Invalid URL", str);
            }
            InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m92).c("Ua", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Na.f37431e, ya2, (Integer) 8001);
            return new Ta(3, 8001);
        }
        if (ya2 != null) {
            ya2.f38042f = "EX_NATIVE";
        }
        if (AbstractC3849l5.a(str3, this.f37835a, this.f37839e, this.f37841g)) {
            a(Na.f37432f, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3878m9 interfaceC3878m93 = this.f37841g;
            if (interfaceC3878m93 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m93).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        int iA = AbstractC3849l5.a(this.f37835a, queryParameter, this.f37839e, str, this.f37841g);
        if (iA == 0 || iA == 1) {
            a(Na.f37432f, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3878m9 interfaceC3878m94 = this.f37841g;
            if (interfaceC3878m94 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m94).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        Ma ma3 = this.f37838d;
        if (ma3 != null) {
            ma3.a(str2, "Invalid URL", str);
        }
        InterfaceC3878m9 interfaceC3878m95 = this.f37841g;
        if (interfaceC3878m95 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m95).c("Ua", "InmobiNativeBrowser scheme url handling failed");
        }
        a(Na.f37433g, ya2, Integer.valueOf(iA));
        return new Ta(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, Ya ya2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ua", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, ya2);
        } catch (Exception e10) {
            Ma ma2 = this.f37838d;
            if (ma2 != null) {
                ma2.a(str2, "Unexpected error", "open");
            }
            Kb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
            if (interfaceC3878m92 == null) {
                return 9;
            }
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m92).b("Ua", "SDK encountered unexpected error in handling open() request from creative " + e10.getMessage());
            return 9;
        }
    }

    public final int d(String api, String str, String str2, Ya ya2) {
        String strA;
        Intrinsics.checkNotNullParameter(api, "api");
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).c("Ua", "processOpenCCTRequest - url - " + str2);
        }
        if (ya2 != null) {
            ya2.f38042f = "IN_NATIVE";
        }
        if (str2 == null || (StringsKt.a0(str2, "http", false, 2, null) && !URLUtil.isValidUrl(str2))) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m92).c("Ua", api + " called with invalid url (" + str2 + ")");
            }
            Ma ma2 = this.f37838d;
            if (ma2 != null) {
                ma2.a(str, "Invalid URL", api);
            }
            a(Na.f37431e, ya2, (Integer) 3);
            return 3;
        }
        String strA2 = AbstractC3725g5.a(this.f37835a);
        try {
            try {
                boolean z10 = this.f37836b.f37902c;
                if (strA2 != null && z10) {
                    R2 r22 = new R2(str2, null, this.f37835a, this.f37837c, this.f37839e, ya2, api);
                    C3673e5 c3673e5 = r22.f37631e;
                    Context context = r22.f37632f;
                    if (c3673e5.f38498a == null && context != null && (strA = AbstractC3725g5.a(context)) != null) {
                        C3622c5 c3622c5 = new C3622c5(c3673e5);
                        c3673e5.f38499b = c3622c5;
                        CustomTabsClient.bindCustomTabsService(context, strA, c3622c5);
                    }
                    InterfaceC3878m9 interfaceC3878m93 = this.f37841g;
                    if (interfaceC3878m93 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                        ((C3903n9) interfaceC3878m93).c("Ua", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3878m9 interfaceC3878m94 = this.f37841g;
                if (interfaceC3878m94 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m94).a("Ua", "ChromeCustomTab fallback to Embedded");
                }
                if (ya2 != null) {
                    ya2.f38042f = "IN_CUSTOM";
                }
                return a(str2, api, ya2);
            } catch (Exception unused) {
                int iA = AbstractC4146x3.a(this.f37835a, str2, this.f37839e, api);
                if (iA != 0 && iA != 1) {
                    return iA;
                }
                c(api, str, str2);
                if (ya2 != null) {
                    ya2.f38042f = "EX_NATIVE";
                }
                a(Na.f37432f, ya2, (Integer) null);
                return iA;
            }
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m95 = this.f37841g;
            if (interfaceC3878m95 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m95).a("Ua", "Exception occurred while opening External ", e10);
            }
            return 9;
        }
    }

    public final int e(String str, String str2, String str3, Ya ya2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ua", "In processOpenExternalNativeRequest");
        }
        int iA = AbstractC3849l5.a(this.f37835a, str3, this.f37839e, str, this.f37841g);
        if (iA != 0 && iA != 1) {
            return d(str, str2, str3, ya2);
        }
        if (ya2 != null) {
            ya2.f38042f = "EX_NATIVE";
        }
        a(Na.f37432f, ya2, (Integer) null);
        c(str, str2, str3);
        InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
        if (interfaceC3878m92 == null) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
        ((C3903n9) interfaceC3878m92).c("Ua", "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, Ya ya2) {
        String str4;
        String str5;
        String str6;
        Ya ya3;
        Ua ua2;
        String str7;
        String str8;
        String str9;
        Ya ya4;
        Ua ua3;
        String strEncode;
        try {
            try {
            } catch (ActivityNotFoundException e10) {
                e = e10;
                str7 = str;
                str8 = str2;
                str9 = str3;
                ya4 = ya2;
                ua3 = this;
            } catch (URISyntaxException e11) {
                e = e11;
                str4 = str;
                str5 = str2;
                str6 = str3;
                ya3 = ya2;
                ua2 = this;
            }
            try {
                int iA = AbstractC4146x3.a(this.f37835a, str2, this.f37839e, "openExternal");
                if (iA != 0 && iA != 1) {
                    a(Na.f37433g, ya2, Integer.valueOf(iA));
                    Ma ma2 = this.f37838d;
                    if (ma2 != null) {
                        try {
                            strEncode = URLEncoder.encode(str2, "UTF-8");
                            Intrinsics.checkNotNull(strEncode);
                        } catch (UnsupportedEncodingException unused) {
                            strEncode = str2;
                        }
                        ma2.a(str, "Cannot resolve URI (" + strEncode + ")", "openExternal");
                        return;
                    }
                    return;
                }
                a(Na.f37432f, ya2, (Integer) null);
                c("openExternal", str, str2);
            } catch (ActivityNotFoundException e12) {
                e = e12;
                ua3 = this;
                str7 = str;
                str8 = str2;
                str9 = str3;
                ya4 = ya2;
                a(ua3, str7, str8, str9, ya4, e);
            } catch (URISyntaxException e13) {
                e = e13;
                ua2 = this;
                str4 = str;
                str5 = str2;
                str6 = str3;
                ya3 = ya2;
                a(ua2, str4, str5, str6, ya3, e);
            }
        } catch (NullPointerException e14) {
            a(this, str, str2, str3, ya2, e14);
        } catch (Exception e15) {
            a(Na.f37433g, ya2, (Integer) 9);
            Ma ma3 = this.f37838d;
            if (ma3 != null) {
                ma3.a(str, "Unexpected error", "openExternal");
            }
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            Kb.a((byte) 1, "Ua", "Could not open URL SDK encountered an unexpected error");
            InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
            if (interfaceC3878m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m9).b("Ua", "SDK encountered unexpected error in handling openExternal() request from creative " + e15.getMessage());
            }
        }
    }

    public Ua(Context context, Va landingPageState, Rh rh2, Ma ma2, InterfaceC3911nh redirectionValidator, Za za2, InterfaceC3878m9 interfaceC3878m9, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingPageState, "landingPageState");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        this.f37835a = context;
        this.f37836b = landingPageState;
        this.f37837c = rh2;
        this.f37838d = ma2;
        this.f37839e = redirectionValidator;
        this.f37840f = za2;
        this.f37841g = interfaceC3878m9;
        this.f37842h = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.Ta a(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.inmobi.media.Ya r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ua.a(java.lang.String, java.lang.String, java.lang.String, com.inmobi.media.Ya, boolean):com.inmobi.media.Ta");
    }

    public final void c(String str, String str2, String str3) {
        Ma ma2 = this.f37838d;
        if (ma2 != null) {
            ma2.a();
        }
        Ma ma3 = this.f37838d;
        if (ma3 != null) {
            ma3.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).c("Ua", str + " called with invalid url (" + str3 + ")");
        }
        Ma ma2 = this.f37838d;
        if (ma2 != null) {
            ma2.a(str2, "Invalid URL", str);
        }
    }

    public final boolean a(String str, String str2, Ya ya2, P2 p22) {
        String strA;
        try {
            if (this.f37836b.f37903d && p22 != null) {
                String strA2 = AbstractC3725g5.a(this.f37835a);
                if (strA2 != null) {
                    try {
                        boolean zB = Ef.b(Ef.a(J5.g()));
                        Class cls = Integer.TYPE;
                        if (zB) {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", cls);
                        } else {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", cls);
                        }
                        R2 r22 = new R2(str2, p22, this.f37835a, this.f37837c, this.f37839e, ya2, str);
                        C3673e5 c3673e5 = r22.f37631e;
                        Context context = r22.f37632f;
                        if (c3673e5.f38498a == null && context != null && (strA = AbstractC3725g5.a(context)) != null) {
                            C3622c5 c3622c5 = new C3622c5(c3673e5);
                            c3673e5.f38499b = c3622c5;
                            CustomTabsClient.bindCustomTabsService(context, strA, c3622c5);
                        }
                        return true;
                    } catch (Error | Exception unused) {
                    }
                }
                InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
                if (interfaceC3878m9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m9).c("Ua", "Partial tabs not supported: packageName - " + strA2);
                }
            }
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m92).c("Ua", "Error while opening partial tab: " + e10.getMessage());
            }
        }
        return false;
    }

    public final int a(String api, String str, String str2, Ya ya2, P2 p22) {
        Intrinsics.checkNotNullParameter(api, "api");
        if (str2 != null && str2.length() != 0) {
            Uri uri = Uri.parse(str2);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (Intrinsics.areEqual(uri.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, ya2);
                    return 2;
                }
                if (Intrinsics.areEqual(uri.getScheme(), "inmobideeplink")) {
                    return a(api, str, str2, ya2).f37760a == 1 ? 2 : 4;
                }
                if (F1.a(this.f37835a, str2, this.f37839e, api, this.f37841g) | AbstractC3849l5.a(str2, this.f37835a, this.f37839e, this.f37841g)) {
                    c(api, str, str2);
                    if (ya2 != null) {
                        ya2.f38042f = "EX_NATIVE";
                    }
                    a(Na.f37432f, ya2, (Integer) null);
                    return 2;
                }
                Intrinsics.checkNotNull(uri);
                if (AbstractC4146x3.a(uri) && a(api, str2, ya2, p22)) {
                    return 5;
                }
                if (AbstractC4146x3.a(uri)) {
                    return 3;
                }
                int iA = AbstractC3849l5.a(this.f37835a, str2, this.f37839e, api, this.f37841g);
                if (ya2 != null) {
                    ya2.f38042f = "EX_NATIVE";
                }
                if (iA != 0 && iA != 1) {
                    InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
                    if (interfaceC3878m9 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                        ((C3903n9) interfaceC3878m9).b("Ua", "CustomExpand handling failed");
                    }
                    a(Na.f37436j, ya2, (Integer) null);
                    return 4;
                }
                c(api, str, str2);
                a(Na.f37432f, ya2, (Integer) null);
                InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
                if (interfaceC3878m92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m92).c("Ua", "Deeplink url handled successfully");
                }
                return 2;
            }
            b(api, str, str2);
            a(Na.f37431e, ya2, (Integer) 4);
            return 1;
        }
        b(api, str, str2);
        a(Na.f37431e, ya2, (Integer) 2);
        return 1;
    }

    public final Ta a(String str, String str2, String str3, Ya ya2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ua", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (ya2 != null) {
                ya2.f38042f = "EX_NATIVE";
            }
            if (iA2 != 0 && iA2 != 1) {
                Ma ma2 = this.f37838d;
                if (ma2 != null) {
                    ma2.a(str2, "Invalid URL", str);
                }
                InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
                if (interfaceC3878m92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m92).c("Ua", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Na.f37433g, ya2, Integer.valueOf(iA2));
                return new Ta(2, Integer.valueOf(iA2));
            }
            InterfaceC3878m9 interfaceC3878m93 = this.f37841g;
            if (interfaceC3878m93 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m93).c("Ua", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Na.f37432f, ya2, (Integer) null);
            c(str, str2, str3);
            return new Ta(1);
        }
        InterfaceC3878m9 interfaceC3878m94 = this.f37841g;
        if (interfaceC3878m94 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m94).c("Ua", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (ya2 != null) {
            ya2.f38042f = "EX_NATIVE";
        }
        a(Na.f37432f, ya2, (Integer) null);
        c(str, str2, str3);
        return new Ta(1);
    }

    public final int a(String str, String str2, String url) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).c("Ua", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + url);
        }
        if (str2 != null && str2.length() != 0) {
            if (AbstractC3849l5.a(str2, this.f37835a, this.f37839e, this.f37841g)) {
                if (F3.a(url)) {
                    C4121w3 c4121w3 = C4121w3.f39816a;
                    Intrinsics.checkNotNull(url);
                    InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C4121w3.a(url, true, interfaceC3878m92);
                } else {
                    InterfaceC3878m9 interfaceC3878m93 = this.f37841g;
                    if (interfaceC3878m93 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                        ((C3903n9) interfaceC3878m93).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC3878m9 interfaceC3878m94 = this.f37841g;
                if (interfaceC3878m94 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m94).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int iA = AbstractC3849l5.a(this.f37835a, str2, this.f37839e, str, this.f37841g);
            if (iA != 0 && iA != 1) {
                InterfaceC3878m9 interfaceC3878m95 = this.f37841g;
                if (interfaceC3878m95 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m95).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (F3.a(url)) {
                C4121w3 c4121w32 = C4121w3.f39816a;
                Intrinsics.checkNotNull(url);
                InterfaceC3878m9 interfaceC3878m96 = this.f37841g;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, interfaceC3878m96);
            } else {
                InterfaceC3878m9 interfaceC3878m97 = this.f37841g;
                if (interfaceC3878m97 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                    ((C3903n9) interfaceC3878m97).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3878m9 interfaceC3878m98 = this.f37841g;
            if (interfaceC3878m98 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m98).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC3878m9 interfaceC3878m99 = this.f37841g;
        if (interfaceC3878m99 == null) {
            return 2;
        }
        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
        ((C3903n9) interfaceC3878m99).b("Ua", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String url, String api, Ya ya2) {
        Ya yaA;
        Ya yaA2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(api, "api");
        if (ya2 != null) {
            ya2.f38042f = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
            if (interfaceC3878m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m9).b("Ua", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Na.f37431e, ya2, (Integer) null);
            return 2;
        }
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(this)");
        if (AbstractC4146x3.a(uri)) {
            Intent intent = new Intent(this.f37835a, (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f37839e.getViewTouchTimestamp());
            if (ya2 != null) {
                yaA = Ya.a(ya2);
                Na na2 = Na.f37430d;
                yaA.f38041e = 2;
                Unit unit = Unit.f93236a;
            } else {
                yaA = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yaA);
            if (ya2 != null) {
                yaA2 = Ya.a(ya2);
                Na na3 = Na.f37430d;
                yaA2.f38041e = 2;
                Unit unit2 = Unit.f93236a;
            } else {
                yaA2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yaA2);
            InterfaceC3878m9 obj = this.f37841g;
            if (obj != null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                HashMap map = P8.f37526a;
                String key = string.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                P8.f37526a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            Ma ma2 = this.f37838d;
            if (ma2 != null) {
                ma2.a(intent);
            }
            a(Na.f37432f, ya2, (Integer) null);
            Ma ma3 = this.f37838d;
            if (ma3 == null) {
                return 1;
            }
            ma3.b(null, null, url);
            return 1;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
        if (interfaceC3878m92 == null) {
            return 10;
        }
        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
        ((C3903n9) interfaceC3878m92).b("Ua", "Embedded request unable to handle " + url);
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.Ta a(java.lang.String r10, java.lang.String r11, com.inmobi.media.ads.network.common.model.InlineParams r12, java.lang.String r13, com.inmobi.media.Ya r14) {
        /*
            r9 = this;
            java.lang.String r0 = "api"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.inmobi.media.m9 r0 = r9.f37841g
            if (r0 == 0) goto L2b
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "Ua"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "inline installer called with URL: "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.inmobi.media.n9 r0 = (com.inmobi.media.C3903n9) r0
            r0.a(r2, r1)
        L2b:
            if (r14 == 0) goto L31
            java.lang.String r0 = "SKSTORE"
            r14.f38042f = r0
        L31:
            com.inmobi.media.Sa r0 = r9.a(r12)
            boolean r1 = r0 instanceof com.inmobi.media.Ra
            if (r1 == 0) goto L53
            r7 = r0
            com.inmobi.media.Ra r7 = (com.inmobi.media.Ra) r7
            if (r12 == 0) goto L4c
            boolean r12 = r12.getPingInWebView()
            r0 = 1
            if (r12 != r0) goto L4c
        L45:
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r5 = r14
            r8 = r0
            goto L4e
        L4c:
            r0 = 0
            goto L45
        L4e:
            com.inmobi.media.Ta r10 = r2.a(r3, r4, r5, r6, r7, r8)
            return r10
        L53:
            r2 = r10
            r3 = r11
            r1 = r13
            r4 = r14
            boolean r10 = r0 instanceof com.inmobi.media.Qa
            if (r10 == 0) goto L65
            com.inmobi.media.Qa r0 = (com.inmobi.media.Qa) r0
            int r5 = r0.f37586a
            r0 = r9
            com.inmobi.media.Ta r10 = r0.a(r1, r2, r3, r4, r5)
            return r10
        L65:
            lf.m r10 = new lf.m
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ua.a(java.lang.String, java.lang.String, com.inmobi.media.ads.network.common.model.InlineParams, java.lang.String, com.inmobi.media.Ya):com.inmobi.media.Ta");
    }

    public final Sa a(InlineParams inlineParams) {
        Activity fullScreenActivity;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        if (inlineParams == null) {
            return new Qa(8700);
        }
        WeakReference weakReference = this.f37842h;
        if (weakReference == null || (gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) weakReference.get()) == null) {
            fullScreenActivity = null;
        } else {
            fullScreenActivity = gestureDetectorOnGestureListenerC3635ci.getFullScreenActivity();
            if (fullScreenActivity == null) {
                fullScreenActivity = gestureDetectorOnGestureListenerC3635ci.getBannerHolderActivity().get();
            }
        }
        String packageName = this.f37835a.getPackageName();
        String targetBundleId = inlineParams.getTargetBundleId();
        boolean overlay = inlineParams.getOverlay();
        String url = inlineParams.getUrl();
        if (targetBundleId != null && targetBundleId.length() != 0) {
            Intrinsics.checkNotNull(packageName);
            if (packageName.length() == 0) {
                return new Qa(8703);
            }
            if (fullScreenActivity == null) {
                return new Qa(8704);
            }
            if (url != null && url.length() != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(url);
                sb2.append("id=" + targetBundleId);
                String referrer = inlineParams.getReferrer();
                String listing = inlineParams.getListing();
                if (referrer != null && !StringsKt.y0(referrer)) {
                    sb2.append('&');
                    sb2.append("referrer=" + referrer);
                }
                if (listing != null && !StringsKt.y0(listing)) {
                    sb2.append('&');
                    sb2.append("listing=" + listing);
                }
                return new Ra(fullScreenActivity, sb2.toString(), packageName, overlay);
            }
            return new Qa(2);
        }
        return new Qa(8702);
    }

    public final Ta a(String str, String str2, String str3, Ya ya2, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ua", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i10, ya2);
        if (ya2 != null) {
            ya2.f38042f = "EX_NATIVE";
        }
        if (F1.a(this.f37835a, str, this.f37839e, str2, this.f37841g)) {
            a(Na.f37432f, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        if (AbstractC3849l5.a(str, this.f37835a, this.f37839e, this.f37841g)) {
            a(Na.f37432f, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        int iE = e(str2, str3, str, ya2);
        if (iE != 0 && iE != 1) {
            a(Na.f37433g, ya2, Integer.valueOf(iE));
            Ma ma2 = this.f37838d;
            if (ma2 != null) {
                ma2.a(str3, "Launch failed", str2);
            }
            return new Ta(2, Integer.valueOf(iE));
        }
        return new Ta(1);
    }

    public final Ta a(String str, String str2, Ya ya2, String url, Ra ra2, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).a("Ua", "Executing inline installer flow for URL: " + url);
        }
        int iA = AbstractC4146x3.a(ra2, this.f37839e, str);
        if (iA != 0 && iA != 1) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37841g;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
                ((C3903n9) interfaceC3878m92).a("Ua", "Inline installer launch failed; executing fallback for URL: " + url + ", errorCode: " + iA);
            }
            return a(url, str, str2, ya2, iA);
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f37841g;
        if (interfaceC3878m93 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m93).a("Ua", "Inline installer launch succeeded for URL: " + url);
        }
        if (z10) {
            C4121w3 c4121w3 = C4121w3.f39816a;
            InterfaceC3878m9 interfaceC3878m94 = this.f37841g;
            Intrinsics.checkNotNullParameter(url, "url");
            Dg.a(Ag.f36573b, new C3947p3(url, true, interfaceC3878m94, null));
        } else {
            C4121w3 c4121w32 = C4121w3.f39816a;
            InterfaceC3878m9 interfaceC3878m95 = this.f37841g;
            Intrinsics.checkNotNullParameter(url, "url");
            C4121w3.a(url, true, interfaceC3878m95);
        }
        a(Na.f37432f, ya2, (Integer) null);
        Ma ma2 = this.f37838d;
        if (ma2 != null) {
            ma2.b(str, str2, url);
        }
        return new Ta(1);
    }

    public final void a(int i10, Ya ya2) {
        Object objB;
        InterfaceC3878m9 interfaceC3878m9;
        Za za2;
        try {
            Result.Companion companion = Result.f93230c;
            if (ya2 == null || (za2 = ya2.f38037a) == null) {
                za2 = this.f37840f;
            }
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("errorCode", Integer.valueOf(i10)));
            if (za2 != null) {
                mapMutableMapOf.put("plType", za2.f38108c);
                mapMutableMapOf.put("impressionId", za2.f38107b);
                mapMutableMapOf.put("plId", Long.valueOf(za2.f38106a));
                mapMutableMapOf.put("adType", za2.f38109d);
                mapMutableMapOf.put("markupType", za2.f38110e);
                mapMutableMapOf.put("creativeType", za2.f38111f);
                mapMutableMapOf.put("metadataBlob", za2.f38112g);
                mapMutableMapOf.put("isRewarded", Boolean.valueOf(za2.f38113h));
            }
            if (ya2 != null) {
                String str = ya2.f38042f;
                if (str == null) {
                    str = ya2.f38037a.f38114i;
                }
                mapMutableMapOf.put("trigger", str);
                mapMutableMapOf.put("urlType", ya2.f38038b);
                long j10 = ya2.f38040d;
                if (j10 != 0) {
                    CoroutineScope coroutineScope = AbstractC3790il.f38771a;
                    mapMutableMapOf.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                }
            }
            mapMutableMapOf.put("networkType", C4148x5.m());
            Wj wj = Wj.f37959a;
            Wj.b("InlineInstallFailed", mapMutableMapOf, EnumC3585ak.f38215a);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG == null || (interfaceC3878m9 = this.f37841g) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
        ((C3903n9) interfaceC3878m9).b("Ua", "Failed to submit inline install failed telemetry: " + thG.getMessage());
    }

    public static final void a(Ua ua2, String str, String str2, String str3, Ya ya2, Exception exc) {
        InterfaceC3878m9 interfaceC3878m9 = ua2.f37841g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m9).b("Ua", "Error message in processing openExternal: " + exc.getMessage());
        }
        Ma ma2 = ua2.f37838d;
        if (ma2 != null) {
            try {
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                Intrinsics.checkNotNull(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            ma2.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            ua2.f(str, str3, null, ya2);
        }
    }

    public final void a(Na funnelState, Ya ya2, Integer num) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        Pa.a(funnelState, ya2, num, new Function2() { // from class: w3.r4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Ua.a(this.f107276b, (String) obj, (Map) obj2);
            }
        });
    }

    public static final Unit a(Ua ua2, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Ma ma2 = ua2.f37838d;
        if (ma2 != null) {
            ma2.a(trackerName, macros);
        }
        return Unit.f93236a;
    }
}
