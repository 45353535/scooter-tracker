package com.inmobi.media;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Mk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Mutex f37382c = ng.f.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ne f37383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f37384b;

    public Mk(Ne networkResponse, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f37383a = networkResponse;
        this.f37384b = inMobiUnifiedIdInterfaceSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:35:0x0087, B:36:0x00a0, B:38:0x00a6, B:40:0x00ae, B:41:0x00b9, B:42:0x00bd, B:24:0x0058, B:28:0x0067, B:31:0x0081, B:45:0x00c8), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.json.JSONObject r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(org.json.JSONObject, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, java.lang.String r9, kotlin.coroutines.jvm.internal.d r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.inmobi.media.Kk
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Kk r0 = (com.inmobi.media.Kk) r0
            int r1 = r0.f37232f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37232f = r1
            goto L18
        L13:
            com.inmobi.media.Kk r0 = new com.inmobi.media.Kk
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f37230d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37232f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlinx.coroutines.sync.Mutex r8 = r0.f37229c
            java.lang.String r9 = r0.f37228b
            kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L32
            goto La4
        L32:
            r9 = move-exception
            goto Lb8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            int r8 = r0.f37227a
            kotlinx.coroutines.sync.Mutex r9 = r0.f37229c
            java.lang.String r2 = r0.f37228b
            kotlin.d.b(r10)
            goto L5d
        L47:
            kotlin.d.b(r10)
            kotlinx.coroutines.sync.Mutex r10 = com.inmobi.media.Mk.f37382c
            r0.f37228b = r9
            r0.f37229c = r10
            r0.f37227a = r8
            r0.f37232f = r4
            java.lang.Object r2 = r10.lock(r5, r0)
            if (r2 != r1) goto L5b
            goto La1
        L5b:
            r2 = r9
            r9 = r10
        L5d:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lad
            r10.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "errorCode"
            r10.put(r4, r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "UnifiedIdNetworkResponseFailure"
            com.inmobi.media.Wj r4 = com.inmobi.media.Wj.f37959a     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.ak r4 = com.inmobi.media.EnumC3585ak.f38215a     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.Wj.b(r8, r10, r4)     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.Ne r8 = r7.f37383a     // Catch: java.lang.Throwable -> Lad
            int r8 = r8.c()     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.Y5 r10 = com.inmobi.media.EnumC3571a6.f38152b     // Catch: java.lang.Throwable -> Lad
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 == r10) goto Laf
            if (r8 != 0) goto L83
            goto Laf
        L83:
            com.inmobi.media.Jk r8 = com.inmobi.media.Jk.f37166a     // Catch: java.lang.Throwable -> Lad
            r0.f37228b = r2     // Catch: java.lang.Throwable -> Lad
            r0.f37229c = r9     // Catch: java.lang.Throwable -> Lad
            r0.f37232f = r3     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.qh r8 = com.inmobi.media.Jk.f37167b     // Catch: java.lang.Throwable -> Lad
            com.inmobi.media.Ek r10 = new com.inmobi.media.Ek     // Catch: java.lang.Throwable -> Lad
            r10.<init>(r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r8 = com.inmobi.media.F3.a(r8, r10, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r10 = pf.b.g()     // Catch: java.lang.Throwable -> Lad
            if (r8 != r10) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r8 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> Lad
        L9f:
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            r8 = r9
            r9 = r2
        La4:
            r7.a(r9)     // Catch: java.lang.Throwable -> L32
            kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L32
            r8.unlock(r5)
            return r9
        Lad:
            r8 = move-exception
            goto Lb5
        Laf:
            kotlin.Unit r8 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> Lad
            r9.unlock(r5)
            return r8
        Lb5:
            r6 = r9
            r9 = r8
            r8 = r6
        Lb8:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(int, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, TryCatch #1 {JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043), top: B:29:0x000d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = "ufids"
            org.json.JSONObject r0 = com.inmobi.media.F9.b()
            org.json.JSONObject r0 = com.inmobi.media.Ok.a(r0)
            r1 = 0
            if (r0 == 0) goto L37
            boolean r2 = r0.has(r5)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r2 == 0) goto L37
            org.json.JSONArray r5 = r0.getJSONArray(r5)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r5 <= 0) goto L37
            java.util.LinkedHashSet r5 = r4.f37384b     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
        L23:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r2 == 0) goto L54
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r2 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r2     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.media.Ok.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            goto L23
        L33:
            r5 = move-exception
            goto L63
        L35:
            r5 = move-exception
            goto L5a
        L37:
            java.util.LinkedHashSet r5 = r4.f37384b     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
        L3d:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            if (r0 == 0) goto L54
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r0 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r0     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.lang.Error r2 = new java.lang.Error     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            java.lang.String r3 = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            com.inmobi.media.Ok.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L33 org.json.JSONException -> L35
            goto L3d
        L54:
            java.util.LinkedHashSet r5 = r4.f37384b
            r5.clear()
            return
        L5a:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L33
            java.util.LinkedHashSet r5 = r4.f37384b
            r5.clear()
            return
        L63:
            java.util.LinkedHashSet r0 = r4.f37384b
            r0.clear()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(java.lang.String):void");
    }
}
