package kotlin.text;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class p extends l {
    private static final Function1 e(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.f((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.g(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    private static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.b(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String i(String str, final String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return kotlin.sequences.k.O(kotlin.sequences.k.Q(StringsKt__StringsKt.E0(str), new Function1() { // from class: kotlin.text.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.k(indent, (String) obj);
            }
        }), IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt__StringsKt.y0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    public static final String l(String str, String newIndent) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List listF0 = StringsKt__StringsKt.F0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (!StringsKt__StringsKt.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listF0.size());
        Function1 function1E = e(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listF0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listF0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == lastIndex) && StringsKt__StringsKt.y0(str3)) {
                str3 = null;
            } else {
                String strA1 = z.A1(str3, iIntValue);
                if (strA1 != null && (str2 = (String) function1E.invoke(strA1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : IOUtils.LINE_SEPARATOR_UNIX, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String m(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.y0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listF0 = StringsKt__StringsKt.F0(str);
        int length = str.length() + (newIndent.length() * listF0.size());
        Function1 function1E = e(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listF0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listF0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == lastIndex) && StringsKt__StringsKt.y0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.b(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (v.Z(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        Intrinsics.checkNotNull(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) function1E.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : IOUtils.LINE_SEPARATOR_UNIX, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, "");
    }

    public static final String o(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return m(str, "", marginPrefix);
    }

    public static /* synthetic */ String p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }
}
