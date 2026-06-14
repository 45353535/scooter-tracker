package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f84459a = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f84460a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f84460a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84460a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        Object a();
    }

    private interface c {
        Object getValue();
    }

    private static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f84463a;

        f(String str) {
            this.f84463a = str;
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f84463a;
        }
    }

    private static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f84464a;

        g(Object obj) {
            this.f84464a = obj;
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f84464a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private c f() {
        if (this.f84459a.isEmpty()) {
            return null;
        }
        return (c) this.f84459a.get(r0.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f84461a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f84462a.put(fVar.f84463a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f84462a.put(fVar.f84463a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f84461a.add(objA);
        return false;
    }

    private boolean i() {
        return this.f84459a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object j(z1 z1Var) {
        try {
            try {
                return Integer.valueOf(z1Var.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(z1Var.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(z1Var.nextDouble());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(final z1 z1Var) {
        boolean zG;
        a aVar = null;
        switch (a.f84460a[z1Var.peek().ordinal()]) {
            case 1:
                z1Var.beginArray();
                m(new d(aVar));
                zG = false;
                break;
            case 2:
                z1Var.endArray();
                zG = g();
                break;
            case 3:
                z1Var.beginObject();
                m(new e(aVar));
                zG = false;
                break;
            case 4:
                z1Var.endObject();
                zG = g();
                break;
            case 5:
                m(new f(z1Var.nextName()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.u1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return z1Var.nextString();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.v1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return this.f84331a.j(z1Var);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.w1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return Boolean.valueOf(z1Var.m());
                    }
                });
                break;
            case 9:
                z1Var.n();
                zG = h(new b() { // from class: io.sentry.x1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return y1.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(z1Var);
    }

    private void l() {
        if (this.f84459a.isEmpty()) {
            return;
        }
        this.f84459a.remove(r0.size() - 1);
    }

    private void m(c cVar) {
        this.f84459a.add(cVar);
    }

    public Object e(z1 z1Var) {
        k(z1Var);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f84461a;

        private d() {
            this.f84461a = new ArrayList();
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f84461a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap f84462a;

        private e() {
            this.f84462a = new HashMap();
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f84462a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
