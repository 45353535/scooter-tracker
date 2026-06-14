package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class Funnels {

    private enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, PrimitiveSink primitiveSink) {
            primitiveSink.putBytes(bArr);
        }
    }

    private enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, PrimitiveSink primitiveSink) {
            primitiveSink.putInt(num.intValue());
        }
    }

    private enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l10, PrimitiveSink primitiveSink) {
            primitiveSink.putLong(l10.longValue());
        }
    }

    private static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Funnel f30752b;

        SequentialFunnel(Funnel funnel) {
            this.f30752b = (Funnel) Preconditions.checkNotNull(funnel);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.f30752b.equals(((SequentialFunnel) obj).f30752b);
            }
            return false;
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.f30752b.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f30752b + ")";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Iterable<? extends E> iterable, PrimitiveSink primitiveSink) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.f30752b.funnel(it.next(), primitiveSink);
            }
        }
    }

    private static class SinkAsStream extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PrimitiveSink f30753b;

        SinkAsStream(PrimitiveSink primitiveSink) {
            this.f30753b = (PrimitiveSink) Preconditions.checkNotNull(primitiveSink);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f30753b + ")";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f30753b.putByte((byte) i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f30753b.putBytes(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f30753b.putBytes(bArr, i10, i11);
        }
    }

    private static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f30754b;

        private static class SerializedForm implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30755b;

            SerializedForm(Charset charset) {
                this.f30755b = charset.name();
            }

            private Object readResolve() {
                return Funnels.stringFunnel(Charset.forName(this.f30755b));
            }
        }

        StringCharsetFunnel(Charset charset) {
            this.f30754b = (Charset) Preconditions.checkNotNull(charset);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.f30754b.equals(((StringCharsetFunnel) obj).f30754b);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.f30754b.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f30754b.name() + ")";
        }

        Object writeReplace() {
            return new SerializedForm(this.f30754b);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.putString(charSequence, this.f30754b);
        }
    }

    private enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.putUnencodedChars(charSequence);
        }
    }

    public static OutputStream asOutputStream(PrimitiveSink primitiveSink) {
        return new SinkAsStream(primitiveSink);
    }

    public static Funnel<byte[]> byteArrayFunnel() {
        return ByteArrayFunnel.INSTANCE;
    }

    public static Funnel<Integer> integerFunnel() {
        return IntegerFunnel.INSTANCE;
    }

    public static Funnel<Long> longFunnel() {
        return LongFunnel.INSTANCE;
    }

    public static <E> Funnel<Iterable<? extends E>> sequentialFunnel(Funnel<E> funnel) {
        return new SequentialFunnel(funnel);
    }

    public static Funnel<CharSequence> stringFunnel(Charset charset) {
        return new StringCharsetFunnel(charset);
    }

    public static Funnel<CharSequence> unencodedCharsFunnel() {
        return UnencodedCharsFunnel.INSTANCE;
    }
}
