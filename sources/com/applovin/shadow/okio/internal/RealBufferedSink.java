package com.applovin.shadow.okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.applovin.shadow.okio.buffer;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, d2 = {"commonClose", "", "Lcom/applovin/shadow/okio/RealBufferedSink;", "commonEmit", "Lcom/applovin/shadow/okio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lcom/applovin/shadow/okio/Timeout;", "commonToString", "", "commonWrite", "source", "", "offset", "", "byteCount", "Lcom/applovin/shadow/okio/Buffer;", "", "byteString", "Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", "s", "commonWriteShortLe", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSink {
    public static final void commonClose(@NotNull buffer bufferVar) throws Throwable {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            return;
        }
        try {
            if (bufferVar.bufferField.size() > 0) {
                Sink sink = bufferVar.sink;
                Buffer buffer = bufferVar.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferVar.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        bufferVar.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long size = bufferVar.bufferField.size();
        if (size > 0) {
            bufferVar.sink.write(bufferVar.bufferField, size);
        }
        return bufferVar;
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = bufferVar.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            bufferVar.sink.write(bufferVar.bufferField, jCompleteSegmentByteCount);
        }
        return bufferVar;
    }

    public static final void commonFlush(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (bufferVar.bufferField.size() > 0) {
            Sink sink = bufferVar.sink;
            Buffer buffer = bufferVar.bufferField;
            sink.write(buffer, buffer.size());
        }
        bufferVar.sink.flush();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return bufferVar.sink.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return "buffer(" + bufferVar.sink + ')';
    }

    public static final void commonWrite(@NotNull buffer bufferVar, @NotNull Buffer source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.write(source, j10);
        bufferVar.emitCompleteSegments();
    }

    public static final long commonWriteAll(@NotNull buffer bufferVar, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(bufferVar.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            bufferVar.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeByte(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull buffer bufferVar, long j10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeDecimalLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull buffer bufferVar, long j10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeHexadecimalUnsignedLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeInt(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeIntLe(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull buffer bufferVar, long j10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull buffer bufferVar, long j10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLongLe(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShort(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShortLe(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8(string);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull buffer bufferVar, int i10) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8CodePoint(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!bufferVar.closed) {
            bufferVar.bufferField.writeUtf8(string, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull Source source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(bufferVar.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                bufferVar.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return bufferVar;
    }
}
