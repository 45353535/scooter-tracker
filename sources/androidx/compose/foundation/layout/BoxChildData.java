package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u0000*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/Alignment;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/BoxChildData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Z", "getMatchParentSize", "()Z", "setMatchParentSize", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BoxChildData extends InspectorValueInfo implements ParentDataModifier {

    @NotNull
    private Alignment alignment;
    private boolean matchParentSize;

    public /* synthetic */ BoxChildData(Alignment alignment, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? InspectableValueKt.getNoInspectorInfo() : function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        BoxChildData boxChildData = other instanceof BoxChildData ? (BoxChildData) other : null;
        return boxChildData != null && Intrinsics.areEqual(this.alignment, boxChildData.alignment) && this.matchParentSize == boxChildData.matchParentSize;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + androidx.compose.foundation.c.a(this.matchParentSize);
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @NotNull
    public BoxChildData modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final void setMatchParentSize(boolean z10) {
        this.matchParentSize = z10;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    @NotNull
    public String toString() {
        return "BoxChildData(alignment=" + this.alignment + ", matchParentSize=" + this.matchParentSize + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxChildData(@NotNull Alignment alignment, boolean z10, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.alignment = alignment;
        this.matchParentSize = z10;
    }
}
