package ph;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ph.d;
import vh.l0;
import vh.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f98488f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f98489g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.g f98490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f98491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f98492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.a f98493e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return h.f98489g;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    public static final class b implements l0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.g f98494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f98495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f98496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f98497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f98498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f98499g;

        public b(vh.g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f98494b = source;
        }

        private final void n() throws IOException {
            int i10 = this.f98497e;
            int iK = ih.d.K(this.f98494b);
            this.f98498f = iK;
            this.f98495c = iK;
            int iD = ih.d.d(this.f98494b.readByte(), 255);
            this.f98496d = ih.d.d(this.f98494b.readByte(), 255);
            a aVar = h.f98488f;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f98402a.c(true, this.f98497e, this.f98495c, iD, this.f98496d));
            }
            int i11 = this.f98494b.readInt() & Integer.MAX_VALUE;
            this.f98497e = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int m() {
            return this.f98498f;
        }

        public final void o(int i10) {
            this.f98496d = i10;
        }

        public final void p(int i10) {
            this.f98498f = i10;
        }

        public final void q(int i10) {
            this.f98495c = i10;
        }

        @Override // vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.f98498f;
                if (i10 != 0) {
                    long j11 = this.f98494b.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f98498f -= (int) j11;
                    return j11;
                }
                this.f98494b.skip(this.f98499g);
                this.f98499g = 0;
                if ((this.f98496d & 4) != 0) {
                    return -1L;
                }
                n();
            }
        }

        public final void s(int i10) {
            this.f98499g = i10;
        }

        @Override // vh.l0
        public m0 timeout() {
            return this.f98494b.timeout();
        }

        public final void w(int i10) {
            this.f98497e = i10;
        }
    }

    public interface c {
        void a(boolean z10, int i10, vh.g gVar, int i11);

        void ackSettings();

        void b(int i10, ph.b bVar, vh.h hVar);

        void c(boolean z10, m mVar);

        void d(int i10, ph.b bVar);

        void headers(boolean z10, int i10, int i11, List list);

        void ping(boolean z10, int i10, int i11);

        void priority(int i10, int i11, int i12, boolean z10);

        void pushPromise(int i10, int i11, List list);

        void windowUpdate(int i10, long j10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f98489g = logger;
    }

    public h(vh.g source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f98490b = source;
        this.f98491c = z10;
        b bVar = new b(source);
        this.f98492d = bVar;
        this.f98493e = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void M(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            z(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void R(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? ih.d.d(this.f98490b.readByte(), 255) : 0;
        cVar.pushPromise(i12, this.f98490b.readInt() & Integer.MAX_VALUE, s(f98488f.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void U(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f98490b.readInt();
        ph.b bVarA = ph.b.f98354c.a(i13);
        if (bVarA != null) {
            cVar.d(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    private final void V(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.ackSettings();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        m mVar = new m();
        kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, i10), 6);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (true) {
                int iE2 = ih.d.e(this.f98490b.readShort(), 65535);
                i13 = this.f98490b.readInt();
                if (iE2 != 2) {
                    if (iE2 == 3) {
                        iE2 = 4;
                    } else if (iE2 != 4) {
                        if (iE2 == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE2 = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE2, i13);
                if (iE == iF) {
                    break;
                } else {
                    iE += iG;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.c(false, mVar);
    }

    private final void W(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jF = ih.d.f(this.f98490b.readInt(), SieveCacheKt.NodeLinkMask);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.windowUpdate(i12, jF);
    }

    private final void p(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? ih.d.d(this.f98490b.readByte(), 255) : 0;
        cVar.a(z10, i12, this.f98490b, f98488f.b(i10, i11, iD));
        this.f98490b.skip(iD);
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f98490b.readInt();
        int i14 = this.f98490b.readInt();
        int i15 = i10 - 8;
        ph.b bVarA = ph.b.f98354c.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        vh.h byteString = vh.h.f106841f;
        if (i15 > 0) {
            byteString = this.f98490b.readByteString(i15);
        }
        cVar.b(i13, bVarA, byteString);
    }

    private final List s(int i10, int i11, int i12, int i13) throws IOException {
        this.f98492d.p(i10);
        b bVar = this.f98492d;
        bVar.q(bVar.m());
        this.f98492d.s(i11);
        this.f98492d.o(i12);
        this.f98492d.w(i13);
        this.f98493e.k();
        return this.f98493e.e();
    }

    private final void w(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? ih.d.d(this.f98490b.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            z(cVar, i12);
            i10 -= 5;
        }
        cVar.headers(z10, i12, -1, s(f98488f.b(i10, i11, iD), iD, i11, i12));
    }

    private final void y(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.ping((i11 & 1) != 0, this.f98490b.readInt(), this.f98490b.readInt());
    }

    private final void z(c cVar, int i10) {
        int i11 = this.f98490b.readInt();
        cVar.priority(i10, i11 & Integer.MAX_VALUE, ih.d.d(this.f98490b.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f98490b.close();
    }

    public final boolean n(boolean z10, c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f98490b.require(9L);
            int iK = ih.d.K(this.f98490b);
            if (iK > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iK);
            }
            int iD = ih.d.d(this.f98490b.readByte(), 255);
            int iD2 = ih.d.d(this.f98490b.readByte(), 255);
            int i10 = this.f98490b.readInt() & Integer.MAX_VALUE;
            Logger logger = f98489g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f98402a.c(true, i10, iK, iD, iD2));
            }
            if (z10 && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f98402a.b(iD));
            }
            switch (iD) {
                case 0:
                    p(handler, iK, iD2, i10);
                    return true;
                case 1:
                    w(handler, iK, iD2, i10);
                    return true;
                case 2:
                    M(handler, iK, iD2, i10);
                    return true;
                case 3:
                    U(handler, iK, iD2, i10);
                    return true;
                case 4:
                    V(handler, iK, iD2, i10);
                    return true;
                case 5:
                    R(handler, iK, iD2, i10);
                    return true;
                case 6:
                    y(handler, iK, iD2, i10);
                    return true;
                case 7:
                    q(handler, iK, iD2, i10);
                    return true;
                case 8:
                    W(handler, iK, iD2, i10);
                    return true;
                default:
                    this.f98490b.skip(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void o(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f98491c) {
            if (!n(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        vh.g gVar = this.f98490b;
        vh.h hVar = e.f98403b;
        vh.h byteString = gVar.readByteString(hVar.K());
        Logger logger = f98489g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(ih.d.t("<< CONNECTION " + byteString.r(), new Object[0]));
        }
        if (Intrinsics.areEqual(hVar, byteString)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString.S());
    }
}
