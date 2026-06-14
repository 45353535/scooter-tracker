package io.sentry.cache.tape;

import io.sentry.cache.tape.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f83343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f83344c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c.a f83345d;

    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] m() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    private final class C1008b implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator f83346b;

        C1008b(Iterator it) {
            this.f83346b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83346b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                return b.this.f83345d.b((byte[]) this.f83346b.next());
            } catch (IOException e10) {
                throw ((Error) d.q(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f83346b.remove();
        }
    }

    b(d dVar, c.a aVar) {
        this.f83343b = dVar;
        this.f83345d = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f83343b.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f83343b.close();
    }

    @Override // io.sentry.cache.tape.c
    public void e(Object obj) throws IOException {
        this.f83344c.reset();
        this.f83345d.a(obj, this.f83344c);
        this.f83343b.o(this.f83344c.m(), 0, this.f83344c.size());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1008b(this.f83343b.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public void q(int i10) throws IOException {
        this.f83343b.b0(i10);
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f83343b.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f83343b + '}';
    }
}
