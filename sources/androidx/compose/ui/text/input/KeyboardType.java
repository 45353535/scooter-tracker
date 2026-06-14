package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardType {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Text = m3680constructorimpl(1);
    private static final int Ascii = m3680constructorimpl(2);
    private static final int Number = m3680constructorimpl(3);
    private static final int Phone = m3680constructorimpl(4);
    private static final int Uri = m3680constructorimpl(5);
    private static final int Email = m3680constructorimpl(6);
    private static final int Password = m3680constructorimpl(7);
    private static final int NumberPassword = m3680constructorimpl(8);
    private static final int Decimal = m3680constructorimpl(9);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R'\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "()V", "Ascii", "Landroidx/compose/ui/text/input/KeyboardType;", "getAscii-PjHm6EE$annotations", "getAscii-PjHm6EE", "()I", "I", "Decimal", "getDecimal-PjHm6EE$annotations", "getDecimal-PjHm6EE", "Email", "getEmail-PjHm6EE$annotations", "getEmail-PjHm6EE", "Number", "getNumber-PjHm6EE$annotations", "getNumber-PjHm6EE", "NumberPassword", "getNumberPassword-PjHm6EE$annotations", "getNumberPassword-PjHm6EE", "Password", "getPassword-PjHm6EE$annotations", "getPassword-PjHm6EE", "Phone", "getPhone-PjHm6EE$annotations", "getPhone-PjHm6EE", "Text", "getText-PjHm6EE$annotations", "getText-PjHm6EE", "Uri", "getUri-PjHm6EE$annotations", "getUri-PjHm6EE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3686getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3687getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3688getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3689getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3690getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3691getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3692getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3693getTextPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3694getUriPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m3695getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m3696getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m3697getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m3698getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m3699getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m3700getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m3701getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* JADX INFO: renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m3702getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m3703getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardType(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m3679boximpl(int i10) {
        return new KeyboardType(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3680constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3681equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardType) && i10 == ((KeyboardType) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3682equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3683hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3684toStringimpl(int i10) {
        return m3682equalsimpl0(i10, Text) ? "Text" : m3682equalsimpl0(i10, Ascii) ? "Ascii" : m3682equalsimpl0(i10, Number) ? "Number" : m3682equalsimpl0(i10, Phone) ? "Phone" : m3682equalsimpl0(i10, Uri) ? "Uri" : m3682equalsimpl0(i10, Email) ? "Email" : m3682equalsimpl0(i10, Password) ? "Password" : m3682equalsimpl0(i10, NumberPassword) ? "NumberPassword" : m3682equalsimpl0(i10, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3681equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3683hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3684toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
