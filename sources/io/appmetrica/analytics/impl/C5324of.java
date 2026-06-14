package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5324of implements Zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77900b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77901c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77902d = "additional_parameters";

    public C5324of(@NotNull Context context) {
        this.f77899a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:8:0x002b, B:10:0x0031, B:20:0x0061, B:22:0x0067, B:25:0x006e, B:26:0x0076, B:19:0x005b, B:29:0x0094, B:30:0x009c, B:12:0x0047, B:15:0x004e, B:17:0x0055), top: B:38:0x0029, inners: #2 }] */
    @Override // kotlin.jvm.functions.Function0
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5498vf invoke() {
        /*
            r11 = this;
            r0 = 1
            android.content.Context r1 = r11.f77899a
            java.lang.String r2 = "com.yandex.preinstallsatellite.appmetrica.provider"
            boolean r1 = io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(r1, r2)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L15
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Satellite content provider with preload info was not found."
            io.appmetrica.analytics.impl.AbstractC5227kj.a(r1, r0)
            return r2
        L15:
            android.content.Context r1 = r11.f77899a     // Catch: java.lang.Throwable -> La4
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r11.f77900b     // Catch: java.lang.Throwable -> La4
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> La4
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L9c
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L94
            java.lang.String r4 = r11.f77901c     // Catch: java.lang.Throwable -> La5
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = r1.getString(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = r11.f77902d     // Catch: java.lang.Throwable -> La5
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L55
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L4e
            goto L55
        L4e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5b
        L53:
            r7 = r5
            goto L61
        L55:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            goto L53
        L5b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r5.<init>()     // Catch: java.lang.Throwable -> La5
            goto L53
        L61:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto L76
            java.lang.Long r4 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r6)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L6e
            goto L76
        L6e:
            java.lang.String r0 = "Tracking id from Satellite is not a number."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.AbstractC5227kj.a(r0, r3)     // Catch: java.lang.Throwable -> La5
            goto La5
        L76:
            java.lang.String r4 = "Preload info from Satellite: {tracking id = %s, additional parameters = %s}"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La5
            r5[r3] = r6     // Catch: java.lang.Throwable -> La5
            r5[r0] = r7     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.AbstractC5227kj.a(r4, r5)     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.vf r5 = new io.appmetrica.analytics.impl.vf     // Catch: java.lang.Throwable -> La5
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La5
            r8 = r3 ^ 1
            io.appmetrica.analytics.impl.Y7 r10 = io.appmetrica.analytics.impl.Y7.f76696d     // Catch: java.lang.Throwable -> La5
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.no.a(r1)
            return r5
        L94:
            java.lang.String r0 = "No Preload Info data in Satellite content provider"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.AbstractC5227kj.a(r0, r3)     // Catch: java.lang.Throwable -> La5
            goto La5
        L9c:
            java.lang.String r0 = "No Satellite content provider found"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.AbstractC5227kj.a(r0, r3)     // Catch: java.lang.Throwable -> La5
            goto La5
        La4:
            r1 = r2
        La5:
            io.appmetrica.analytics.impl.no.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5324of.invoke():io.appmetrica.analytics.impl.vf");
    }
}
