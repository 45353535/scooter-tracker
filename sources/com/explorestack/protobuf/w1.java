package com.explorestack.protobuf;

import androidx.collection.SieveCacheKt;
import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
final class w1 extends ByteString {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f19416g = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteString f19418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteString f19419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19421f;

    class a extends ByteString.AbstractByteIterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f19422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteString.ByteIterator f19423c = a();

        a() {
            this.f19422b = new c(w1.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.explorestack.protobuf.ByteString$ByteIterator] */
        private ByteString.ByteIterator a() {
            if (this.f19422b.hasNext()) {
                return this.f19422b.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19423c != null;
        }

        @Override // com.explorestack.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f19423c;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f19423c.hasNext()) {
                this.f19423c = a();
            }
            return bNextByte;
        }
    }

    private static final class c implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayDeque f19426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteString.LeafByteString f19427c;

        /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.LeafByteString a(ByteString byteString) {
            while (byteString instanceof w1) {
                w1 w1Var = (w1) byteString;
                this.f19426b.push(w1Var);
                byteString = w1Var.f19418c;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString b() {
            ByteString.LeafByteString leafByteStringA;
            do {
                ArrayDeque arrayDeque = this.f19426b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringA = a(((w1) this.f19426b.pop()).f19419d);
            } while (leafByteStringA.isEmpty());
            return leafByteStringA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f19427c;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f19427c = b();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19427c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(ByteString byteString) {
            if (!(byteString instanceof w1)) {
                this.f19426b = null;
                this.f19427c = (ByteString.LeafByteString) byteString;
                return;
            }
            w1 w1Var = (w1) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(w1Var.getTreeDepth());
            this.f19426b = arrayDeque;
            arrayDeque.push(w1Var);
            this.f19427c = a(w1Var.f19418c);
        }
    }

    /* synthetic */ w1(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    static ByteString g(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return i(byteString, byteString2);
        }
        if (byteString instanceof w1) {
            w1 w1Var = (w1) byteString;
            if (w1Var.f19419d.size() + byteString2.size() < 128) {
                return new w1(w1Var.f19418c, i(w1Var.f19419d, byteString2));
            }
            if (w1Var.f19418c.getTreeDepth() > w1Var.f19419d.getTreeDepth() && w1Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new w1(w1Var.f19418c, new w1(w1Var.f19419d, byteString2));
            }
        }
        return size >= k(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new w1(byteString, byteString2) : new b(null).b(byteString, byteString2);
    }

    private static ByteString i(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean j(ByteString byteString) {
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = leafByteString.size() - i10;
            int size2 = leafByteString2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? leafByteString.equalsRange(leafByteString2, i11, iMin) : leafByteString2.equalsRange(leafByteString, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f19417b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i10 = 0;
                leafByteString = (ByteString.LeafByteString) cVar.next();
            } else {
                i10 += iMin;
                leafByteString = leafByteString;
            }
            if (iMin == size2) {
                leafByteString2 = (ByteString.LeafByteString) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    static int k(int i10) {
        int[] iArr = f19416g;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f19417b);
        return internalByteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f19418c.copyTo(byteBuffer);
        this.f19419d.copyTo(byteBuffer);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f19420e;
        if (i13 <= i14) {
            this.f19418c.copyToInternal(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f19419d.copyToInternal(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f19418c.copyToInternal(bArr, i10, i11, i15);
            this.f19419d.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f19417b != byteString.size()) {
            return false;
        }
        if (this.f19417b == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return j(byteString);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int getTreeDepth() {
        return this.f19421f;
    }

    @Override // com.explorestack.protobuf.ByteString
    byte internalByteAt(int i10) {
        int i11 = this.f19420e;
        return i10 < i11 ? this.f19418c.internalByteAt(i10) : this.f19419d.internalByteAt(i10 - i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected boolean isBalanced() {
        return this.f19417b >= k(this.f19421f);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f19418c.partialIsValidUtf8(0, 0, this.f19420e);
        ByteString byteString = this.f19419d;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.explorestack.protobuf.ByteString
    public l newCodedInput() {
        return l.i(asReadOnlyByteBufferList(), true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f19420e;
        if (i13 <= i14) {
            return this.f19418c.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f19419d.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f19419d.partialHash(this.f19418c.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f19420e;
        if (i13 <= i14) {
            return this.f19418c.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f19419d.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f19419d.partialIsValidUtf8(this.f19418c.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f19417b;
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        int iCheckRange = ByteString.checkRange(i10, i11, this.f19417b);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.f19417b) {
            return this;
        }
        int i12 = this.f19420e;
        return i11 <= i12 ? this.f19418c.substring(i10, i11) : i10 >= i12 ? this.f19419d.substring(i10 - i12, i11 - i12) : new w1(this.f19418c.substring(i10), this.f19419d.substring(0, i11 - this.f19420e));
    }

    @Override // com.explorestack.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f19418c.writeTo(outputStream);
        this.f19419d.writeTo(outputStream);
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f19420e;
        if (i12 <= i13) {
            this.f19418c.writeToInternal(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f19419d.writeToInternal(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f19418c.writeToInternal(outputStream, i10, i14);
            this.f19419d.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToReverse(j jVar) throws IOException {
        this.f19419d.writeToReverse(jVar);
        this.f19418c.writeToReverse(jVar);
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f19425a;

        private b() {
            this.f19425a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString w1Var = (ByteString) this.f19425a.pop();
            while (!this.f19425a.isEmpty()) {
                w1Var = new w1((ByteString) this.f19425a.pop(), w1Var, null);
            }
            return w1Var;
        }

        private void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof w1) {
                w1 w1Var = (w1) byteString;
                c(w1Var.f19418c);
                c(w1Var.f19419d);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(w1.f19416g, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iK = w1.k(iD + 1);
            if (this.f19425a.isEmpty() || ((ByteString) this.f19425a.peek()).size() >= iK) {
                this.f19425a.push(byteString);
                return;
            }
            int iK2 = w1.k(iD);
            ByteString w1Var = (ByteString) this.f19425a.pop();
            while (true) {
                aVar = null;
                if (this.f19425a.isEmpty() || ((ByteString) this.f19425a.peek()).size() >= iK2) {
                    break;
                } else {
                    w1Var = new w1((ByteString) this.f19425a.pop(), w1Var, aVar);
                }
            }
            w1 w1Var2 = new w1(w1Var, byteString, aVar);
            while (!this.f19425a.isEmpty()) {
                if (((ByteString) this.f19425a.peek()).size() >= w1.k(d(w1Var2.size()) + 1)) {
                    break;
                } else {
                    w1Var2 = new w1((ByteString) this.f19425a.pop(), w1Var2, aVar);
                }
            }
            this.f19425a.push(w1Var2);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private w1(ByteString byteString, ByteString byteString2) {
        this.f19418c = byteString;
        this.f19419d = byteString2;
        int size = byteString.size();
        this.f19420e = size;
        this.f19417b = size + byteString2.size();
        this.f19421f = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeTo(j jVar) throws IOException {
        this.f19418c.writeTo(jVar);
        this.f19419d.writeTo(jVar);
    }

    private class d extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f19428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteString.LeafByteString f19429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19433g;

        public d() {
            o();
        }

        private void m() {
            if (this.f19429c != null) {
                int i10 = this.f19431e;
                int i11 = this.f19430d;
                if (i10 == i11) {
                    this.f19432f += i11;
                    this.f19431e = 0;
                    if (!this.f19428b.hasNext()) {
                        this.f19429c = null;
                        this.f19430d = 0;
                    } else {
                        ByteString.LeafByteString next = this.f19428b.next();
                        this.f19429c = next;
                        this.f19430d = next.size();
                    }
                }
            }
        }

        private int n() {
            return w1.this.size() - (this.f19432f + this.f19431e);
        }

        private void o() {
            c cVar = new c(w1.this, null);
            this.f19428b = cVar;
            ByteString.LeafByteString next = cVar.next();
            this.f19429c = next;
            this.f19430d = next.size();
            this.f19431e = 0;
            this.f19432f = 0;
        }

        private int p(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                m();
                if (this.f19429c == null) {
                    break;
                }
                int iMin = Math.min(this.f19430d - this.f19431e, i12);
                if (bArr != null) {
                    this.f19429c.copyTo(bArr, this.f19431e, i10, iMin);
                    i10 += iMin;
                }
                this.f19431e += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() {
            return n();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f19433g = this.f19432f + this.f19431e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            int iP = p(bArr, i10, i11);
            if (iP != 0) {
                return iP;
            }
            if (i11 > 0 || n() == 0) {
                return -1;
            }
            return iP;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            o();
            p(null, 0, this.f19433g);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > SieveCacheKt.NodeLinkMask) {
                j10 = 2147483647L;
            }
            return p(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() {
            m();
            ByteString.LeafByteString leafByteString = this.f19429c;
            if (leafByteString == null) {
                return -1;
            }
            int i10 = this.f19431e;
            this.f19431e = i10 + 1;
            return leafByteString.byteAt(i10) & 255;
        }
    }
}
