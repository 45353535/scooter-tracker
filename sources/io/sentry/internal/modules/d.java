package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.g1;
import io.sentry.g7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f83639d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ILogger f83640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f83641b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map f83642c = null;

    public d(ILogger iLogger) {
        this.f83640a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        if (this.f83642c == null) {
            g1 g1VarD = this.f83641b.d();
            try {
                if (this.f83642c == null) {
                    this.f83642c = b();
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f83642c;
    }

    protected abstract Map b();

    protected Map c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f83639d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f83640a.c(g7.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f83640a.a(g7.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.f83640a.b(g7.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
