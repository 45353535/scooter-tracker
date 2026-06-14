package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifierN;", "Landroidx/compose/ui/ComposedModifier;", "", "fqName", "", "", UserMetadata.KEYDATA_FILENAME, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KeyedComposedModifierN extends ComposedModifier {

    @NotNull
    private final String fqName;

    @NotNull
    private final Object[] keys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifierN(@NotNull String fqName, @NotNull Object[] keys, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.fqName = fqName;
        this.keys = keys;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) other;
        return Intrinsics.areEqual(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys);
    }

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
