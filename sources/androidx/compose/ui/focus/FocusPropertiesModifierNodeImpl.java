package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "focusPropertiesScope", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusProperties", "modifyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Lkotlin/jvm/functions/Function1;", "getFocusPropertiesScope", "()Lkotlin/jvm/functions/Function1;", "setFocusPropertiesScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusPropertiesModifierNodeImpl extends Modifier.Node implements FocusPropertiesModifierNode {

    @NotNull
    private Function1<? super FocusProperties, Unit> focusPropertiesScope;

    public FocusPropertiesModifierNodeImpl(@NotNull Function1<? super FocusProperties, Unit> focusPropertiesScope) {
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        this.focusPropertiesScope = focusPropertiesScope;
    }

    @NotNull
    public final Function1<FocusProperties, Unit> getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void modifyFocusProperties(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusPropertiesScope.invoke(focusProperties);
    }

    public final void setFocusPropertiesScope(@NotNull Function1<? super FocusProperties, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.focusPropertiesScope = function1;
    }
}
