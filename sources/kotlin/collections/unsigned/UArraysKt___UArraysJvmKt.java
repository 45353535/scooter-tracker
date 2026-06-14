package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.c0;
import lf.r;
import lf.s;
import lf.t;
import lf.u;
import lf.v;
import lf.w;
import lf.y;
import lf.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u0006\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0006\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0013*\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013*\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013*\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\"\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b \u0010!\u001a/\u0010\"\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b#\u0010$\u001a/\u0010\"\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010&\u001a/\u0010\"\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a=\u00108\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a=\u00108\u001a\u0004\u0018\u00010\b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00108\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00108\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010D\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030?j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`@H\u0007¢\u0006\u0004\bB\u0010C\u001a1\u0010D\u001a\u0004\u0018\u00010\b*\u00020\u00072\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0?j\n\u0012\u0006\b\u0000\u0012\u00020\b`@H\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010D\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0?j\n\u0012\u0006\b\u0000\u0012\u00020\f`@H\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010D\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100?j\n\u0012\u0006\b\u0000\u0012\u00020\u0010`@H\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\bK\u0010*\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010Q\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\bP\u00107\u001a=\u0010Q\u001a\u0004\u0018\u00010\b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010Q\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010Q\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010V\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030?j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`@H\u0007¢\u0006\u0004\bU\u0010C\u001a1\u0010V\u001a\u0004\u0018\u00010\b*\u00020\u00072\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0?j\n\u0012\u0006\b\u0000\u0012\u00020\b`@H\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010V\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0?j\n\u0012\u0006\b\u0000\u0012\u00020\f`@H\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010V\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100?j\n\u0012\u0006\b\u0000\u0012\u00020\u0010`@H\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010]\u001a\u00020Z*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Z04H\u0087\bø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001a+\u0010]\u001a\u00020Z*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020Z04H\u0087\bø\u0001\u0000¢\u0006\u0004\b[\u0010^\u001a+\u0010]\u001a\u00020Z*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020Z04H\u0087\bø\u0001\u0000¢\u0006\u0004\b[\u0010_\u001a+\u0010]\u001a\u00020Z*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020Z04H\u0087\bø\u0001\u0000¢\u0006\u0004\b[\u0010`\u001a+\u0010]\u001a\u00020a*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020a04H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a+\u0010]\u001a\u00020a*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020a04H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010d\u001a+\u0010]\u001a\u00020a*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020a04H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010e\u001a+\u0010]\u001a\u00020a*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020a04H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"Llf/u;", "", FirebaseAnalytics.Param.INDEX, "Llf/t;", "elementAt-qFRl0hI", "([II)I", "elementAt", "Llf/w;", "Llf/v;", "elementAt-r7IrZao", "([JI)J", "Llf/s;", "Llf/r;", "elementAt-PpDY95g", "([BI)B", "Llf/z;", "Llf/y;", "elementAt-nggk6HY", "([SI)S", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "element", "fromIndex", "toIndex", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", "max--ajY-9A", "([I)Llf/t;", "max", "max-QwZRm1k", "([J)Llf/v;", "max-GBYM_sE", "([B)Llf/r;", "max-rL5Bavg", "([S)Llf/y;", "", "R", "Lkotlin/Function1;", "selector", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Llf/t;", "maxBy", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Llf/v;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Llf/r;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Llf/y;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Llf/t;", "maxWith", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Llf/v;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Llf/r;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Llf/y;", "min--ajY-9A", "min", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy-jgv0xPQ", "minBy", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith-YmdZ_VM", "minWith", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "sumOf", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    @NotNull
    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<t> m7943asListajY9A(@NotNull int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    @NotNull
    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<r> m7944asListGBYM_sE(@NotNull byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    @NotNull
    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<v> m7945asListQwZRm1k(@NotNull long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    @NotNull
    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<y> m7946asListrL5Bavg(@NotNull short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m7947binarySearch2fe2U9s(@NotNull int[] binarySearch, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i11, i12, u.n(binarySearch));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iB = c0.b(binarySearch[i14], i10);
            if (iB < 0) {
                i11 = i14 + 1;
            } else {
                if (iB <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m7948binarySearch2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = u.n(iArr);
        }
        return m7947binarySearch2fe2U9s(iArr, i10, i11, i12);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m7949binarySearchEtDCXyQ(@NotNull short[] binarySearch, short s10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, z.n(binarySearch));
        int i12 = s10 & 65535;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iB = c0.b(binarySearch[i14], i12);
            if (iB < 0) {
                i10 = i14 + 1;
            } else {
                if (iB <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m7950binarySearchEtDCXyQ$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = z.n(sArr);
        }
        return m7949binarySearchEtDCXyQ(sArr, s10, i10, i11);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m7951binarySearchK6DWlUc(@NotNull long[] binarySearch, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, w.n(binarySearch));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = c0.d(binarySearch[i13], j10);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m7952binarySearchK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = w.n(jArr);
        }
        return m7951binarySearchK6DWlUc(jArr, j10, i10, i11);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m7953binarySearchWpHrYlw(@NotNull byte[] binarySearch, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, s.n(binarySearch));
        int i12 = b10 & 255;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iB = c0.b(binarySearch[i14], i12);
            if (iB < 0) {
                i10 = i14 + 1;
            } else {
                if (iB <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m7954binarySearchWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = s.n(bArr);
        }
        return m7953binarySearchWpHrYlw(bArr, b10, i10, i11);
    }

    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m7955elementAtPpDY95g(byte[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return s.l(elementAt, i10);
    }

    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m7956elementAtnggk6HY(short[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return z.l(elementAt, i10);
    }

    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m7957elementAtqFRl0hI(int[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return u.l(elementAt, i10);
    }

    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m7958elementAtr7IrZao(long[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return w.l(elementAt, i10);
    }

    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ t m7959maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m8327maxOrNullajY9A(max);
    }

    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ r m7960maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m8328maxOrNullGBYM_sE(max);
    }

    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ v m7961maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m8329maxOrNullQwZRm1k(max);
    }

    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ y m7962maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m8330maxOrNullrL5Bavg(max);
    }

    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> r m7963maxByJOV_ifY(byte[] maxBy, Function1<? super r, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (s.p(maxBy)) {
            return null;
        }
        byte bL = s.l(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return r.a(bL);
        }
        R rInvoke = selector.invoke(r.a(bL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bL2 = s.l(maxBy, i10);
                R rInvoke2 = selector.invoke(r.a(bL2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bL = bL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return r.a(bL);
    }

    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> v m7964maxByMShoTSo(long[] maxBy, Function1<? super v, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (w.p(maxBy)) {
            return null;
        }
        long jL = w.l(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return v.a(jL);
        }
        R rInvoke = selector.invoke(v.a(jL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jL2 = w.l(maxBy, i10);
                R rInvoke2 = selector.invoke(v.a(jL2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jL = jL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return v.a(jL);
    }

    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> t m7965maxByjgv0xPQ(int[] maxBy, Function1<? super t, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (u.p(maxBy)) {
            return null;
        }
        int iL = u.l(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return t.a(iL);
        }
        R rInvoke = selector.invoke(t.a(iL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iL2 = u.l(maxBy, i10);
                R rInvoke2 = selector.invoke(t.a(iL2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iL = iL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t.a(iL);
    }

    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> y m7966maxByxTcfx_M(short[] maxBy, Function1<? super y, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z.p(maxBy)) {
            return null;
        }
        short sL = z.l(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return y.a(sL);
        }
        R rInvoke = selector.invoke(y.a(sL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sL2 = z.l(maxBy, i10);
                R rInvoke2 = selector.invoke(y.a(sL2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sL = sL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y.a(sL);
    }

    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ r m7967maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8335maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ t m7968maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8336maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ y m7969maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8337maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ v m7970maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8338maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ t m7971minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m8383minOrNullajY9A(min);
    }

    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ r m7972minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m8384minOrNullGBYM_sE(min);
    }

    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ v m7973minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m8385minOrNullQwZRm1k(min);
    }

    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ y m7974minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m8386minOrNullrL5Bavg(min);
    }

    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> r m7975minByJOV_ifY(byte[] minBy, Function1<? super r, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (s.p(minBy)) {
            return null;
        }
        byte bL = s.l(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return r.a(bL);
        }
        R rInvoke = selector.invoke(r.a(bL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bL2 = s.l(minBy, i10);
                R rInvoke2 = selector.invoke(r.a(bL2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bL = bL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return r.a(bL);
    }

    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> v m7976minByMShoTSo(long[] minBy, Function1<? super v, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (w.p(minBy)) {
            return null;
        }
        long jL = w.l(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return v.a(jL);
        }
        R rInvoke = selector.invoke(v.a(jL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jL2 = w.l(minBy, i10);
                R rInvoke2 = selector.invoke(v.a(jL2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jL = jL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return v.a(jL);
    }

    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> t m7977minByjgv0xPQ(int[] minBy, Function1<? super t, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (u.p(minBy)) {
            return null;
        }
        int iL = u.l(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return t.a(iL);
        }
        R rInvoke = selector.invoke(t.a(iL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iL2 = u.l(minBy, i10);
                R rInvoke2 = selector.invoke(t.a(iL2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iL = iL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t.a(iL);
    }

    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> y m7978minByxTcfx_M(short[] minBy, Function1<? super y, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z.p(minBy)) {
            return null;
        }
        short sL = z.l(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return y.a(sL);
        }
        R rInvoke = selector.invoke(y.a(sL));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sL2 = z.l(minBy, i10);
                R rInvoke2 = selector.invoke(y.a(sL2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sL = sL2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y.a(sL);
    }

    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ r m7979minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8391minWithOrNullXMRcp5o(minWith, comparator);
    }

    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ t m7980minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8392minWithOrNullYmdZ_VM(minWith, comparator);
    }

    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ y m7981minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8393minWithOrNulleOHTfZs(minWith, comparator);
    }

    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ v m7982minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m8394minWithOrNullzrEWJaI(minWith, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(int[] sumOf, Function1<? super t, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iN = u.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t.a(u.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] sumOf, Function1<? super t, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iN = u.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t.a(u.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(long[] sumOf, Function1<? super v, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iN = w.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(v.a(w.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] sumOf, Function1<? super v, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iN = w.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(v.a(w.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, Function1<? super r, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iN = s.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(r.a(s.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] sumOf, Function1<? super r, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iN = s.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(r.a(s.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sumOf, Function1<? super y, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iN = z.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(y.a(z.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sumOf, Function1<? super y, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iN = z.n(sumOf);
        for (int i10 = 0; i10 < iN; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(y.a(z.l(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
