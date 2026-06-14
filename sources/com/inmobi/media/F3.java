package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public abstract class F3 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f10) {
        try {
            return zf.a.d(f10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f10) {
        try {
            return (int) (f10 / J5.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES));
        C4148x5.f39893a.getClass();
        return C4148x5.v() ? new WebResourceResponse(mimeType, "UTF-8", 200, "OK", mapMapOf, inputStream) : new WebResourceResponse(mimeType, "UTF-8", inputStream);
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / J5.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final float a(float f10) {
        return zf.a.d(f10 * 10.0f) / 10.0f;
    }

    public static final boolean a(Context context) {
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        C4148x5.f39893a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            applicationInfo = packageInfo.applicationInfo;
        } catch (Exception unused) {
        }
        int i10 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        return i10 >= 35;
    }

    public static final void a(wo woVar, RelativeLayout.LayoutParams layoutParams, Df orientation) {
        Intrinsics.checkNotNullParameter(woVar, "<this>");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        woVar.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar = (vo) woVar.f39881a.get(orientation);
        int i10 = voVar != null ? voVar.f39803a : 0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar2 = (vo) woVar.f39881a.get(orientation);
        int i11 = voVar2 != null ? voVar2.f39805c : 0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar3 = (vo) woVar.f39881a.get(orientation);
        layoutParams.setMargins(i10, 0, i11, voVar3 != null ? voVar3.f39806d : 0);
    }

    public static final String a(HashMap map) {
        String strEncode;
        String strEncode2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String string = StringsKt.v1((String) entry.getValue()).toString();
            if (string.length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(C4240b4.j.f42670c);
                }
                kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(string, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                String str2 = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                sb2.append(str2);
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final String a(vh.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String strEncodeToString = Base64.encodeToString(eVar.readByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final void a(CoroutineScope coroutineScope) {
        if (coroutineScope == null) {
            return;
        }
        try {
            kotlinx.coroutines.i.f(coroutineScope, null, 1, null);
        } catch (IllegalStateException unused) {
        }
    }

    public static final Job a(CoroutineScope coroutineScope, long j10, long j11, Function1 action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return eg.i.d(coroutineScope, null, null, new B3(j10, action, j11, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3986qh r4, kotlin.jvm.functions.Function1 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.inmobi.media.D3
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.D3 r0 = (com.inmobi.media.D3) r0
            int r1 = r0.f36700b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36700b = r1
            goto L18
        L13:
            com.inmobi.media.D3 r0 = new com.inmobi.media.D3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36699a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36700b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)     // Catch: java.lang.IllegalStateException -> L43
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r6)
            com.inmobi.media.E3 r6 = new com.inmobi.media.E3     // Catch: java.lang.IllegalStateException -> L43
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.IllegalStateException -> L43
            r0.f36700b = r3     // Catch: java.lang.IllegalStateException -> L43
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.lang.IllegalStateException -> L43
            if (r4 != r1) goto L4e
            return r1
        L43:
            r4 = move-exception
            kotlin.Lazy r5 = com.inmobi.media.P9.f37527a
            com.inmobi.media.L2 r5 = new com.inmobi.media.L2
            r5.<init>(r4)
            com.inmobi.media.P9.a(r5)
        L4e:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F3.a(com.inmobi.media.qh, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        C4148x5.f39893a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, filter, 2);
        }
        return context.registerReceiver(broadcastReceiver, filter);
    }
}
