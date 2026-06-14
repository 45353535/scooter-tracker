package com.appodeal.ads.network.httpclients.ext;

import com.appodeal.ads.network.HttpError;
import com.appodeal.ads.network.httpclients.g;
import com.appodeal.ads.network.httpclients.l;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.appodeal.ads.network.httpclients.n a(java.net.HttpURLConnection r5, com.appodeal.ads.network.NetworkResponseHandler r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.util.Map r2 = r5.getHeaderFields()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            if (r2 != 0) goto L18
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            goto L18
        L10:
            r5 = move-exception
            r3 = r0
            r0 = r1
            goto Laf
        L15:
            r6 = move-exception
            goto L7d
        L18:
            boolean r3 = r6 instanceof com.appodeal.ads.network.NetworkResponseHandler.ParseToJson     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            r4 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L44
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            r6.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            uf.b.a(r1, r6, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r0 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            byte[] r3 = r6.toByteArray()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r4 = "toByteArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            com.appodeal.ads.network.httpclients.k r4 = new com.appodeal.ads.network.httpclients.k     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r4.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            goto L5f
        L3c:
            r5 = move-exception
            goto Lb1
        L3f:
            r0 = move-exception
            r3 = r6
        L41:
            r6 = r0
        L42:
            r0 = r1
            goto L7f
        L44:
            boolean r3 = r6 instanceof com.appodeal.ads.network.NetworkResponseHandler.SaveToFile     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            if (r3 == 0) goto L72
            com.appodeal.ads.network.NetworkResponseHandler$SaveToFile r6 = (com.appodeal.ads.network.NetworkResponseHandler.SaveToFile) r6     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            java.lang.String r6 = r6.getOutputFilePath()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            uf.b.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            com.appodeal.ads.network.httpclients.m r4 = new com.appodeal.ads.network.httpclients.m     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r6 = r3
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            r6.flush()
            r6.close()
            return r4
        L6b:
            r5 = move-exception
            goto L70
        L6d:
            r6 = move-exception
            r0 = r6
            goto L41
        L70:
            r6 = r3
            goto Lb1
        L72:
            lf.m r6 = new lf.m     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            r6.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
            throw r6     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L15
        L78:
            r5 = move-exception
            r3 = r0
            goto Laf
        L7b:
            r6 = move-exception
            r1 = r0
        L7d:
            r3 = r0
            goto L42
        L7f:
            java.net.URL r5 = r5.getURL()     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r1.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "Exception during processing response: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lae
            r1.append(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lae
            com.appodeal.ads.network.httpclients.l r1 = new com.appodeal.ads.network.httpclients.l     // Catch: java.lang.Throwable -> Lae
            com.appodeal.ads.network.HttpError$UncaughtException r2 = new com.appodeal.ads.network.HttpError$UncaughtException     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La3
            r0.close()
        La3:
            if (r3 == 0) goto La8
            r3.flush()
        La8:
            if (r3 == 0) goto Lad
            r3.close()
        Lad:
            return r1
        Lae:
            r5 = move-exception
        Laf:
            r1 = r0
            goto L70
        Lb1:
            if (r1 == 0) goto Lb6
            r1.close()
        Lb6:
            if (r6 == 0) goto Lbb
            r6.flush()
        Lbb:
            if (r6 == 0) goto Lc0
            r6.close()
        Lc0:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.network.httpclients.ext.c.a(java.net.HttpURLConnection, com.appodeal.ads.network.NetworkResponseHandler):com.appodeal.ads.network.httpclients.n");
    }

    public static final Object b(HttpURLConnection httpURLConnection, g request) {
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        Exception exc;
        Object lVar;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            Result.Companion companion = Result.f93230c;
            httpURLConnection.setConnectTimeout((int) request.a());
            httpURLConnection.setReadTimeout((int) request.e());
            httpURLConnection.setRequestMethod(b.a(request.d()));
            for (Map.Entry entry : request.c().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), CollectionsKt.joinToString$default((List) entry.getValue(), ";", null, null, 0, null, null, 62, null));
            }
            boolean z10 = true;
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    httpURLConnection.setDoOutput(true);
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(request.b());
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (201 > responseCode || responseCode >= 300) {
                                z10 = false;
                            }
                            lVar = (responseCode == 200 || z10) ? a(httpURLConnection, request.f()) : new l((400 > responseCode || responseCode >= 500) ? (500 > responseCode || responseCode >= 600) ? HttpError.InternalError.INSTANCE : HttpError.ServerError.INSTANCE : HttpError.RequestError.INSTANCE);
                        } catch (Exception e10) {
                            lVar = new l(new HttpError.UncaughtException("Exception during reading response: " + httpURLConnection.getURL(), e10));
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        bufferedOutputStream2 = bufferedOutputStream;
                        lVar = new l(new HttpError.UncaughtException("Exception during sending request: " + httpURLConnection.getURL(), exc));
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.flush();
                        }
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.flush();
                        }
                        if (bufferedOutputStream == null) {
                            throw th2;
                        }
                        bufferedOutputStream.close();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    bufferedOutputStream = bufferedOutputStream2;
                }
            } catch (Exception e12) {
                exc = e12;
            }
            return Result.b(lVar);
        } catch (Throwable th5) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(d.a(th5));
        }
    }
}
