package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long j10, CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j10, -9223372036854775807L, cachedContentIndex);
    }

    public static SimpleCacheSpan createHole(String str, long j10, long j11) {
        return new SimpleCacheSpan(str, j10, j11, -9223372036854775807L, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j10) {
        return new SimpleCacheSpan(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + SUFFIX);
    }

    @Nullable
    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            strUnescapeFileName = matcher.matches() ? (String) Assertions.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) Assertions.checkStateNotNull(file.getParentFile()), cachedContentIndex.assignIdForKey(strUnescapeFileName), Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j10) {
        Assertions.checkState(this.isCached);
        return new SimpleCacheSpan(this.key, this.position, this.length, j10, file);
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long j10, long j11, CachedContentIndex cachedContentIndex) {
        String keyForId;
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = cachedContentIndex.getKeyForId(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new SimpleCacheSpan(keyForId, Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), j12, j11 == -9223372036854775807L ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))) : j11, file2);
    }
}
