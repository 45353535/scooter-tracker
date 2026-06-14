package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class LazyListItemProviderKt$rememberLazyListItemProvider$1$1 implements LazyListItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    final /* synthetic */ State<LazyListItemProviderImpl> $itemProviderState;

    LazyListItemProviderKt$rememberLazyListItemProvider$1$1(State<LazyListItemProviderImpl> state) {
        this.$itemProviderState = state;
        this.$$delegate_0 = LazyLayoutItemProviderKt.DelegatingLazyLayoutItemProvider(state);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i10, @Nullable Composer composer, int i11) {
        composer.startReplaceableGroup(-203667997);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-203667997, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider.<anonymous>.<no name provided>.Item (LazyListItemProvider.kt:-1)");
        }
        this.$$delegate_0.Item(i10, composer, i11 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public Object getContentType(int i10) {
        return this.$$delegate_0.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @NotNull
    public List<Integer> getHeaderIndexes() {
        return this.$itemProviderState.getValue().getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @NotNull
    public LazyItemScopeImpl getItemScope() {
        return this.$itemProviderState.getValue().getItemScope();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int i10) {
        return this.$$delegate_0.getKey(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }
}
