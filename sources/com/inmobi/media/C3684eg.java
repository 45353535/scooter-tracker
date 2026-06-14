package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import com.adjust.sdk.Constants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3684eg implements InterfaceC3710fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3607bg f38519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3887mi f38520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38522d;

    public C3684eg(InterfaceC3607bg interfaceC3607bg, C3887mi c3887mi) {
        this.f38519a = interfaceC3607bg;
        this.f38520b = c3887mi;
        String id2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id2, "toString(...)");
        this.f38521c = id2;
        this.f38522d = new AtomicBoolean(false);
        F8 f82 = Uf.f37853b;
        if (f82 != null) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            f82.f38765b.put(id2, new WeakReference(this));
            Iterator it = f82.f38765b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3949p5 c3949p5 = Uf.f37854c;
        if (c3949p5 != null) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            c3949p5.f38765b.put(id2, new WeakReference(this));
            Iterator it2 = c3949p5.f38765b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3659dg
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.dg r0 = (com.inmobi.media.C3659dg) r0
            int r1 = r0.f38450d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38450d = r1
            goto L18
        L13:
            com.inmobi.media.dg r0 = new com.inmobi.media.dg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f38448b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38450d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r9 = r0.f38447a
            kotlin.d.b(r10)     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            goto L47
        L2b:
            r0 = move-exception
            r9 = r0
            goto L63
        L2e:
            r0 = move-exception
            r9 = r0
            goto L76
        L31:
            r0 = move-exception
            r9 = r0
            goto L84
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.d.b(r10)
            java.util.List r9 = r8.a(r9)     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
        L47:
            boolean r10 = r9.hasNext()     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            if (r10 == 0) goto La3
            java.lang.Object r10 = r9.next()     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            com.inmobi.media.Rf r10 = (com.inmobi.media.Rf) r10     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            java.lang.String r2 = r10.f37662e     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            r8.b(r2)     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            r0.f38447a = r9     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            r0.f38450d = r3     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            java.lang.Object r10 = a(r10, r0)     // Catch: java.lang.NoClassDefFoundError -> L2b java.lang.Exception -> L2e org.json.JSONException -> L31
            if (r10 != r1) goto L47
            return r1
        L63:
            r10 = 2245(0x8c5, float:3.146E-42)
            a(r8, r10)
            r9.getMessage()
            kotlin.Lazy r10 = com.inmobi.media.P9.f37527a
            com.inmobi.media.L2 r10 = new com.inmobi.media.L2
            r10.<init>(r9)
            com.inmobi.media.P9.a(r10)
            goto La3
        L76:
            r10 = 2244(0x8c4, float:3.145E-42)
            a(r8, r10)
            r9.getMessage()
            kotlin.Lazy r10 = com.inmobi.media.P9.f37527a
            com.inmobi.media.AbstractC3779i9.a(r9)
            goto La3
        L84:
            r10 = 2243(0x8c3, float:3.143E-42)
            a(r8, r10)
            com.inmobi.media.bg r10 = r8.f38519a
            if (r10 == 0) goto La0
            com.inmobi.media.Z5[] r0 = com.inmobi.media.Z5.f38096a
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r10
            com.inmobi.media.Yh r1 = (com.inmobi.media.Yh) r1
            r7 = 0
            java.lang.String r2 = ""
            r3 = -104(0xffffffffffffff98, float:NaN)
            java.lang.String r4 = "Ping JSON is invalid"
            r1.a(r2, r3, r4, r5, r7)
        La0:
            r9.getMessage()
        La3:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3684eg.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void b(String priority) {
        C3887mi c3887mi = this.f38520b;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3887mi.a();
            mapA.put("trigger", priority);
            AbstractC3810jg.a("PingStarted", mapA);
        }
    }

    public static Object a(Rf rf2, C3659dg c3659dg) {
        Objects.toString(rf2);
        if (Intrinsics.areEqual(rf2.f37662e, Constants.HIGH)) {
            F8 f82 = Uf.f37853b;
            if (f82 != null) {
                Object objB = f82.b(rf2, c3659dg);
                if (objB != pf.b.g()) {
                    objB = Unit.f93236a;
                }
                return objB == pf.b.g() ? objB : Unit.f93236a;
            }
        } else {
            C3949p5 c3949p5 = Uf.f37854c;
            if (c3949p5 != null) {
                Object objA = c3949p5.a(rf2, c3659dg);
                if (objA != pf.b.g()) {
                    objA = Unit.f93236a;
                }
                return objA == pf.b.g() ? objA : Unit.f93236a;
            }
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC3607bg interfaceC3607bg = this.f38519a;
            if (interfaceC3607bg != null) {
                Z5[] z5Arr = Z5.f38096a;
                ((Yh) interfaceC3607bg).a("", PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !StringsKt.y0(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (a(strOptString, strOptString2)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                linkedHashMap.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                            }
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Constants.NORMAL);
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                        Intrinsics.checkNotNull(strOptString2);
                        String str2 = strOptString3 == null ? Constants.NORMAL : strOptString3;
                        String str3 = this.f38521c;
                        C3887mi c3887mi = this.f38520b;
                        rf = new Rf(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3887mi != null ? c3887mi.f39041a : null);
                    }
                } else {
                    Intrinsics.checkNotNull(strOptString);
                    a(this, (short) 2255);
                    InterfaceC3607bg interfaceC3607bg2 = this.f38519a;
                    if (interfaceC3607bg2 != null) {
                        Z5[] z5Arr2 = Z5.f38096a;
                        ((Yh) interfaceC3607bg2).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (rf != null) {
                arrayList.add(rf);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !StringsKt.y0(str2)) {
            try {
                URI uri = new URI(str2);
                if ((Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https")) && (host = uri.getHost()) != null) {
                    if (!StringsKt.y0(host)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC3607bg interfaceC3607bg = this.f38519a;
            if (interfaceC3607bg != null) {
                Z5[] z5Arr = Z5.f38096a;
                ((Yh) interfaceC3607bg).a(str, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC3607bg interfaceC3607bg2 = this.f38519a;
        if (interfaceC3607bg2 != null) {
            Z5[] z5Arr2 = Z5.f38096a;
            ((Yh) interfaceC3607bg2).a(str, PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(Rf ping, int i10, long j10) {
        InterfaceC3607bg interfaceC3607bg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.f38522d.get()) {
            return;
        }
        String str = ping.f37658a;
        if (Intrinsics.areEqual(Constants.HIGH, ping.f37662e) && ping.f37663f && (interfaceC3607bg = this.f38519a) != null) {
            ((Yh) interfaceC3607bg).a(ping.f37659b, i10, null, j10, ping.f37664g);
        }
        String priority = ping.f37662e;
        long jCurrentTimeMillis = System.currentTimeMillis() - ping.f37666i;
        C3887mi c3887mi = this.f38520b;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3887mi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
            AbstractC3810jg.a("PingSuccess", mapA);
        }
    }

    public final void a(Rf ping, int i10, String str, int i11, long j10) {
        InterfaceC3607bg interfaceC3607bg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.f38522d.get()) {
            return;
        }
        String str2 = ping.f37658a;
        if (Intrinsics.areEqual(Constants.HIGH, ping.f37662e) && ping.f37663f && ping.f37664g < 1 && (interfaceC3607bg = this.f38519a) != null) {
            ((Yh) interfaceC3607bg).a(ping.f37659b, i10, str, j10, ping.f37664g);
        }
        String priority = ping.f37662e;
        C3887mi c3887mi = this.f38520b;
        if (c3887mi != null) {
            if (priority == null) {
                priority = "unknown";
            }
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3887mi.a();
            mapA.put("errorCode", (short) 2247);
            mapA.put("trigger", priority);
            mapA.put("retryCount", String.valueOf(i11));
            AbstractC3810jg.a("PingFailed", mapA);
        }
    }

    public static void a(C3684eg c3684eg, short s10) {
        C3887mi c3887mi = c3684eg.f38520b;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3887mi.a();
            mapA.put("errorCode", Short.valueOf(s10));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3810jg.a("PingFailed", mapA);
        }
    }
}
