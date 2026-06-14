package hh;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c0 implements Closeable, AutoCloseable {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private Reader reader;

    public static final class a extends Reader implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.g f73569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f73570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Reader f73572e;

        public a(vh.g source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f73569b = source;
            this.f73570c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f73571d = true;
            Reader reader = this.f73572e;
            if (reader != null) {
                reader.close();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f73569b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f73571d) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f73572e;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f73569b.inputStream(), ih.d.J(this.f73569b, this.f73570c));
                this.f73572e = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    public static final class b {

        public static final class a extends c0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f73573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f73574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ vh.g f73575d;

            a(w wVar, long j10, vh.g gVar) {
                this.f73573b = wVar;
                this.f73574c = j10;
                this.f73575d = gVar;
            }

            @Override // hh.c0
            public long contentLength() {
                return this.f73574c;
            }

            @Override // hh.c0
            public w contentType() {
                return this.f73573b;
            }

            @Override // hh.c0
            public vh.g source() {
                return this.f73575d;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c0 i(b bVar, byte[] bArr, w wVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            return bVar.h(bArr, wVar);
        }

        public final c0 a(w wVar, long j10, vh.g content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return f(content, wVar, j10);
        }

        public final c0 b(w wVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return e(content, wVar);
        }

        public final c0 c(w wVar, vh.h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, wVar);
        }

        public final c0 d(w wVar, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, wVar);
        }

        public final c0 e(String str, w wVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (wVar != null) {
                Charset charsetD = w.d(wVar, null, 1, null);
                if (charsetD == null) {
                    wVar = w.f73770e.b(wVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            vh.e eVarE0 = new vh.e().E0(str, charset);
            return f(eVarE0, wVar, eVarE0.e0());
        }

        public final c0 f(vh.g gVar, w wVar, long j10) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            return new a(wVar, j10, gVar);
        }

        public final c0 g(vh.h hVar, w wVar) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            return f(new vh.e().r(hVar), wVar, hVar.K());
        }

        public final c0 h(byte[] bArr, w wVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return f(new vh.e().write(bArr), wVar, bArr.length);
        }

        private b() {
        }
    }

    @NotNull
    public static final c0 create(@Nullable w wVar, long j10, @NotNull vh.g gVar) {
        return Companion.a(wVar, j10, gVar);
    }

    private final Charset m() {
        Charset charsetC;
        w wVarContentType = contentType();
        return (wVarContentType == null || (charsetC = wVarContentType.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetC;
    }

    @NotNull
    public final InputStream byteStream() {
        return source().inputStream();
    }

    @NotNull
    public final vh.h byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        vh.g gVarSource = source();
        try {
            vh.h byteString = gVarSource.readByteString();
            uf.c.a(gVarSource, null);
            int iK = byteString.K();
            if (jContentLength == -1 || jContentLength == iK) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iK + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        vh.g gVarSource = source();
        try {
            byte[] byteArray = gVarSource.readByteArray();
            uf.c.a(gVarSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), m());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ih.d.m(source());
    }

    public abstract long contentLength();

    public abstract w contentType();

    public abstract vh.g source();

    @NotNull
    public final String string() throws IOException {
        vh.g gVarSource = source();
        try {
            String string = gVarSource.readString(ih.d.J(gVarSource, m()));
            uf.c.a(gVarSource, null);
            return string;
        } finally {
        }
    }

    @NotNull
    public static final c0 create(@Nullable w wVar, @NotNull String str) {
        return Companion.b(wVar, str);
    }

    @NotNull
    public static final c0 create(@Nullable w wVar, @NotNull vh.h hVar) {
        return Companion.c(wVar, hVar);
    }

    @NotNull
    public static final c0 create(@Nullable w wVar, @NotNull byte[] bArr) {
        return Companion.d(wVar, bArr);
    }

    @NotNull
    public static final c0 create(@NotNull String str, @Nullable w wVar) {
        return Companion.e(str, wVar);
    }

    @NotNull
    public static final c0 create(@NotNull vh.g gVar, @Nullable w wVar, long j10) {
        return Companion.f(gVar, wVar, j10);
    }

    @NotNull
    public static final c0 create(@NotNull vh.h hVar, @Nullable w wVar) {
        return Companion.g(hVar, wVar);
    }

    @NotNull
    public static final c0 create(@NotNull byte[] bArr, @Nullable w wVar) {
        return Companion.h(bArr, wVar);
    }
}
