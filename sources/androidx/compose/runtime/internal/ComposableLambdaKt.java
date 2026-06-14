package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a \u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0012\u001a\u00020\f*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"BITS_PER_SLOT", "", "SLOTS_PER_INT", "bitsForSlot", "bits", "slot", "composableLambda", "Landroidx/compose/runtime/internal/ComposableLambda;", "composer", "Landroidx/compose/runtime/Composer;", C4240b4.i.W, "tracked", "", "block", "", "composableLambdaInstance", "differentBits", "sameBits", "replacableWith", "Landroidx/compose/runtime/RecomposeScope;", "other", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambda(@NotNull Composer composer, int i10, boolean z10, @NotNull Object block) {
        ComposableLambdaImpl composableLambdaImpl;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(i10);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objRememberedValue;
        }
        composableLambdaImpl.update(block);
        composer.endReplaceableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambdaInstance(int i10, boolean z10, @NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
        composableLambdaImpl.update(block);
        return composableLambdaImpl;
    }

    public static final int differentBits(int i10) {
        return bitsForSlot(2, i10);
    }

    public static final boolean replacableWith(@Nullable RecomposeScope recomposeScope, @NotNull RecomposeScope other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (recomposeScope == null) {
            return true;
        }
        if (!(recomposeScope instanceof RecomposeScopeImpl) || !(other instanceof RecomposeScopeImpl)) {
            return false;
        }
        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
        return !recomposeScopeImpl.getValid() || Intrinsics.areEqual(recomposeScope, other) || Intrinsics.areEqual(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) other).getAnchor());
    }

    public static final int sameBits(int i10) {
        return bitsForSlot(1, i10);
    }
}
