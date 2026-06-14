package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aX\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "", "enabled", "pullRefresh", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "onPull", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onRelease", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullRefreshKt {
    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier, @NotNull final PullRefreshState state, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("pullRefresh");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), pullRefresh(Modifier.INSTANCE, new PullRefreshKt$pullRefresh$2$1(state), new PullRefreshKt$pullRefresh$2$2(state), z10));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return pullRefresh(modifier, pullRefreshState, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState, float f10, Continuation continuation) {
        return b.c(pullRefreshState.onRelease$material_release(f10));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, Function1 function1, Function2 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return pullRefresh(modifier, function1, function2, z10);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier, @NotNull final Function1<? super Float, Float> onPull, @NotNull final Function2<? super Float, ? super Continuation, ? extends Object> onRelease, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2
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
                inspectorInfo.setName("pullRefresh");
                inspectorInfo.getProperties().set("onPull", onPull);
                inspectorInfo.getProperties().set("onRelease", onRelease);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, new PullRefreshNestedScrollConnection(onPull, onRelease, z10), null, 2, null));
    }
}
