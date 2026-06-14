package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f51752a = Logger.getLogger(l.class.getName());

    static class a implements r, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f51753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f51754b;

        a(t tVar, OutputStream outputStream) {
            this.f51753a = tVar;
            this.f51754b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f51733b, 0L, j10);
            while (j10 > 0) {
                this.f51753a.e();
                o oVar = cVar.f51732a;
                int iMin = (int) Math.min(j10, oVar.f51767c - oVar.f51766b);
                this.f51754b.write(oVar.f51765a, oVar.f51766b, iMin);
                int i10 = oVar.f51766b + iMin;
                oVar.f51766b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f51733b -= j11;
                if (i10 == oVar.f51767c) {
                    cVar.f51732a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f51753a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f51754b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f51754b.flush();
        }

        public String toString() {
            return "sink(" + this.f51754b + ")";
        }
    }

    static class c extends com.mbridge.msdk.thrid.okio.a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f51757k;

        c(Socket socket) {
            this.f51757k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            try {
                this.f51757k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f51752a.log(Level.WARNING, "Failed to close timed out socket " + this.f51757k, (Throwable) e10);
            } catch (Exception e11) {
                l.f51752a.log(Level.WARNING, "Failed to close timed out socket " + this.f51757k, (Throwable) e11);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    static class b implements s, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f51755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f51756b;

        b(t tVar, InputStream inputStream) {
            this.f51755a = tVar;
            this.f51756b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f51755a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f51756b.read(oVarB.f51765a, oVarB.f51767c, (int) Math.min(j10, 8192 - oVarB.f51767c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f51767c += i10;
                long j11 = i10;
                cVar.f51733b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f51756b.close();
        }

        public String toString() {
            return "source(" + this.f51756b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f51755a;
        }
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
