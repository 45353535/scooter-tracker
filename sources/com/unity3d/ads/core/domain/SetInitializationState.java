package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/SetInitializationState;", "", "invoke", "", "state", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SetInitializationState {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void invoke$default(SetInitializationState setInitializationState, InitializationState initializationState, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            setInitializationState.invoke(initializationState, z10);
        }
    }

    void invoke(@NotNull InitializationState state, boolean legacy);
}
