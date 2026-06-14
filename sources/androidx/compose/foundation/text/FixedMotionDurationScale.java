package androidx.compose.foundation.text;

import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/FixedMotionDurationScale;", "Landroidx/compose/ui/MotionDurationScale;", "()V", "scaleFactor", "", "getScaleFactor", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FixedMotionDurationScale implements MotionDurationScale {

    @NotNull
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r10, function2);
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, bVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return c.a(this);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, bVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
    }
}
