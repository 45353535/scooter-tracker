package hh;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vh.l0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: hh.a0$a$a, reason: collision with other inner class name */
        public static final class C0907a extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f73498b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f73499c;

            C0907a(w wVar, File file) {
                this.f73498b = wVar;
                this.f73499c = file;
            }

            @Override // hh.a0
            public long contentLength() {
                return this.f73499c.length();
            }

            @Override // hh.a0
            public w contentType() {
                return this.f73498b;
            }

            @Override // hh.a0
            public void writeTo(vh.f sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                l0 l0VarJ = vh.x.j(this.f73499c);
                try {
                    sink.i(l0VarJ);
                    uf.c.a(l0VarJ, null);
                } finally {
                }
            }
        }

        public static final class b extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f73500b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ vh.h f73501c;

            b(w wVar, vh.h hVar) {
                this.f73500b = wVar;
                this.f73501c = hVar;
            }

            @Override // hh.a0
            public long contentLength() {
                return this.f73501c.K();
            }

            @Override // hh.a0
            public w contentType() {
                return this.f73500b;
            }

            @Override // hh.a0
            public void writeTo(vh.f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.r(this.f73501c);
            }
        }

        public static final class c extends a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f73502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f73503c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f73504d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f73505e;

            c(w wVar, int i10, byte[] bArr, int i11) {
                this.f73502b = wVar;
                this.f73503c = i10;
                this.f73504d = bArr;
                this.f73505e = i11;
            }

            @Override // hh.a0
            public long contentLength() {
                return this.f73503c;
            }

            @Override // hh.a0
            public w contentType() {
                return this.f73502b;
            }

            @Override // hh.a0
            public void writeTo(vh.f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f73504d, this.f73505e, this.f73503c);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a0 n(a aVar, w wVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(wVar, bArr, i10, i11);
        }

        public static /* synthetic */ a0 o(a aVar, byte[] bArr, w wVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                wVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m(bArr, wVar, i10, i11);
        }

        public final a0 a(w wVar, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return g(file, wVar);
        }

        public final a0 b(w wVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, wVar);
        }

        public final a0 c(w wVar, vh.h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return i(content, wVar);
        }

        public final a0 d(w wVar, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return n(this, wVar, content, 0, 0, 12, null);
        }

        public final a0 e(w wVar, byte[] content, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return n(this, wVar, content, i10, 0, 8, null);
        }

        public final a0 f(w wVar, byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m(content, wVar, i10, i11);
        }

        public final a0 g(File file, w wVar) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0907a(wVar, file);
        }

        public final a0 h(String str, w wVar) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, wVar, 0, bytes.length);
        }

        public final a0 i(vh.h hVar, w wVar) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            return new b(wVar, hVar);
        }

        public final a0 j(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return o(this, bArr, null, 0, 0, 7, null);
        }

        public final a0 k(byte[] bArr, w wVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return o(this, bArr, wVar, 0, 0, 6, null);
        }

        public final a0 l(byte[] bArr, w wVar, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return o(this, bArr, wVar, i10, 0, 4, null);
        }

        public final a0 m(byte[] bArr, w wVar, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            ih.d.l(bArr.length, i10, i11);
            return new c(wVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull File file) {
        return Companion.a(wVar, file);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract w contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(vh.f fVar);

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull String str) {
        return Companion.b(wVar, str);
    }

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull vh.h hVar) {
        return Companion.c(wVar, hVar);
    }

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull byte[] bArr) {
        return Companion.d(wVar, bArr);
    }

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull byte[] bArr, int i10) {
        return Companion.e(wVar, bArr, i10);
    }

    @NotNull
    public static final a0 create(@Nullable w wVar, @NotNull byte[] bArr, int i10, int i11) {
        return Companion.f(wVar, bArr, i10, i11);
    }

    @NotNull
    public static final a0 create(@NotNull File file, @Nullable w wVar) {
        return Companion.g(file, wVar);
    }

    @NotNull
    public static final a0 create(@NotNull String str, @Nullable w wVar) {
        return Companion.h(str, wVar);
    }

    @NotNull
    public static final a0 create(@NotNull vh.h hVar, @Nullable w wVar) {
        return Companion.i(hVar, wVar);
    }

    @NotNull
    public static final a0 create(@NotNull byte[] bArr) {
        return Companion.j(bArr);
    }

    @NotNull
    public static final a0 create(@NotNull byte[] bArr, @Nullable w wVar) {
        return Companion.k(bArr, wVar);
    }

    @NotNull
    public static final a0 create(@NotNull byte[] bArr, @Nullable w wVar, int i10) {
        return Companion.l(bArr, wVar, i10);
    }

    @NotNull
    public static final a0 create(@NotNull byte[] bArr, @Nullable w wVar, int i10, int i11) {
        return Companion.m(bArr, wVar, i10, i11);
    }
}
