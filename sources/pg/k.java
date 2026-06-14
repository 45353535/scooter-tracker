package pg;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f98329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f98331d;

    public k(j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f98329b = source;
        this.f98331d = new a();
    }

    @Override // pg.j
    public long L(a sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f98330c) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f98331d.s() == 0 && this.f98329b.L(this.f98331d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f98331d.L(sink, Math.min(j10, this.f98331d.s()));
    }

    @Override // pg.s
    public long Q(i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f98329b.L(this.f98331d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jN = this.f98331d.n();
            if (jN > 0) {
                j10 += jN;
                sink.v0(this.f98331d, jN);
            }
        }
        if (this.f98331d.s() <= 0) {
            return j10;
        }
        long jS = j10 + this.f98331d.s();
        a aVar = this.f98331d;
        sink.v0(aVar, aVar.s());
        return jS;
    }

    @Override // pg.s
    public void c0(i sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(j10);
            this.f98331d.c0(sink, j10);
        } catch (EOFException e10) {
            sink.v0(this.f98331d, this.f98331d.s());
            throw e10;
        }
    }

    @Override // pg.j, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f98330c) {
            return;
        }
        this.f98330c = true;
        this.f98329b.close();
        this.f98331d.m();
    }

    @Override // pg.s
    public boolean exhausted() {
        if (this.f98330c) {
            throw new IllegalStateException("Source is closed.");
        }
        return this.f98331d.exhausted() && this.f98329b.L(this.f98331d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // pg.s, pg.r
    public a getBuffer() {
        return this.f98331d;
    }

    @Override // pg.s
    public int j0(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        v.a(sink.length, i10, i11);
        if (this.f98331d.s() == 0 && this.f98329b.L(this.f98331d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f98331d.j0(sink, i10, ((int) Math.min(i11 - i10, this.f98331d.s())) + i10);
    }

    @Override // pg.s
    public s peek() {
        if (this.f98330c) {
            throw new IllegalStateException("Source is closed.");
        }
        return e.a(new h(this));
    }

    @Override // pg.s
    public byte readByte() throws EOFException {
        require(1L);
        return this.f98331d.readByte();
    }

    @Override // pg.s
    public boolean request(long j10) {
        if (this.f98330c) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 >= 0) {
            while (this.f98331d.s() < j10) {
                if (this.f98329b.L(this.f98331d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @Override // pg.s
    public void require(long j10) throws EOFException {
        if (request(j10)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j10 + ").");
    }

    public String toString() {
        return "buffered(" + this.f98329b + ')';
    }
}
