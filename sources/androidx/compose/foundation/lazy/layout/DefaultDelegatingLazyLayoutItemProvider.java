package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultDelegatingLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "delegate", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/State;)V", "itemCount", "", "getItemCount", "()I", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "Item", "", FirebaseAnalytics.Param.INDEX, "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultDelegatingLazyLayoutItemProvider implements LazyLayoutItemProvider {

    @NotNull
    private final State<LazyLayoutItemProvider> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDelegatingLazyLayoutItemProvider(@NotNull State<? extends LazyLayoutItemProvider> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i10, @Nullable Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1633511187);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633511187, i12, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:194)");
            }
            this.delegate.getValue().Item(i10, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                DefaultDelegatingLazyLayoutItemProvider.this.Item(i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public Object getContentType(int index) {
        return this.delegate.getValue().getContentType(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.delegate.getValue().getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int index) {
        return this.delegate.getValue().getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.delegate.getValue().getKeyToIndexMap();
    }
}
