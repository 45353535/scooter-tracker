package xe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final int a(d text, int i10, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        while (i10 < i11) {
            char cCharAt = text.charAt(i10);
            if (!CharsKt.b(cCharAt) && cCharAt != '\t') {
                break;
            }
            i10++;
        }
        return i10;
    }
}
