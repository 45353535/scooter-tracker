package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "(Ljava/lang/String;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", SessionDescription.ATTR_LENGTH, "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "get", "", FirebaseAnalytics.Param.INDEX, "replace", "", "start", "end", "toString", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalTextApi
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private int bufEnd;
    private int bufStart;

    @Nullable
    private GapBuffer buffer;

    @NotNull
    private String text;
    public static final int $stable = 8;

    public PartialGapBuffer(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    public final char get(int index) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int length = gapBuffer.length();
        int i10 = this.bufStart;
        return index < length + i10 ? gapBuffer.get(index - i10) : this.text.charAt(index - ((length - this.bufEnd) + i10));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void replace(int start, int end, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (start > end) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + start + " > " + end).toString());
        }
        if (start < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + start).toString());
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i10 = this.bufStart;
            int i11 = start - i10;
            int i12 = end - i10;
            if (i11 >= 0 && i12 <= gapBuffer.length()) {
                gapBuffer.replace(i11, i12, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(start, end, text);
            return;
        }
        int iMax = Math.max(255, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(start, 64);
        int iMin2 = Math.min(this.text.length() - end, 64);
        int i13 = start - iMin;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i13, start);
        int i14 = iMax - iMin2;
        int i15 = iMin2 + end;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, i14, end, i15);
        GapBufferKt.toCharArray(text, cArr, iMin);
        this.buffer = new GapBuffer(cArr, iMin + text.length(), i14);
        this.bufStart = i13;
        this.bufEnd = i15;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
