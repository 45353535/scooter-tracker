package com.appodeal.ads.network.encoders;

import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13951a = new b();

    @Override // com.appodeal.ads.network.encoders.d
    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCEPT_ENCODING, CollectionsKt.listOf("gzip")), TuplesKt.to("Content-Encoding", CollectionsKt.listOf("gzip")));
    }

    @Override // com.appodeal.ads.network.encoders.d
    public final byte[] a(byte[] data) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        Intrinsics.checkNotNullParameter(data, "data");
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(data);
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    Intrinsics.checkNotNull(byteArray);
                    byteArrayOutputStream2.close();
                    return byteArray;
                } catch (Exception unused) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    return data;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                gZIPOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Exception unused3) {
            gZIPOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @Override // com.appodeal.ads.network.encoders.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(java.lang.String r6, byte[] r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "gzip"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 == 0) goto L63
            r6 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L44
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L44
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L2d
        L21:
            int r2 = r7.read(r6)     // Catch: java.lang.Throwable -> L2d
            r3 = -1
            if (r2 == r3) goto L2f
            r3 = 0
            r0.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L2d
            goto L21
        L2d:
            r6 = move-exception
            goto L40
        L2f:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L2d
            r0.close()
            r1.close()
            r7.close()
            return r6
        L40:
            r4 = r0
            r0 = r6
            r6 = r4
            goto L53
        L44:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L53
        L4a:
            r7 = move-exception
            r1 = r6
            r6 = r0
        L4d:
            r0 = r7
            r7 = r1
            goto L53
        L50:
            r7 = move-exception
            r1 = r6
            goto L4d
        L53:
            if (r6 == 0) goto L58
            r6.close()
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            if (r7 == 0) goto L62
            r7.close()
        L62:
            throw r0
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.network.encoders.b.a(java.lang.String, byte[]):byte[]");
    }
}
