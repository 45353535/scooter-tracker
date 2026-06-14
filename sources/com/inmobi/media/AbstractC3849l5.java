package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3849l5 {
    public static int a(Context context, String url, InterfaceC3911nh redirectionValidator, String api, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC3878m9 == null) {
                return 2;
            }
            ((C3903n9) interfaceC3878m9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = AbstractC4146x3.a(context, url);
            if (listA.isEmpty()) {
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC3878m9);
            }
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) listA.get(0), redirectionValidator, api, interfaceC3878m9);
        } catch (URISyntaxException unused) {
            if (interfaceC3878m9 == null) {
                return 5;
            }
            ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, InterfaceC3911nh interfaceC3911nh, String str2, InterfaceC3878m9 interfaceC3878m9) {
        try {
            return AbstractC4146x3.a(context, str, interfaceC3911nh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3911nh, str2, interfaceC3878m9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3911nh, str2, interfaceC3878m9);
        } catch (SecurityException unused3) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static boolean a(String url, Context context, InterfaceC3911nh redirectionValidator, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        C4148x5.f39893a.getClass();
        if (!C4148x5.r() || !redirectionValidator.a()) {
            return false;
        }
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(intent);
            if (interfaceC3878m9 == null) {
                return true;
            }
            ((C3903n9) interfaceC3878m9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3911nh interfaceC3911nh, String str2, InterfaceC3878m9 interfaceC3878m9) {
        try {
            return AbstractC4146x3.a(context, str, resolveInfo, interfaceC3911nh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
