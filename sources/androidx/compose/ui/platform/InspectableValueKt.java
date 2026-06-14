package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0014\b\b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\"#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "definitions", "debugInspectorInfo", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "NoInspectorInfo", "Lkotlin/jvm/functions/Function1;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InspectableValueKt {

    @NotNull
    private static final Function1<InspectorInfo, Unit> NoInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.f93236a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    @NotNull
    public static final Function1<InspectorInfo, Unit> debugInspectorInfo(@NotNull final Function1<? super InspectorInfo, Unit> definitions) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        return isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                definitions.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @NotNull
    public static final Function1<InspectorInfo, Unit> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function1<? super Modifier, ? extends Modifier> factory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return inspectableWrapper(modifier, inspectorInfo, factory.invoke(Modifier.INSTANCE));
    }

    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Modifier wrapped) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(inspectorInfo);
        return modifier.then(inspectableModifier).then(wrapped).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        isDebugInspectorInfoEnabled = z10;
    }
}
