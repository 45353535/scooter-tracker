package c1;

import android.content.Context;
import android.widget.FrameLayout;
import b1.e;
import com.ironsource.mediationsdk.l;
import e1.a;
import f1.eg;
import f1.h;
import f1.l9;
import f1.o5;
import f1.rd;
import f1.vf;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends FrameLayout implements c1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d1.b f6467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f6468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f6469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l9 f6470g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6471d = new a("STANDARD", 0, 320, 50);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f6472e = new a("MEDIUM", 1, 300, 250);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f6473f = new a(l.f44064d, 2, 728, 90);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f6474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f6475h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6477c;

        static {
            a[] aVarArrD = d();
            f6474g = aVarArrD;
            f6475h = qf.a.a(aVarArrD);
        }

        private a(String str, int i10, int i11, int i12) {
            this.f6476b = i11;
            this.f6477c = i12;
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{f6471d, f6472e, f6473f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6474g.clone();
        }

        public final int getHeight() {
            return this.f6477c;
        }

        public final int getWidth() {
            return this.f6476b;
        }
    }

    /* JADX INFO: renamed from: c1.b$b, reason: collision with other inner class name */
    public static final class C0144b extends Lambda implements Function0 {
        public C0144b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final vf invoke() {
            return o5.a(b.this.getMediation());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            b.this.f6467d.g(new e1.b(null, b.this), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String location, a size, d1.b callback, e eVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6465b = location;
        this.f6466c = size;
        this.f6467d = callback;
        this.f6468e = eVar;
        this.f6469f = i.a(new C0144b());
        this.f6470g = new h(getApi(), callback, this, rd.f70996b);
    }

    private final void f() {
        try {
            rd.f70996b.d().c().b(new c());
        } catch (Exception e10) {
            eg.j("Banner ad cannot post session not started callback " + e10, null, 2, null);
        }
    }

    private final vf getApi() {
        return (vf) this.f6469f.getValue();
    }

    public void b() {
        if (b1.b.h()) {
            getApi().z(this, this.f6467d);
        } else {
            f();
        }
    }

    public void c() {
        this.f6470g.c();
    }

    public final void d() {
        if (b1.b.h()) {
            this.f6470g.b();
        }
    }

    public boolean e() {
        return this.f6470g.a();
    }

    public final int getBannerHeight() {
        return this.f6466c.getHeight();
    }

    public final int getBannerWidth() {
        return this.f6466c.getWidth();
    }

    @Override // c1.a
    @NotNull
    public String getLocation() {
        return this.f6465b;
    }

    @Override // c1.a
    @Nullable
    public e getMediation() {
        return this.f6468e;
    }
}
