package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import androidx.annotation.Px;
import androidx.core.util.Pools;
import com.taurusx.tax.f.y;
import java.util.LinkedList;
import java.util.Queue;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B'\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/yandex/div/core/view2/spannable/VerticalAlignmentSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/LineBackgroundSpan;", "", "fontSize", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "alignment", "Lkf/a;", "Landroid/text/Layout;", "layoutProvider", "<init>", "(ILcom/yandex/div/core/view2/spannable/TextVerticalAlignment;Lkf/a;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "left", "right", "top", "baseline", "bottom", "", "text", "start", "end", "lineNumber", "", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;III)V", "Landroid/text/TextPaint;", "updateDrawState", "(Landroid/text/TextPaint;)V", "I", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "Lkf/a;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "Ljava/util/Queue;", "", "lines", "Ljava/util/Queue;", "", "textDrawWasCalled", "Z", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Pools.SimplePool<int[]> LINE_POOL = new Pools.SimplePool<>(16);

    @NotNull
    private final TextVerticalAlignment alignment;
    private final int fontSize;

    @NotNull
    private final a layoutProvider;
    private boolean textDrawWasCalled;

    @NotNull
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();

    @NotNull
    private final Queue<int[]> lines = new LinkedList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/spannable/VerticalAlignmentSpan$Companion;", "", "()V", "INDEX_LINE_ASCENT", "", "INDEX_LINE_DESCENT", "LINE_POOL", "Landroidx/core/util/Pools$SimplePool;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VerticalAlignmentSpan(@Px int i10, @NotNull TextVerticalAlignment textVerticalAlignment, @NotNull a aVar) {
        this.fontSize = i10;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = aVar;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int left, int right, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, int lineNumber) {
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (start > spanned.getSpanEnd(this) || spanStart > end) {
            return;
        }
        Layout layout = (Layout) this.layoutProvider.get();
        int iD = lineNumber == layout.getLineCount() - 1 ? 0 : zf.a.d(layout.getSpacingAdd());
        int[] iArrAcquire = LINE_POOL.acquire();
        if (iArrAcquire == null) {
            iArrAcquire = new int[2];
        }
        iArrAcquire[0] = top - baseline;
        iArrAcquire[1] = (bottom - baseline) - iD;
        this.lines.add(iArrAcquire);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] iArrRemove = this.lines.remove();
        int i10 = iArrRemove[0];
        int i11 = iArrRemove[1];
        LINE_POOL.release(iArrRemove);
        int i12 = this.fontSize;
        if (i12 > 0) {
            paint.setTextSize(i12);
        }
        paint.getFontMetricsInt(this.fontMetrics);
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i13 == 1) {
            paint.baselineShift += i10 - this.fontMetrics.ascent;
            return;
        }
        if (i13 != 2) {
            if (i13 != 4) {
                return;
            }
            paint.baselineShift += i11 - this.fontMetrics.descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            paint.baselineShift += ((i10 + i11) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
    }
}
