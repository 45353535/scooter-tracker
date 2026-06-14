package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5192ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Boolean f77510a;

    public final void a(Context context) {
        if (this.f77510a == null) {
            synchronized (this) {
                try {
                    if (this.f77510a == null) {
                        boolean z10 = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (zExists || zExists2) {
                                z10 = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f77510a = Boolean.valueOf(z10);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
