package r9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99232a;

    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f99233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f99234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f99235d;

        public b(int i10, long j10) {
            super(i10);
            this.f99233b = j10;
            this.f99234c = new ArrayList();
            this.f99235d = new ArrayList();
        }

        public void b(b bVar) {
            this.f99235d.add(bVar);
        }

        public void c(C1181c c1181c) {
            this.f99234c.add(c1181c);
        }

        public b d(int i10) {
            int size = this.f99235d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f99235d.get(i11);
                if (bVar.f99232a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C1181c e(int i10) {
            int size = this.f99234c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1181c c1181c = (C1181c) this.f99234c.get(i11);
                if (c1181c.f99232a == i10) {
                    return c1181c;
                }
            }
            return null;
        }

        @Override // r9.c
        public String toString() {
            return c.a(this.f99232a) + " leaves: " + Arrays.toString(this.f99234c.toArray()) + " containers: " + Arrays.toString(this.f99235d.toArray());
        }
    }

    /* JADX INFO: renamed from: r9.c$c, reason: collision with other inner class name */
    public static final class C1181c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f99236b;

        public C1181c(int i10, d0 d0Var) {
            super(i10);
            this.f99236b = d0Var;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f99232a);
    }

    private c(int i10) {
        this.f99232a = i10;
    }
}
