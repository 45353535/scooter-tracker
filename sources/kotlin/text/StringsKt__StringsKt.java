package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001d\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001f\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001d\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u001f\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u001d\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b%\u0010\u001f\u001a\u0019\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010(\u001a!\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010&\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b-\u0010(\u001a;\u00102\u001a\u00020\u0013*\u00020\u00072\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0013H\u0000¢\u0006\u0004\b2\u00103\u001a#\u00105\u001a\u00020\u0013*\u00020\u00072\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b5\u00106\u001a#\u00107\u001a\u00020\u0013*\u00020\u00072\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b7\u00106\u001a#\u00108\u001a\u00020\u0013*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b8\u00109\u001a+\u0010;\u001a\u00020\u0013*\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u00020\u0013*\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b=\u00109\u001a-\u0010>\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b>\u0010?\u001a-\u0010@\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\b@\u0010?\u001a=\u0010C\u001a\u00020\f*\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010D\u001aG\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0000\u0018\u00010G*\u00020\u00072\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0006\u0010:\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u0013H\u0002¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u00020\f*\u00020\u00072\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\bJ\u0010K\u001a-\u0010M\u001a\u00020\f*\u00020\u00072\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\u00020\f*\u00020\u00072\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\bO\u0010K\u001a-\u0010P\u001a\u00020\f*\u00020\u00072\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u0013¢\u0006\u0004\bP\u0010N\u001a&\u0010Q\u001a\u00020\u0013*\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\bQ\u00109\u001a&\u0010R\u001a\u00020\u0013*\u00020\u00072\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\bR\u00106\u001a?\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00160U*\u00020\u00072\u0006\u0010S\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00160U*\u00020\u00072\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X2\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010\\\u001a\u00020[2\u0006\u0010T\u001a\u00020\fH\u0000¢\u0006\u0004\b\\\u0010]\u001a?\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\u00072\u0012\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X\"\u00020\u00002\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u0010T\u001a\u00020\f¢\u0006\u0004\b_\u0010`\u001a7\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\u00072\n\u0010S\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u0010T\u001a\u00020\f¢\u0006\u0004\ba\u0010b\u001a1\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000U*\u00020\u0007¢\u0006\u0004\be\u0010f\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\u0007¢\u0006\u0004\bg\u0010h\u001a\u001f\u0010i\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\bi\u0010j\u001a\u001f\u0010k\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\bk\u0010j\u001a\u0015\u0010l\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bl\u0010m\"\u0015\u0010p\u001a\u00020\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\bn\u0010o\"\u0015\u0010s\u001a\u00020\f*\u00020\u00078F¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"", "", "", "chars", "w1", "(Ljava/lang/String;[C)Ljava/lang/String;", "y1", "", "v1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "z1", "x1", "", SessionDescription.ATTR_LENGTH, "padChar", "G0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "H0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "y0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", SessionDescription.ATTR_RANGE, "d1", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "m1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "n1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "e1", "f1", "q1", "r1", "i1", "j1", "prefix", "P0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "Q0", "S0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "R0", "thisOffset", "other", "otherOffset", "ignoreCase", "O0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "Y0", "(Ljava/lang/CharSequence;CZ)Z", "j0", "a1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "startIndex", "Z0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "k0", "w0", "(Ljava/lang/CharSequence;[CIZ)I", "D0", "endIndex", "last", "s0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "n0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "q0", "(Ljava/lang/CharSequence;CIZ)I", TypedValues.Custom.S_STRING, "r0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "z0", "A0", "e0", "d0", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "I0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "J0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "T0", "(I)V", "", "V0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "U0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "W0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "E0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "F0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "h0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "i0", "u1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "o0", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "p0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends v {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f93480a;

        public a(CharSequence charSequence) {
            this.f93480a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new f(this.f93480a);
        }
    }

    public static final int A0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? s0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int B0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = p0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return z0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int C0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = p0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return A0(charSequence, str, i10, z10);
    }

    public static final int D0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(chars), i10);
        }
        for (int iJ = kotlin.ranges.g.j(i10, p0(charSequence)); -1 < iJ; iJ--) {
            char cCharAt = charSequence.charAt(iJ);
            for (char c10 : chars) {
                if (kotlin.text.a.g(c10, cCharAt, z10)) {
                    return iJ;
                }
            }
        }
        return -1;
    }

    public static Sequence E0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    public static List F0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.k.c0(E0(charSequence));
    }

    public static final CharSequence G0(CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String H0(String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return G0(str, i10, c10).toString();
    }

    private static final Sequence I0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        T0(i11);
        return new b(charSequence, i10, i11, new Function2() { // from class: kotlin.text.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.M0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final Sequence J0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        T0(i11);
        final List listAsList = ArraysKt.asList(strArr);
        return new b(charSequence, i10, i11, new Function2() { // from class: kotlin.text.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.N0(listAsList, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ Sequence K0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return I0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ Sequence L0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return J0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair M0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iW0 = w0(DelimitedRangesSequence, cArr, i10, z10);
        if (iW0 < 0) {
            return null;
        }
        return TuplesKt.to(Integer.valueOf(iW0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair N0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairN0 = n0(DelimitedRangesSequence, list, i10, z10, false);
        if (pairN0 != null) {
            return TuplesKt.to(pairN0.getFirst(), Integer.valueOf(((String) pairN0.getSecond()).length()));
        }
        return null;
    }

    public static final boolean O0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!kotlin.text.a.g(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String P0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!c1(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!m0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return S0(str, delimiter, delimiter);
    }

    public static final String S0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !c1(str, prefix, false, 2, null) || !m0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void T0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List U0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return W0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableA = kotlin.sequences.k.A(K0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableA, 10));
        Iterator it = iterableA.iterator();
        while (it.hasNext()) {
            arrayList.add(d1(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List V0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return W0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableA = kotlin.sequences.k.A(L0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableA, 10));
        Iterator it = iterableA.iterator();
        while (it.hasNext()) {
            arrayList.add(d1(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List W0(CharSequence charSequence, String str, boolean z10, int i10) {
        T0(i10);
        int length = 0;
        int iR0 = r0(charSequence, str, 0, z10);
        if (iR0 == -1 || i10 == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? kotlin.ranges.g.j(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iR0).toString());
            length = str.length() + iR0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iR0 = r0(charSequence, str, length, z10);
        } while (iR0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List X0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return U0(charSequence, cArr, z10, i10);
    }

    public static final boolean Y0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.g(charSequence.charAt(0), c10, z10);
    }

    public static boolean Z0(CharSequence charSequence, CharSequence prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? v.Z((String) charSequence, (String) prefix, i10, false, 4, null) : O0(charSequence, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean a1(CharSequence charSequence, CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? v.a0((String) charSequence, (String) prefix, false, 2, null) : O0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean b1(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean c1(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a1(charSequence, charSequence2, z10);
    }

    public static final boolean d0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return u0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String d1(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static boolean e0(CharSequence charSequence, CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other instanceof String ? v0(charSequence, (String) other, 0, z10, 2, null) >= 0 : t0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static String e1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iU0 = u0(str, c10, 0, false, 6, null);
        if (iU0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iU0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean f0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d0(charSequence, c10, z10);
    }

    public static String f1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(str, delimiter, 0, false, 6, null);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iV0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean g0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String g1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return e1(str, c10, str2);
    }

    public static final boolean h0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return v.N((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!kotlin.text.a.g(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String h1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return f1(str, str2, str3);
    }

    public static final boolean i0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static String i1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(str, c10, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean j0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.g(charSequence.charAt(p0(charSequence)), c10, z10);
    }

    public static final String j1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = C0(str, delimiter, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iC0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean k0(CharSequence charSequence, CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? v.M((String) charSequence, (String) suffix, false, 2, null) : O0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ String k1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return i1(str, c10, str2);
    }

    public static /* synthetic */ boolean l0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j0(charSequence, c10, z10);
    }

    public static /* synthetic */ String l1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return j1(str, str2, str3);
    }

    public static /* synthetic */ boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return k0(charSequence, charSequence2, z10);
    }

    public static final String m1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iU0 = u0(str, c10, 0, false, 6, null);
        if (iU0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iU0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final Pair n0(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int iV0 = !z11 ? v0(charSequence, str, i10, false, 4, null) : C0(charSequence, str, i10, false, 4, null);
            if (iV0 < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(iV0), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.d intRange = !z11 ? new IntRange(kotlin.ranges.g.e(i10, 0), charSequence3.length()) : kotlin.ranges.g.r(kotlin.ranges.g.j(i10, p0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iE = intRange.e();
            int iF = intRange.f();
            int iG = intRange.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                int i11 = iE;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (v.Q(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iF) {
                            break;
                        }
                        i11 += iG;
                        z10 = z12;
                    } else {
                        return TuplesKt.to(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iE2 = intRange.e();
            int iF2 = intRange.f();
            int iG2 = intRange.g();
            if ((iG2 > 0 && iE2 <= iF2) || (iG2 < 0 && iF2 <= iE2)) {
                int i12 = iE2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (O0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iF2) {
                            break;
                        }
                        i12 += iG2;
                        charSequence3 = charSequence2;
                    } else {
                        return TuplesKt.to(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final String n1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(str, delimiter, 0, false, 6, null);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iV0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static IntRange o0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String o1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m1(str, c10, str2);
    }

    public static int p0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String p1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return n1(str, str2, str3);
    }

    public static final int q0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? w0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static String q1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(str, c10, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iB0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int r0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? t0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static String r1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = C0(str, delimiter, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iC0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int s0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.d intRange = !z11 ? new IntRange(kotlin.ranges.g.e(i10, 0), kotlin.ranges.g.j(i11, charSequence.length())) : kotlin.ranges.g.r(kotlin.ranges.g.j(i10, p0(charSequence)), kotlin.ranges.g.e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iE = intRange.e();
            int iF = intRange.f();
            int iG = intRange.g();
            if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
                return -1;
            }
            int i12 = iE;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (v.Q(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iF) {
                    return -1;
                }
                i12 += iG;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iE2 = intRange.e();
            int iF2 = intRange.f();
            int iG2 = intRange.g();
            if ((iG2 <= 0 || iE2 > iF2) && (iG2 >= 0 || iF2 > iE2)) {
                return -1;
            }
            int i13 = iE2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (O0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iF2) {
                    return -1;
                }
                i13 += iG2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ String s1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return q1(str, c10, str2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return V0(charSequence, strArr, z10, i10);
    }

    static /* synthetic */ int t0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return s0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String t1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return r1(str, str2, str3);
    }

    public static /* synthetic */ int u0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return q0(charSequence, c10, i10, z10);
    }

    public static Boolean u1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int v0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return r0(charSequence, str, i10, z10);
    }

    public static CharSequence v1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zB = CharsKt__CharJVMKt.b(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int w0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(chars), i10);
        }
        int iE = kotlin.ranges.g.e(i10, 0);
        int iP0 = p0(charSequence);
        if (iE > iP0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            for (char c10 : chars) {
                if (kotlin.text.a.g(c10, cCharAt, z10)) {
                    return iE;
                }
            }
            if (iE == iP0) {
                return -1;
            }
            iE++;
        }
    }

    public static String w1(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zContains = ArraysKt.contains(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int x0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return w0(charSequence, cArr, i10, z10);
    }

    public static CharSequence x1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static boolean y0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String y1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!ArraysKt.contains(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final int z0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? D0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static CharSequence z1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }
}
