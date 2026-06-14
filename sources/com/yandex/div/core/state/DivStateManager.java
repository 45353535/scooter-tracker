package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import com.yandex.div.state.DivStateCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@AnyThread
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/state/DivStateManager;", "", "Lcom/yandex/div/state/DivStateCache;", Reporting.EventType.CACHE, "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "temporaryCache", "<init>", "(Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;)V", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "Lcom/yandex/div/core/state/DivViewState;", "getState", "(Lcom/yandex/div/DivDataTag;)Lcom/yandex/div/core/state/DivViewState;", "", "stateId", "", "temporary", "", "updateState", "(Lcom/yandex/div/DivDataTag;JZ)V", "", "cardId", "Lcom/yandex/div/core/state/DivStatePath;", "divStatePath", "updateStates", "(Ljava/lang/String;Lcom/yandex/div/core/state/DivStatePath;Z)V", "Lcom/yandex/div/state/DivStateCache;", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "Landroidx/collection/ArrayMap;", "states", "Landroidx/collection/ArrayMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivStateManager {

    @NotNull
    private final DivStateCache cache;

    @NotNull
    private final ArrayMap<DivDataTag, DivViewState> states = new ArrayMap<>();

    @NotNull
    private final TemporaryDivStateCache temporaryCache;

    public DivStateManager(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache) {
        this.cache = divStateCache;
        this.temporaryCache = temporaryDivStateCache;
    }

    @Nullable
    public final DivViewState getState(@NotNull DivDataTag tag) {
        DivViewState divViewState;
        synchronized (this.states) {
            try {
                divViewState = this.states.get(tag);
                if (divViewState == null) {
                    String rootState = this.cache.getRootState(tag.getId());
                    divViewState = rootState != null ? new DivViewState(Long.parseLong(rootState)) : null;
                    this.states.put(tag, divViewState);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return divViewState;
    }

    public final void updateState(@NotNull DivDataTag tag, long stateId, boolean temporary) {
        if (Intrinsics.areEqual(DivDataTag.INVALID, tag)) {
            return;
        }
        synchronized (this.states) {
            try {
                DivViewState state = getState(tag);
                this.states.put(tag, state == null ? new DivViewState(stateId) : new DivViewState(stateId, state.getBlockStates()));
                this.temporaryCache.putRootState(tag.getId(), String.valueOf(stateId));
                if (!temporary) {
                    this.cache.putRootState(tag.getId(), String.valueOf(stateId));
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void updateStates(@NotNull String cardId, @NotNull DivStatePath divStatePath, boolean temporary) {
        String pathToLastState = divStatePath.getPathToLastState();
        String lastStateId = divStatePath.getLastStateId();
        if (pathToLastState == null || lastStateId == null) {
            return;
        }
        synchronized (this.states) {
            try {
                this.temporaryCache.putState(cardId, pathToLastState, lastStateId);
                if (!temporary) {
                    this.cache.putState(cardId, pathToLastState, lastStateId);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
