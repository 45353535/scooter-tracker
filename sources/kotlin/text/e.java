package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
