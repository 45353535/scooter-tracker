package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier1;", "Landroidx/compose/ui/ComposedModifier;", "", "fqName", "", "key1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KeyedComposedModifier1 extends ComposedModifier {

    @NotNull
    private final String fqName;

    @Nullable
    private final Object key1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifier1(@NotNull String fqName, @Nullable Object obj, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.fqName = fqName;
        this.key1 = obj;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KeyedComposedModifier1)) {
            return false;
        }
        KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) other;
        return Intrinsics.areEqual(this.fqName, keyedComposedModifier1.fqName) && Intrinsics.areEqual(this.key1, keyedComposedModifier1.key1);
    }

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @Nullable
    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
