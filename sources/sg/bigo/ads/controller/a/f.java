package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.a.b;
import sg.bigo.ads.controller.a.b.d;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends c {

    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a f103276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a.b f103277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f103278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.api.a.h f103279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f103280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f103281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f103282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private j f103283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f103284i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f103285j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f103286k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f103287l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g f103288m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f103289n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final AtomicBoolean f103290o = new AtomicBoolean(false);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final AtomicBoolean f103291p = new AtomicBoolean(false);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f103292q = new Runnable() { // from class: sg.bigo.ads.controller.a.f.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] run timeout task");
                a.this.b();
            }
        };

        public a(@NonNull sg.bigo.ads.controller.a.a aVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar, @NonNull String str, String str2) {
            this.f103289n = null;
            boolean z10 = false;
            this.f103276a = aVar;
            this.f103278c = gVar;
            this.f103279d = hVar;
            this.f103280e = str;
            this.f103289n = str2;
            str.getClass();
            if (str.equals("/Ad/GetSDKConfig")) {
                this.f103277b = aVar.f103132g;
                z10 = true;
            } else {
                this.f103277b = !str.equals("/Ad/ReportUniBaina") ? aVar.f103134i : aVar.f103133h;
            }
            this.f103284i = z10;
        }

        @Override // sg.bigo.ads.common.u.a
        public final String a() {
            g gVar;
            g gVar2;
            String str = this.f103289n;
            if (str != null) {
                return sg.bigo.ads.b.a(str, this.f103280e);
            }
            if (q.a((CharSequence) this.f103281f)) {
                String strV = this.f103278c.v();
                e eVarA = this.f103277b.a(strV, this.f103279d.s());
                sg.bigo.ads.controller.a.a aVar = this.f103276a;
                this.f103285j = aVar.f103129a;
                this.f103286k = aVar.f103130e;
                this.f103287l = aVar.f103131f;
                this.f103282g = eVarA.f103273a;
                this.f103283h = this.f103277b.f103145a;
                d.a.f103269a.a(this.f103280e, this.f103282g, this.f103283h);
                this.f103281f = sg.bigo.ads.b.a(this.f103282g.c() ? this.f103282g.b() : this.f103282g.a(), this.f103280e);
                if (eVarA.f103275c && (gVar2 = this.f103288m) != null) {
                    gVar2.a(this.f103280e);
                }
                if (eVarA.f103274b && (gVar = this.f103288m) != null) {
                    gVar.a(strV, this.f103284i);
                }
            }
            return this.f103281f;
        }

        @Override // sg.bigo.ads.common.u.a
        public final void b() {
            g gVar;
            boolean zEquals = false;
            if (!this.f103290o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f103292q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail, url is " + this.f103281f);
            sg.bigo.ads.controller.a.a.b bVar = this.f103277b;
            b.C1279b c1279b = bVar.f103146b;
            if (c1279b != null && (zEquals = TextUtils.equals(strD, c1279b.a()))) {
                bVar.f103147c++;
            }
            if (zEquals && (gVar = this.f103288m) != null) {
                gVar.a(this.f103280e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final void c() {
            g gVar;
            boolean z10 = false;
            if (!this.f103290o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f103292q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success, url is " + this.f103281f);
            sg.bigo.ads.controller.a.a.b bVar = this.f103277b;
            b.C1279b c1279b = bVar.f103146b;
            if (c1279b != null) {
                boolean z11 = TextUtils.equals(strD, c1279b.a()) && bVar.f103147c > 0;
                if (z11) {
                    bVar.f103147c = 0;
                }
                z10 = z11;
            }
            if (z10 && (gVar = this.f103288m) != null) {
                gVar.a(this.f103280e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final String d() {
            j jVar = this.f103282g;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.common.u.a
        public final boolean e() {
            j jVar = this.f103282g;
            return jVar != null && jVar.c();
        }

        @Override // sg.bigo.ads.common.u.a
        public final String f() {
            j jVar = this.f103283h;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.controller.a.c
        @Nullable
        public final j g() {
            return this.f103282g;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final boolean h() {
            return this.f103286k;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final String i() {
            return this.f103287l;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(long j10) {
            if (this.f103291p.compareAndSet(false, true)) {
                sg.bigo.ads.common.n.d.a(3, this.f103292q, j10);
            }
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(g gVar) {
            this.f103288m = gVar;
        }
    }
}
