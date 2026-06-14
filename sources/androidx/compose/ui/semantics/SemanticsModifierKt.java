package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "properties", "semantics", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "clearAndSetSemantics", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SemanticsModifierKt {
    @NotNull
    public static final Modifier clearAndSetSemantics(@NotNull Modifier modifier, @NotNull final Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return modifier.then(new SemanticsModifierCore(false, true, properties, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsModifierKt$clearAndSetSemantics$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clearAndSetSemantics");
                inspectorInfo.getProperties().set("properties", properties);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @NotNull
    public static final Modifier semantics(@NotNull Modifier modifier, final boolean z10, @NotNull final Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return modifier.then(new SemanticsModifierCore(z10, false, properties, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("semantics");
                inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("properties", properties);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semantics(modifier, z10, function1);
    }
}
