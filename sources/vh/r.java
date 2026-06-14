package vh;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements l0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f106897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f106898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Inflater f106899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f106900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CRC32 f106901f;

    public r(l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        f0 f0Var = new f0(source);
        this.f106898c = f0Var;
        Inflater inflater = new Inflater(true);
        this.f106899d = inflater;
        this.f106900e = new s((g) f0Var, inflater);
        this.f106901f = new CRC32();
    }

    private final void c(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        throw new IOException(str2);
    }

    private final void m() throws IOException {
        this.f106898c.require(10L);
        byte bZ = this.f106898c.f106829c.z(3L);
        boolean z10 = ((bZ >> 1) & 1) == 1;
        if (z10) {
            o(this.f106898c.f106829c, 0L, 10L);
        }
        c("ID1ID2", 8075, this.f106898c.readShort());
        this.f106898c.skip(8L);
        if (((bZ >> 2) & 1) == 1) {
            this.f106898c.require(2L);
            if (z10) {
                o(this.f106898c.f106829c, 0L, 2L);
            }
            long shortLe = this.f106898c.f106829c.readShortLe() & 65535;
            this.f106898c.require(shortLe);
            if (z10) {
                o(this.f106898c.f106829c, 0L, shortLe);
            }
            this.f106898c.skip(shortLe);
        }
        if (((bZ >> 3) & 1) == 1) {
            long jIndexOf = this.f106898c.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z10) {
                o(this.f106898c.f106829c, 0L, jIndexOf + 1);
            }
            this.f106898c.skip(jIndexOf + 1);
        }
        if (((bZ >> 4) & 1) == 1) {
            long jIndexOf2 = this.f106898c.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                o(this.f106898c.f106829c, 0L, jIndexOf2 + 1);
            }
            this.f106898c.skip(jIndexOf2 + 1);
        }
        if (z10) {
            c("FHCRC", this.f106898c.readShortLe(), (short) this.f106901f.getValue());
            this.f106901f.reset();
        }
    }

    private final void n() throws IOException {
        c("CRC", this.f106898c.readIntLe(), (int) this.f106901f.getValue());
        c("ISIZE", this.f106898c.readIntLe(), (int) this.f106899d.getBytesWritten());
    }

    private final void o(e eVar, long j10, long j11) {
        g0 g0Var = eVar.f106814b;
        Intrinsics.checkNotNull(g0Var);
        while (true) {
            int i10 = g0Var.f106835c;
            int i11 = g0Var.f106834b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) g0Var.f106834b) + j10);
            int iMin = (int) Math.min(g0Var.f106835c - i12, j11);
            this.f106901f.update(g0Var.f106833a, i12, iMin);
            j11 -= (long) iMin;
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
            j10 = 0;
        }
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f106900e.close();
    }

    @Override // vh.l0
    public long read(e sink, long j10) throws IOException {
        r rVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f106897b == 0) {
            m();
            this.f106897b = (byte) 1;
        }
        if (this.f106897b == 1) {
            long jE0 = sink.e0();
            long j11 = this.f106900e.read(sink, j10);
            if (j11 != -1) {
                o(sink, jE0, j11);
                return j11;
            }
            rVar = this;
            rVar.f106897b = (byte) 2;
        } else {
            rVar = this;
        }
        if (rVar.f106897b == 2) {
            n();
            rVar.f106897b = (byte) 3;
            if (!rVar.f106898c.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // vh.l0
    public m0 timeout() {
        return this.f106898c.timeout();
    }
}
