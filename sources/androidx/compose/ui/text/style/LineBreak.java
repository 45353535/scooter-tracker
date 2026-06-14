package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.webkit.Profile;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001e\u001f !B$\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tB\u0014\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\b\u0010\fJ1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00078Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u0088\u0001\n\u0092\u0001\u00020\u000bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", C4240b4.f.f42572e, "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "wordBreak", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "constructor-impl", "(III)I", "mask", "", "(I)I", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", MenuActionType.COPY, "copy-gijOMQM", "(IIII)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "Strategy", "Strictness", "WordBreak", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineBreak {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private final int mask;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k", "()I", "I", "Paragraph", "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m3787getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m3788getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m3789getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Strategy {
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Simple = m3791constructorimpl(1);
        private static final int HighQuality = m3791constructorimpl(2);
        private static final int Balanced = m3791constructorimpl(3);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "()V", "Balanced", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getBalanced-fcGXIks", "()I", "I", "HighQuality", "getHighQuality-fcGXIks", "Simple", "getSimple-fcGXIks", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m3797getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* JADX INFO: renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m3798getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* JADX INFO: renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m3799getSimplefcGXIks() {
                return Strategy.Simple;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strategy(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m3790boximpl(int i10) {
            return new Strategy(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3791constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3792equalsimpl(int i10, Object obj) {
            return (obj instanceof Strategy) && i10 == ((Strategy) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3793equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3794hashCodeimpl(int i10) {
            return i10;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3795toStringimpl(int i10) {
            return m3793equalsimpl0(i10, Simple) ? "Strategy.Simple" : m3793equalsimpl0(i10, HighQuality) ? "Strategy.HighQuality" : m3793equalsimpl0(i10, Balanced) ? "Strategy.Balanced" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3792equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3794hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m3795toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Strictness {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Default = m3801constructorimpl(1);
        private static final int Loose = m3801constructorimpl(2);
        private static final int Normal = m3801constructorimpl(3);
        private static final int Strict = m3801constructorimpl(4);
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getDefault-usljTpc", "()I", "I", "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m3807getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* JADX INFO: renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m3808getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* JADX INFO: renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m3809getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* JADX INFO: renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m3810getStrictusljTpc() {
                return Strictness.Strict;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strictness(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m3800boximpl(int i10) {
            return new Strictness(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3801constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3802equalsimpl(int i10, Object obj) {
            return (obj instanceof Strictness) && i10 == ((Strictness) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3803equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3804hashCodeimpl(int i10) {
            return i10;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3805toStringimpl(int i10) {
            return m3803equalsimpl0(i10, Default) ? "Strictness.None" : m3803equalsimpl0(i10, Loose) ? "Strictness.Loose" : m3803equalsimpl0(i10, Normal) ? "Strictness.Normal" : m3803equalsimpl0(i10, Strict) ? "Strictness.Strict" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3802equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3804hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m3805toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WordBreak {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Default = m3812constructorimpl(1);
        private static final int Phrase = m3812constructorimpl(2);
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getDefault-jp8hJ3c", "()I", "I", "Phrase", "getPhrase-jp8hJ3c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m3818getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* JADX INFO: renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m3819getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            private Companion() {
            }
        }

        private /* synthetic */ WordBreak(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m3811boximpl(int i10) {
            return new WordBreak(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3812constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3813equalsimpl(int i10, Object obj) {
            return (obj instanceof WordBreak) && i10 == ((WordBreak) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3814equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3815hashCodeimpl(int i10) {
            return i10;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3816toStringimpl(int i10) {
            return m3814equalsimpl0(i10, Default) ? "WordBreak.None" : m3814equalsimpl0(i10, Phrase) ? "WordBreak.Phrase" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3813equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3815hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m3816toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    static {
        Strategy.Companion companion = Strategy.INSTANCE;
        int iM3799getSimplefcGXIks = companion.m3799getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.INSTANCE;
        int iM3809getNormalusljTpc = companion2.m3809getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.INSTANCE;
        Simple = m3776constructorimpl(iM3799getSimplefcGXIks, iM3809getNormalusljTpc, companion3.m3818getDefaultjp8hJ3c());
        Heading = m3776constructorimpl(companion.m3797getBalancedfcGXIks(), companion2.m3808getLooseusljTpc(), companion3.m3819getPhrasejp8hJ3c());
        Paragraph = m3776constructorimpl(companion.m3798getHighQualityfcGXIks(), companion2.m3810getStrictusljTpc(), companion3.m3818getDefaultjp8hJ3c());
    }

    private /* synthetic */ LineBreak(int i10) {
        this.mask = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m3774boximpl(int i10) {
        return new LineBreak(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3775constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m3777copygijOMQM(int i10, int i11, int i12, int i13) {
        return m3776constructorimpl(i11, i12, i13);
    }

    /* JADX INFO: renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m3778copygijOMQM$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = m3781getStrategyfcGXIks(i10);
        }
        if ((i14 & 2) != 0) {
            i12 = m3782getStrictnessusljTpc(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = m3783getWordBreakjp8hJ3c(i10);
        }
        return m3777copygijOMQM(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3779equalsimpl(int i10, Object obj) {
        return (obj instanceof LineBreak) && i10 == ((LineBreak) obj).getMask();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3780equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m3781getStrategyfcGXIks(int i10) {
        return Strategy.m3791constructorimpl(LineBreak_androidKt.unpackByte1(i10));
    }

    /* JADX INFO: renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m3782getStrictnessusljTpc(int i10) {
        return Strictness.m3801constructorimpl(LineBreak_androidKt.unpackByte2(i10));
    }

    /* JADX INFO: renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m3783getWordBreakjp8hJ3c(int i10) {
        return WordBreak.m3812constructorimpl(LineBreak_androidKt.unpackByte3(i10));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3784hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3785toStringimpl(int i10) {
        return "LineBreak(strategy=" + ((Object) Strategy.m3795toStringimpl(m3781getStrategyfcGXIks(i10))) + ", strictness=" + ((Object) Strictness.m3805toStringimpl(m3782getStrictnessusljTpc(i10))) + ", wordBreak=" + ((Object) WordBreak.m3816toStringimpl(m3783getWordBreakjp8hJ3c(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return m3779equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m3784hashCodeimpl(this.mask);
    }

    @NotNull
    public String toString() {
        return m3785toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3776constructorimpl(int i10, int i11, int i12) {
        return m3775constructorimpl(LineBreak_androidKt.packBytes(i10, i11, i12));
    }
}
