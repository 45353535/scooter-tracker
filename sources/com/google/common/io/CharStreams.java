package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class CharStreams {

    private static final class NullWriter extends Writer implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final NullWriter f30913b = new NullWriter();

        private NullWriter() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c10) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i10) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            Preconditions.checkNotNull(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11 + i10, cArr.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11 + i10, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, charSequence == null ? 4 : charSequence.length());
            return this;
        }
    }

    static long a(Reader reader, StringBuilder sb2) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(sb2);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            sb2.append(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static Writer asWriter(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    static long b(Reader reader, Writer writer) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    static CharBuffer c() {
        return CharBuffer.allocate(2048);
    }

    @CanIgnoreReturnValue
    public static long copy(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? a((Reader) readable, (StringBuilder) appendable) : b((Reader) readable, asWriter(appendable));
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charBufferC = c();
        long jRemaining = 0;
        while (readable.read(charBufferC) != -1) {
            Java8Compatibility.b(charBufferC);
            appendable.append(charBufferC);
            jRemaining += (long) charBufferC.remaining();
            Java8Compatibility.a(charBufferC);
        }
        return jRemaining;
    }

    private static StringBuilder d(Readable readable) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (readable instanceof Reader) {
            a((Reader) readable, sb2);
            return sb2;
        }
        copy(readable, sb2);
        return sb2;
    }

    @CanIgnoreReturnValue
    public static long exhaust(Readable readable) throws IOException {
        CharBuffer charBufferC = c();
        long j10 = 0;
        while (true) {
            long j11 = readable.read(charBufferC);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            Java8Compatibility.a(charBufferC);
        }
    }

    public static Writer nullWriter() {
        return NullWriter.f30913b;
    }

    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(readable);
        while (true) {
            String line = lineReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static void skipFully(Reader reader, long j10) throws IOException {
        Preconditions.checkNotNull(reader);
        while (j10 > 0) {
            long jSkip = reader.skip(j10);
            if (jSkip == 0) {
                throw new EOFException();
            }
            j10 -= jSkip;
        }
    }

    public static String toString(Readable readable) throws IOException {
        return d(readable).toString();
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> lineProcessor) throws IOException {
        String line;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineProcessor);
        LineReader lineReader = new LineReader(readable);
        do {
            line = lineReader.readLine();
            if (line == null) {
                break;
            }
        } while (lineProcessor.processLine(line));
        return lineProcessor.getResult();
    }
}
