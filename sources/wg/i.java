package wg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f108000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f108001c;

        a(SerialDescriptor serialDescriptor) {
            this.f108001c = serialDescriptor;
            this.f108000b = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f108001c;
            int iE = serialDescriptor.e();
            int i10 = this.f108000b;
            this.f108000b = i10 - 1;
            return serialDescriptor.d(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f108000b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f108002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f108003c;

        b(SerialDescriptor serialDescriptor) {
            this.f108003c = serialDescriptor;
            this.f108002b = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.f108003c;
            int iE = serialDescriptor.e();
            int i10 = this.f108002b;
            this.f108002b = i10 - 1;
            return serialDescriptor.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f108002b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f108004b;

        public c(SerialDescriptor serialDescriptor) {
            this.f108004b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f108004b);
        }
    }

    public static final class d implements Iterable, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f108005b;

        public d(SerialDescriptor serialDescriptor) {
            this.f108005b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f108005b);
        }
    }

    public static final Iterable a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    public static final Iterable b(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
