package sg.bigo.ads.controller.a.b;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.controller.e.e f103246a;

    public a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
    }

    @Override // sg.bigo.ads.controller.a.b.c
    final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    final sg.bigo.ads.controller.a.a.b b() {
        return this.f103252b.f103205a.f103134i;
    }

    @Override // sg.bigo.ads.controller.a.b.c
    final void a(final Pair<String, Integer> pair) {
        g gVar;
        if (pair == null || (gVar = this.f103253c) == null || this.f103254d == null || this.f103255e == null) {
            return;
        }
        String strA = gVar.a();
        if (q.a((CharSequence) strA) || !sg.bigo.ads.controller.e.c.a().a(strA)) {
            sg.bigo.ads.common.t.a.a(0, 3, "GlobalConfig", "app key is empty or invalid");
            return;
        }
        this.f103258h.set(true);
        sg.bigo.ads.controller.g.h hVar = new sg.bigo.ads.controller.g.h(this.f103253c, this.f103252b, sg.bigo.ads.controller.b.e.E(), new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.a.b.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                a.this.f103258h.set(false);
                a.this.a(pair, c.a(i12));
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                a.this.f103258h.set(false);
                sg.bigo.ads.controller.e.e eVar = a.this.f103246a;
                if (eVar != null) {
                    eVar.a(i10, str, true);
                }
                a.this.a(pair, false);
            }
        });
        hVar.f103691i = (String) pair.first;
        hVar.b();
    }
}
