package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\"\u0010\u0010\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\f¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "or", "or-H91voCI", "(II)I", "or-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i10) {
        this.mask = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m3198boximpl(int i10) {
        return new NodeKind(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m3199constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3200equalsimpl(int i10, Object obj) {
        return (obj instanceof NodeKind) && i10 == ((NodeKind) obj).m3206unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3201equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3202hashCodeimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: or-H91voCI, reason: not valid java name */
    public static final int m3203orH91voCI(int i10, int i11) {
        return i10 | i11;
    }

    /* JADX INFO: renamed from: or-impl, reason: not valid java name */
    public static final int m3204orimpl(int i10, int i11) {
        return i10 | i11;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3205toStringimpl(int i10) {
        return "NodeKind(mask=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m3200equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m3202hashCodeimpl(this.mask);
    }

    public String toString() {
        return m3205toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3206unboximpl() {
        return this.mask;
    }
}
