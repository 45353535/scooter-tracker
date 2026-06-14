package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f82089b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f82090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f82091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f82092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f82093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f82094g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f82095a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d0.f82090c;
        }

        public final int b() {
            return d0.f82092e;
        }

        public final int c() {
            return d0.f82091d;
        }

        private a() {
        }
    }

    static {
        int iE = e(1);
        f82090c = iE;
        int iE2 = e(2);
        f82091d = iE2;
        int iE3 = e(4);
        f82092e = iE3;
        f82093f = e(7);
        f82094g = CollectionsKt.listOf((Object[]) new d0[]{d(iE), d(iE2), d(iE3)});
    }

    private /* synthetic */ d0(int i10) {
        this.f82095a = i10;
    }

    public static final /* synthetic */ d0 d(int i10) {
        return new d0(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return (i11 | i10) == i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof d0) && i10 == ((d0) obj).l();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    public static final int j(int i10, int i11) {
        return e(i10 | i11);
    }

    public static String k(int i10) {
        if (h(i10, f82090c)) {
            return "CR";
        }
        if (h(i10, f82091d)) {
            return "LF";
        }
        if (h(i10, f82092e)) {
            return "CRLF";
        }
        List list = f82094g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (f(i10, ((d0) obj).l())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public boolean equals(Object obj) {
        return g(this.f82095a, obj);
    }

    public int hashCode() {
        return i(this.f82095a);
    }

    public final /* synthetic */ int l() {
        return this.f82095a;
    }

    public String toString() {
        return k(this.f82095a);
    }
}
