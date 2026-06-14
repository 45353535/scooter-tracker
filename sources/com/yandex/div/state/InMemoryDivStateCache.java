package com.yandex.div.state;

import androidx.annotation.AnyThread;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@AnyThread
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0084\u0001\u0010\u0015\u001ar\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0013*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00120\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004 \u0013*8\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0013*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00120\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00140\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016RT\u0010\u0017\u001aB\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004 \u0013* \u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00140\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/state/InMemoryDivStateCache;", "Lcom/yandex/div/state/DivStateCache;", "<init>", "()V", "", "cardId", "path", "state", "", "putState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "putRootState", "(Ljava/lang/String;Ljava/lang/String;)V", "getState", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getRootState", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", "states", "Ljava/util/Map;", "rootStates", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<Pair<String, String>, String> states = DesugarCollections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = DesugarCollections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getRootState(@NotNull String cardId) {
        return this.rootStates.get(cardId);
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getState(@NotNull String cardId, @NotNull String path) {
        return this.states.get(TuplesKt.to(cardId, path));
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(@NotNull String cardId, @NotNull String state) {
        this.rootStates.put(cardId, state);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putState(@NotNull String cardId, @NotNull String path, @NotNull String state) {
        this.states.put(TuplesKt.to(cardId, path), state);
    }
}
