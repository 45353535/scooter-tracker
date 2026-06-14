package tg;

import kotlin.jvm.internal.Intrinsics;
import pg.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tg.b f105173a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tg.c f105174b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final tg.a f105175c = new a();

    public static final class a implements tg.a {
        a() {
        }

        @Override // tg.b
        public byte a(m segment, int i10) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return e.f105173a.a(segment, i10);
        }
    }

    public static final class b implements tg.b {
        b() {
        }

        @Override // tg.b
        public byte a(m segment, int i10) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.k(i10);
        }
    }

    public static final class c implements tg.c {
        c() {
        }
    }
}
