package uf;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class o implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f105645a;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f105646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f105647c;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f105646b;
            this.f105646b = null;
            Intrinsics.checkNotNull(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f105646b == null && !this.f105647c) {
                String line = o.this.f105645a.readLine();
                this.f105646b = line;
                if (line == null) {
                    this.f105647c = true;
                }
            }
            return this.f105646b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f105645a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
