package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements MessageLite {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.explorestack.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0320a implements MessageLite.Builder {
        private static void a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private String b(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static p2 newUninitializedMessageException(MessageLite messageLite) {
            return new p2(messageLite);
        }

        protected abstract AbstractC0320a internalMergeFrom(a aVar);

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0321a(inputStream, l.D(i10, inputStream)), wVar);
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public abstract AbstractC0320a mergeFrom(l lVar);

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public abstract AbstractC0320a mergeFrom(l lVar, w wVar);

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            j0.a(iterable);
            if (!(iterable instanceof p0)) {
                if (iterable instanceof q1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    a(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((p0) iterable).getUnderlyingElements();
            p0 p0Var = (p0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (p0Var.size() - size) + " is null.";
                    for (int size2 = p0Var.size() - 1; size2 >= size; size2--) {
                        p0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    p0Var.c((ByteString) obj);
                } else {
                    p0Var.add((String) obj);
                }
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                l lVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(lVarNewCodedInput);
                lVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("ByteString"), e11);
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0321a extends FilterInputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18777b;

            C0321a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f18777b = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f18777b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f18777b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f18777b--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f18777b));
                if (jSkip >= 0) {
                    this.f18777b = (int) (((long) this.f18777b) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f18777b;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f18777b -= i13;
                }
                return i13;
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, w.b());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            try {
                l lVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(lVarNewCodedInput, wVar);
                lVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("ByteString"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                l lVarM = l.m(bArr, i10, i11);
                mergeFrom(lVarM);
                lVarM.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("byte array"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(byte[] bArr, w wVar) {
            return mergeFrom(bArr, 0, bArr.length, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException {
            try {
                l lVarM = l.m(bArr, i10, i11);
                mergeFrom(lVarM, wVar);
                lVarM.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("byte array"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(InputStream inputStream) {
            l lVarG = l.g(inputStream);
            mergeFrom(lVarG);
            lVarG.a(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AbstractC0320a mergeFrom(InputStream inputStream, w wVar) {
            l lVarG = l.g(inputStream);
            mergeFrom(lVarG, wVar);
            lVarG.a(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder
        public AbstractC0320a mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return internalMergeFrom((a) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0320a.addAll((Iterable) iterable, (List) collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    abstract int getMemoizedSerializedSize();

    int getSerializedSize(x1 x1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = x1Var.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    abstract p2 newUninitializedMessageException();

    abstract void setMemoizedSerializedSize(int i10);

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            n nVarJ0 = n.j0(bArr);
            writeTo(nVarJ0);
            nVarJ0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException(a("ByteString"), e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        n nVarI0 = n.i0(outputStream, n.K(n.M(serializedSize) + serializedSize));
        nVarI0.N0(serializedSize);
        writeTo(nVarI0);
        nVarI0.e0();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        n nVarI0 = n.i0(outputStream, n.K(getSerializedSize()));
        writeTo(nVarI0);
        nVarI0.e0();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0320a.addAll((Iterable) iterable, (List) list);
    }
}
