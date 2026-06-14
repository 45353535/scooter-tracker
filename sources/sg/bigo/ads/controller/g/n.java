package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.controller.g.a;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends e<sg.bigo.ads.controller.a.f> {
    public n(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.controller.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.controller.g.e, sg.bigo.ads.controller.g.a
    protected final void a(@NonNull a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.f103684b.P());
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.common.f.b.c()));
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    protected final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f103685c;
        return bVar != null ? bVar.f103205a.f103137l.f103204e : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.common.u.a f() {
        return this.f103685c.b("/Ad/ReportUniBaina", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final void i() {
        sg.bigo.ads.common.x.a.C();
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final boolean j() {
        return sg.bigo.ads.api.a.i.f102116a.f() && sg.bigo.ads.common.x.a.B();
    }
}
