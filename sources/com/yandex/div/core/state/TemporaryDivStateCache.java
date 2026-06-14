package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/state/TemporaryDivStateCache;", "", "<init>", "()V", "", "cardId", "path", "getState", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "resetCard", "(Ljava/lang/String;)Ljava/util/Map;", "stateId", "", "putState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "putRootState", "(Ljava/lang/String;Ljava/lang/String;)V", "temporaryCache", "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TemporaryDivStateCache {

    @NotNull
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    @AnyThread
    @Nullable
    public final String getState(@NotNull String cardId, @NotNull String path) {
        String str;
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(cardId);
            str = map != null ? map.get(path) : null;
        }
        return str;
    }

    @AnyThread
    public final void putRootState(@NotNull String cardId, @NotNull String stateId) {
        putState(cardId, "/", stateId);
    }

    @AnyThread
    public final void putState(@NotNull String cardId, @NotNull String path, @NotNull String stateId) {
        synchronized (this.temporaryCache) {
            try {
                Map<String, Map<String, String>> map = this.temporaryCache;
                Map<String, String> linkedHashMap = map.get(cardId);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    map.put(cardId, linkedHashMap);
                }
                linkedHashMap.put(path, stateId);
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @AnyThread
    @Nullable
    public final Map<String, String> resetCard(@NotNull String cardId) {
        Map<String, String> mapRemove;
        synchronized (this.temporaryCache) {
            mapRemove = this.temporaryCache.remove(cardId);
        }
        return mapRemove;
    }
}
