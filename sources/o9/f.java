package o9;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f96391a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f96392e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96396d;

        public a(io.bidmachine.media3.common.a aVar) {
            this(aVar.F, aVar.E, aVar.G);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f96393a == aVar.f96393a && this.f96394b == aVar.f96394b && this.f96395c == aVar.f96395c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f96393a), Integer.valueOf(this.f96394b), Integer.valueOf(this.f96395c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f96393a + ", channelCount=" + this.f96394b + ", encoding=" + this.f96395c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f96393a = i10;
            this.f96394b = i11;
            this.f96395c = i12;
            this.f96396d = o0.G0(i12) ? o0.k0(i12, i11) : -1;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f96397b;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.f96397b = aVar;
        }
    }

    a a(a aVar);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
