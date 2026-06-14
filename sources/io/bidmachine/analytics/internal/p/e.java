package io.bidmachine.analytics.internal.p;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f79718d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f79719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f79720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f79721c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(int i10) {
        this.f79719a = i10;
        this.f79720b = new LinkedHashMap();
        this.f79721c = new Object();
    }

    public final InputStream a(String str) {
        Object objB;
        synchronized (this.f79721c) {
            try {
                Result.Companion companion = Result.f93230c;
                g gVar = (g) this.f79720b.remove(str);
                objB = Result.b(new ByteArrayInputStream(gVar != null ? h.a(gVar) : null));
            } finally {
            }
        }
        return (InputStream) (Result.i(objB) ? null : objB);
    }

    public final String b(String str) {
        Object objB;
        Long lA;
        synchronized (this.f79721c) {
            try {
                Result.Companion companion = Result.f93230c;
                g gVar = (g) this.f79720b.get(str);
                objB = Result.b((gVar == null || (lA = gVar.a()) == null) ? null : lA.toString());
            } finally {
            }
        }
        return (String) (Result.i(objB) ? null : objB);
    }

    public /* synthetic */ e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2097152 : i10);
    }

    public final void a(String str, String str2) {
        synchronized (this.f79721c) {
            try {
                Result.Companion companion = Result.f93230c;
                Map map = this.f79720b;
                Object objA = map.get(str);
                if (objA == null) {
                    objA = a();
                    map.put(str, objA);
                }
                ((g) objA).a(str2);
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }

    private final g a() {
        int i10 = this.f79719a;
        return new g(i10 / 2, i10);
    }
}
