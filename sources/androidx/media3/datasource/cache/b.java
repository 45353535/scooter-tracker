package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {
    static {
        CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;
    }

    public static /* synthetic */ String a(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
