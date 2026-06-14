package ve;

import com.google.common.base.Ascii;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f106597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f106598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f106599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f106600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f106601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f106602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f106603g;

    static {
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.b('a', 'z'), (Iterable) new kotlin.ranges.b('A', 'Z')), (Iterable) new kotlin.ranges.b('0', '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f106597a = CollectionsKt.toSet(arrayList);
        f106598b = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.b('a', 'z'), (Iterable) new kotlin.ranges.b('A', 'Z')), (Iterable) new kotlin.ranges.b('0', '9')));
        f106599c = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.b('a', 'f'), (Iterable) new kotlin.ranges.b('A', 'F')), (Iterable) new kotlin.ranges.b('0', '9')));
        Set of2 = SetsKt.setOf((Object[]) new Character[]{':', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', Character.valueOf(D5.T), '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f106600d = arrayList2;
        f106601e = SetsKt.setOf((Object[]) new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', Character.valueOf(D5.T), '-', '.', '_', '~'});
        f106602f = SetsKt.plus(f106598b, (Iterable) SetsKt.setOf((Object[]) new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listListOf = CollectionsKt.listOf((Object[]) new Character[]{'-', '.', '_', '~'});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f106603g = arrayList3;
    }

    private static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        r0.append(kotlin.text.StringsKt.H(r2, 0, r4, false, 4, null));
        r9 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String f(java.lang.CharSequence r8, int r9, int r10, int r11, boolean r12, java.nio.charset.Charset r13) throws ve.p0 {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.f.f(java.lang.CharSequence, int, int, int, boolean, java.nio.charset.Charset):java.lang.String");
    }

    private static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String h(String str, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return h(str, i10, i11, charset);
    }

    public static final String j(String str, int i10, int i11, boolean z10, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return j(str, i10, i11, z10, charset);
    }

    public static final String l(String str, final boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        w(gf.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1() { // from class: ve.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.n(sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String m(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(StringBuilder sb2, boolean z10, byte b10) {
        if (f106597a.contains(Byte.valueOf(b10)) || f106603g.contains(Byte.valueOf(b10))) {
            sb2.append((char) b10);
        } else if (z10 && b10 == 32) {
            sb2.append('+');
        } else {
            sb2.append(z(b10));
        }
        return Unit.f93236a;
    }

    public static final String o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, true);
    }

    public static final String p(String str, boolean z10, boolean z11) {
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        Charset charset = Charsets.UTF_8;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((!z10 && cCharAt == '/') || f106598b.contains(Character.valueOf(cCharAt)) || f106601e.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                i11++;
            } else {
                if (!z11 && cCharAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set set = f106599c;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(cCharAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = CharsKt.h(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
                int i14 = i13 + i11;
                w(gf.b.c(charsetEncoderNewEncoder, str, i11, i14), new Function1() { // from class: ve.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.r(sb2, ((Byte) obj).byteValue());
                    }
                });
                i11 = i14;
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String q(String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return p(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(StringBuilder sb2, byte b10) {
        sb2.append(z(b10));
        return Unit.f93236a;
    }

    public static final String s(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(str, true, false, 2, null);
    }

    public static final String t(String str, final boolean z10, final boolean z11, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        w(gf.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1() { // from class: ve.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.v(z11, sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String u(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return t(str, z10, z11, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(boolean z10, StringBuilder sb2, boolean z11, byte b10) {
        if (b10 == 32) {
            if (z10) {
                sb2.append('+');
            } else {
                sb2.append("%20");
            }
        } else if (f106597a.contains(Byte.valueOf(b10)) || (!z11 && f106600d.contains(Byte.valueOf(b10)))) {
            sb2.append((char) b10);
        } else {
            sb2.append(z(b10));
        }
        return Unit.f93236a;
    }

    private static final void w(pg.s sVar, final Function1 function1) {
        hf.e.c(sVar, new Function1() { // from class: ve.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.x(function1, (pg.a) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(Function1 function1, pg.a buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (hf.a.a(buffer)) {
            function1.invoke(Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    private static final char y(int i10) {
        return (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48);
    }

    private static final String z(byte b10) {
        return StringsKt.B(new char[]{'%', y((b10 & 255) >> 4), y(b10 & Ascii.SI)});
    }
}
