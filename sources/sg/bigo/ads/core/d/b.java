package sg.bigo.ads.core.d;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.h;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.d.b.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[][] f104017a = {new String[]{"0", "1"}, new String[]{"2", "3"}};

    private static int a(h hVar) {
        h.a aVarAx = hVar.ax();
        if (aVarAx != null && aVarAx.a() && hVar.aB()) {
            return k.a(aVarAx.b()) ? 1 : 2;
        }
        return 0;
    }

    public static int b() {
        int iP = sg.bigo.ads.common.x.a.p();
        int iN = sg.bigo.ads.common.x.a.n();
        int iO = sg.bigo.ads.common.x.a.o();
        int iM = sg.bigo.ads.common.x.a.m();
        int i10 = iP == 2 ? 1 : 0;
        int i11 = iN == 2 ? 1 : 0;
        int i12 = iO == 2 ? 1 : 0;
        return (iP << 4) | (iN << 6) | (iO << 8) | (iM << 10) | (sg.bigo.ads.common.x.a.l() << 12) | ((iM == 2 ? 1 : 0) << 3) | (i12 << 2) | (i11 << 1) | i10;
    }

    @NonNull
    public static Map<String, String> c(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.api.b.a aVar) {
        return a(bVar, aVar, true);
    }

    public static void d(Map<String, String> map) {
        a("06002067", map);
    }

    @NonNull
    private static Map<String, String> a(Map<String, String> map, @Nullable sg.bigo.ads.api.core.b bVar, String str, String str2, int i10) {
        m mVarAV;
        map.put("show_proportion", str);
        map.put(Reporting.Key.AD_SIZE, str2);
        map.put("render_style", String.valueOf(i10));
        if ((bVar instanceof n) && (mVarAV = ((n) bVar).aV()) != null) {
            map.put("creative_size", q.a("%1$d*%2$d", Integer.valueOf(mVarAV.f102207a), Integer.valueOf(mVarAV.f102208b)));
        }
        return map;
    }

    public static void b(int i10, int i11, String str) {
        HashMap map = new HashMap();
        map.put("action", String.valueOf(i10));
        map.put("scene", String.valueOf(i11));
        if (!q.a((CharSequence) str)) {
            map.put("error", str);
        }
        a("06002063", map);
    }

    public static void c(Map<String, String> map) {
        c.a().a("06002066", map);
    }

    private static Map<String, String> a(Map<String, String> map, @Nullable g gVar) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (gVar != null) {
            map.put("session_id", gVar.c());
            map.put("gps_country", gVar.d());
            map.put("sim_country", gVar.e());
            map.put("system_country", gVar.f());
            map.put("req_status", String.valueOf(gVar.h()));
            map.put(CommonUrlParts.UUID, String.valueOf(gVar.i()));
            map.put("cfg_sta", String.valueOf(gVar.j()));
            if (gVar.l() > 0) {
                long jL = gVar.l() - gVar.k();
                if (jL >= 0) {
                    map.put("cfg_cost", String.valueOf(jL));
                }
            }
            if (gVar.m() > 0) {
                long jM = gVar.m() - gVar.k();
                if (jM >= 0) {
                    map.put("delay_cost", String.valueOf(jM));
                }
            }
            if (gVar.m() > 0 && gVar.l() > 0) {
                long jM2 = gVar.m() - gVar.l();
                if (jM2 >= 0) {
                    map.put("req_queue_time", String.valueOf(jM2));
                }
            }
            if (gVar.n() > 0) {
                long jN = gVar.n() - gVar.k();
                if (jN >= 0) {
                    map.put("net_cost", String.valueOf(jN));
                }
            }
            String strG = gVar.g();
            if (!q.a((CharSequence) strG)) {
                map.put("load_ext", strG);
            }
        }
        return map;
    }

    public static void b(Map<String, String> map) {
        a("06002014", map);
    }

    private static void c(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int iBp;
        if (!(bVar instanceof n) || map == null || (iBp = ((n) bVar).bp()) <= 0) {
            return;
        }
        map.put("ad_cur_page_indx", String.valueOf(iBp));
    }

    @NonNull
    private static Map<String, String> a(@Nullable l lVar) {
        HashMap map = new HashMap();
        if (lVar == null) {
            return map;
        }
        map.put("slot", lVar.l());
        map.put("config_id", String.valueOf(i.f102116a.i()));
        map.put(Reporting.Key.PLACEMENT_ID, lVar.n());
        map.put("strategy_id", lVar.a());
        map.put("ad_type", String.valueOf(lVar.b()));
        map.put("abflags", q.a(i.f102116a.j(), lVar.o()));
        map.put("auc_mode", String.valueOf(lVar.v()));
        return map;
    }

    private static void b(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.core.b bVar) {
        List<sg.bigo.ads.api.core.b> listAm = bVar.am();
        if (listAm == null || listAm.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (sg.bigo.ads.api.core.b bVar2 : listAm) {
            if (bVar2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("ad_id", bVar2.r());
                    jSONObject.putOpt("creative_id", bVar2.z());
                    jSONObject.putOpt("is_playable", String.valueOf(bVar2.ad()));
                    if (bVar2 instanceof n) {
                        n nVar = (n) bVar2;
                        jSONObject.putOpt("media_type", nVar.aY());
                        jSONObject.putOpt("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
                        if (nVar.w() == 2) {
                            jSONObject.putOpt("fill_strategy", String.valueOf(nVar.bd()));
                            jSONObject.putOpt("dl_status", String.valueOf(nVar.be()));
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
        map.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.Map<java.lang.String, java.lang.String> a(@androidx.annotation.NonNull sg.bigo.ads.api.core.b r11, @androidx.annotation.Nullable sg.bigo.ads.api.b.a r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.d.b.a(sg.bigo.ads.api.core.b, sg.bigo.ads.api.b.a, boolean):java.util.Map");
    }

    public static void b(sg.bigo.ads.api.core.b bVar, int i10, int i11, String str) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("ad_pkg_name", str);
        mapA.put("open_rslt", String.valueOf(i10));
        mapA.put("open_type", String.valueOf(i11));
        mapA.put("ori_ad_bundle", bVar.n());
        a("06002070", mapA);
    }

    @NonNull
    private static Map<String, String> a(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.api.b.h hVar) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        b.InterfaceC1253b interfaceC1253bN = bVar.N();
        mapA.put("final_url_type", String.valueOf(hVar.j()));
        mapA.put("redirect_num", String.valueOf(hVar.k()));
        mapA.put("preload_t", String.valueOf(interfaceC1253bN.f()));
        mapA.put("progress", String.valueOf(hVar.l()));
        mapA.put("click_index", String.valueOf(hVar.n()));
        mapA.put("preload_scene", String.valueOf(interfaceC1253bN.k()));
        mapA.put("preload_ready", hVar.m() ? "1" : "0");
        mapA.put("land_way", String.valueOf(hVar.o()));
        mapA.put("webview_layout", String.valueOf(hVar.h()));
        mapA.put("url", hVar.i());
        Map<String, String> mapP = hVar.p();
        if (mapP != null) {
            mapA.putAll(mapP);
        }
        return mapA;
    }

    private static void b(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int iBn;
        if (!(bVar instanceof n) || map == null || (iBn = ((n) bVar).bn()) <= 0) {
            return;
        }
        map.put("ad_imp_indx", String.valueOf(iBn));
    }

    public static void a() {
        HashMap map = new HashMap();
        map.put("build", sg.bigo.ads.common.z.a.b());
        map.put("cpu_info", sg.bigo.ads.common.z.a.c());
        a("06002059", map);
    }

    public static void b(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.api.b.a aVar) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("rew_rslt", "1");
        mapA.put("out_ad", String.valueOf(aVar.Q()));
        a(mapA, aVar, false);
        a("06002019", mapA);
    }

    public static void a(int i10, int i11, long j10) {
        HashMap map = new HashMap();
        map.put("action", String.valueOf(i10));
        map.put("times", String.valueOf(i11));
        map.put("cost", String.valueOf(j10));
        a("06002064", map);
    }

    public static void a(int i10, int i11, String str) {
        a((sg.bigo.ads.api.core.b) null, i10, i11, str);
    }

    public static void a(int i10, long j10, long j11) {
        HashMap map = new HashMap();
        map.put("start_type", String.valueOf(i10));
        map.put("start_time", String.valueOf(j10));
        map.put("duration", String.valueOf(j11));
        a("06002044", map);
    }

    public static void a(long j10, int i10, int i11, int i12, int i13) {
        HashMap map = new HashMap();
        map.put("ts", String.valueOf(j10));
        map.put("load_num", String.valueOf(i10));
        map.put("fill_num", String.valueOf(i11));
        map.put("imp_num", String.valueOf(i12));
        map.put("click_num", String.valueOf(i13));
        a("06002039", map);
    }

    public static void a(long j10, int i10, int i11, String str, int i12, boolean z10, int i13, String str2) {
        d dVar = new d("06002002");
        dVar.a("rslt", "0");
        dVar.a("cost", j10);
        dVar.a("e_code", i10);
        dVar.a("s_code", i11);
        dVar.a("error", str);
        dVar.a("src", i12);
        dVar.a("in_fg", String.valueOf(z10 ? 1 : 2));
        dVar.a("times", String.valueOf(i13));
        if (!TextUtils.isEmpty(str2)) {
            dVar.a(CommonUrlParts.UUID, str2);
        }
        a(dVar);
    }

    public static void a(long j10, int i10, String str, String str2, Map<String, String> map) {
        d dVar = new d("06002001");
        dVar.a("states", "success");
        dVar.a("cost", j10);
        dVar.a("status", i10);
        dVar.a("cur_in_fg", sg.bigo.ads.common.f.b.c());
        if (!TextUtils.isEmpty(str)) {
            dVar.a(CommonUrlParts.UUID, str);
        }
        dVar.a("tc_string", str2);
        String strA = sg.bigo.ads.common.utils.l.a(map);
        if (!TextUtils.isEmpty(strA)) {
            dVar.a("cost_map", strA);
        }
        a(dVar);
    }

    public static void a(long j10, long j11, boolean z10, int i10, boolean z11, int i11, String str) {
        d dVar = new d("06002002");
        dVar.a("rslt", "1");
        dVar.a("config_id", j10);
        dVar.a("cost", j11);
        dVar.a("n_rt", z10 ? "0" : "1");
        dVar.a("src", i10);
        dVar.a("in_fg", String.valueOf(z11 ? 1 : 2));
        dVar.a("times", String.valueOf(i11));
        if (!TextUtils.isEmpty(str)) {
            dVar.a(CommonUrlParts.UUID, str);
        }
        dVar.a("cur_in_fg", sg.bigo.ads.common.f.b.c());
        a(dVar);
    }

    public static void a(long j10, boolean z10, String str, int i10, String str2) {
        d dVar = new d("06002051");
        dVar.a("rslt", "0");
        dVar.a("cost", j10);
        dVar.a("clear", z10 ? "1" : "0");
        dVar.a("url", str);
        dVar.a("e_code", i10);
        dVar.a("error", str2);
        a(dVar);
    }

    public static void a(long j10, boolean z10, String str, boolean z11) {
        d dVar = new d("06002051");
        dVar.a("rslt", "1");
        dVar.a("cost", j10);
        dVar.a("clear", z10 ? "1" : "0");
        dVar.a("update", z11 ? "1" : "0");
        dVar.a("url", str);
        a(dVar);
    }

    public static void a(Context context, @NonNull sg.bigo.ads.api.b.a aVar, String str, String str2, int i10, long j10, long j11, long j12, int i11, int i12, int i13) {
        Map<String, String> mapA;
        sg.bigo.ads.common.b bVarH;
        if (aVar instanceof sg.bigo.ads.api.b.g) {
            sg.bigo.ads.api.b.g gVar = (sg.bigo.ads.api.b.g) aVar;
            mapA = a(aVar.R().h());
            a(mapA, gVar, true);
            mapA.put("icon_show_num", String.valueOf(gVar.j()));
            mapA.put("scene_page", String.valueOf(gVar.f102141b));
            mapA.put("word_icon_style", String.valueOf(gVar.f102142c ? 1 : 0));
        } else {
            sg.bigo.ads.api.core.b bVarF = aVar.f();
            Map<String, String> mapA2 = a(bVarF, (sg.bigo.ads.api.b.a) null, false);
            boolean z10 = bVarF instanceof n;
            if (z10) {
                n nVar = (n) bVarF;
                m mVarAV = nVar.aV();
                if (mVarAV != null) {
                    mapA2.put("creative_size", q.a("%1$d*%2$d", Integer.valueOf(mVarAV.f102207a), Integer.valueOf(mVarAV.f102208b)));
                }
                int iAC = nVar.aC();
                if (iAC != 0) {
                    mapA2.put("show_method", String.valueOf(iAC));
                }
                mapA2.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
                if (nVar.w() == 2) {
                    mapA2.put("fill_strategy", String.valueOf(nVar.bd()));
                    mapA2.put("dl_status", String.valueOf(nVar.be()));
                    if (nVar.bd() == 2) {
                        mapA2.put("backup_source", String.valueOf(!q.a((CharSequence) nVar.aT()) ? 1 : 0));
                        mapA2.put("backup_dl_status", String.valueOf(nVar.bg()));
                    }
                    mapA2.put("backup_creative", String.valueOf(nVar.bf()));
                }
                mapA2.put("media_type", nVar.aY());
                a(bVarF, mapA2);
                b(bVarF, mapA2);
                c(bVarF, mapA2);
            }
            a(mapA2, bVarF);
            if (z10 && bVarF.x() == 2 && (bVarF.w() == 2 || bVarF.w() == 1)) {
                if (i11 != -1) {
                    mapA2.put("icon_sta", String.valueOf(i11));
                }
                if (i12 != -1) {
                    mapA2.put("img_sta", String.valueOf(i12));
                }
                if (i13 != -1) {
                    mapA2.put("vid_sta", String.valueOf(i13));
                }
            }
            mapA = mapA2;
        }
        mapA.put("show_proportion", str);
        mapA.put(Reporting.Key.AD_SIZE, str2);
        mapA.put("render_style", String.valueOf(i10));
        mapA.put("render_cost", String.valueOf(j10));
        mapA.put("attach_render_cost", String.valueOf(j11));
        mapA.put("cost", String.valueOf(j12));
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.put("out_ad", String.valueOf(aVar.Q()));
        int i14 = aVar.U;
        if (i14 != 0) {
            mapA.put("show_method_source", String.valueOf(i14));
        }
        int i15 = aVar.V;
        if (i15 != 0) {
            mapA.put("show_acty_source", String.valueOf(i15));
        }
        sg.bigo.ads.api.a.h hVar = i.f102116a;
        if (hVar != null && hVar.n().a(15) && (bVarH = sg.bigo.ads.common.aa.b.h(context)) != null) {
            mapA.put("bat_stat", String.valueOf(bVarH.f102289c));
            mapA.put("bat_num", String.valueOf(bVarH.f102287a));
            mapA.put("bat_scale", String.valueOf(bVarH.f102288b));
        }
        o oVarB_ = aVar.b_();
        t tVar = oVarB_ != null ? oVarB_.f102212a : null;
        if (tVar != null) {
            mapA.put("is_vpaid", "1");
            mapA.put("vpaid_imp_type", String.valueOf(tVar.f102228d));
            mapA.put("vpaid_start_cost", String.valueOf(tVar.f102229e));
            mapA.put("vpaid_impression_cost", String.valueOf(tVar.f102230f));
        }
        a("06002010", mapA);
    }

    public static void a(Context context, @NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, String str3, int i10, int i11, int i12, int i13, long j10, int i14, int i15, @NonNull sg.bigo.ads.api.b.a aVar, String str4) {
        sg.bigo.ads.common.b bVarH;
        int iBo;
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        sg.bigo.ads.api.b.a aVarO = aVar.O();
        if (aVarO instanceof sg.bigo.ads.api.b.g) {
            sg.bigo.ads.api.b.g gVar = (sg.bigo.ads.api.b.g) aVarO;
            mapA.put("icon_show_num", String.valueOf(gVar.j()));
            mapA.put("scene_page", String.valueOf(gVar.f102141b));
            mapA.put("word_icon_style", String.valueOf(gVar.f102142c ? 1 : 0));
        }
        mapA.put(Reporting.Key.AD_SIZE, str);
        mapA.put("click_area", str2);
        mapA.put("down_click_area", str3);
        mapA.put("click_module", String.valueOf(i10));
        mapA.put("click_source", String.valueOf(i11));
        mapA.put("open_way", String.valueOf(bVar.N().c()));
        mapA.put("url_t", String.valueOf(i12));
        mapA.put("open_way_form", String.valueOf(i13));
        mapA.put("cost", String.valueOf(j10));
        boolean z10 = bVar instanceof n;
        if (z10) {
            n nVar = (n) bVar;
            m mVarAV = nVar.aV();
            if (mVarAV != null) {
                mapA.put("creative_size", q.a("%1$d*%2$d", Integer.valueOf(mVarAV.f102207a), Integer.valueOf(mVarAV.f102208b)));
            }
            int iAC = nVar.aC();
            if (iAC != 0) {
                mapA.put("show_method", String.valueOf(iAC));
            }
            long jAE = nVar.aE();
            if (jAE > 0) {
                mapA.put("page_cost", String.valueOf(SystemClock.elapsedRealtime() - jAE));
            }
            int iAD = nVar.aD();
            if (i11 == 11 && iAD > 0) {
                mapA.put("render_method", String.valueOf(iAD));
            }
            if (nVar.w() == 2) {
                mapA.put("backup_creative", String.valueOf(nVar.bf()));
            }
            a(bVar, mapA);
            b(bVar, mapA);
            if (z10 && (iBo = nVar.bo()) > 0) {
                mapA.put("ad_click_indx", String.valueOf(iBo));
            }
            c(bVar, mapA);
        }
        sg.bigo.ads.api.a.h hVar = i.f102116a;
        if (hVar != null && hVar.n().a(15) && (bVarH = sg.bigo.ads.common.aa.b.h(context)) != null) {
            mapA.put("bat_stat", String.valueOf(bVarH.f102289c));
            mapA.put("bat_num", String.valueOf(bVarH.f102287a));
            mapA.put("bat_scale", String.valueOf(bVarH.f102288b));
        }
        mapA.put("total_num", String.valueOf(i14));
        mapA.put("current_num", String.valueOf(i15));
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.put("out_ad", String.valueOf(aVar.Q()));
        int i16 = aVar.U;
        if (i16 != 0) {
            mapA.put("show_method_source", String.valueOf(i16));
        }
        mapA.put("click_acty_source", String.valueOf(aVar.W));
        a(mapA, bVar);
        a(mapA, aVar, true);
        if (!TextUtils.isEmpty(str4)) {
            mapA.put("land_u", str4);
        }
        if (!TextUtils.isEmpty(bVar.N().b())) {
            mapA.put("dp_u", bVar.N().b());
        }
        o oVarB_ = aVar.b_();
        t tVar = oVarB_ != null ? oVarB_.f102212a : null;
        if (tVar != null) {
            mapA.put("is_vpaid", "1");
            mapA.put("vpaid_click_url", tVar.f102231g);
            mapA.put("vpaid_click_handle", tVar.f102232h ? "1" : "0");
            mapA.put("vpaid_click_id", tVar.f102233i);
        }
        a("06002011", mapA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str, String str2, boolean z10, long j10, int i10, String str3, boolean z11, int i11, String str4, String str5, String str6, String str7, boolean z12, boolean z13, int i12, String str8) {
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("domain_front", str2);
        map.put("rslt", z10 ? "1" : "0");
        map.put("cost", String.valueOf(j10));
        map.put("res_code", String.valueOf(i10));
        map.put("res_msg", String.valueOf(str3));
        map.put("in_fg", String.valueOf(z11 ? 1 : 0));
        map.put("size", String.valueOf(i11));
        int iM = sg.bigo.ads.common.x.a.m();
        int iN = sg.bigo.ads.common.x.a.n();
        int iO = sg.bigo.ads.common.x.a.o();
        int iP = sg.bigo.ads.common.x.a.p();
        if (iM != 0 || iN != 0 || iO != 0 || iP != 0) {
            String string = iM == 1 ? "GDPR" : "";
            if (iN == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(string.length() == 0 ? "" : C4240b4.j.f42670c);
                sb2.append("CCPA");
                string = sb2.toString();
            }
            if (iO == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(string.length() == 0 ? "" : C4240b4.j.f42670c);
                sb3.append("LGPD");
                string = sb3.toString();
            }
            if (iP == 1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(string.length() != 0 ? C4240b4.j.f42670c : "");
                sb4.append("COPPA");
                string = sb4.toString();
            }
            map.put("privacy", string);
            map.put(C4240b4.j.f42669b0, "1");
        }
        map.put("gps_country", str4);
        map.put("sim_country", str5);
        map.put("system_country", str6);
        if (!TextUtils.isEmpty(str7)) {
            map.put(CommonUrlParts.UUID, str7);
        }
        map.put("encrypt", z12 ? "1" : "0");
        map.put("req_encrypt_enable", z13 ? "1" : "0");
        map.put("resp_decrypt_enable", String.valueOf(i12));
        if (!TextUtils.isEmpty(str8)) {
            map.put("enc_logid", String.valueOf(str8));
        }
        a("06002015", map);
    }

    public static void a(String str, List<String> list, String str2, int i10) {
        HashMap map = new HashMap();
        map.put("rslt", str);
        if (!k.a((Collection) list)) {
            map.put("reason", list.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("browser", str2);
        }
        map.put("open_way", String.valueOf(i10));
        a("06002060", map);
    }

    private static void a(@NonNull String str, Map<String, String> map) {
        d dVar = new d(str);
        dVar.a(map);
        a(dVar);
    }

    public static void a(@Nullable String str, @Nullable sg.bigo.ads.api.core.b bVar, String str2, String str3, String str4, int i10, int i11, int i12, String str5, long j10, int i13, String str6, int i14, int i15, int i16, int i17, boolean z10, boolean z11, int i18, String str7, o oVar) {
        Map<String, String> map;
        if (bVar == null) {
            map = new HashMap<>();
        } else {
            Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
            mapA.put("ad_resp_type", String.valueOf(bVar.w()));
            if (bVar instanceof n) {
                n nVar = (n) bVar;
                if (bVar.w() == 2) {
                    mapA.put("dl_status", String.valueOf(nVar.be()));
                }
                if (nVar.w() == 2) {
                    mapA.put("fill_strategy", String.valueOf(nVar.bd()));
                }
                if (nVar.bd() == 2) {
                    mapA.put("backup_source", String.valueOf(!q.a((CharSequence) nVar.aT()) ? 1 : 0));
                }
                mapA.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
                mapA.put("backup_dl_status", String.valueOf(nVar.bg()));
            }
            map = mapA;
        }
        if (!map.containsKey("slot") && !TextUtils.isEmpty(str)) {
            map.put("slot", str);
        }
        if (!map.containsKey("ad_type") && !TextUtils.isEmpty(str2)) {
            map.put("ad_type", str2);
        }
        if (str3 == null) {
            str3 = "0";
        }
        map.put("session_id", str3);
        if (str4 == null) {
            str4 = "0";
        }
        map.put("session_id2", str4);
        map.put("rslt", String.valueOf(i10));
        map.put("e_code", String.valueOf(i11));
        map.put("s_code", String.valueOf(i12));
        if (str5 != null) {
            map.put("error", str5);
        }
        map.put("cost_total", String.valueOf(j10));
        map.put("cache_ad_source", String.valueOf(str6));
        map.put("cache_ad", String.valueOf(i13));
        map.put("cache_req_status", String.valueOf(i14));
        map.put("req_type", String.valueOf(i15));
        map.put("cur_req_status", String.valueOf(i16));
        map.put("adx_type_req", String.valueOf(i17));
        map.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        map.put("encrypt", z10 ? "1" : "0");
        map.put("req_encrypt_enable", z11 ? "1" : "0");
        map.put("resp_decrypt_enable", String.valueOf(i18));
        if (!TextUtils.isEmpty(str7)) {
            map.put("enc_logid", str7);
        }
        t tVar = oVar != null ? oVar.f102212a : null;
        if (tVar != null) {
            map.put("is_vpaid", "1");
            map.put("vpaid_version", String.valueOf(tVar.f102225a));
            map.put("vpaid_version_cost", String.valueOf(tVar.f102226b));
            map.put("vpaid_init_cost", String.valueOf(tVar.f102227c));
        }
        a("06002057", map);
    }

    public static void a(Map<String, String> map) {
        a("06002013", map);
    }

    public static void a(@NonNull Map<String, String> map, @Nullable sg.bigo.ads.api.b.a aVar, boolean z10) {
        sg.bigo.ads.api.b.a aVarO = aVar != null ? aVar.O() : null;
        if (aVarO instanceof sg.bigo.ads.api.b.g) {
            sg.bigo.ads.api.b.g gVar = (sg.bigo.ads.api.b.g) aVarO;
            a(map, gVar, false);
            if (z10) {
                map.put("scene_page", String.valueOf(gVar.f102141b));
            }
        }
    }

    private static void a(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.b.b bVar) {
        sg.bigo.ads.api.core.b bVarI = bVar.i();
        if (bVarI != null) {
            map.put("host_slot", bVarI.b());
            map.put("host_placement", bVarI.c());
            map.put("host_sid", String.valueOf(bVarI.y()));
            map.put("host_ad_id", bVarI.r());
        }
        if (bVar instanceof sg.bigo.ads.api.b.c) {
            map.put("icon_req_num", String.valueOf(((sg.bigo.ads.api.b.c) bVar).j()));
        }
    }

    @NonNull
    private static void a(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.b.g gVar, boolean z10) {
        Object objR = gVar.R();
        if (objR instanceof sg.bigo.ads.api.b.b) {
            a(map, (sg.bigo.ads.api.b.b) objR);
        }
        map.put("icon_fill_num", String.valueOf(gVar.i()));
        map.put("icon_fill_scene", String.valueOf(gVar.h()));
        sg.bigo.ads.api.core.b bVar = (sg.bigo.ads.api.core.b) k.b(gVar.a());
        if (!z10 || bVar == null) {
            return;
        }
        map.put("sid", String.valueOf(bVar.y()));
        map.put("dsp", bVar.v());
        map.put("adx_type", String.valueOf(bVar.w()));
    }

    private static void a(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.core.b bVar) {
        if (bVar instanceof n) {
            if ((bVar.x() == 3 || bVar.x() == 4) && bVar.w() == 2) {
                n nVar = (n) bVar;
                int iAH = nVar.aH();
                map.put("ser_multi_vid", String.valueOf(iAH));
                if (iAH == 3) {
                    String strAI = nVar.aI();
                    if (TextUtils.isEmpty(strAI)) {
                        return;
                    }
                    map.put("media_reason", String.valueOf(strAI));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@Nullable l lVar, @Nullable sg.bigo.ads.api.b bVar, int i10, int i11, String str, int i12, int i13, int i14, boolean z10, int i15, String str2) {
        Map<String, String> mapA = a(lVar);
        mapA.put("rslt", "0");
        mapA.put("e_code", String.valueOf(i10));
        mapA.put("s_code", String.valueOf(i11));
        mapA.put("error", str);
        if (bVar != 0) {
            if (!mapA.containsKey("slot")) {
                mapA.put("slot", bVar.f102117a);
                mapA.put("ad_type", String.valueOf(bVar.c()));
            }
            mapA.put("banner_type", String.valueOf(bVar.f102119c));
            String str3 = bVar.f102124h.f102125a;
            if (!q.a((CharSequence) str3)) {
                mapA.put("load_ext", str3);
            }
            b.a aVar = bVar.f102124h;
            a(mapA, aVar);
            mapA.put("cost", String.valueOf(Math.max(0L, aVar.n() - aVar.k())));
            if (bVar instanceof sg.bigo.ads.api.b.b) {
                a(mapA, (sg.bigo.ads.api.b.b) bVar);
            }
        }
        mapA.put("req_type", String.valueOf(i12));
        mapA.put("cur_req_status", String.valueOf(i13));
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.put("encrypt", String.valueOf(i14));
        mapA.put("req_encrypt_enable", z10 ? "1" : "0");
        mapA.put("resp_decrypt_enable", String.valueOf(i15));
        if (!TextUtils.isEmpty(str2)) {
            mapA.put("enc_logid", str2);
        }
        if (i11 == 800) {
            mapA.put("tcf_applies", String.valueOf(sg.bigo.ads.common.m.b.c()));
            mapA.put("tcf_purpose", sg.bigo.ads.common.m.b.b());
            mapA.put("tcf_interests", sg.bigo.ads.common.m.b.d());
            mapA.put("consent_status", String.valueOf(b()));
        }
        a("06002007", mapA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.api.b.a aVar, int i10, int i11, String str) {
        Map<String, String> mapA;
        g gVar;
        if (aVar instanceof sg.bigo.ads.api.b.g) {
            sg.bigo.ads.api.b bVarR = aVar.R();
            mapA = a(bVarR.h());
            a(mapA, (sg.bigo.ads.api.b.g) aVar, true);
            if (bVarR instanceof sg.bigo.ads.api.b.c) {
                mapA.put("scene_page", String.valueOf(((sg.bigo.ads.api.b.c) bVarR).k()));
            }
            gVar = bVarR.f102124h;
        } else {
            sg.bigo.ads.api.core.b bVarF = aVar.f();
            mapA = a(bVarF, (sg.bigo.ads.api.b.a) null, false);
            g gVarAa = bVarF.aa();
            if (bVarF instanceof n) {
                n nVar = (n) bVarF;
                mapA.put("material_type", nVar.aR() ? "2" : "1");
                mapA.put("media_type", nVar.aY());
                mapA.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
                if (nVar.w() == 2) {
                    mapA.put("fill_strategy", String.valueOf(nVar.bd()));
                    mapA.put("dl_status", String.valueOf(nVar.be()));
                    if (nVar.bd() == 2) {
                        mapA.put("backup_source", String.valueOf(!q.a((CharSequence) nVar.aT()) ? 1 : 0));
                    }
                    mapA.put("media_type", nVar.aY());
                }
                if (bVarF.am() != null) {
                    mapA.put("ad_resp_num", String.valueOf(bVarF.am().size() + 1));
                }
                a(bVarF, mapA);
            }
            a(mapA, bVarF);
            b(mapA, bVarF);
            gVar = gVarAa;
        }
        long jO = gVar.o() - gVar.n();
        long jO2 = gVar.o() - gVar.k();
        mapA.put("rslt", "0");
        mapA.put("cost", String.valueOf(jO));
        mapA.put("cost_total", String.valueOf(jO2));
        mapA.put("e_code", String.valueOf(i10));
        mapA.put("s_code", String.valueOf(i11));
        mapA.put("error", str);
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        p pVarP = aVar.P();
        if (pVarP != null) {
            mapA.put("encrypt", pVarP.f102213a ? "1" : "0");
            mapA.put("req_encrypt_enable", pVarP.f102214b ? "1" : "0");
            mapA.put("resp_decrypt_enable", String.valueOf(pVarP.f102215c));
            String str2 = pVarP.f102216d;
            if (!TextUtils.isEmpty(str2)) {
                mapA.put("enc_logid", str2);
            }
        }
        a("06002008", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.b.a aVar, String str, String str2, int i10) {
        Map<String, String> mapA;
        int iAC;
        if (aVar instanceof sg.bigo.ads.api.b.g) {
            mapA = a(aVar.R().h());
            a(mapA, (sg.bigo.ads.api.b.g) aVar, true);
            a(mapA, (sg.bigo.ads.api.core.b) null, str, str2, i10);
        } else {
            sg.bigo.ads.api.core.b bVarF = aVar.f();
            mapA = a(bVarF, (sg.bigo.ads.api.b.a) null, false);
            a(mapA, bVarF, str, str2, i10);
            if ((bVarF instanceof n) && (iAC = ((n) bVarF).aC()) != 0) {
                mapA.put("show_method", String.valueOf(iAC));
            }
        }
        a("06002029", mapA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.api.b.a aVar, boolean z10) {
        Map<String, String> mapA;
        g gVar;
        if (aVar instanceof sg.bigo.ads.api.b.g) {
            sg.bigo.ads.api.b bVarR = aVar.R();
            mapA = a(bVarR.h());
            a(mapA, (sg.bigo.ads.api.b.g) aVar, true);
            if (bVarR instanceof sg.bigo.ads.api.b.c) {
                mapA.put("scene_page", String.valueOf(((sg.bigo.ads.api.b.c) bVarR).k()));
            }
            gVar = bVarR.f102124h;
        } else {
            sg.bigo.ads.api.core.b bVarF = aVar.f();
            mapA = a(bVarF, (sg.bigo.ads.api.b.a) null, false);
            g gVarAa = bVarF.aa();
            if (bVarF instanceof n) {
                n nVar = (n) bVarF;
                mapA.put("material_type", nVar.aR() ? "2" : "1");
                mapA.put("media_type", nVar.aY());
                mapA.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
                if (nVar.w() == 2) {
                    mapA.put("fill_strategy", String.valueOf(nVar.bd()));
                    mapA.put("dl_status", String.valueOf(nVar.be()));
                    if (nVar.bd() == 2) {
                        mapA.put("backup_source", String.valueOf(!q.a((CharSequence) nVar.aT()) ? 1 : 0));
                        mapA.put("backup_dl_status", String.valueOf(nVar.bg()));
                    }
                    mapA.put("media_type", nVar.aY());
                }
                if (bVarF.am() != null) {
                    mapA.put("ad_resp_num", String.valueOf(bVarF.am().size() + 1));
                }
                a(bVarF, mapA);
            }
            a(mapA, bVarF);
            b(mapA, bVarF);
            gVar = gVarAa;
        }
        long jO = gVar.o() - gVar.n();
        long jO2 = gVar.o() - gVar.k();
        mapA.put("rslt", "1");
        mapA.put("cost", String.valueOf(jO));
        mapA.put("cost_total", String.valueOf(jO2));
        mapA.put("is_cache", z10 ? "1" : "0");
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        p pVarP = aVar.P();
        if (pVarP != null) {
            mapA.put("encrypt", pVarP.f102213a ? "1" : "0");
            mapA.put("req_encrypt_enable", pVarP.f102214b ? "1" : "0");
            mapA.put("resp_decrypt_enable", String.valueOf(pVarP.f102215c));
            String str = pVarP.f102216d;
            if (!TextUtils.isEmpty(str)) {
                mapA.put("enc_logid", str);
            }
        }
        o oVarB_ = aVar.b_();
        t tVar = oVarB_ != null ? oVarB_.f102212a : null;
        if (tVar != null) {
            mapA.put("is_vpaid", "1");
            mapA.put("vpaid_version", String.valueOf(tVar.f102225a));
            mapA.put("vpaid_version_cost", String.valueOf(tVar.f102226b));
            mapA.put("vpaid_init_cost", String.valueOf(tVar.f102227c));
        }
        a("06002008", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.b.h hVar, @Nullable h.a aVar, long j10, int i10, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.api.b.a aVar2, String str) {
        Map<String, String> mapA = a(bVar, hVar);
        if (aVar != null) {
            mapA.put("status", String.valueOf(aVar.a()));
            mapA.put("cost", String.valueOf(aVar.b()));
        }
        mapA.put("duration", String.valueOf(j10));
        mapA.put("num", String.valueOf(i10));
        mapA.put("out_ad", String.valueOf(aVar2 == null ? sg.bigo.ads.common.v.a.f102845a : aVar2.Q()));
        if (!TextUtils.isEmpty(str)) {
            mapA.put("task_affinity", str);
        }
        a(mapA, aVar2, false);
        a("06002062", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.b.h hVar, @NonNull h.a aVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.api.b.a aVar2, String str) {
        Map<String, String> mapA = a(bVar, hVar);
        mapA.put("status", String.valueOf(aVar.a()));
        mapA.put("cost", String.valueOf(aVar.b()));
        mapA.put("out_ad", String.valueOf(aVar2 == null ? sg.bigo.ads.common.v.a.f102845a : aVar2.Q()));
        if (!TextUtils.isEmpty(str)) {
            mapA.put("task_affinity", str);
        }
        a(mapA, aVar2, false);
        a("06002061", mapA);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar) {
        a("06002047", a(bVar, (sg.bigo.ads.api.b.a) null, false));
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i10) {
        HashMap map = new HashMap();
        if (bVar != null) {
            map.put("host_slot", bVar.b());
            map.put("host_placement", bVar.c());
            map.put("host_sid", String.valueOf(bVar.y()));
            map.put("host_ad_id", bVar.r());
        }
        map.put("show_icon_invoke", "1");
        map.put("scene_page", String.valueOf(i10));
        c.a().a("06002069", map);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("page_style", String.valueOf(i10));
        mapA.put("page_source", String.valueOf(i11));
        if (bVar instanceof n) {
            a(bVar, mapA);
            b(bVar, mapA);
            c(bVar, mapA);
        }
        a("06002041", mapA);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("multi_scene", String.valueOf(i10));
        map.put("action", String.valueOf(i11));
        map.put("multi_num", String.valueOf(i12));
        map.put("multi_status_loading_num", String.valueOf(i13));
        map.put("multi_status_success_num", String.valueOf(i14));
        map.put("multi_status_failed_num", String.valueOf(i15));
        a("06002058", (Map<String, String>) map);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i10, int i11, long j10) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("page_type", String.valueOf(i10));
        map.put("action", String.valueOf(i11));
        map.put("cost", String.valueOf(j10));
        a("06002056", (Map<String, String>) map);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i10, int i11, long j10, long j11) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("page_type", String.valueOf(i10));
        map.put("action", String.valueOf(i11));
        map.put("cost1", String.valueOf(j10));
        map.put("cost2", String.valueOf(j11));
        a("06002055", (Map<String, String>) map);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i10, int i11, String str) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("e_code", String.valueOf(i10));
        map.put("s_code", String.valueOf(i11));
        map.put("error", str);
        a("06002035", (Map<String, String>) map);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i10, int i11, String str, int i12, int i13, boolean z10) {
        HashMap map = new HashMap();
        if (bVar != null) {
            map.put("host_slot", bVar.b());
            map.put("host_placement", bVar.c());
            map.put("host_sid", String.valueOf(bVar.y()));
            map.put("host_ad_id", bVar.r());
        }
        map.put("icon_show_rslt", "1");
        map.put("scene_page", String.valueOf(i10));
        map.put("icon_fill_num", String.valueOf(i11));
        map.put("icon_show_num", String.valueOf(i12));
        map.put("icon_slot", String.valueOf(str));
        map.put("icon_style", String.valueOf(i13));
        map.put("word_icon_style", String.valueOf(z10));
        c.a().a("06002069", map);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i10, int i11, String str, long j10, boolean z10, int i12, String str2) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("render_method", String.valueOf(i10));
        map.put("rslt", String.valueOf(i11));
        map.put("cost", String.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            map.put("material_id", str);
        }
        if (z10) {
            map.put("e_code", String.valueOf(i12));
            map.put("error", String.valueOf(str2));
        }
        a("06002050", (Map<String, String>) map);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, long j10) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("rslt", "1");
        mapA.put("wrap", String.valueOf(i10));
        mapA.put("cost", String.valueOf(j10));
        if (bVar instanceof n) {
            n nVar = (n) bVar;
            mapA.put("video_duration", String.valueOf(nVar.aU()));
            mapA.put("video_type", nVar.aY());
            mapA.put("has_video", String.valueOf(nVar.ay() != null ? 1 : 0));
            mapA.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
        }
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        a(bVar, mapA);
        a("06002016", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, long j10, long j11, @NonNull sg.bigo.ads.api.b.a aVar) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("close_source", String.valueOf(i10));
        mapA.put("duration", String.valueOf(j10));
        mapA.put("ad_front_duration", String.valueOf(j11));
        mapA.put("close_type", "0");
        mapA.put("out_ad", String.valueOf(aVar.Q()));
        a(mapA, aVar, false);
        a("06002023", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, long j10, @Nullable String str, int i11, @Nullable String str2, @Nullable String str3) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("slot", String.valueOf(bVar.b()));
        mapA.put("rslt", String.valueOf(i10));
        mapA.put("cost", String.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            mapA.put("url", str);
        }
        if (i11 > 0) {
            mapA.put("cnt", String.valueOf(i11));
        }
        if (!TextUtils.isEmpty(str2)) {
            mapA.put("material_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            mapA.put("error", str3);
        }
        if (bVar instanceof n) {
            n nVar = (n) bVar;
            mapA.put("companion_type", f104017a[nVar.aG() ? 1 : 0][nVar.aF() ? 1 : 0]);
            if (nVar.bd() == 2) {
                mapA.put("backup_source", String.valueOf(!q.a((CharSequence) nVar.aT()) ? 1 : 0));
            }
        }
        a("06002042", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, @Nullable Double d10, @Nullable String str) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("auc_mode", String.valueOf(i10));
        mapA.put("bid_rslt", "1");
        if (d10 != null) {
            mapA.put("sec_price", String.valueOf(d10));
        }
        if (str != null) {
            mapA.put("sec_bidder", str);
        }
        a("06002045", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, @Nullable Double d10, @Nullable String str, int i11) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("auc_mode", String.valueOf(i10));
        mapA.put("bid_rslt", "0");
        if (d10 != null) {
            mapA.put("first_price", String.valueOf(d10));
        }
        if (str != null) {
            mapA.put("first_bidder", str);
        }
        mapA.put("loss_reason", String.valueOf(i11));
        a("06002045", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, String str, int i11) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("video_stat", String.valueOf(i10));
        mapA.put("video_url", str);
        mapA.put("path_t", String.valueOf(i11));
        if (bVar instanceof n) {
            n nVar = (n) bVar;
            mapA.put("video_duration", String.valueOf(nVar.aU()));
            m mVarAV = nVar.aV();
            if (mVarAV != null) {
                mapA.put("video_actual_duration", String.valueOf(mVarAV.f102209c));
            }
            a(bVar, mapA);
            b(bVar, mapA);
            c(bVar, mapA);
        }
        a("06002017", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, String str, long j10, int i11, String str2) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("rslt", "0");
        mapA.put("wrap", String.valueOf(i10));
        mapA.put("wrap_url", str);
        mapA.put("cost", String.valueOf(j10));
        mapA.put("e_code", String.valueOf(i11));
        mapA.put("error", String.valueOf(str2));
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        a(bVar, mapA);
        a("06002016", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i10, @NonNull sg.bigo.ads.api.core.d dVar, @Nullable sg.bigo.ads.api.b.a aVar) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("open_way_gp", String.valueOf(i10));
        mapA.put("open_rslt_gp", String.valueOf(dVar.f102158b));
        mapA.put("deep_rslt", String.valueOf(dVar.f102159c));
        mapA.put("webview_layout", String.valueOf(dVar.f102164h));
        mapA.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, dVar.f102165i);
        int i11 = dVar.f102160d;
        if (i11 >= 0) {
            mapA.put("open_gp_inline", String.valueOf(i11));
        }
        if (!q.a((CharSequence) dVar.f102166j)) {
            mapA.put("pkg_name", dVar.f102166j);
        }
        mapA.put("out_ad", String.valueOf(aVar == null ? sg.bigo.ads.common.v.a.f102845a : aVar.Q()));
        a(mapA, aVar, false);
        a("06002034", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("ad_destroy_duration", String.valueOf(j10));
        a("06002065", mapA);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i10, int i11) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("rslt", String.valueOf(str));
        map.put("render_method", String.valueOf(i10));
        map.put("reason", String.valueOf(i11));
        a("06002049", (Map<String, String>) map);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i10, int i11, String str2, int i12) {
        HashMap map = new HashMap();
        if (bVar != null) {
            map.put("host_slot", bVar.b());
            map.put("host_placement", bVar.c());
            map.put("host_sid", String.valueOf(bVar.y()));
            map.put("host_ad_id", bVar.r());
        }
        map.put("icon_show_rslt", "0");
        map.put("icon_show_error", str);
        map.put("scene_page", String.valueOf(i10));
        map.put("icon_fill_num", String.valueOf(i11));
        map.put("icon_slot", String.valueOf(str2));
        map.put("icon_style", String.valueOf(i12));
        c.a().a("06002069", map);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i10, long j10, int i11) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("rslt", "1");
        map.put("video_url", str);
        map.put("retry", String.valueOf(i11));
        map.put("media_player_status", String.valueOf(i10));
        map.put("cost", String.valueOf(j10));
        a("06002054", (Map<String, String>) map);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, int i10, long j10, long j11, int i11, int i12, String str2, boolean z10) {
        m mVarAV;
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("rslt", "1");
        mapA.put("url", str);
        mapA.put("source", String.valueOf(i10));
        mapA.put("cost", String.valueOf(j10));
        mapA.put("size", String.valueOf(j11));
        mapA.put("dl_opt", String.valueOf(i11));
        mapA.put("material_type", String.valueOf(i12));
        if ((bVar instanceof n) && (mVarAV = ((n) bVar).aV()) != null) {
            mapA.put("creative_size", q.a("%1$d*%2$d", Integer.valueOf(mVarAV.f102207a), Integer.valueOf(mVarAV.f102208b)));
        }
        mapA.put("media_type", str2);
        mapA.put("from_breakpoint", z10 ? "1" : "0");
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        a(bVar, mapA);
        a("06002018", mapA);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i10, String str2, int i11) {
        Map map = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.api.b.a) null, false);
        map.put("rslt", "0");
        map.put("video_url", str);
        map.put("retry", String.valueOf(i11));
        map.put("media_player_status", String.valueOf(i10));
        map.put("error", str2);
        a("06002054", (Map<String, String>) map);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, long j10, int i10, @Nullable Map<String, String> map) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("action", str);
        mapA.put("cost", String.valueOf(j10));
        mapA.put("rslt", String.valueOf(i10));
        if (map != null) {
            mapA.putAll(map);
        }
        a("06002025", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, int i10) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        a(mapA, bVar, str, str2, i10);
        a("06002043", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, long j10, long j11, int i10, String str3, boolean z10) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("rslt", "0");
        mapA.put("url", str);
        mapA.put("error", str2);
        mapA.put("cost", String.valueOf(j10));
        mapA.put("size", String.valueOf(j11));
        mapA.put("material_type", String.valueOf(i10));
        mapA.put("media_type", str3);
        mapA.put("from_breakpoint", z10 ? "1" : "0");
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        a(bVar, mapA);
        a("06002018", mapA);
    }

    private static void a(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int iBm;
        if (!(bVar instanceof n) || map == null || (iBm = ((n) bVar).bm()) <= 0) {
            return;
        }
        map.put("ad_resp_indx", String.valueOf(iBm));
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, @Nullable AdError adError) {
        a(bVar, adError, true, true);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, @Nullable AdError adError, boolean z10, boolean z11) {
        if (bVar == null || adError == null) {
            return;
        }
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(adError.getCode());
        mapA.put("e_code", sb2.toString());
        mapA.put("s_code", String.valueOf(adError.getSubCode()));
        if (adError.getCode() == 2000) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bVar.K());
            mapA.put("duration_expired", sb3.toString());
        }
        mapA.put("error", adError.getMessage());
        mapA.put("ad_impl", z10 ? "1" : "0");
        mapA.put("fail_to_show", z11 ? "1" : "0");
        if ((bVar instanceof n) && bVar.w() == 2) {
            mapA.put("dl_status", String.valueOf(((n) bVar).be()));
        }
        a("06002048", mapA);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.api.b.a aVar) {
        Map<String, String> mapA = a(bVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("out_ad", String.valueOf(aVar.Q()));
        a(mapA, aVar, false);
        a("06002022", mapA);
    }

    public static void a(sg.bigo.ads.api.core.h hVar, long j10, long j11, long j12, long j13, long j14) {
        Map<String, String> mapA = a((sg.bigo.ads.api.core.b) hVar, (sg.bigo.ads.api.b.a) null, false);
        mapA.put("by_js", String.valueOf(j10));
        mapA.put("by_js_cost", String.valueOf(j11));
        mapA.put("by_bit", String.valueOf(j12));
        mapA.put("by_bit_cost", String.valueOf(j13));
        mapA.put("by_bit_run_cost", String.valueOf(j14));
        if (j10 > 0 && j11 >= 0 && j12 > 0 && j13 >= 0) {
            j11 = Math.min(j11, j13);
        } else if (j10 <= 0 || j11 < 0) {
            j11 = (j12 <= 0 || j13 < 0) ? -1L : j13;
        }
        mapA.put("cost", String.valueOf(j11));
        a("06002040", mapA);
    }

    public static void a(sg.bigo.ads.common.g gVar) {
        String string;
        if (gVar == null || sg.bigo.ads.common.x.a.q()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("gg_service_ver", gVar.H());
            jSONObject.putOpt("webkit_ver", gVar.I());
            jSONObject.putOpt("cpu_core_num", Integer.valueOf(gVar.J()));
            jSONObject.putOpt("cpu_clock_speed", Long.valueOf(gVar.K()));
            jSONObject.putOpt("total_memory", Long.valueOf(gVar.L()));
            jSONObject.putOpt("free_memory", Long.valueOf(gVar.M()));
            jSONObject.putOpt("rom_free_in", Long.valueOf(gVar.N()));
            jSONObject.putOpt("rom_free_ext", Long.valueOf(gVar.O()));
            jSONObject.putOpt(N6.f41390i0, Float.valueOf(gVar.aj()));
            jSONObject.putOpt("note", Integer.valueOf(gVar.ak()));
            jSONObject.putOpt("font", Float.valueOf(gVar.al()));
            jSONObject.putOpt("scale", Integer.valueOf(gVar.am()));
            jSONObject.putOpt("theme", Integer.valueOf(gVar.an()));
            jSONObject.putOpt("gg_service", Integer.valueOf(gVar.ao() ? 1 : 0));
            jSONObject.putOpt("tsdk", String.valueOf(gVar.ap()));
            jSONObject.putOpt("msdk", String.valueOf(gVar.aq()));
            jSONObject.putOpt("apks", Long.valueOf(gVar.ar()));
            jSONObject.putOpt("unity", Integer.valueOf(gVar.as() ? 1 : 0));
            jSONObject.putOpt("ace", Integer.valueOf(gVar.at() ? 1 : 0));
            jSONObject.putOpt("exo", Integer.valueOf(gVar.au() ? 1 : 0));
            string = jSONObject.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (string == null) {
            return;
        }
        String strA = sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
        HashMap map = new HashMap();
        map.put("data", strA);
        a("06002068", map);
    }

    private static void a(d dVar) {
        Map<String, String> map = dVar.f104039a;
        if (q.a((CharSequence) map.get("session_id"))) {
            map.put("session_id", UUID.randomUUID().toString());
        }
        c.a().a(dVar.f104040b, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.api.core.b[] bVarArr, @NonNull sg.bigo.ads.api.b bVar, boolean z10, int i10, int i11, int i12, boolean z11, int i13, String str) {
        Map<String, String> mapA;
        int size = 1;
        if (bVar.e()) {
            mapA = a(bVar.h());
            sg.bigo.ads.api.core.b bVar2 = (sg.bigo.ads.api.core.b) k.b(bVarArr);
            mapA.put("dsp", bVar2.v());
            mapA.put("sid", String.valueOf(bVar2.y()));
            mapA.put("adx_type", String.valueOf(bVar2.w()));
            mapA.put("icon_fill_num", String.valueOf(bVarArr.length));
        } else {
            sg.bigo.ads.api.core.b bVar3 = (sg.bigo.ads.api.core.b) k.b(bVarArr);
            int i14 = 0;
            mapA = a(bVar3, (sg.bigo.ads.api.b.a) null, false);
            if ((bVar3 instanceof n) && bVar3.w() == 2) {
                n nVar = (n) bVar3;
                if (nVar.aB() != null && nVar.aB().b()) {
                    i14 = 1;
                }
                mapA.put("video_type", String.valueOf(i14));
            }
            a(mapA, bVar3);
            List<sg.bigo.ads.api.core.b> listAm = bVar3.am();
            if (listAm != null && listAm.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (sg.bigo.ads.api.core.b bVar4 : listAm) {
                    if (bVar4 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("ad_id", bVar4.r());
                            jSONObject.putOpt("creative_id", bVar4.z());
                            jSONArray.put(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }
                size = 1 + listAm.size();
                mapA.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
            }
        }
        if (bVar instanceof sg.bigo.ads.api.b.b) {
            a(mapA, (sg.bigo.ads.api.b.b) bVar);
        }
        mapA.put("ad_resp_num", String.valueOf(size));
        mapA.put("rslt", "1");
        mapA.put("banner_type", String.valueOf(bVar.f102119c));
        String str2 = bVar.f102124h.f102125a;
        if (!q.a((CharSequence) str2)) {
            mapA.put("load_ext", str2);
        }
        b.a aVar = bVar.f102124h;
        mapA.put("cost", String.valueOf(Math.max(0L, aVar.n() - aVar.k())));
        mapA.put("is_playable", z10 ? "1" : "0");
        mapA.put("req_type", String.valueOf(i10));
        mapA.put("cur_req_status", String.valueOf(i11));
        mapA.put("cur_in_fg", String.valueOf(sg.bigo.ads.common.f.b.c()));
        mapA.remove("cache_ad");
        mapA.remove("cache_ad_source");
        mapA.remove("cache_req_status");
        mapA.remove("session_id2");
        mapA.put("encrypt", String.valueOf(i12));
        mapA.put("req_encrypt_enable", z11 ? "1" : "0");
        mapA.put("resp_decrypt_enable", String.valueOf(i13));
        if (!TextUtils.isEmpty(str)) {
            mapA.put("enc_logid", str);
        }
        a("06002007", mapA);
    }
}
