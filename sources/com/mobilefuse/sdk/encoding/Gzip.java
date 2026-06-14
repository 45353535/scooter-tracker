package com.mobilefuse.sdk.encoding;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import uf.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0005"}, d2 = {"gunzip", "", "", "gzip", "toGzipByteArray", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class Gzip {
    @Nullable
    public static final String gunzip(@NotNull byte[] gunzip) {
        Intrinsics.checkNotNullParameter(gunzip, "$this$gunzip");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(gunzip)), Charsets.UTF_8), 8192);
            try {
                String strI = r.i(bufferedReader);
                c.a(bufferedReader, null);
                return strI;
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final byte[] gzip(@NotNull byte[] gzip) throws IOException {
        Intrinsics.checkNotNullParameter(gzip, "$this$gzip");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(gzip);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "byteStream.toByteArray()");
        return byteArray;
    }

    @NotNull
    public static final byte[] toGzipByteArray(@NotNull String toGzipByteArray) {
        Intrinsics.checkNotNullParameter(toGzipByteArray, "$this$toGzipByteArray");
        byte[] bytes = toGzipByteArray.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return gzip(bytes);
    }
}
