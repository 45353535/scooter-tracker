package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class u0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f49081a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f49082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinearLayout f49083c;

    public static class a {
        public static boolean a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> listA = a(context);
                if (listA != null && listA.size() > 0) {
                    String strA = a(str);
                    if (TextUtils.isEmpty(strA)) {
                        return false;
                    }
                    Intent intentB = b(context);
                    intentB.setData(Uri.parse(strA));
                    intentB.addFlags(268435456);
                    Iterator<ResolveInfo> it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intentB.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(intentB);
                    u0.a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
                return false;
            }
        }

        public static Intent b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        public static boolean c(String str) {
            Uri uri;
            try {
                if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || TextUtils.isEmpty(uri.getHost())) {
                    return false;
                }
                if (uri.getHost().equals(com.taurusx.tax.g.f0.f66126w)) {
                    return true;
                }
                return uri.getHost().equals(com.taurusx.tax.g.f0.f66128z);
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
            }
            return false;
        }

        public static boolean d(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
                return false;
            }
        }

        public static boolean b(String str) {
            return d(str) || c(str);
        }

        public static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(b(context), 0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static String a(String str) {
            if (d(str)) {
                return str;
            }
            if (!c(str)) {
                return null;
            }
            return com.taurusx.tax.g.f0.f66125c + str.substring(str.indexOf("details?id="));
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(com.mbridge.msdk.foundation.same.directory.e.a(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG), b(str)).getAbsolutePath();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            return str.hashCode() + "";
        }
        return (str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode()) + "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r8.startActivity(r1);
        a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        a(r8, "https://play.google.com/store/apps/details?id=" + r9.replace("market://details?id=", ""), (com.mbridge.msdk.out.BaseTrackingListener) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r8, java.lang.String r9, com.mbridge.msdk.out.NativeListener.NativeTrackingListener r10) {
        /*
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> La5
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> La5
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> La5
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r2)     // Catch: java.lang.Exception -> La5
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: java.lang.Exception -> La5
            r3 = 0
            java.util.List r2 = r2.queryIntentActivities(r1, r3)     // Catch: java.lang.Exception -> La5
            int r4 = r2.size()     // Catch: java.lang.Exception -> La5
            if (r4 <= 0) goto L22
            r3 = 1
        L22:
            java.lang.String r4 = "market://"
            boolean r4 = r9.startsWith(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r5 = "https://play.google.com/store/apps/details?id="
            java.lang.String r6 = ""
            java.lang.String r7 = "market://details?id="
            if (r4 == 0) goto L86
            if (r3 != 0) goto L49
            java.lang.String r9 = r9.replace(r7, r6)     // Catch: java.lang.Exception -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r0.<init>()     // Catch: java.lang.Exception -> La5
            r0.append(r5)     // Catch: java.lang.Exception -> La5
            r0.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> La5
            a(r8, r9, r10)     // Catch: java.lang.Exception -> La5
            return
        L49:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> La5
        L4d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> La5
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> La5
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3     // Catch: java.lang.Exception -> La5
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Exception -> La5
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Exception -> La5
            if (r3 == 0) goto L4d
            java.lang.String r2 = "com.android.vending.AssetBrowserActivity"
            r1.setClassName(r0, r2)     // Catch: java.lang.Exception -> La5
        L68:
            r8.startActivity(r1)     // Catch: java.lang.Exception -> L6f
            a(r10)     // Catch: java.lang.Exception -> L6f
            return
        L6f:
            java.lang.String r9 = r9.replace(r7, r6)     // Catch: java.lang.Exception -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r0.<init>()     // Catch: java.lang.Exception -> La5
            r0.append(r5)     // Catch: java.lang.Exception -> La5
            r0.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> La5
            a(r8, r9, r10)     // Catch: java.lang.Exception -> La5
            goto Laf
        L86:
            java.lang.String r0 = "https://play.google.com/"
            boolean r0 = r9.startsWith(r0)     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto Laf
            java.lang.String r9 = r9.replace(r5, r6)     // Catch: java.lang.Exception -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r0.<init>()     // Catch: java.lang.Exception -> La5
            r0.append(r7)     // Catch: java.lang.Exception -> La5
            r0.append(r9)     // Catch: java.lang.Exception -> La5
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> La5
            a(r8, r9, r10)     // Catch: java.lang.Exception -> La5
            return
        La5:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.String r9 = "SDKUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r9, r8)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.u0.a(android.content.Context, java.lang.String, com.mbridge.msdk.out.NativeListener$NativeTrackingListener):void");
    }

    public static void b(Campaign campaign, ViewGroup viewGroup) {
        a(campaign, viewGroup, 0, 0);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    q0.d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = f49083c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    public static void a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null) {
            list.add("web_view");
        }
        if (f49082b) {
            a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            int i10 = MBCommonActivity.f46221e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
            eVar.a("result", 1);
        } catch (Exception unused) {
            eVar.a("result", 2);
            a(context, str, nativeTrackingListener, campaignEx, list);
        }
        eVar.a("type", 9);
        if (list != null) {
            eVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        try {
            if (a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setComponent(null);
            intent.setSelector(null);
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            a(baseTrackingListener);
            eVar.a("result", 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(baseTrackingListener);
                eVar.a("result", 1);
            } catch (Exception e11) {
                e11.printStackTrace();
                eVar.a("result", 2);
            }
        }
        try {
            eVar.a("type", 5);
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception unused) {
        }
    }

    public static void a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    public static void a(Context context, String str, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BaseTrackingListener baseTrackingListener, List<String> list) {
        CampaignEx campaignEx2;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("type", 9);
        try {
            BrowserView browserView = new BrowserView(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(m0.n(context), m0.m(context)));
            campaignEx2 = campaignEx;
            try {
                browserView.setListener(new com.mbridge.msdk.foundation.webview.a(context, campaignEx2, aVar, browserView, baseTrackingListener));
                browserView.loadUrl(str);
                eVar.a("result", "1");
            } catch (Exception e10) {
                e = e10;
                q0.b("SDKUtil", e.getMessage());
                eVar.a("result", "2");
            }
        } catch (Exception e11) {
            e = e11;
            campaignEx2 = campaignEx;
        }
        if (list != null) {
            eVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx2, eVar);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup, int i10, int i11) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    q0.d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (f49083c == null) {
                        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                        if (contextD instanceof Activity) {
                            f49083c = (LinearLayout) LayoutInflater.from(contextD.getApplicationContext()).inflate(i0.a(contextD.getApplicationContext(), "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        } else {
                            f49083c = (LinearLayout) LayoutInflater.from(contextD).inflate(i0.a(contextD, "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        }
                    }
                    int iMin = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int iMin2 = Math.min(Math.max(iMin / 4, 70), iMin);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin2, iMin2);
                        layoutParams.gravity = 17;
                        f1.a(f49083c);
                        viewGroup.addView(f49083c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMin2, iMin2);
                    if (i11 == 0 && i10 == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i11;
                        layoutParams2.topMargin = i10;
                    }
                    f1.a(f49083c);
                    viewGroup.addView(f49083c, layoutParams2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
