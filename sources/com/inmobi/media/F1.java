package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class F1 {
    public static boolean a(Context context, String url, InterfaceC3911nh redirectionValidator, String api, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if (Intrinsics.areEqual("market", uri.getScheme()) || Intrinsics.areEqual(com.taurusx.tax.g.f0.f66126w, uri.getHost()) || Intrinsics.areEqual(com.taurusx.tax.g.f0.f66128z, uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC3878m9 != null) {
                                ((C3903n9) interfaceC3878m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e10) {
                            if (interfaceC3878m9 != null) {
                                ((C3903n9) interfaceC3878m9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e10.getMessage());
                            }
                            return false;
                        } catch (Exception e11) {
                            if (interfaceC3878m9 != null) {
                                ((C3903n9) interfaceC3878m9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e11.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                    }
                }
                int iA = AbstractC3849l5.a(context, url, redirectionValidator, api, interfaceC3878m9);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
