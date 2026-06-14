package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f118653a = MapsKt.mapOf(TuplesKt.to("CLIENT_TIME", yf1.f118170b));

    public final String a(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                break;
            }
            String str3 = str;
            int iU0 = StringsKt.u0(str3, '{', i10, false, 4, null);
            if (iU0 == -1) {
                sb2.append((CharSequence) str3, i10, str3.length());
                break;
            }
            sb2.append((CharSequence) str3, i10, iU0);
            int i11 = iU0 + 1;
            int iU02 = StringsKt.u0(str3, '}', i11, false, 4, null);
            if (iU02 == -1) {
                sb2.append((CharSequence) str3, iU0, str3.length());
                break;
            }
            String strSubstring = str3.substring(i11, iU02);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Function0 function0 = (Function0) this.f118653a.get(strSubstring);
            if (function0 == null || (str2 = (String) function0.invoke()) == null) {
                str2 = "{" + strSubstring + "}";
            }
            sb2.append(str2);
            i10 = iU02 + 1;
            str = str3;
        }
        return sb2.toString();
    }
}
