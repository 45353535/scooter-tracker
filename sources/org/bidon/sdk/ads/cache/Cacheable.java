package org.bidon.sdk.ads.cache;

import androidx.annotation.Keep;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/cache/Cacheable;", "", "withSettings", "", "settings", "Lorg/bidon/sdk/ads/cache/Cacheable$Settings;", "Settings", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Cacheable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/ads/cache/Cacheable$Companion;", "", "<init>", "()V", "MIN_CACHE_SIZE", "", "CACHE_CAPACITY", "DefaultSettings", "Lorg/bidon/sdk/ads/cache/Cacheable$Settings;", "getDefaultSettings", "()Lorg/bidon/sdk/ads/cache/Cacheable$Settings;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int CACHE_CAPACITY = 1;
        private static final int MIN_CACHE_SIZE = 1;

        private Companion() {
        }

        @NotNull
        public final Settings getDefaultSettings() {
            return new Settings(1, 1);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/bidon/sdk/ads/cache/Cacheable$Settings;", "", "minCacheSize", "", "cacheCapacity", "<init>", "(II)V", "getMinCacheSize", "()I", "getCacheCapacity", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Settings {
        private final int cacheCapacity;
        private final int minCacheSize;

        public Settings(int i10, int i11) {
            this.minCacheSize = i10;
            this.cacheCapacity = i11;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = settings.minCacheSize;
            }
            if ((i12 & 2) != 0) {
                i11 = settings.cacheCapacity;
            }
            return settings.copy(i10, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMinCacheSize() {
            return this.minCacheSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCacheCapacity() {
            return this.cacheCapacity;
        }

        @NotNull
        public final Settings copy(int minCacheSize, int cacheCapacity) {
            return new Settings(minCacheSize, cacheCapacity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.minCacheSize == settings.minCacheSize && this.cacheCapacity == settings.cacheCapacity;
        }

        public final int getCacheCapacity() {
            return this.cacheCapacity;
        }

        public final int getMinCacheSize() {
            return this.minCacheSize;
        }

        public int hashCode() {
            return (this.minCacheSize * 31) + this.cacheCapacity;
        }

        @NotNull
        public String toString() {
            return "Settings(minCacheSize=" + this.minCacheSize + ", cacheCapacity=" + this.cacheCapacity + ")";
        }
    }

    void withSettings(@NotNull Settings settings);
}
