package com.yandex.div.evaluable.types;

import com.taurusx.tax.f.y;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/evaluable/types/Color;", "", "", "value", "constructor-impl", "(I)I", "alpha-impl", "alpha", "red-impl", "red", "green-impl", "green", "blue-impl", "blue", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Color {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/evaluable/types/Color$Companion;", "", "<init>", "()V", "", "alpha", "red", "green", "blue", "Lcom/yandex/div/evaluable/types/Color;", "argb-H0kstlE", "(IIII)I", "argb", "", "colorString", "parse-C4zCDoM", "(Ljava/lang/String;)I", "parse", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m7668argbH0kstlE(int alpha, int red, int green, int blue) {
            return Color.m7660constructorimpl((alpha << 24) | (red << 16) | (green << 8) | blue);
        }

        /* JADX INFO: renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m7669parseC4zCDoM(@NotNull String colorString) throws IllegalArgumentException {
            String str;
            Intrinsics.checkNotNullParameter(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException(("Unknown color " + colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char cCharAt = colorString.charAt(1);
                char cCharAt2 = colorString.charAt(2);
                char cCharAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = colorString.charAt(1);
                char cCharAt5 = colorString.charAt(2);
                char cCharAt6 = colorString.charAt(3);
                char cCharAt7 = colorString.charAt(4);
                str = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ff");
                String strSubstring = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                str = sb2.toString();
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color " + colorString);
                }
                str = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return Color.m7660constructorimpl((int) Long.parseLong(str, CharsKt.checkRadix(16)));
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: alpha-impl, reason: not valid java name */
    public static final int m7657alphaimpl(int i10) {
        return i10 >>> 24;
    }

    /* JADX INFO: renamed from: blue-impl, reason: not valid java name */
    public static final int m7658blueimpl(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m7659boximpl(int i10) {
        return new Color(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m7660constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7661equalsimpl(int i10, Object obj) {
        return (obj instanceof Color) && i10 == ((Color) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7662equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: green-impl, reason: not valid java name */
    public static final int m7663greenimpl(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7664hashCodeimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: red-impl, reason: not valid java name */
    public static final int m7665redimpl(int i10) {
        return (i10 >> 16) & 255;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7666toStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        String upperCase = StringsKt.H0(hexString, 8, '0').toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m7661equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7664hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m7666toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
