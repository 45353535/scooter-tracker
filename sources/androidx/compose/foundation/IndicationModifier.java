package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/IndicationModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "indicationInstance", "Landroidx/compose/foundation/IndicationInstance;", "(Landroidx/compose/foundation/IndicationInstance;)V", "getIndicationInstance", "()Landroidx/compose/foundation/IndicationInstance;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IndicationModifier implements DrawModifier {

    @NotNull
    private final IndicationInstance indicationInstance;

    public IndicationModifier(@NotNull IndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.indicationInstance.drawIndication(contentDrawScope);
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
    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
