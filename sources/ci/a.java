package ci;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.e;

/* JADX INFO: loaded from: classes4.dex */
public class a implements org.tensorflow.lite.b, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0154a f6850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f6851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6852d;

    /* JADX INFO: renamed from: ci.a$a, reason: collision with other inner class name */
    public static final class C0154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6853a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6854b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6855c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6856d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f6857e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f6858f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f6859g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f6860h = 0;

        public String a() {
            return this.f6854b;
        }

        public boolean b() {
            Boolean bool = this.f6859g;
            return bool != null && bool.booleanValue();
        }

        public String c() {
            return this.f6855c;
        }

        public int d() {
            return this.f6853a;
        }

        public int e() {
            Integer num = this.f6857e;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public String f() {
            return this.f6856d;
        }

        public long g() {
            return this.f6860h;
        }

        public Boolean h() {
            return this.f6858f;
        }
    }

    public interface b extends org.tensorflow.lite.b, AutoCloseable {
        @Override // org.tensorflow.lite.b, java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    public a(C0154a c0154a) {
        TensorFlowLite.a();
        this.f6850b = c0154a;
    }

    private void m() {
        if (this.f6851c == null) {
            throw new IllegalStateException(this.f6852d ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }

    @Override // org.tensorflow.lite.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f6851c;
        if (bVar != null) {
            bVar.close();
            this.f6851c = null;
        }
    }

    @Override // org.tensorflow.lite.b
    public long getNativeHandle() {
        m();
        return this.f6851c.getNativeHandle();
    }

    public void n(e eVar) {
        this.f6851c = eVar.createNnApiDelegateImpl(this.f6850b);
        this.f6852d = true;
    }

    public a() {
        this(new C0154a());
    }
}
