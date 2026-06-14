package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: loaded from: classes3.dex */
class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    private class BoundedByteIterator implements ByteString.ByteIterator {
        private final int limit;
        private int position;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i10 = this.position;
            if (i10 >= this.limit) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.bytes;
            this.position = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private BoundedByteIterator() {
            int offsetIntoBytes = BoundedByteString.this.getOffsetIntoBytes();
            this.position = offsetIntoBytes;
            this.limit = offsetIntoBytes + BoundedByteString.this.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    BoundedByteString(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.bytesOffset = i10;
            this.bytesLength = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public byte byteAt(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < size()) {
            return this.bytes[this.bytesOffset + i10];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    protected int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new BoundedByteIterator();
    }
}
