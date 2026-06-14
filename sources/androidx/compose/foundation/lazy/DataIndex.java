package androidx.compose.foundation.lazy;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0014\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/DataIndex;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "compareTo", "other", "compareTo-ZjPyQlc", "(II)I", "dec", "dec-jQJCoq8", "equals", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "inc", "inc-jQJCoq8", "minus", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "minus-yUvdeeg", "minus-PBKCTt8", "plus", "plus-PBKCTt8", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataIndex {
    private final int value;

    private /* synthetic */ DataIndex(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DataIndex m504boximpl(int i10) {
        return new DataIndex(i10);
    }

    /* JADX INFO: renamed from: compareTo-ZjPyQlc, reason: not valid java name */
    public static final int m505compareToZjPyQlc(int i10, int i11) {
        return i10 - i11;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m506constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: dec-jQJCoq8, reason: not valid java name */
    public static final int m507decjQJCoq8(int i10) {
        return m506constructorimpl(i10 - 1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m508equalsimpl(int i10, Object obj) {
        return (obj instanceof DataIndex) && i10 == ((DataIndex) obj).m516unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m509equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m510hashCodeimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: inc-jQJCoq8, reason: not valid java name */
    public static final int m511incjQJCoq8(int i10) {
        return m506constructorimpl(i10 + 1);
    }

    /* JADX INFO: renamed from: minus-PBKCTt8, reason: not valid java name */
    public static final int m512minusPBKCTt8(int i10, int i11) {
        return m506constructorimpl(i10 - i11);
    }

    /* JADX INFO: renamed from: minus-yUvdeeg, reason: not valid java name */
    public static final int m513minusyUvdeeg(int i10, int i11) {
        return m506constructorimpl(i10 - i11);
    }

    /* JADX INFO: renamed from: plus-PBKCTt8, reason: not valid java name */
    public static final int m514plusPBKCTt8(int i10, int i11) {
        return m506constructorimpl(i10 + i11);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m515toStringimpl(int i10) {
        return "DataIndex(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m508equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m510hashCodeimpl(this.value);
    }

    public String toString() {
        return m515toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m516unboximpl() {
        return this.value;
    }
}
