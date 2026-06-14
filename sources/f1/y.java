package f1;

import android.util.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class y {
    public final String a(String str) {
        String strW = StringsKt.W(str, IOUtils.LINE_SEPARATOR_UNIX, "", false, 4, null);
        int length = strW.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = Intrinsics.compare((int) strW.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return strW.subSequence(i10, length + 1).toString();
    }

    public final String b(String encodedString) {
        Object objB;
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        try {
            Result.Companion companion = Result.f93230c;
            byte[] bArrDecode = Base64.decode(a(encodedString), 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            objB = Result.b(new String(bArrDecode, Charsets.UTF_8));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.j("Cannot decode base64 string: " + thG.getLocalizedMessage(), null, 2, null);
        }
        if (Result.i(objB)) {
            objB = "";
        }
        return (String) objB;
    }

    public final String c(String originalString) {
        Object objB;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        try {
            Result.Companion companion = Result.f93230c;
            byte[] bytes = originalString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            objB = Result.b(a(strEncodeToString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.j("Cannot encode to base64 string: " + thG.getLocalizedMessage(), null, 2, null);
        }
        if (Result.i(objB)) {
            objB = "";
        }
        return (String) objB;
    }
}
