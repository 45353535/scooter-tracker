package ve;

import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f106703a = SetsKt.setOf((Object[]) new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS), '\"', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), '[', ']', '?', Character.valueOf(D5.T), '{', '}', ' ', '\t', '\n', '\r'});

    private static final boolean b(String str) {
        if (str.length() < 2 || StringsKt.C1(str) != '\"' || StringsKt.E1(str) != '\"') {
            return false;
        }
        int i10 = 1;
        while (true) {
            String str2 = str;
            int iU0 = StringsKt.u0(str2, '\"', i10, false, 4, null);
            if (iU0 == StringsKt.p0(str2)) {
                break;
            }
            int i11 = 0;
            for (int i12 = iU0 - 1; str2.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = iU0 + 1;
            if (i10 >= str2.length()) {
                break;
            }
            str = str2;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f106703a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(str, sb2);
        return sb2.toString();
    }

    private static final void e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                sb2.append(cCharAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append("\"");
    }
}
