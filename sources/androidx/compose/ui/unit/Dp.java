package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", y.f66058y, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dp implements Comparable<Dp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m3951constructorimpl(0.0f);
    private static final float Infinity = m3951constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m3951constructorimpl(Float.NaN);
    private final float value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3966getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3967getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3968getUnspecifiedD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m3969getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m3970getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m3971getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Dp(float f10) {
        this.value = f10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m3949boximpl(float f10) {
        return new Dp(f10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m3951constructorimpl(float f10) {
        return f10;
    }

    @Stable
    /* JADX INFO: renamed from: div-0680j_4, reason: not valid java name */
    public static final float m3952div0680j_4(float f10, float f11) {
        return f10 / f11;
    }

    @Stable
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m3953divu2uoSUM(float f10, float f11) {
        return m3951constructorimpl(f10 / f11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3955equalsimpl(float f10, Object obj) {
        return (obj instanceof Dp) && Float.compare(f10, ((Dp) obj).m3965unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3956equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3957hashCodeimpl(float f10) {
        return Float.floatToIntBits(f10);
    }

    @Stable
    /* JADX INFO: renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m3958minus5rwHm24(float f10, float f11) {
        return m3951constructorimpl(f10 - f11);
    }

    @Stable
    /* JADX INFO: renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m3959plus5rwHm24(float f10, float f11) {
        return m3951constructorimpl(f10 + f11);
    }

    @Stable
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m3960timesu2uoSUM(float f10, float f11) {
        return m3951constructorimpl(f10 * f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3962toStringimpl(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m3963unaryMinusD9Ej5fM(float f10) {
        return m3951constructorimpl(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m3964compareTo0680j_4(dp.m3965unboximpl());
    }

    @Stable
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m3964compareTo0680j_4(float f10) {
        return m3950compareTo0680j_4(this.value, f10);
    }

    public boolean equals(Object obj) {
        return m3955equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3957hashCodeimpl(this.value);
    }

    @Stable
    @NotNull
    public String toString() {
        return m3962toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m3965unboximpl() {
        return this.value;
    }

    @Stable
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m3950compareTo0680j_4(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    @Stable
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m3954divu2uoSUM(float f10, int i10) {
        return m3951constructorimpl(f10 / i10);
    }

    @Stable
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m3961timesu2uoSUM(float f10, int i10) {
        return m3951constructorimpl(f10 * i10);
    }
}
