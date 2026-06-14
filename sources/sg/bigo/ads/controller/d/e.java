package sg.bigo.ads.controller.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    protected final sg.bigo.ads.controller.a.b f103528a;

    static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f103529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f103530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f103531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f103532d;

        public a(@Nullable String str, @Nullable j jVar) {
            this.f103529a = str;
            if (jVar != null) {
                boolean zC = jVar.c();
                this.f103531c = zC;
                this.f103530b = jVar.a();
                str = sg.bigo.ads.controller.a.d.a(str, zC ? jVar.b() : jVar.a());
            } else {
                this.f103531c = false;
                this.f103530b = "";
            }
            this.f103532d = str;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String a() {
            return this.f103532d;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String b() {
            return this.f103529a;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String c() {
            return this.f103530b;
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return this.f103531c;
        }
    }

    public e(@Nullable sg.bigo.ads.controller.a.b bVar) {
        this.f103528a = bVar;
    }

    @Override // sg.bigo.ads.common.k
    @NonNull
    public final k.b a(@Nullable String str) {
        sg.bigo.ads.controller.a.b bVar = this.f103528a;
        return new a(str, bVar != null ? bVar.f103205a.f103134i.f103146b : null);
    }
}
