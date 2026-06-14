package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000b\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\u001a?\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aC\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aC\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001aK\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u0014\u001ac\u0010#\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u001f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"\u001aC\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010 \u001a\u00020\u001f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a+\u0010*\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a?\u0010/\u001a\u00020\u0007*\u00020\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "", "block", "inset", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFLkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLkotlin/jvm/functions/Function1;)V", "horizontal", "vertical", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLkotlin/jvm/functions/Function1;)V", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DrawScopeKt {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m2106clipPathKD09W0M(@NotNull DrawScope clipPath, @NotNull Path path, int i10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2048clipPathmtrdDE(path, i10);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m2107clipPathKD09W0M$default(DrawScope clipPath, Path path, int i10, Function1 block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2048clipPathmtrdDE(path, i10);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m2108clipRectrOu3jXo(@NotNull DrawScope clipRect, float f10, float f11, float f12, float f13, int i10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2049clipRectN_I0leg(f10, f11, f12, f13, i10);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m2109clipRectrOu3jXo$default(DrawScope clipRect, float f10, float f11, float f12, float f13, int i10, Function1 block, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Size.m1440getWidthimpl(clipRect.mo2040getSizeNHjbRc());
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Size.m1437getHeightimpl(clipRect.mo2040getSizeNHjbRc());
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2049clipRectN_I0leg(f14, f15, f16, f17, i10);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, float f11, float f12, float f13, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f12, f13);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f10, -f11, -f12, -f13);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f10, float f11, Function1 block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        block.invoke(drawScope);
        float f12 = -f10;
        float f13 = -f11;
        drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m2110rotateRg1IO4c(@NotNull DrawScope rotate, float f10, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2052rotateUv8p0NA(f10, j10);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2111rotateRg1IO4c$default(DrawScope rotate, float f10, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotate.mo2039getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2052rotateUv8p0NA(f10, j10);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m2112rotateRadRg1IO4c(@NotNull DrawScope rotateRad, float f10, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2052rotateUv8p0NA(DegreesKt.degrees(f10), j10);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2113rotateRadRg1IO4c$default(DrawScope rotateRad, float f10, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotateRad.mo2039getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2052rotateUv8p0NA(DegreesKt.degrees(f10), j10);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m2114scaleFgt4K4Q(@NotNull DrawScope scale, float f10, float f11, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2053scale0AR0LA0(f10, f11, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m2115scaleFgt4K4Q$default(DrawScope scale, float f10, float f11, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = scale.mo2039getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2053scale0AR0LA0(f10, f11, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m2116scaleRg1IO4c(@NotNull DrawScope scale, float f10, long j10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2053scale0AR0LA0(f10, f10, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2117scaleRg1IO4c$default(DrawScope scale, float f10, long j10, Function1 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = scale.mo2039getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2053scale0AR0LA0(f10, f10, j10);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    public static final void translate(@NotNull DrawScope drawScope, float f10, float f11, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f10, -f11);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f10, float f11, Function1 block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f10, -f11);
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull Function1<? super DrawTransform, Unit> transformBlock, @NotNull Function1<? super DrawScope, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(transformBlock, "transformBlock");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        transformBlock.invoke(drawContext.getTransform());
        drawBlock.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
        block.invoke(drawScope);
        float f11 = -f10;
        drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, float f11, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        block.invoke(drawScope);
        float f12 = -f10;
        float f13 = -f11;
        drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
    }
}
