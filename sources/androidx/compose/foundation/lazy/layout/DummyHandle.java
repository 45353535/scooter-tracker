package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DummyHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "()V", MenuActionType.CANCEL, "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DummyHandle implements LazyLayoutPrefetchState.PrefetchHandle {

    @NotNull
    public static final DummyHandle INSTANCE = new DummyHandle();

    private DummyHandle() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public void cancel() {
    }
}
