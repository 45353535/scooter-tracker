package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1 implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    final /* synthetic */ State<LazyGridItemProvider> $itemProviderState;

    /* JADX WARN: Multi-variable type inference failed */
    LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1(State<? extends LazyGridItemProvider> state) {
        this.$itemProviderState = state;
        this.$$delegate_0 = LazyLayoutItemProviderKt.DelegatingLazyLayoutItemProvider(state);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i10, @Nullable Composer composer, int i11) {
        composer.startReplaceableGroup(125380152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(125380152, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public boolean getHasCustomSpans() {
        return this.$itemProviderState.getValue().getHasCustomSpans();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    /* JADX INFO: renamed from: getSpan-_-orMbw */
    public long mo576getSpan_orMbw(@NotNull LazyGridItemSpanScope getSpan, int i10) {
        Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
        return this.$itemProviderState.getValue().mo576getSpan_orMbw(getSpan, i10);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @NotNull
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.$itemProviderState.getValue().getSpanLayoutProvider();
    }
}
