package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i11 = 0;
            while (i11 < length2) {
                bArr[i10] = (byte) str2.charAt(i11);
                i11++;
                i10++;
            }
        }
        return bArr;
    }
}
