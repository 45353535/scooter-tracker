package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class t extends s {
    public static StringBuilder r(StringBuilder sb2, String... value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }
}
