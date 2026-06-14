package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f0;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Handler f46484a = new a(Looper.getMainLooper());

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            String string;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string2 = data.getString("rid");
                        String string3 = data.getString("rid_n");
                        string = data.getString("cid");
                        str = string2;
                        str2 = string3;
                    } else {
                        str = "";
                        str2 = str;
                        string = str2;
                    }
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(i10, i11, str, str2, string);
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f46485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46486b;

        b(Context context, String str) {
            this.f46485a = context;
            this.f46486b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f0.class.getMethod("mia", Context.class, String.class);
                Context context = this.f46485a;
                if (context != null) {
                    method.invoke(null, context, this.f46486b);
                } else {
                    q0.b("CommonClickUtil", "Context is null");
                }
            } catch (Throwable th2) {
                q0.b("CommonClickUtil", th2.getMessage());
            }
        }
    }

    public static boolean a(CampaignEx campaignEx) {
        return d.a(campaignEx);
    }

    public static void b(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !a(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || listQueryIntentActivities.size() <= 0 || (next = listQueryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            if (com.mbridge.msdk.util.b.a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e10.printStackTrace();
        }
    }

    public static void c(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static boolean d(Context context, String str) {
        Intent intent;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals(com.taurusx.tax.g.n.f66171o)) {
                intent = Intent.parseUri(str, 1);
            } else if (uri.getScheme().equals("android-app")) {
                intent = Intent.parseUri(str, 2);
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                intent.setData(uri);
            }
            if (intent == null) {
                return false;
            }
            intent.setComponent(null);
            intent.setSelector(null);
            if (a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
            return false;
        }
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            int i10 = MBCommonActivity.f46221e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof ContextThemeWrapper)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ClassNotFoundException e10) {
            q0.b("CommonClickUtil", e10.getMessage());
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r0 = r1.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        return a(a(a(a(r5, r0.a(), java.lang.String.valueOf(com.mbridge.msdk.foundation.tools.m0.m(com.mbridge.msdk.foundation.controller.c.n().d()))), r0.b(), java.lang.String.valueOf(com.mbridge.msdk.foundation.tools.m0.n(com.mbridge.msdk.foundation.controller.c.n().d()))), r0.c(), r6), r0.d(), r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L8
            goto La1
        L8:
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.setting.h r1 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.setting.g r1 = r1.d(r2)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto La1
            java.util.Map r1 = r1.l()     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto La1
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9f
            if (r2 != 0) goto La1
            java.util.Set r2 = r1.entrySet()     // Catch: java.lang.Exception -> L9f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L9f
        L36:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L9f
            if (r3 == 0) goto La1
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L9f
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> L9f
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L9f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L9f
            if (r4 != 0) goto L36
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Exception -> L9f
            if (r4 == 0) goto L36
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.setting.b$a r0 = (com.mbridge.msdk.setting.b.a) r0     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto La1
            java.util.List r1 = r0.a()     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L9f
            android.content.Context r2 = r2.d()     // Catch: java.lang.Exception -> L9f
            int r2 = com.mbridge.msdk.foundation.tools.m0.m(r2)     // Catch: java.lang.Exception -> L9f
            float r2 = (float) r2     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = a(r5, r1, r2)     // Catch: java.lang.Exception -> L9f
            java.util.List r1 = r0.b()     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L9f
            android.content.Context r2 = r2.d()     // Catch: java.lang.Exception -> L9f
            int r2 = com.mbridge.msdk.foundation.tools.m0.n(r2)     // Catch: java.lang.Exception -> L9f
            float r2 = (float) r2     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = a(r5, r1, r2)     // Catch: java.lang.Exception -> L9f
            java.util.List r1 = r0.c()     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = a(r5, r1, r6)     // Catch: java.lang.Exception -> L9f
            java.util.List r6 = r0.d()     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = a(r5, r6, r7)     // Catch: java.lang.Exception -> L9f
            return r5
        L9f:
            r6 = move-exception
            goto La2
        La1:
            return r5
        La2:
            r6.printStackTrace()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.c.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    public static boolean a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent) {
        try {
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
        }
        if (context instanceof Activity) {
            context.startActivity(intent);
            return true;
        }
        if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
            Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
            if (!(contextF instanceof Activity)) {
                return false;
            }
            contextF.startActivity(intent);
            return true;
        }
        return false;
    }

    public static void a(Context context, int i10, String str) {
        if (i10 == 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b(context, str));
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }
}
