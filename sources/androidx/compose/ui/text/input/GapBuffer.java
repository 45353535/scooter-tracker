package androidx.compose.ui.text.input;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", FirebaseAnalytics.Param.INDEX, SessionDescription.ATTR_LENGTH, "makeSureAvailableSpace", "requestSize", "replace", "text", "", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GapBuffer {

    @NotNull
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(@NotNull char[] initBuffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.capacity = initBuffer.length;
        this.buffer = initBuffer;
        this.gapStart = i10;
        this.gapEnd = i11;
    }

    private final void delete(int start, int end) {
        int i10 = this.gapStart;
        if (start < i10 && end <= i10) {
            int i11 = i10 - end;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i11, end, i10);
            this.gapStart = start;
            this.gapEnd -= i11;
            return;
        }
        if (start < i10 && end >= i10) {
            this.gapEnd = end + gapLength();
            this.gapStart = start;
            return;
        }
        int iGapLength = start + gapLength();
        int iGapLength2 = end + gapLength();
        int i12 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i12, iGapLength);
        this.gapStart += iGapLength - i12;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int requestSize) {
        if (requestSize <= gapLength()) {
            return;
        }
        int iGapLength = requestSize - gapLength();
        int i10 = this.capacity;
        do {
            i10 *= 2;
        } while (i10 - this.capacity < iGapLength);
        char[] cArr = new char[i10];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i11 = this.capacity;
        int i12 = this.gapEnd;
        int i13 = i11 - i12;
        int i14 = i10 - i13;
        ArraysKt.copyInto(this.buffer, cArr, i14, i12, i13 + i12);
        this.buffer = cArr;
        this.capacity = i10;
        this.gapEnd = i14;
    }

    public final void append(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i10 = this.gapEnd;
        builder.append(cArr, i10, this.capacity - i10);
    }

    public final char get(int index) {
        int i10 = this.gapStart;
        return index < i10 ? this.buffer[index] : this.buffer[(index - i10) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int start, int end, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        makeSureAvailableSpace(text.length() - (end - start));
        delete(start, end);
        GapBufferKt.toCharArray(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply { append(this) }.toString()");
        return string;
    }
}
