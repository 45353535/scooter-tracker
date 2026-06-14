package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class CacheMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile CacheMetaData f64024a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;

    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "5.2.4";

    @VisibleForTesting
    public CacheMetaData() {
    }

    public static CacheMetaData b() {
        return f64024a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f64024a.ACM;
        return aCMConfig != null && aCMConfig.a(ih.f64695a.f64789q);
    }

    public final ACMConfig a() {
        return this.ACM;
    }

    public final float c() {
        return this.sendCacheSizeProb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CacheMetaData cacheMetaData = (CacheMetaData) obj;
            if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) == 0 && vi.a((Object) this.ACM, (Object) cacheMetaData.ACM) && vi.a((Object) this.cacheMetaDataUpdateVersion, (Object) cacheMetaData.cacheMetaDataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "5.2.4";
        f64024a = cacheMetaData;
        g7.a(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) g7.c(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean zA = vi.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if ("5.2.4".equals(cacheMetaData.cacheMetaDataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f64610e);
                g9Var.f64553d = "metadata_null";
                g9Var.a();
            }
            f64024a = cacheMetaData;
            return;
        }
        f64024a = cacheMetaData2;
    }
}
