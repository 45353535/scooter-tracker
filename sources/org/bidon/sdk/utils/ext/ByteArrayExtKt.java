package org.bidon.sdk.utils.ext;

import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toHexString", "", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ByteArrayExtKt {
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            cArr[i11] = charArray[(b10 & 255) >>> 4];
            cArr[i11 + 1] = charArray[b10 & Ascii.SI];
        }
        return new String(cArr);
    }
}
