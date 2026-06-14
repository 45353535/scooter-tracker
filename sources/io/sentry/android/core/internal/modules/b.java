package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.c1;
import io.sentry.g7;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f82510e;

    public b(Context context, ILogger iLogger) {
        super(iLogger);
        this.f82510e = c1.f(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f82509b.a();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f82510e.getAssets().open("sentry-external-modules.txt");
            try {
                Map mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f83640a.c(g7.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e10) {
            this.f83640a.a(g7.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
