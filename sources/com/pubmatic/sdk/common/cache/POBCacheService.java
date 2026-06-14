package com.pubmatic.sdk.common.cache;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBCacheService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static POBCacheService f62292b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f62293a = DesugarCollections.synchronizedMap(new HashMap());

    private POBCacheService() {
    }

    @NonNull
    public static synchronized POBCacheService getInstance() {
        try {
            if (f62292b == null) {
                f62292b = new POBCacheService();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f62292b;
    }

    @NonNull
    public <T> Map<String, T> getService(@NonNull String str) {
        Map<String, T> map;
        try {
            map = (Map) this.f62293a.get(str);
        } catch (Exception unused) {
            POBLog.error("POBCacheService", "Couldn't find cache for - %s", str);
            map = null;
        }
        if (map != null) {
            return map;
        }
        Map<String, T> mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
        this.f62293a.put(str, mapSynchronizedMap);
        return mapSynchronizedMap;
    }
}
