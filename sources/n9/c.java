package n9;

import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f95224g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f95225h = o0.C0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f95226i = o0.C0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f95227j = o0.C0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f95228k = o0.C0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f95229l = o0.C0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f95235f;

    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: n9.c$c, reason: collision with other inner class name */
    private static final class C1094c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f95236a;

        private d(c cVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(cVar.f95230a).setFlags(cVar.f95231b).setUsage(cVar.f95232c);
            int i10 = o0.f98837a;
            if (i10 >= 29) {
                b.a(usage, cVar.f95233d);
            }
            if (i10 >= 32) {
                C1094c.a(usage, cVar.f95234e);
            }
            this.f95236a = usage.build();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95237a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f95238b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f95239c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f95240d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f95241e = 0;

        public c a() {
            return new c(this.f95237a, this.f95238b, this.f95239c, this.f95240d, this.f95241e);
        }
    }

    public d a() {
        if (this.f95235f == null) {
            this.f95235f = new d();
        }
        return this.f95235f;
    }

    public int b() {
        if ((this.f95231b & 1) == 1) {
            return 1;
        }
        switch (this.f95232c) {
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f95230a == cVar.f95230a && this.f95231b == cVar.f95231b && this.f95232c == cVar.f95232c && this.f95233d == cVar.f95233d && this.f95234e == cVar.f95234e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f95230a) * 31) + this.f95231b) * 31) + this.f95232c) * 31) + this.f95233d) * 31) + this.f95234e;
    }

    private c(int i10, int i11, int i12, int i13, int i14) {
        this.f95230a = i10;
        this.f95231b = i11;
        this.f95232c = i12;
        this.f95233d = i13;
        this.f95234e = i14;
    }
}
