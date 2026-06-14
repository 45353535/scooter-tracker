package f1;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f69454k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f69455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f69457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f69458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f69459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f69461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f69462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f69463j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f69464b = new b("UI", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f69465c = new b("ASYNC", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f69466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69467e;

        static {
            b[] bVarArrD = d();
            f69466d = bVarArrD;
            f69467e = qf.a.a(bVarArrD);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f69464b, f69465c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f69466d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f69468b = new c("GET", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f69469c = new c("POST", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f69470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69471e;

        static {
            c[] cVarArrD = d();
            f69470d = cVarArrD;
            f69471e = qf.a.a(cVarArrD);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] d() {
            return new c[]{f69468b, f69469c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f69470d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f69472b = new d("CANCELED", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f69473c = new d("QUEUED", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f69474d = new d("PROCESSING", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ d[] f69475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69476f;

        static {
            d[] dVarArrD = d();
            f69475e = dVarArrD;
            f69476f = qf.a.a(dVarArrD);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] d() {
            return new d[]{f69472b, f69473c, f69474d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f69475e.clone();
        }
    }

    public bd(c method, String uri, r priority, File file) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f69455b = method;
        this.f69456c = uri;
        this.f69457d = priority;
        this.f69458e = file;
        this.f69459f = new AtomicReference(d.f69473c);
        this.f69463j = b.f69464b;
    }

    public qd a() {
        return new qd(null, null, null);
    }

    public ke b(ef efVar) {
        return ke.f70267c.b(null);
    }

    public abstract void c(g1.a aVar, ef efVar);

    public void f(String uri, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    public final boolean g() {
        return androidx.compose.animation.core.c.a(this.f69459f, d.f69473c, d.f69472b);
    }

    public final c h() {
        return this.f69455b;
    }

    public final r i() {
        return this.f69457d;
    }

    public final String j() {
        return this.f69456c;
    }

    public void d(Object obj, ef efVar) {
    }
}
