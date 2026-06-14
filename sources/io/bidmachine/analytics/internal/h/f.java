package io.bidmachine.analytics.internal.h;

import io.bidmachine.analytics.internal.q.g;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f79589a = i.a(b.f79593a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f79590b = i.a(c.f79594a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f79591c = i.a(a.f79592a);

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79592a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.o.b invoke() {
            return new io.bidmachine.analytics.internal.o.b();
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f79593a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.p.e invoke() {
            return new io.bidmachine.analytics.internal.p.e(0, 1, null);
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79594a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g();
        }
    }

    public final io.bidmachine.analytics.internal.o.b a() {
        return (io.bidmachine.analytics.internal.o.b) this.f79591c.getValue();
    }

    public final io.bidmachine.analytics.internal.p.e b() {
        return (io.bidmachine.analytics.internal.p.e) this.f79589a.getValue();
    }

    public final g c() {
        return (g) this.f79590b.getValue();
    }
}
