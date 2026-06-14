package com.yandex.div.core.util.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import androidx.annotation.ColorInt;
import androidx.compose.material.OutlinedTextFieldKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import java.util.Arrays;
import k8.g8;
import k8.hb;
import k8.jp;
import k8.st;
import k8.xt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rf.c;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#JG\u0010'\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010*JS\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0012\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b\u0014\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "<init>", "(Landroid/content/Context;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/text/Layout;", "layout", "", "startLine", "endLine", "startOffset", "endOffset", "Lk8/g8;", H2.f75840g, "", "draw", "(Landroid/graphics/Canvas;Landroid/text/Layout;IIIILk8/g8;)V", "cornerRadius", "Landroid/graphics/Rect;", "padding", "", "buildLines", "(Landroid/text/Layout;IIIIILandroid/graphics/Rect;)[Landroid/graphics/Rect;", "lines", "coalesceInvisibleLeftBounds", "([Landroid/graphics/Rect;)V", "coalesceInvisibleRightBounds", "", "minDelta", "coalesceCloseBounds", "([II)V", "start", "lineCount", "fillColor", "drawLines", "(Landroid/graphics/Canvas;[Landroid/graphics/Rect;IIII)V", "buildLeftSegments", "([Landroid/graphics/Rect;II)[I", "buildRightSegments", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", "(Landroid/graphics/Canvas;Landroid/text/Layout;IIIILk8/xt;Lk8/st;)V", "Landroid/content/Context;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CloudTextRangeBackgroundRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final Path path = new Path();

    @NotNull
    private final Paint paint = new Paint();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer$Companion;", "", "()V", "OFFSET_SEGMENT_DELTA_X", "", "OFFSET_SEGMENT_DELTA_Y", "SEGMENT_VALUES", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CloudTextRangeBackgroundRenderer(@NotNull Context context, @NotNull ExpressionResolver expressionResolver) {
        this.context = context;
        this.expressionResolver = expressionResolver;
    }

    private final int[] buildLeftSegments(Rect[] lines, int start, int lineCount) {
        int i10 = (start + lineCount) - 1;
        if (lineCount == 1) {
            return new int[]{lines[i10].width(), -lines[i10].height()};
        }
        Rect rect = lines[i10];
        int i11 = rect.left;
        int i12 = rect.bottom;
        int[] iArr = new int[lineCount * 2];
        int i13 = 0;
        if (start <= i10) {
            int i14 = 0;
            while (true) {
                Rect rect2 = lines[i10];
                int i15 = rect2.left;
                if (i15 != i11) {
                    iArr[i14 * 2] = i15 - i11;
                    i14++;
                    i11 = i15;
                }
                int i16 = rect2.top - i12;
                int i17 = i10 - 1;
                while (true) {
                    if (i17 < start) {
                        break;
                    }
                    Rect rect3 = lines[i17];
                    int i18 = rect3.bottom;
                    int i19 = rect2.top;
                    if (i18 <= i19) {
                        break;
                    }
                    if (rect3.left <= rect2.left) {
                        i16 -= i19 - i18;
                        break;
                    }
                    i17--;
                }
                int iJ = g.j(i16, 0);
                int i20 = (i14 * 2) + 1;
                iArr[i20] = iArr[i20] + iJ;
                i12 += iJ;
                if (i10 == start) {
                    break;
                }
                i10--;
            }
            i13 = i14;
        }
        iArr[i13 * 2] = lines[start].width();
        int[] iArrCopyOf = Arrays.copyOf(iArr, (i13 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    private final Rect[] buildLines(Layout layout, int startLine, int endLine, int startOffset, int endOffset, int cornerRadius, Rect padding) {
        int i10 = endLine - startLine;
        int i11 = i10 + 1;
        if (i11 == 0) {
            return new Rect[0];
        }
        Rect[] rectArr = new Rect[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = startLine + i12;
            rectArr[i12] = new Rect((i12 == 0 ? startOffset : a.d(layout.getLineLeft(startLine + i12))) - padding.left, layout.getLineTop(i13) - padding.top, (i12 == i10 ? endOffset : a.d(layout.getLineRight(i13))) + padding.right, layout.getLineBottom(i13) + padding.bottom);
            i12++;
        }
        coalesceInvisibleLeftBounds(rectArr);
        coalesceInvisibleRightBounds(rectArr);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            Rect rect = rectArr[i14];
            iArr[i14] = -rect.left;
            iArr2[i14] = rect.right;
        }
        int i15 = cornerRadius * 2;
        coalesceCloseBounds(iArr, i15);
        coalesceCloseBounds(iArr2, i15);
        for (int i16 = 0; i16 < i11; i16++) {
            Rect rect2 = rectArr[i16];
            rect2.left = -iArr[i16];
            rect2.right = iArr2[i16];
        }
        return rectArr;
    }

    private final int[] buildRightSegments(Rect[] lines, int start, int lineCount) {
        int i10 = start;
        int i11 = (i10 + lineCount) - 1;
        if (lineCount == 1) {
            return new int[]{-lines[i10].width(), lines[i10].height()};
        }
        Rect rect = lines[i10];
        int i12 = rect.right;
        int i13 = rect.top;
        int[] iArr = new int[lineCount * 2];
        int i14 = 0;
        if (i10 <= i11) {
            int i15 = 0;
            while (true) {
                Rect rect2 = lines[i10];
                int i16 = rect2.right;
                if (i16 != i12) {
                    iArr[i15 * 2] = i16 - i12;
                    i15++;
                    i12 = i16;
                }
                int i17 = rect2.bottom - i13;
                int i18 = i10 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 > i11) {
                        break;
                    }
                    Rect rect3 = lines[i19];
                    int i20 = rect3.top;
                    int i21 = rect2.bottom;
                    if (i20 >= i21) {
                        break;
                    }
                    if (rect3.right >= rect2.right) {
                        i17 -= i21 - i20;
                        break;
                    }
                    i19++;
                }
                int iE = g.e(i17, 0);
                int i22 = (i15 * 2) + 1;
                iArr[i22] = iArr[i22] + iE;
                i13 += iE;
                if (i10 == i11) {
                    break;
                }
                i10 = i18;
            }
            i14 = i15;
        }
        iArr[i14 * 2] = -lines[i11].width();
        int[] iArrCopyOf = Arrays.copyOf(iArr, (i14 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    private final void coalesceCloseBounds(int[] lines, int minDelta) {
        boolean z10;
        int i10 = 0;
        do {
            d indices = i10 % 2 == 0 ? ArraysKt.getIndices(lines) : g.s(ArraysKt.getIndices(lines));
            int iE = indices.e();
            int iF = indices.f();
            int iG = indices.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                z10 = false;
                while (true) {
                    int i11 = iE == 0 ? 0 : lines[iE - 1] - lines[iE];
                    int i12 = iE == ArraysKt.getLastIndex(lines) ? 0 : lines[iE + 1] - lines[iE];
                    if ((i11 <= 0 || i11 >= minDelta) && (i12 <= 0 || i12 >= minDelta)) {
                        if (iE != 0 && i11 < 0 && Math.abs(i11) < minDelta) {
                            lines[iE - 1] = lines[iE];
                            z10 = true;
                        }
                        if (iE != ArraysKt.getLastIndex(lines) && i12 < 0 && Math.abs(i12) < minDelta) {
                            lines[iE + 1] = lines[iE];
                            z10 = true;
                        }
                    }
                    if (iE == iF) {
                        break;
                    } else {
                        iE += iG;
                    }
                }
            } else {
                z10 = false;
            }
            i10++;
        } while (z10);
    }

    private final void coalesceInvisibleLeftBounds(Rect[] lines) {
        int i10;
        int length = lines.length;
        int i11 = ((Rect) ArraysKt.first(lines)).left;
        int i12 = ((Rect) ArraysKt.first(lines)).top;
        int length2 = lines.length;
        int i13 = 0;
        while (i13 < length2) {
            Rect rect = lines[i13];
            int i14 = rect.bottom - i12;
            i13++;
            for (int i15 = i13; i15 < length; i15++) {
                Rect rect2 = lines[i15];
                int i16 = rect2.top;
                int i17 = rect.bottom;
                if (i16 >= i17) {
                    break;
                }
                i10 = rect2.left;
                if (i10 <= rect.left) {
                    i14 -= i17 - i16;
                    break;
                }
            }
            i10 = Integer.MIN_VALUE;
            if (i14 <= 0) {
                rect.left = Math.max(i11, i10);
                i14 = 0;
            } else {
                i11 = rect.left;
            }
            i12 += i14;
        }
    }

    private final void coalesceInvisibleRightBounds(Rect[] lines) {
        int i10;
        int length = lines.length;
        int i11 = ((Rect) ArraysKt.first(lines)).right;
        int i12 = ((Rect) ArraysKt.first(lines)).top;
        int length2 = lines.length;
        int i13 = 0;
        while (i13 < length2) {
            Rect rect = lines[i13];
            int i14 = rect.bottom - i12;
            i13++;
            for (int i15 = i13; i15 < length; i15++) {
                Rect rect2 = lines[i15];
                int i16 = rect2.top;
                int i17 = rect.bottom;
                if (i16 >= i17) {
                    break;
                }
                i10 = rect2.right;
                if (i10 >= rect.right) {
                    i14 -= i17 - i16;
                    break;
                }
            }
            i10 = Integer.MAX_VALUE;
            if (i14 <= 0) {
                rect.right = Math.min(i11, i10);
                i14 = 0;
            } else {
                i11 = rect.right;
            }
            i12 += i14;
        }
    }

    private final void drawLines(Canvas canvas, Rect[] lines, int start, int lineCount, int cornerRadius, @ColorInt int fillColor) {
        char c10;
        float f10;
        float f11;
        float f12;
        float fMin;
        char c11;
        float f13;
        char c12 = 1;
        if (lineCount < 1) {
            return;
        }
        Rect rect = lines[start];
        Rect rect2 = lines[(start + lineCount) - 1];
        int[] iArrBuildLeftSegments = buildLeftSegments(lines, start, lineCount);
        int[] iArrBuildRightSegments = buildRightSegments(lines, start, lineCount);
        this.path.reset();
        float f14 = cornerRadius;
        float f15 = 2.0f;
        float fMin2 = Math.min(f14, Math.min(rect.width() / 2.0f, iArrBuildRightSegments[1] / 2.0f));
        this.path.moveTo(rect.right - fMin2, rect.top);
        float f16 = 0.9f;
        float f17 = 0.1f;
        this.path.rQuadTo(fMin2 * 0.9f, fMin2 * 0.1f, fMin2, fMin2);
        char c13 = 0;
        int i10 = 2;
        int iC = c.c(0, iArrBuildRightSegments.length - 1, 2);
        float f18 = 0.0f;
        if (iC >= 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArrBuildRightSegments.length - i10) {
                    c11 = c12;
                    c10 = c11;
                } else {
                    c10 = c12;
                    c11 = c13;
                }
                float f19 = iArrBuildRightSegments[i11];
                f10 = f15;
                float f20 = iArrBuildRightSegments[i11 + 1];
                if (c11 != 0) {
                    f11 = f16;
                    f13 = f18;
                } else {
                    f11 = f16;
                    f13 = iArrBuildRightSegments[i11 + 3];
                }
                f12 = f17;
                fMin = Math.min(f14, Math.min(Math.abs(f19) / f10, f20 / f10));
                this.path.rLineTo(f18, (f20 - fMin2) - fMin);
                this.path.rQuadTo(fMin2 * f12 * Math.signum(f19), fMin * f11, fMin * Math.signum(f19), fMin);
                if (c11 == 0) {
                    fMin2 = Math.min(f14, Math.min(Math.abs(f19) / f10, f13 / f10));
                    this.path.rLineTo(f19 - ((fMin2 + fMin) * Math.signum(f19)), 0.0f);
                    this.path.rQuadTo(fMin2 * f11 * Math.signum(f19), fMin2 * f12, Math.signum(f19) * fMin2, fMin2);
                }
                if (i11 == iC) {
                    break;
                }
                i11 += 2;
                f15 = f10;
                f16 = f11;
                f17 = f12;
                c12 = c10;
                c13 = 0;
                i10 = 2;
                f18 = 0.0f;
            }
        } else {
            c10 = 1;
            f10 = 2.0f;
            f11 = 0.9f;
            f12 = 0.1f;
            fMin = 0.0f;
        }
        float fMin3 = Math.min(f14, Math.min(rect2.width() / f10, (-iArrBuildLeftSegments[c10]) / f10));
        this.path.rLineTo((-rect2.width()) + fMin + fMin3, 0.0f);
        float f21 = -0.9f;
        float f22 = -0.1f;
        float f23 = -fMin3;
        this.path.rQuadTo(fMin3 * (-0.9f), fMin3 * (-0.1f), f23, f23);
        char c14 = 0;
        int iC2 = c.c(0, iArrBuildLeftSegments.length - 1, 2);
        if (iC2 >= 0) {
            int i12 = 0;
            while (true) {
                char c15 = i12 >= iArrBuildLeftSegments.length - 2 ? c10 : c14;
                float f24 = iArrBuildLeftSegments[i12];
                float f25 = iArrBuildLeftSegments[i12 + 1];
                float f26 = c15 != 0 ? 0.0f : iArrBuildLeftSegments[i12 + 3];
                float fMin4 = Math.min(f14, Math.min(Math.abs(f24) / f10, (-f25) / f10));
                float f27 = f21;
                this.path.rLineTo(0.0f, f25 + fMin3 + fMin4);
                float f28 = f22;
                this.path.rQuadTo(fMin4 * f12 * Math.signum(f24), fMin4 * f27, fMin4 * Math.signum(f24), -fMin4);
                if (c15 == 0) {
                    fMin3 = Math.min(f14, Math.min(Math.abs(f24) / f10, (-f26) / f10));
                    this.path.rLineTo(f24 - ((fMin4 + fMin3) * Math.signum(f24)), 0.0f);
                    this.path.rQuadTo(fMin3 * f11 * Math.signum(f24), fMin3 * f28, Math.signum(f24) * fMin3, -fMin3);
                }
                if (i12 == iC2) {
                    break;
                }
                i12 += 2;
                f21 = f27;
                f22 = f28;
                c14 = 0;
            }
        }
        this.path.close();
        this.paint.setColor(fillColor);
        canvas.drawPath(this.path, this.paint);
    }

    private final DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int startLine, int endLine, int startOffset, int endOffset, @Nullable xt border, @Nullable st background) {
        Object objB = background != null ? background.b() : null;
        g8 g8Var = objB instanceof g8 ? (g8) objB : null;
        if (g8Var == null) {
            return;
        }
        draw(canvas, layout, startLine, endLine, startOffset, endOffset, g8Var);
    }

    private final void draw(Canvas canvas, Layout layout, int startLine, int endLine, int startOffset, int endOffset, g8 background) {
        jp jpVar;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        int iIntValue = ((Number) background.f87773a.evaluate(this.expressionResolver)).intValue();
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx((Long) background.f87774b.evaluate(this.expressionResolver), displayMetrics);
        hb hbVar = background.f87775c;
        if (hbVar == null || (expression5 = hbVar.f88006g) == null || (jpVar = (jp) expression5.evaluate(this.expressionResolver)) == null) {
            jpVar = jp.DP;
        }
        hb hbVar2 = background.f87775c;
        int iUnitToPx = (hbVar2 == null || (expression4 = hbVar2.f88002c) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression4.evaluate(this.expressionResolver)).longValue()), displayMetrics, jpVar);
        hb hbVar3 = background.f87775c;
        int iUnitToPx2 = (hbVar3 == null || (expression3 = hbVar3.f88005f) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression3.evaluate(this.expressionResolver)).longValue()), displayMetrics, jpVar);
        hb hbVar4 = background.f87775c;
        int iUnitToPx3 = (hbVar4 == null || (expression2 = hbVar4.f88003d) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression2.evaluate(this.expressionResolver)).longValue()), displayMetrics, jpVar);
        hb hbVar5 = background.f87775c;
        Rect[] rectArrBuildLines = buildLines(layout, startLine, endLine, startOffset, endOffset, iDpToPx, new Rect(iUnitToPx, iUnitToPx2, iUnitToPx3, (hbVar5 == null || (expression = hbVar5.f88000a) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression.evaluate(this.expressionResolver)).longValue()), displayMetrics, jpVar)));
        if (rectArrBuildLines.length < 2) {
            drawLines(canvas, rectArrBuildLines, 0, rectArrBuildLines.length, iDpToPx, iIntValue);
            return;
        }
        int length = rectArrBuildLines.length - 1;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 + 1;
            if (rectArrBuildLines[i11].left > rectArrBuildLines[i13].right) {
                drawLines(canvas, rectArrBuildLines, i12, i10, iDpToPx, iIntValue);
                i10 = 0;
                i12 = i13;
            }
            i10++;
            i11 = i13;
        }
        drawLines(canvas, rectArrBuildLines, i12, i10, iDpToPx, iIntValue);
    }
}
