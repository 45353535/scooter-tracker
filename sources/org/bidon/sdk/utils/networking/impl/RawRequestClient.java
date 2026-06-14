package org.bidon.sdk.utils.networking.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.ByteArrayExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¨\u0006\u001e"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawRequestClient;", "", "<init>", "()V", "execute", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "rawRequest", "Lorg/bidon/sdk/utils/networking/impl/RawRequest;", "execute-IoAF18A", "(Lorg/bidon/sdk/utils/networking/impl/RawRequest;)Ljava/lang/Object;", "requestRawData", "Ljava/net/URLConnection;", "request", "connectTimeout", "", "readTimeout", "requestRawData-BWLJW6A", "(Ljava/net/URLConnection;Lorg/bidon/sdk/utils/networking/impl/RawRequest;II)Ljava/lang/Object;", "logResponseResult", "", "responseCode", "url", "Ljava/net/URL;", "rawResponse", "", "getResponseBody", "streamType", "Lorg/bidon/sdk/utils/networking/impl/RawRequestClient$StreamType;", "StreamType", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RawRequestClient {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawRequestClient$StreamType;", "", "<init>", "(Ljava/lang/String;I)V", "Normal", "Error", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class StreamType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StreamType[] $VALUES;
        public static final StreamType Normal = new StreamType("Normal", 0);
        public static final StreamType Error = new StreamType("Error", 1);

        private static final /* synthetic */ StreamType[] $values() {
            return new StreamType[]{Normal, Error};
        }

        static {
            StreamType[] streamTypeArr$values = $values();
            $VALUES = streamTypeArr$values;
            $ENTRIES = qf.a.a(streamTypeArr$values);
        }

        private StreamType(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static StreamType valueOf(String str) {
            return (StreamType) Enum.valueOf(StreamType.class, str);
        }

        public static StreamType[] values() {
            return (StreamType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StreamType.values().length];
            try {
                iArr[StreamType.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StreamType.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:3:0x0001, B:28:0x005e, B:44:0x008c, B:47:0x0094, B:49:0x0099, B:51:0x009e, B:52:0x00a1, B:38:0x007e, B:40:0x0083, B:42:0x0088), top: B:62:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:3:0x0001, B:28:0x005e, B:44:0x008c, B:47:0x0094, B:49:0x0099, B:51:0x009e, B:52:0x00a1, B:38:0x007e, B:40:0x0083, B:42:0x0088), top: B:62:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:3:0x0001, B:28:0x005e, B:44:0x008c, B:47:0x0094, B:49:0x0099, B:51:0x009e, B:52:0x00a1, B:38:0x007e, B:40:0x0083, B:42:0x0088), top: B:62:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] getResponseBody(java.net.URLConnection r6, org.bidon.sdk.utils.networking.impl.RawRequestClient.StreamType r7) {
        /*
            r5 = this;
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L68
            int[] r1 = org.bidon.sdk.utils.networking.impl.RawRequestClient.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r7 = r1[r7]     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r1 = 1
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            if (r7 == r1) goto L2c
            r1 = 2
            if (r7 != r1) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            goto L35
        L1d:
            r6 = move-exception
            r7 = r0
            r1 = r7
            goto L92
        L22:
            r6 = move-exception
            r7 = r0
            r1 = r7
            goto L75
        L26:
            lf.m r6 = new lf.m     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            throw r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            java.io.InputStream r6 = r6.getErrorStream()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
        L35:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r7.<init>()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L54
            int r2 = r6.read(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L54
        L42:
            r3 = -1
            if (r2 == r3) goto L5a
            r3 = 0
            r7.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L54
            int r2 = r6.read(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L54
            goto L42
        L4e:
            r1 = move-exception
            r4 = r7
            r7 = r6
            r6 = r1
            r1 = r4
            goto L92
        L54:
            r1 = move-exception
            r4 = r7
            r7 = r6
            r6 = r1
            r1 = r4
            goto L75
        L5a:
            byte[] r1 = r7.toByteArray()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L54
            r6.close()     // Catch: java.lang.Throwable -> L68
            r7.flush()     // Catch: java.lang.Throwable -> L68
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L8c
        L68:
            r6 = move-exception
            goto La2
        L6a:
            r7 = move-exception
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            goto L92
        L70:
            r7 = move-exception
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r0
        L75:
            java.lang.String r2 = "RawRequestClient"
            java.lang.String r3 = "Error while obtaining data"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logError(r2, r3, r6)     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L81
            r7.close()     // Catch: java.lang.Throwable -> L68
        L81:
            if (r1 == 0) goto L86
            r1.flush()     // Catch: java.lang.Throwable -> L68
        L86:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.lang.Throwable -> L68
        L8b:
            r1 = r0
        L8c:
            java.lang.Object r6 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L68
            goto Lac
        L91:
            r6 = move-exception
        L92:
            if (r7 == 0) goto L97
            r7.close()     // Catch: java.lang.Throwable -> L68
        L97:
            if (r1 == 0) goto L9c
            r1.flush()     // Catch: java.lang.Throwable -> L68
        L9c:
            if (r1 == 0) goto La1
            r1.close()     // Catch: java.lang.Throwable -> L68
        La1:
            throw r6     // Catch: java.lang.Throwable -> L68
        La2:
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        Lac:
            boolean r7 = kotlin.Result.i(r6)
            if (r7 == 0) goto Lb3
            goto Lb4
        Lb3:
            r0 = r6
        Lb4:
            byte[] r0 = (byte[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.impl.RawRequestClient.getResponseBody(java.net.URLConnection, org.bidon.sdk.utils.networking.impl.RawRequestClient$StreamType):byte[]");
    }

    private final void logResponseResult(RawRequest request, int responseCode, URL url, byte[] rawResponse) {
        LogExtKt.logInfo("RawRequestClient", " <-- " + request.getMethod() + " " + responseCode + " " + url + ", raw response(size: " + (rawResponse != null ? Integer.valueOf(rawResponse.length) : null) + ", data: " + (rawResponse != null ? ByteArrayExtKt.toHexString(rawResponse) : null) + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0100 A[Catch: all -> 0x0011, Exception -> 0x009b, TRY_LEAVE, TryCatch #3 {Exception -> 0x009b, blocks: (B:36:0x0093, B:38:0x0097, B:43:0x00a2, B:45:0x00a8, B:47:0x00ae, B:48:0x00bb, B:50:0x00c1, B:52:0x00d5, B:61:0x00e5, B:64:0x00f6, B:65:0x00fa, B:71:0x010e, B:72:0x0128, B:74:0x0130, B:75:0x0136, B:78:0x0146, B:84:0x0154, B:82:0x014f, B:83:0x0152, B:67:0x0100), top: B:95:0x0093, outer: #1 }] */
    /* JADX INFO: renamed from: requestRawData-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m8682requestRawDataBWLJW6A(java.net.URLConnection r12, org.bidon.sdk.utils.networking.impl.RawRequest r13, int r14, int r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.impl.RawRequestClient.m8682requestRawDataBWLJW6A(java.net.URLConnection, org.bidon.sdk.utils.networking.impl.RawRequest, int, int):java.lang.Object");
    }

    /* JADX INFO: renamed from: requestRawData-BWLJW6A$default, reason: not valid java name */
    static /* synthetic */ Object m8683requestRawDataBWLJW6A$default(RawRequestClient rawRequestClient, URLConnection uRLConnection, RawRequest rawRequest, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 40000;
        }
        if ((i12 & 4) != 0) {
            i11 = 40000;
        }
        return rawRequestClient.m8682requestRawDataBWLJW6A(uRLConnection, rawRequest, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: execute-IoAF18A, reason: not valid java name */
    public final Object m8684executeIoAF18A(@NotNull RawRequest rawRequest) throws Throwable {
        Throwable th2;
        URLConnection uRLConnectionOpenConnection;
        HttpURLConnection httpURLConnection;
        Intrinsics.checkNotNullParameter(rawRequest, "rawRequest");
        try {
            uRLConnectionOpenConnection = new URL(rawRequest.getUrl()).openConnection();
            try {
                Intrinsics.checkNotNull(uRLConnectionOpenConnection);
                Object objM8683requestRawDataBWLJW6A$default = m8683requestRawDataBWLJW6A$default(this, uRLConnectionOpenConnection, rawRequest, 0, 0, 6, null);
                httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return objM8683requestRawDataBWLJW6A$default;
            } catch (Throwable th3) {
                th2 = th3;
                httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                if (httpURLConnection == null) {
                    throw th2;
                }
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            uRLConnectionOpenConnection = null;
        }
    }
}
