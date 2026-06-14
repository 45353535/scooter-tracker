package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.n1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Leg/n1;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/snapshots/Snapshot;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalComposeApi
final class SnapshotContextElementImpl implements SnapshotContextElement, n1 {

    @NotNull
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r10, function2);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, bVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b getKey() {
        return SnapshotContextElement.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, bVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return SnapshotContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // eg.n1
    public void restoreThreadContext(@NotNull CoroutineContext context, @Nullable Snapshot oldState) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.snapshot.unsafeLeave(oldState);
    }

    @Override // eg.n1
    @Nullable
    public Snapshot updateThreadContext(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.snapshot.unsafeEnter();
    }
}
