package xe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jf.e f108194a;

    public static final class a extends jf.d {
        a() {
        }

        @Override // jf.e
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public char[] h0() {
            return new char[2048];
        }
    }

    public static final class b extends jf.c {
        b() {
            super(4096);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jf.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public char[] n() {
            return new char[2048];
        }
    }

    static {
        f108194a = e.a() ? new a() : new b();
    }

    public static final jf.e a() {
        return f108194a;
    }
}
