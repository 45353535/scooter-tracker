package com.appodeal.ads.adapters.iab.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.amazon.device.ads.DtbConstants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import eg.e0;
import eg.o0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import uf.r;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f12324a = lf.i.a(new Function0() { // from class: com.appodeal.ads.adapters.iab.utils.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.h();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f12325b = lf.i.a(new Function0() { // from class: com.appodeal.ads.adapters.iab.utils.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.e();
        }
    });

    public static ComponentName a(Context context, Intent intent) {
        Object next;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ResolveInfo) next).activityInfo.packageName, "com.android.vending")) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull((List) listQueryIntentActivities);
        }
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static final String b(Context context, JSONArray urls, Runnable postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(postMethod, "postMethod");
        String str = new String();
        try {
            try {
                int length = urls.length();
                for (int i10 = 0; i10 < length; i10++) {
                    str = urls.getString(i10);
                    if (g(context, str, postMethod)) {
                        break;
                    }
                }
                return str;
            } catch (Exception e10) {
                Log.log(e10);
                eg.i.d((CoroutineScope) f12324a.getValue(), null, null, new g(postMethod, null), 3, null);
                return str;
            }
        } finally {
            eg.i.d((CoroutineScope) f12324a.getValue(), null, null, new g(postMethod, null), 3, null);
        }
    }

    public static String c(InputStream inputStream) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            try {
                String strI = r.i(bufferedReader);
                uf.c.a(bufferedReader, null);
                uf.c.a(inputStream, null);
                return strI;
            } finally {
            }
        } finally {
        }
    }

    public static String d(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        URL url;
        String strD;
        HttpURLConnection httpURLConnection2 = null;
        try {
            url = new URL(str);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(500);
            httpURLConnection.setReadTimeout(500);
            switch (httpURLConnection.getResponseCode()) {
                case 301:
                case 302:
                case 303:
                case 305:
                case 307:
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        if (!StringsKt.a0(headerField, "http://", false, 2, null) && !StringsKt.a0(headerField, DtbConstants.HTTPS, false, 2, null)) {
                            if (new URI(headerField).getScheme() == null) {
                                String string = new URL(url, headerField).toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                if (StringsKt.v1(string).toString().length() > 0) {
                                    strD = d(string);
                                }
                            }
                            httpURLConnection.disconnect();
                            return headerField;
                        }
                        strD = d(headerField);
                        headerField = strD;
                        httpURLConnection.disconnect();
                        return headerField;
                    }
                    break;
            }
        } catch (Exception unused2) {
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection = httpURLConnection2;
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        httpURLConnection.disconnect();
        return str;
    }

    public static final CoroutineScope e() {
        return kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdIabAdapter")));
    }

    public static boolean f(Context context, String str) {
        try {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_LAUNCH_URL, "url - " + str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            ComponentName componentNameA = a(context, intent);
            if (componentNameA != null) {
                intent.setComponent(componentNameA);
                context.startActivity(intent);
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(URLDecoder.decode(str, "UTF-8")));
            intent2.setFlags(268435456);
            ComponentName componentNameA2 = a(context, intent2);
            if (componentNameA2 != null) {
                intent2.setComponent(componentNameA2);
                context.startActivity(intent2);
                return true;
            }
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_LAUNCH_ERROR, "component not found to handle intent: " + str);
            return false;
        } catch (Exception e10) {
            Log.log(e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(android.content.Context r8, java.lang.String r9, java.lang.Runnable r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "postMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L78
            int r2 = r9.length()
            if (r2 != 0) goto L15
            goto L78
        L15:
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L1b
            r2.<init>(r9)     // Catch: java.net.MalformedURLException -> L1b
            goto L24
        L1b:
            java.lang.String r2 = "UTF-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r2)     // Catch: java.lang.Exception -> L21
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
        L24:
            java.lang.String r2 = "http://"
            r3 = 2
            boolean r2 = kotlin.text.StringsKt.a0(r9, r2, r0, r3, r1)
            if (r2 != 0) goto L50
            java.lang.String r2 = "https://"
            boolean r0 = kotlin.text.StringsKt.a0(r9, r2, r0, r3, r1)
            if (r0 == 0) goto L36
            goto L50
        L36:
            kotlin.Lazy r0 = com.appodeal.ads.adapters.iab.utils.n.f12324a
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.appodeal.ads.adapters.iab.utils.k r5 = new com.appodeal.ads.adapters.iab.utils.k
            r5.<init>(r10, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            eg.g.d(r2, r3, r4, r5, r6, r7)
            boolean r8 = f(r8, r9)
            return r8
        L50:
            kotlin.Lazy r0 = com.appodeal.ads.adapters.iab.utils.n.f12325b
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.appodeal.ads.adapters.iab.utils.i r5 = new com.appodeal.ads.adapters.iab.utils.i
            r5.<init>(r8, r9, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            eg.g.d(r2, r3, r4, r5, r6, r7)
            kotlin.Lazy r8 = com.appodeal.ads.adapters.iab.utils.n.f12324a
            java.lang.Object r8 = r8.getValue()
            r2 = r8
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.appodeal.ads.adapters.iab.utils.j r5 = new com.appodeal.ads.adapters.iab.utils.j
            r5.<init>(r10, r1)
            eg.g.d(r2, r3, r4, r5, r6, r7)
            r8 = 1
            return r8
        L78:
            kotlin.Lazy r8 = com.appodeal.ads.adapters.iab.utils.n.f12324a
            java.lang.Object r8 = r8.getValue()
            r2 = r8
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.appodeal.ads.adapters.iab.utils.h r5 = new com.appodeal.ads.adapters.iab.utils.h
            r5.<init>(r10, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            eg.g.d(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.iab.utils.n.g(android.content.Context, java.lang.String, java.lang.Runnable):boolean");
    }

    public static final CoroutineScope h() {
        return kotlinx.coroutines.i.a(o0.c().plus(new e0("ApdIabAdapter")));
    }
}
