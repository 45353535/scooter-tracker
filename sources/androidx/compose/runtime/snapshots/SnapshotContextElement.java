package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalComposeApi
public interface SnapshotContextElement extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull SnapshotContextElement snapshotContextElement, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.a.a(snapshotContextElement, r10, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull SnapshotContextElement snapshotContextElement, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.a.b(snapshotContextElement, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull SnapshotContextElement snapshotContextElement, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.a.c(snapshotContextElement, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull SnapshotContextElement snapshotContextElement, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.a.d(snapshotContextElement, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotContextElement$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, @NotNull Function2 function2);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    /* synthetic */ CoroutineContext.Element get(@NotNull CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext minusKey(@NotNull CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
