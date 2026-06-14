package uf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
