package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56267c;

    public l(Context appContext, String cacheDir) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f56265a = appContext;
        this.f56266b = cacheDir;
        this.f56267c = "MediaCacheLocationProviderImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k
    public h0 a() {
        try {
            File externalCacheDir = this.f56265a.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, this.f56266b);
                file.mkdir();
                if (file.exists()) {
                    return new h0.b(file);
                }
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", null, false, 12, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e10, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e11, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e12, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k
    public h0 b() {
        try {
            if (this.f56265a.getCacheDir() != null) {
                File file = new File(this.f56265a.getCacheDir(), this.f56266b);
                file.mkdir();
                if (file.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f56267c, "Able to write to internal storage cache directory", false, 4, null);
                    return new h0.b(file);
                }
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in internal storage", null, false, 12, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e10, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e11, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56267c, "Failed to create cache directory in external storage", e12, false, 8, null);
            return new h0.a(new com.moloco.sdk.internal.q("Failed to create cache directory in internal storage", 200));
        }
    }
}
