package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "scope", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "node", "update", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;)Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lkotlin/jvm/functions/Function1;", MenuActionType.COPY, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/focus/FocusPropertiesElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesModifierNodeImpl> {

    @NotNull
    private final Function1<FocusProperties, Unit> scope;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusPropertiesElement(@NotNull Function1<? super FocusProperties, Unit> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(function1);
    }

    @NotNull
    public final Function1<FocusProperties, Unit> component1() {
        return this.scope;
    }

    @NotNull
    public final FocusPropertiesElement copy(@NotNull Function1<? super FocusProperties, Unit> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new FocusPropertiesElement(scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusPropertiesElement) && Intrinsics.areEqual(this.scope, ((FocusPropertiesElement) other).scope);
    }

    @NotNull
    public final Function1<FocusProperties, Unit> getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }

    @NotNull
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public FocusPropertiesModifierNodeImpl create() {
        return new FocusPropertiesModifierNodeImpl(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public FocusPropertiesModifierNodeImpl update(@NotNull FocusPropertiesModifierNodeImpl node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setFocusPropertiesScope(this.scope);
        return node;
    }
}
