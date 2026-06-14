package io.sentry;

import com.ironsource.D5;
import io.sentry.v7;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes3.dex */
@ApiStatus.Internal
public final class SpotlightIntegration implements r1, v7.b, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v7 f82209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ILogger f82210c = p2.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f82211d = c3.e();

    private void f(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection h(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", D5.L);
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(u5 u5Var) {
        OutputStream outputStream;
        try {
            if (this.f82209b == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionH = h(m());
            try {
                outputStream = httpURLConnectionH.getOutputStream();
            } catch (Throwable th2) {
                try {
                    this.f82210c.a(g7.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th2);
                    this.f82210c.c(g7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionH.getResponseCode()));
                } catch (Throwable th3) {
                    this.f82210c.c(g7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionH.getResponseCode()));
                    f(httpURLConnectionH);
                    throw th3;
                }
            }
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f82209b.getSerializer().b(u5Var, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    this.f82210c.c(g7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionH.getResponseCode()));
                    f(httpURLConnectionH);
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            this.f82210c.a(g7.ERROR, "An exception occurred while creating the connection to spotlight.", e10);
        }
    }

    @Override // io.sentry.r1
    public void c(b1 b1Var, v7 v7Var) {
        this.f82209b = v7Var;
        this.f82210c = v7Var.getLogger();
        if (v7Var.getBeforeEnvelopeCallback() != null || !v7Var.isEnableSpotlight()) {
            this.f82210c.c(g7.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f82211d = new a7(v7Var);
        v7Var.setBeforeEnvelopeCallback(this);
        this.f82210c.c(g7.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        io.sentry.util.o.a("Spotlight");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f82211d.b(0L);
        v7 v7Var = this.f82209b;
        if (v7Var == null || v7Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f82209b.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.v7.b
    public void d(final u5 u5Var, i0 i0Var) {
        try {
            this.f82211d.submit(new Runnable() { // from class: io.sentry.x8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84456b.n(u5Var);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.f82210c.a(g7.WARNING, "Spotlight envelope submission rejected.", e10);
        }
    }

    public String m() {
        v7 v7Var = this.f82209b;
        return (v7Var == null || v7Var.getSpotlightConnectionUrl() == null) ? io.sentry.util.y.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream" : this.f82209b.getSpotlightConnectionUrl();
    }
}
