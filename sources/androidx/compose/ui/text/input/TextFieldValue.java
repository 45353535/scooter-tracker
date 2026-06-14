package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB*\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0007B&\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\nJ3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", MenuActionType.COPY, "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldValue {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new Function2<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver2, @NotNull TextFieldValue it) {
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(it.getText(), SaversKt.getAnnotatedStringSaver(), Saver2), SaversKt.save(TextRange.m3491boximpl(it.getSelection()), SaversKt.getSaver(TextRange.INSTANCE), Saver2));
        }
    }, new Function1<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldValue invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : annotatedStringSaver.restore(obj);
            Intrinsics.checkNotNull(annotatedStringRestore);
            Object obj2 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.INSTANCE);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textRangeRestore = saver.restore(obj2);
            }
            Intrinsics.checkNotNull(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.getPackedValue(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
    });

    /* JADX INFO: renamed from: annotatedString, reason: from kotlin metadata and from toString */
    @NotNull
    private final AnnotatedString text;

    @Nullable
    private final TextRange composition;
    private final long selection;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j10, textRange);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m3704copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.text;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m3706copy3r_uNRQ(annotatedString, j10, textRange);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m3706copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long selection, @Nullable TextRange composition) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return TextRange.m3496equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.areEqual(this.composition, textFieldValue.composition) && Intrinsics.areEqual(this.text, textFieldValue.text);
    }

    @NotNull
    /* JADX INFO: renamed from: getAnnotatedString, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.text.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + TextRange.m3504hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return iHashCode + (textRange != null ? TextRange.m3504hashCodeimpl(textRange.getPackedValue()) : 0);
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) TextRange.m3506toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, textRange);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m3707copy3r_uNRQ(@NotNull String text, long selection, @Nullable TextRange composition) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), selection, composition, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange) {
        this.text = annotatedString;
        this.selection = TextRangeKt.m3509constrain8ffj60Q(j10, 0, getText().length());
        this.composition = textRange != null ? TextRange.m3491boximpl(TextRangeKt.m3509constrain8ffj60Q(textRange.getPackedValue(), 0, getText().length())) : null;
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m3705copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m3707copy3r_uNRQ(str, j10, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i10 & 2) != 0 ? TextRange.INSTANCE.m3508getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? TextRange.INSTANCE.m3508getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j10, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j10, textRange, (DefaultConstructorMarker) null);
    }
}
