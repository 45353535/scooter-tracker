package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3615bo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3615bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H5 f38300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3589ao f38301b;

    public C3615bo(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.f38301b = new C3589ao();
        Runnable runnable = new Runnable() { // from class: w3.z5
            @Override // java.lang.Runnable
            public final void run() {
                C3615bo.a(webAssetCacheConfig, this, context);
            }
        };
        Context context2 = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public final InputStream a(String url, InterfaceC3878m9 interfaceC3878m9) {
        G5 g5B;
        Intrinsics.checkNotNullParameter(url, "url");
        H5 h52 = this.f38300a;
        if (h52 == null) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        try {
            g5B = h52.b(String.valueOf(url.hashCode()));
        } catch (Exception e10) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + url);
            }
        }
        if (g5B != null && Intrinsics.areEqual(url, AbstractC3612bl.a(new InputStreamReader(g5B.f36923a[0], AbstractC3612bl.f38289b)))) {
            return g5B.f36923a[1];
        }
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
        }
        return null;
    }

    public final boolean a(String url, String data, InterfaceC3878m9 interfaceC3878m9) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        D5 d5A;
        OutputStreamWriter outputStreamWriter2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f38300a == null) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            String strValueOf = String.valueOf(url.hashCode());
            H5 h52 = this.f38300a;
            outputStreamWriter = null;
            if (h52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                h52 = null;
            }
            d5A = h52.a(strValueOf);
        } catch (Exception e10) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + url);
            }
        }
        if (d5A == null) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
            }
            return false;
        }
        try {
            OutputStream outputStreamA = d5A.a(0);
            Charset charset = AbstractC3612bl.f38289b;
            OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(outputStreamA, charset);
            try {
                outputStreamWriter3.write(url);
                AbstractC3612bl.a(outputStreamWriter3);
                try {
                    outputStreamWriter2 = new OutputStreamWriter(d5A.a(1), charset);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    outputStreamWriter2.write(data);
                    AbstractC3612bl.a(outputStreamWriter2);
                    if (d5A.f36710c) {
                        d5A.f36711d.a(d5A, false);
                        d5A.f36711d.d(d5A.f36708a.f36771a);
                    } else {
                        d5A.f36711d.a(d5A, true);
                    }
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamWriter = outputStreamWriter2;
                    AbstractC3612bl.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStreamWriter = outputStreamWriter3;
                AbstractC3612bl.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C3615bo c3615bo, Context context) {
        try {
            C4148x5.f39893a.getClass();
            long j10 = C4148x5.f39895c;
            if (j10 < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c3615bo.getClass();
                a(context, j10);
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c3615bo.a(context, webAssetCacheConfig, j10);
            ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
            Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * 1024 * ((long) 1024);
        C3589ao c3589ao = this.f38301b;
        Pattern pattern = H5.f36976p;
        if (jMin > 0) {
            File file2 = new File(file, com.taurusx.tax.g.n0.y.f66195e);
            if (file2.exists()) {
                File file3 = new File(file, com.taurusx.tax.g.n0.y.f66202v);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            H5 h52 = new H5(file, jMin, c3589ao);
            if (h52.f36980c.exists()) {
                try {
                    h52.b();
                    h52.a();
                    h52.f36989l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(h52.f36980c, true), AbstractC3612bl.f38288a));
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    h52.close();
                    AbstractC3612bl.a(h52.f36979b);
                    file.mkdirs();
                    h52 = new H5(file, jMin, c3589ao);
                    h52.c();
                }
            } else {
                file.mkdirs();
                h52 = new H5(file, jMin, c3589ao);
                h52.c();
            }
            this.f38300a = h52;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j10) {
        Pair pair = TuplesKt.to("size", Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "web_asset_file_key");
        Intrinsics.checkNotNullParameter("cache_enabled", C4240b4.i.W);
        Map mapMutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("state", Boolean.valueOf(eaA.f36783a.getBoolean("cache_enabled", false))));
        Wj wj = Wj.f37959a;
        Wj.b("LowAvailableSpaceForCache", mapMutableMapOf, EnumC3585ak.f38215a);
    }
}
