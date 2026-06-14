package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pullRefreshIndicatorTransform", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "scale", "", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullRefreshIndicatorTransformKt {
    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefreshIndicatorTransform(@NotNull Modifier modifier, @NotNull final PullRefreshState state, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("pullRefreshIndicatorTransform");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("scale", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.INSTANCE, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                int iM1593getIntersectrtfAjoo = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
                DrawContext drawContext = drawWithContent.getDrawContext();
                long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2049clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM1593getIntersectrtfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setTranslationY(state.getPosition$material_release() - Size.m1437getHeightimpl(graphicsLayer.getSize()));
                if (!z10 || state.getRefreshing$material_release()) {
                    return;
                }
                float fM = g.m(EasingKt.getLinearOutSlowInEasing().transform(state.getPosition$material_release() / state.getThreshold$material_release()), 0.0f, 1.0f);
                graphicsLayer.setScaleX(fM);
                graphicsLayer.setScaleY(fM);
            }
        }));
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z10);
    }
}
