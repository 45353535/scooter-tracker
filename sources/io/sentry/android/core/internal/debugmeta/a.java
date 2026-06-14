package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.c1;
import io.sentry.g7;
import io.sentry.util.d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f82479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f82480b;

    public a(Context context, ILogger iLogger) {
        this.f82479a = c1.f(context);
        this.f82480b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f82479a.getAssets().open(d.f84295a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f82480b.c(g7.INFO, "%s file was not found.", d.f84295a);
            return null;
        } catch (IOException e10) {
            this.f82480b.a(g7.ERROR, "Error getting Proguard UUIDs.", e10);
            return null;
        } catch (RuntimeException e11) {
            this.f82480b.b(g7.ERROR, e11, "%s file is malformed.", d.f84295a);
            return null;
        }
    }
}
