package com.google.common.io;

import androidx.collection.SieveCacheKt;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class ByteSource {

    class AsCharSource extends CharSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f30886a;

        AsCharSource(Charset charset) {
            this.f30886a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSource
        public ByteSource asByteSource(Charset charset) {
            return charset.equals(this.f30886a) ? ByteSource.this : super.asByteSource(charset);
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
            return new InputStreamReader(ByteSource.this.openStream(), this.f30886a);
        }

        @Override // com.google.common.io.CharSource
        public String read() throws IOException {
            return new String(ByteSource.this.read(), this.f30886a);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.f30886a + ")";
        }
    }

    private static class ByteArrayByteSource extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f30888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f30889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f30890c;

        ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.f30888a, this.f30889b, this.f30890c);
            return this.f30890c;
        }

        @Override // com.google.common.io.ByteSource
        public HashCode hash(HashFunction hashFunction) throws IOException {
            return hashFunction.hashBytes(this.f30888a, this.f30889b, this.f30890c);
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
            return this.f30890c == 0;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f30888a, this.f30889b, this.f30890c);
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
            byte[] bArr = this.f30888a;
            int i10 = this.f30889b;
            return Arrays.copyOfRange(bArr, i10, this.f30890c + i10);
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
            return this.f30890c;
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return Optional.of(Long.valueOf(this.f30890c));
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j10, long j11) {
            Preconditions.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
            Preconditions.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
            long jMin = Math.min(j10, this.f30890c);
            return new ByteArrayByteSource(this.f30888a, this.f30889b + ((int) jMin), (int) Math.min(j11, ((long) this.f30890c) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.f30888a, this.f30889b, this.f30890c), 30, APSSharedUtil.TRUNCATE_SEPARATOR) + ")";
        }

        ByteArrayByteSource(byte[] bArr, int i10, int i11) {
            this.f30888a = bArr;
            this.f30889b = i10;
            this.f30890c = i11;
        }

        @Override // com.google.common.io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
            byteProcessor.processBytes(this.f30888a, this.f30889b, this.f30890c);
            return byteProcessor.getResult();
        }
    }

    private static final class ConcatenatedByteSource extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterable f30891a;

        ConcatenatedByteSource(Iterable iterable) {
            this.f30891a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
            Iterator it = this.f30891a.iterator();
            while (it.hasNext()) {
                if (!((ByteSource) it.next()).isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return new MultiInputStream(this.f30891a.iterator());
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws IOException {
            Iterator it = this.f30891a.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += ((ByteSource) it.next()).size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Iterable iterable = this.f30891a;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            Iterator it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalSizeIfKnown = ((ByteSource) it.next()).sizeIfKnown();
                if (!optionalSizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return Optional.of(Long.MAX_VALUE);
                }
            }
            return Optional.of(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f30891a + ")";
        }
    }

    private static final class EmptyByteSource extends ByteArrayByteSource {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final EmptyByteSource f30892d = new EmptyByteSource();

        EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.io.ByteSource
        public byte[] read() {
            return this.f30888a;
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    private final class SlicedByteSource extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f30893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f30894b;

        SlicedByteSource(long j10, long j11) {
            Preconditions.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
            Preconditions.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
            this.f30893a = j10;
            this.f30894b = j11;
        }

        private InputStream b(InputStream inputStream) throws Throwable {
            long j10 = this.f30893a;
            if (j10 > 0) {
                try {
                    if (ByteStreams.d(inputStream, j10) < this.f30893a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return ByteStreams.limit(inputStream, this.f30894b);
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
            return this.f30894b == 0 || super.isEmpty();
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() throws IOException {
            return b(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return b(ByteSource.this.openStream());
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Optional<Long> optionalSizeIfKnown = ByteSource.this.sizeIfKnown();
            if (!optionalSizeIfKnown.isPresent()) {
                return Optional.absent();
            }
            long jLongValue = optionalSizeIfKnown.get().longValue();
            return Optional.of(Long.valueOf(Math.min(this.f30894b, jLongValue - Math.min(this.f30893a, jLongValue))));
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j10, long j11) {
            Preconditions.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
            Preconditions.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
            long j12 = this.f30894b - j10;
            return j12 <= 0 ? ByteSource.empty() : ByteSource.this.slice(this.f30893a + j10, Math.min(j11, j12));
        }

        public String toString() {
            return ByteSource.this.toString() + ".slice(" + this.f30893a + ", " + this.f30894b + ")";
        }
    }

    protected ByteSource() {
    }

    private long a(InputStream inputStream) {
        long j10 = 0;
        while (true) {
            long jD = ByteStreams.d(inputStream, SieveCacheKt.NodeLinkMask);
            if (jD <= 0) {
                return j10;
            }
            j10 += jD;
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new ConcatenatedByteSource(iterable);
    }

    public static ByteSource empty() {
        return EmptyByteSource.f30892d;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new ByteArrayByteSource(bArr);
    }

    public CharSource asCharSource(Charset charset) {
        return new AsCharSource(charset);
    }

    public boolean contentEquals(ByteSource byteSource) throws Throwable {
        int i10;
        Preconditions.checkNotNull(byteSource);
        byte[] bArrB = ByteStreams.b();
        byte[] bArrB2 = ByteStreams.b();
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            InputStream inputStream2 = (InputStream) closerCreate.register(byteSource.openStream());
            do {
                i10 = ByteStreams.read(inputStream, bArrB, 0, bArrB.length);
                if (i10 == ByteStreams.read(inputStream2, bArrB2, 0, bArrB2.length) && Arrays.equals(bArrB, bArrB2)) {
                }
                return false;
            } while (i10 == bArrB.length);
            closerCreate.close();
            return true;
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws Throwable {
        Preconditions.checkNotNull(outputStream);
        try {
            return ByteStreams.copy((InputStream) Closer.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public HashCode hash(HashFunction hashFunction) throws Throwable {
        Hasher hasherNewHasher = hashFunction.newHasher();
        copyTo(Funnels.asOutputStream(hasherNewHasher));
        return hasherNewHasher.hash();
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue() == 0;
        }
        try {
            return ((InputStream) Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream inputStreamOpenStream = openStream();
        return inputStreamOpenStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenStream : new BufferedInputStream(inputStreamOpenStream);
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws Throwable {
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            Optional<Long> optionalSizeIfKnown = sizeIfKnown();
            return optionalSizeIfKnown.isPresent() ? ByteStreams.e(inputStream, optionalSizeIfKnown.get().longValue()) : ByteStreams.toByteArray(inputStream);
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } finally {
                closerCreate.close();
            }
        }
    }

    public long size() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue();
        }
        Closer closerCreate = Closer.create();
        try {
            return a((InputStream) closerCreate.register(openStream()));
        } catch (IOException unused) {
            closerCreate.close();
            try {
                return ByteStreams.exhaust((InputStream) Closer.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    public ByteSource slice(long j10, long j11) {
        return new SlicedByteSource(j10, j11);
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws Throwable {
        Preconditions.checkNotNull(byteSink);
        Closer closerCreate = Closer.create();
        try {
            return ByteStreams.copy((InputStream) closerCreate.register(openStream()), (OutputStream) closerCreate.register(byteSink.openStream()));
        } finally {
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T read(ByteProcessor<T> byteProcessor) throws Throwable {
        Preconditions.checkNotNull(byteProcessor);
        try {
            return (T) ByteStreams.readBytes((InputStream) Closer.create().register(openStream()), byteProcessor);
        } finally {
        }
    }
}
