package sg.bigo.ads.controller.g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.g.a;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a<sg.bigo.ads.controller.a.f> implements i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final sg.bigo.ads.api.a.h f103703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final sg.bigo.ads.api.b f103704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final sg.bigo.ads.api.a.l f103705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> f103706m;

    public b(@NonNull sg.bigo.ads.api.a.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        super(gVar, bVar, ((long) lVar.d()) * 1000);
        this.f103703j = hVar;
        this.f103704k = bVar2;
        this.f103705l = lVar;
        this.f103706m = eVar;
        bVar2.a(this.f103687e, this.f103688f, this.f103689g);
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    protected final StringBuilder a(long j10, String str) {
        StringBuilder sbA = super.a(j10, str);
        sbA.append(StringUtils.COMMA);
        sbA.append(q.a(this.f103705l.l()));
        sbA.append(StringUtils.COMMA);
        sbA.append(q.a(this.f103705l.n()));
        return sbA;
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    protected final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f103685c;
        return bVar != null ? bVar.f103205a.f103137l.f103201b : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    protected void i() {
        sg.bigo.ads.common.x.a.y();
    }

    @Override // sg.bigo.ads.controller.g.a
    protected boolean j() {
        return sg.bigo.ads.api.a.i.f102116a.d() && sg.bigo.ads.common.x.a.x();
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.b k() {
        return this.f103704k;
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.a.l l() {
        return this.f103705l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    /* JADX INFO: renamed from: m */
    public sg.bigo.ads.controller.a.f f() {
        return this.f103685c.b("/Ad/GetUniAd", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final void a(int i10, int i11, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar = this.f103706m;
        if (eVar != null) {
            eVar.a(a(), i10, i11, str, this.f103705l);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    protected void a(@NonNull String str, @NonNull Map<String, Object> map) {
        if (this.f103706m != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.controller.c.b bVarA = sg.bigo.ads.controller.c.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.f103704k.f102124h, this.f103705l, str);
            if (bVarA != null) {
                this.f103706m.a(a(), this.f103704k, bVarA);
            } else {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    protected final void a(@NonNull a.b bVar) {
        int iU;
        bVar.a("slot", q.a(this.f103705l.l()));
        bVar.a(Reporting.Key.PLACEMENT_ID, q.a(this.f103705l.n()));
        bVar.a("strategy_id", this.f103705l.a());
        bVar.a("support_adx_types", sg.bigo.ads.api.core.a.a(this.f103704k.c()));
        bVar.a("lat_enable", Integer.valueOf(this.f103684b.z() ? 1 : 0));
        bVar.a("hw_lat_enable", Integer.valueOf(this.f103684b.F() ? 1 : 0));
        bVar.a("fire_lat_enable", Integer.valueOf(this.f103684b.ad() ? 1 : 0));
        bVar.a("token", this.f103703j.l());
        bVar.a("slot_abflags", this.f103705l.o());
        bVar.a("global_abflags", this.f103703j.j());
        bVar.a("support_playable_ad", Integer.valueOf(this.f103705l.r()));
        bVar.a("session_id", this.f103704k.f102124h.f102126b);
        int iC = sg.bigo.ads.common.f.b.c();
        bVar.a("req_status", Integer.valueOf(iC));
        this.f103704k.c(iC);
        this.f103704k.b(this.f103684b.X());
        if (sg.bigo.ads.controller.e.h.a().f103660a) {
            bVar.a("algo_info", sg.bigo.ads.controller.e.h.a().f103664e.a(q.a(this.f103705l.l())));
        }
        bVar.a("auc_mode", Integer.valueOf(this.f103705l.v()));
        if (sg.bigo.ads.api.core.a.d(this.f103705l.b())) {
            iU = this.f103705l.q().a("splash_orientation");
        } else {
            sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f102116a;
            iU = hVar == null ? 0 : hVar.u();
        }
        bVar.a("orientation", Integer.valueOf(iU));
        Map<String, Object> mapD = this.f103704k.d();
        if (mapD != null) {
            for (Map.Entry<String, Object> entry : mapD.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        String str = this.f103704k.f102124h.f102125a;
        if (!q.a((CharSequence) str)) {
            bVar.a("load_ext", str);
        }
        String strA = d.a(this.f103704k, this.f103684b);
        if (!TextUtils.isEmpty(strA)) {
            bVar.a("ad_info", strA);
        }
        sg.bigo.ads.common.b bVarAc = this.f103684b.ac();
        bVar.a("bat_stat", bVarAc != null ? String.valueOf(bVarAc.f102289c) : "");
        bVar.a("bat_num", bVarAc != null ? String.valueOf(bVarAc.f102287a) : "");
        bVar.a("bat_scale", bVarAc != null ? String.valueOf(bVarAc.f102288b) : "");
        bVar.a("tc_string", sg.bigo.ads.common.m.b.e());
        if (!(this instanceof j)) {
            bVar.a("imp_pattern", Integer.valueOf(this.f103684b.av()));
        }
        bVar.a("gp_vc", Integer.valueOf(this.f103684b.aw()));
    }
}
