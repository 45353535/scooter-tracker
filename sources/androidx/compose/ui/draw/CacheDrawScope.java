package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\nR\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "block", "Landroidx/compose/ui/draw/DrawResult;", "onDrawBehind", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onDrawWithContent", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "cacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "setCacheParams$ui_release", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "drawResult", "Landroidx/compose/ui/draw/DrawResult;", "getDrawResult$ui_release", "()Landroidx/compose/ui/draw/DrawResult;", "setDrawResult$ui_release", "(Landroidx/compose/ui/draw/DrawResult;)V", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;

    @NotNull
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;

    @Nullable
    private DrawResult drawResult;

    @NotNull
    /* JADX INFO: renamed from: getCacheParams$ui_release, reason: from getter */
    public final BuildDrawCacheParams getCacheParams() {
        return this.cacheParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Nullable
    /* JADX INFO: renamed from: getDrawResult$ui_release, reason: from getter */
    public final DrawResult getDrawResult() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m1281getSizeNHjbRc() {
        return this.cacheParams.mo1280getSizeNHjbRc();
    }

    @NotNull
    public final DrawResult onDrawBehind(@NotNull final Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope.onDrawBehind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                block.invoke(onDrawWithContent);
                onDrawWithContent.drawContent();
            }
        });
    }

    @NotNull
    public final DrawResult onDrawWithContent(@NotNull Function1<? super ContentDrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DrawResult drawResult = new DrawResult(block);
        this.drawResult = drawResult;
        return drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo301roundToPxR2X_6o(long j10) {
        return androidx.compose.ui.unit.a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo302roundToPx0680j_4(float f10) {
        return androidx.compose.ui.unit.a.b(this, f10);
    }

    public final void setCacheParams$ui_release(@NotNull BuildDrawCacheParams buildDrawCacheParams) {
        Intrinsics.checkNotNullParameter(buildDrawCacheParams, "<set-?>");
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(@Nullable DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo303toDpGaN1DYA(long j10) {
        return androidx.compose.ui.unit.a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo304toDpu2uoSUM(float f10) {
        return androidx.compose.ui.unit.a.d(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo306toDpSizekrfVVM(long j10) {
        return androidx.compose.ui.unit.a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo307toPxR2X_6o(long j10) {
        return androidx.compose.ui.unit.a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo308toPx0680j_4(float f10) {
        return androidx.compose.ui.unit.a.h(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo309toSizeXkaWNTQ(long j10) {
        return androidx.compose.ui.unit.a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo310toSp0xMU5do(float f10) {
        return androidx.compose.ui.unit.a.k(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo311toSpkPz2Gy4(float f10) {
        return androidx.compose.ui.unit.a.l(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo305toDpu2uoSUM(int i10) {
        return androidx.compose.ui.unit.a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo312toSpkPz2Gy4(int i10) {
        return androidx.compose.ui.unit.a.m(this, i10);
    }
}
