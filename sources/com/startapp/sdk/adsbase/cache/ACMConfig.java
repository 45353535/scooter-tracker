package com.startapp.sdk.adsbase.cache;

import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.utils.UniversalIntParser;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 8186744598706386361L;

    @Nullable
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents;

    @Nullable
    @TypeInfo(key = Integer.class, type = HashMap.class, value = Integer.class)
    private Map<Integer, Integer> skipRules;
    private long adCacheTTL = 3600;

    @TypeInfo(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);

    @TypeInfo(parser = UniversalIntParser.class)
    private int autoLoadEnabled = 1;
    private boolean localCache = true;

    @TypeInfo(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private int maxCacheSize = 7;

    public final long a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    public final Set b() {
        return this.autoLoad;
    }

    public final FailuresHandler c() {
        return this.failuresHandler;
    }

    public final ComponentInfoEventConfig d() {
        return this.infoEvents;
    }

    public final int e() {
        return this.maxCacheSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ACMConfig aCMConfig = (ACMConfig) obj;
            if (this.adCacheTTL == aCMConfig.adCacheTTL && this.autoLoadEnabled == aCMConfig.autoLoadEnabled && this.localCache == aCMConfig.localCache && this.maxCacheSize == aCMConfig.maxCacheSize && vi.a(this.autoLoad, aCMConfig.autoLoad) && vi.a((Object) this.failuresHandler, (Object) aCMConfig.failuresHandler) && vi.a(this.skipRules, aCMConfig.skipRules) && vi.a((Object) this.infoEvents, (Object) aCMConfig.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final Map f() {
        return this.skipRules;
    }

    public final boolean g() {
        return this.localCache;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), this.autoLoad, Integer.valueOf(this.autoLoadEnabled), Boolean.valueOf(this.localCache), this.failuresHandler, Integer.valueOf(this.maxCacheSize), this.skipRules, this.infoEvents};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean a(boolean z10) {
        int i10 = this.autoLoadEnabled;
        return i10 == 2 ? !z10 : i10 == 1;
    }
}
