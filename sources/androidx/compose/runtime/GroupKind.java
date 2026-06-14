package androidx.compose.runtime;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/GroupKind;", "", "value", "", "constructor-impl", "(I)I", "isNode", "", "isNode-impl", "(I)Z", "isReusable", "isReusable-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GroupKind {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Group = m1228constructorimpl(0);
    private static final int Node = m1228constructorimpl(1);
    private static final int ReusableNode = m1228constructorimpl(2);
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", "Group", "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", "I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m1236getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* JADX INFO: renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m1237getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* JADX INFO: renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m1238getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GroupKind(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m1227boximpl(int i10) {
        return new GroupKind(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1228constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1229equalsimpl(int i10, Object obj) {
        return (obj instanceof GroupKind) && i10 == ((GroupKind) obj).m1235unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1230equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1231hashCodeimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m1232isNodeimpl(int i10) {
        return i10 != INSTANCE.m1236getGroupULZAiWs();
    }

    /* JADX INFO: renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m1233isReusableimpl(int i10) {
        return i10 != INSTANCE.m1237getNodeULZAiWs();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1234toStringimpl(int i10) {
        return "GroupKind(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m1229equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1231hashCodeimpl(this.value);
    }

    public String toString() {
        return m1234toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1235unboximpl() {
        return this.value;
    }
}
