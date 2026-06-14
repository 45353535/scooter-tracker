package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.controller.g.a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends e<sg.bigo.ads.common.u.b.d> {
    public m(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.controller.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.controller.g.e, sg.bigo.ads.controller.g.a
    protected final void a(@NonNull a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.f103684b.P());
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    protected final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f103691i;
        return str != null ? new sg.bigo.ads.common.u.b.d(sg.bigo.ads.b.a(str, "/Ad/ReportUniBaina")) : new sg.bigo.ads.common.u.b.d(sg.bigo.ads.b.a(sg.bigo.ads.b.b(), "/Ad/ReportUniBaina"));
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final void i() {
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final boolean j() {
        return false;
    }
}
