package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "getScaleFactor", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "Key", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MotionDurationScale extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MotionDurationScale motionDurationScale, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.a.a(motionDurationScale, r10, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.a.b(motionDurationScale, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.a.c(motionDurationScale, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MotionDurationScale motionDurationScale, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.a.d(motionDurationScale, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.MotionDurationScale$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    CoroutineContext.b getKey();

    float getScaleFactor();

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext minusKey(@NotNull CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
