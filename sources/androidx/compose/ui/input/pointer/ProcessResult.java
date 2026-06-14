package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "value", "", "constructor-impl", "(I)I", "anyMovementConsumed", "", "getAnyMovementConsumed-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getDispatchedToAPointerInputModifier-impl", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m2975boximpl(int i10) {
        return new ProcessResult(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2976constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2977equalsimpl(int i10, Object obj) {
        return (obj instanceof ProcessResult) && i10 == ((ProcessResult) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2978equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m2979getAnyMovementConsumedimpl(int i10) {
        return (i10 & 2) != 0;
    }

    /* JADX INFO: renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m2980getDispatchedToAPointerInputModifierimpl(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2981hashCodeimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2982toStringimpl(int i10) {
        return "ProcessResult(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m2977equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2981hashCodeimpl(this.value);
    }

    public String toString() {
        return m2982toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
