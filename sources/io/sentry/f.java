package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Object[] f83451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f83452c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f83453d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient boolean f83454e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83455f;

    class a implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f83456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f83457c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f83458d;

        a() {
            this.f83456b = f.this.f83452c;
            this.f83458d = f.this.f83454e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83458d || this.f83456b != f.this.f83453d;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f83458d = false;
            int i10 = this.f83456b;
            this.f83457c = i10;
            this.f83456b = f.this.q(i10);
            return f.this.f83451b[this.f83457c];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f83457c;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == f.this.f83452c) {
                f.this.remove();
                this.f83457c = -1;
                return;
            }
            int iQ = this.f83457c + 1;
            if (f.this.f83452c >= this.f83457c || iQ >= f.this.f83453d) {
                while (iQ != f.this.f83453d) {
                    if (iQ >= f.this.f83455f) {
                        f.this.f83451b[iQ - 1] = f.this.f83451b[0];
                        iQ = 0;
                    } else {
                        f.this.f83451b[f.this.o(iQ)] = f.this.f83451b[iQ];
                        iQ = f.this.q(iQ);
                    }
                }
            } else {
                System.arraycopy(f.this.f83451b, iQ, f.this.f83451b, this.f83457c, f.this.f83453d - iQ);
            }
            this.f83457c = -1;
            f fVar = f.this;
            fVar.f83453d = fVar.o(fVar.f83453d);
            f.this.f83451b[f.this.f83453d] = null;
            f.this.f83454e = false;
            this.f83456b = f.this.o(this.f83456b);
        }
    }

    f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f83451b = objArr;
        this.f83455f = objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f83455f - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f83455f) {
            return 0;
        }
        return i11;
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f83451b = new Object[this.f83455f];
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f83451b[i11] = objectInputStream.readObject();
        }
        this.f83452c = 0;
        boolean z10 = i10 == this.f83455f;
        this.f83454e = z10;
        if (z10) {
            this.f83453d = 0;
        } else {
            this.f83453d = i10;
        }
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (r()) {
            remove();
        }
        Object[] objArr = this.f83451b;
        int i10 = this.f83453d;
        int i11 = i10 + 1;
        this.f83453d = i11;
        objArr[i10] = obj;
        if (i11 >= this.f83455f) {
            this.f83453d = 0;
        }
        if (this.f83453d == this.f83452c) {
            this.f83454e = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f83454e = false;
        this.f83452c = 0;
        this.f83453d = 0;
        Arrays.fill(this.f83451b, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f83451b[this.f83452c];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public boolean r() {
        return size() == this.f83455f;
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f83451b;
        int i10 = this.f83452c;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f83452c = i11;
            objArr[i10] = null;
            if (i11 >= this.f83455f) {
                this.f83452c = 0;
            }
            this.f83454e = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f83453d;
        int i11 = this.f83452c;
        if (i10 < i11) {
            return (this.f83455f - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f83454e) {
            return this.f83455f;
        }
        return 0;
    }
}
