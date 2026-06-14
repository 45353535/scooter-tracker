package org.bidon.sdk.utils.networking.encoders;

import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/utils/networking/encoders/GZIPRequestDataEncoder;", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataEncoder;", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataDecoder;", "<init>", "()V", "getHeaders", "", "", "", "encode", "", "data", "decode", "contentEncoding", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GZIPRequestDataEncoder implements RequestDataEncoder, RequestDataDecoder {

    @NotNull
    public static final GZIPRequestDataEncoder INSTANCE = new GZIPRequestDataEncoder();

    private GZIPRequestDataEncoder() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    @Override // org.bidon.sdk.utils.networking.encoders.RequestDataDecoder
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] decode(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.NotNull byte[] r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "gzip"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 == 0) goto L5e
            r6 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L45
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L45
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L40
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L40
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
            goto L4e
        L2f:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L2d
            r0.close()
            r1.close()
            r7.close()
            return r6
        L40:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
            goto L4e
        L45:
            r7 = move-exception
            r1 = r6
        L47:
            r6 = r7
            r7 = r1
            goto L4e
        L4a:
            r7 = move-exception
            r0 = r6
            r1 = r0
            goto L47
        L4e:
            if (r0 == 0) goto L53
            r0.close()
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            if (r7 == 0) goto L5d
            r7.close()
        L5d:
            throw r6
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.encoders.GZIPRequestDataEncoder.decode(java.lang.String, byte[]):byte[]");
    }

    @Override // org.bidon.sdk.utils.networking.encoders.RequestDataEncoder
    @NotNull
    public byte[] encode(@NotNull byte[] data) throws Throwable {
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

    @Override // org.bidon.sdk.utils.networking.encoders.RequestDataEncoder
    @NotNull
    public Map<String, List<String>> getHeaders() {
        return MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCEPT_ENCODING, CollectionsKt.listOf("gzip")), TuplesKt.to("Content-Encoding", CollectionsKt.listOf("gzip")));
    }
}
