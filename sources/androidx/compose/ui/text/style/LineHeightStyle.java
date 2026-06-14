package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment-PIaL0Z0", "()F", "F", "getTrim-EVpEnUU", "()I", "I", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", y.f66058y, "Trim", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineHeightStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int trim;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "topRatio", "", "constructor-impl", "(F)F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Alignment {
        private final float topRatio;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final float Top = m3823constructorimpl(0.0f);
        private static final float Center = m3823constructorimpl(0.5f);
        private static final float Proportional = m3823constructorimpl(-1.0f);
        private static final float Bottom = m3823constructorimpl(1.0f);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R\"\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R\"\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0$annotations", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0$annotations", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0$annotations", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0$annotations", "getTop-PIaL0Z0", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0$annotations, reason: not valid java name */
            public static /* synthetic */ void m3829getBottomPIaL0Z0$annotations() {
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0$annotations, reason: not valid java name */
            public static /* synthetic */ void m3830getCenterPIaL0Z0$annotations() {
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0$annotations, reason: not valid java name */
            public static /* synthetic */ void m3831getProportionalPIaL0Z0$annotations() {
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0$annotations, reason: not valid java name */
            public static /* synthetic */ void m3832getTopPIaL0Z0$annotations() {
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m3833getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m3834getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m3835getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m3836getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        @ExperimentalTextApi
        private /* synthetic */ Alignment(float f10) {
            this.topRatio = f10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m3822boximpl(float f10) {
            return new Alignment(f10);
        }

        @ExperimentalTextApi
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m3823constructorimpl(float f10) {
            if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3824equalsimpl(float f10, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f10, ((Alignment) obj).getTopRatio()) == 0;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3825equalsimpl0(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3826hashCodeimpl(float f10) {
            return Float.floatToIntBits(f10);
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3827toStringimpl(float f10) {
            if (f10 == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return m3824equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m3826hashCodeimpl(this.topRatio);
        }

        @NotNull
        public String toString() {
            return m3827toStringimpl(this.topRatio);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isTrimFirstLineTop", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimLastLineBottom", "isTrimLastLineBottom-impl$ui_text_release", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int FirstLineTop = m3838constructorimpl(1);
        private static final int LastLineBottom = m3838constructorimpl(16);
        private static final int Both = m3838constructorimpl(17);
        private static final int None = m3838constructorimpl(0);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m3846getBothEVpEnUU() {
                return Trim.Both;
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m3847getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m3848getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m3849getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m3837boximpl(int i10) {
            return new Trim(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m3838constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3839equalsimpl(int i10, Object obj) {
            return (obj instanceof Trim) && i10 == ((Trim) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3840equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3841hashCodeimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m3842isTrimFirstLineTopimpl$ui_text_release(int i10) {
            return (i10 & 1) > 0;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m3843isTrimLastLineBottomimpl$ui_text_release(int i10) {
            return (i10 & 16) > 0;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3844toStringimpl(int i10) {
            return i10 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i10 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i10 == Both ? "LineHeightStyle.Trim.Both" : i10 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3839equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3841hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m3844toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Default = new LineHeightStyle(Alignment.INSTANCE.m3835getProportionalPIaL0Z0(), Trim.INSTANCE.m3846getBothEVpEnUU(), defaultConstructorMarker);
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return Alignment.m3825equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m3840equalsimpl0(this.trim, lineHeightStyle.trim);
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name and from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name and from getter */
    public final int getTrim() {
        return this.trim;
    }

    public int hashCode() {
        return (Alignment.m3826hashCodeimpl(this.alignment) * 31) + Trim.m3841hashCodeimpl(this.trim);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m3827toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m3844toStringimpl(this.trim)) + ')';
    }

    private LineHeightStyle(float f10, int i10) {
        this.alignment = f10;
        this.trim = i10;
    }
}
