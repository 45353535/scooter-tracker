package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class f implements Iterator, yf.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f93521g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f93522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f93525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93526f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f93522b = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f93523c = 0;
        int i10 = this.f93525e;
        int i11 = this.f93524d;
        this.f93524d = this.f93526f + i10;
        return this.f93522b.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f93523c;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f93526f < 0) {
            this.f93523c = 2;
            return false;
        }
        int length = this.f93522b.length();
        int length2 = this.f93522b.length();
        for (int i13 = this.f93524d; i13 < length2; i13++) {
            char cCharAt = this.f93522b.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f93522b.length() && this.f93522b.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f93523c = 1;
                this.f93526f = i10;
                this.f93525e = length;
                return true;
            }
        }
        i10 = -1;
        this.f93523c = 1;
        this.f93526f = i10;
        this.f93525e = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
