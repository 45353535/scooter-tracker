package com.google.common.io;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class CharSource {

    private final class AsByteSource extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f30905a;

        AsByteSource(Charset charset) {
            this.f30905a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
            return charset.equals(this.f30905a) ? CharSource.this : super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return new ReaderInputStream(CharSource.this.openStream(), this.f30905a, 8192);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.f30905a + ")";
        }
    }

    private static class CharSequenceCharSource extends CharSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Splitter f30907b = Splitter.onPattern("\r\n|\n|\r");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final CharSequence f30908a;

        protected CharSequenceCharSource(CharSequence charSequence) {
            this.f30908a = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        private Iterator c() {
            return new AbstractIterator<String>() { // from class: com.google.common.io.CharSource.CharSequenceCharSource.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Iterator f30909d;

                {
                    this.f30909d = CharSequenceCharSource.f30907b.split(CharSequenceCharSource.this.f30908a).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public String computeNext() {
                    if (this.f30909d.hasNext()) {
                        String str = (String) this.f30909d.next();
                        if (this.f30909d.hasNext() || !str.isEmpty()) {
                            return str;
                        }
                    }
                    return (String) a();
                }
            };
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
            return this.f30908a.length() == 0;
        }

        @Override // com.google.common.io.CharSource
        public long length() {
            return this.f30908a.length();
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.of(Long.valueOf(this.f30908a.length()));
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() {
            return new CharSequenceReader(this.f30908a);
        }

        @Override // com.google.common.io.CharSource
        public String read() {
            return this.f30908a.toString();
        }

        @Override // com.google.common.io.CharSource
        public String readFirstLine() {
            Iterator itC = c();
            if (itC.hasNext()) {
                return (String) itC.next();
            }
            return null;
        }

        @Override // com.google.common.io.CharSource
        public ImmutableList<String> readLines() {
            return ImmutableList.copyOf(c());
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.f30908a, 30, APSSharedUtil.TRUNCATE_SEPARATOR) + ")";
        }

        @Override // com.google.common.io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
            Iterator itC = c();
            while (itC.hasNext() && lineProcessor.processLine((String) itC.next())) {
            }
            return lineProcessor.getResult();
        }
    }

    private static final class ConcatenatedCharSource extends CharSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterable f30911a;

        ConcatenatedCharSource(Iterable iterable) {
            this.f30911a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws IOException {
            Iterator it = this.f30911a.iterator();
            while (it.hasNext()) {
                if (!((CharSource) it.next()).isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public long length() throws IOException {
            Iterator it = this.f30911a.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((CharSource) it.next()).length();
            }
            return length;
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            Iterator it = this.f30911a.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalLengthIfKnown = ((CharSource) it.next()).lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return Optional.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
            return new MultiReader(this.f30911a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f30911a + ")";
        }
    }

    private static final class EmptyCharSource extends StringCharSource {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final EmptyCharSource f30912c = new EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
            return "CharSource.empty()";
        }
    }

    protected CharSource() {
    }

    private long a(Reader reader) throws IOException {
        long j10 = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j10;
            }
            j10 += jSkip;
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new ConcatenatedCharSource(iterable);
    }

    public static CharSource empty() {
        return EmptyCharSource.f30912c;
    }

    public static CharSource wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new StringCharSource((String) charSequence) : new CharSequenceCharSource(charSequence);
    }

    public ByteSource asByteSource(Charset charset) {
        return new AsByteSource(charset);
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws Throwable {
        Preconditions.checkNotNull(appendable);
        try {
            return CharStreams.copy((Reader) Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        try {
            return ((Reader) Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public long length() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        try {
            return a((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws Throwable {
        try {
            return CharStreams.toString((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public String readFirstLine() throws Throwable {
        try {
            return ((BufferedReader) Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public ImmutableList<String> readLines() throws Throwable {
        try {
            BufferedReader bufferedReader = (BufferedReader) Closer.create().register(openBufferedStream());
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return ImmutableList.copyOf((Collection) arrayListNewArrayList);
                }
                arrayListNewArrayList.add(line);
            }
        } finally {
        }
    }

    private static class StringCharSource extends CharSequenceCharSource {
        protected StringCharSource(String str) {
            super(str);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.f30908a);
            return this.f30908a.length();
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.f30908a);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(CharSink charSink) throws Throwable {
            Preconditions.checkNotNull(charSink);
            try {
                ((Writer) Closer.create().register(charSink.openStream())).write((String) this.f30908a);
                return this.f30908a.length();
            } finally {
            }
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws Throwable {
        Preconditions.checkNotNull(charSink);
        Closer closerCreate = Closer.create();
        try {
            return CharStreams.copy((Reader) closerCreate.register(openStream()), (Writer) closerCreate.register(charSink.openStream()));
        } finally {
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T readLines(LineProcessor<T> lineProcessor) throws Throwable {
        Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) CharStreams.readLines((Reader) Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }
}
