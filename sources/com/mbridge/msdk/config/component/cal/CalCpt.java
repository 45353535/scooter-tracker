package com.mbridge.msdk.config.component.cal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class CalCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f46650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f46651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f46655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f46656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f46657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f46658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f46659q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put("result", z10 ? "1" : "2");
        if (!z10) {
            map.put("code", str);
            map.put("reason", str2);
        }
        a(a("910002", map));
    }

    private String h() {
        Map<String, Object> mapF = this.f46650h.f();
        this.f46652j = String.valueOf(mapF.get("userId"));
        this.f46653k = String.valueOf(mapF.get("cbType"));
        this.f46654l = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_NAME));
        this.f46655m = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_AMOUNT));
        this.f46656n = String.valueOf(mapF.get("unitId"));
        this.f46657o = String.valueOf(mapF.get("clickId"));
        this.f46658p = String.valueOf(mapF.get("extra"));
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f46642d.b("adModel")).b("host");
        StringBuilder sb2 = new StringBuilder();
        if (objB instanceof String) {
            sb2.append(objB);
            sb2.append("/addReward?");
            sb2.append("user_id=");
            sb2.append(this.f46652j);
            sb2.append("&cb_type=");
            sb2.append(this.f46653k);
            sb2.append("&reward_name=");
            sb2.append(this.f46654l);
            sb2.append("&reward_amount=");
            sb2.append(this.f46655m);
            sb2.append("&unit_id=");
            sb2.append(this.f46656n);
            sb2.append("&click_id=");
            sb2.append(this.f46657o);
            sb2.append("&extra=");
            sb2.append(this.f46658p);
        }
        return sb2.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f46650h.f();
        this.f46654l = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_NAME));
        this.f46655m = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_AMOUNT));
        RewardInfo rewardInfo = new RewardInfo(mapF.get("converted").equals("1"), 1);
        rewardInfo.setRewardName(this.f46654l);
        rewardInfo.setRewardAmount(this.f46655m);
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f46651i, rewardInfo);
        }
    }

    private void j() {
        if (this.f46659q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put("buyer_id", this.f46650h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f46659q).a(map);
        }
    }

    private void k() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f46651i);
        }
    }

    private void l() {
        if (this.f46659q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f46650h.g());
            map.put("ready_state", Boolean.valueOf(this.f46650h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f46659q).a(map);
        }
    }

    private void m() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f46651i, this.f46650h.c() == null ? "" : this.f46650h.c());
        }
    }

    private void n() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f46651i);
        }
    }

    private void o() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f46651i);
        }
    }

    private void p() {
        if (this.f46659q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put("init_status", Integer.valueOf(this.f46650h.d()));
            map.put("reason", this.f46650h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f46659q).a(map);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", "HTTP");
        map2.put("method", "GET");
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f46642d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f46651i, this.f46650h.c() == null ? "" : this.f46650h.c());
        }
    }

    private void s() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f46651i);
        }
    }

    private void t() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f46651i);
        }
    }

    private void u() {
        Object obj = this.f46659q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f46651i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "910001";
        this.f46650h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f46651i = mBridgeIds;
        mBridgeIds.setUnitId(this.f46650h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f46642d;
            if (aVar != null && aVar.a((Object) "sdk_context")) {
                Object objB = this.f46642d.b("sdk_context");
                if (objB instanceof Map) {
                    this.f46659q = ((Map) objB).get("callback");
                }
            }
            if (this.f46659q == null) {
                a(false, "", "Callback Listener is NULL");
            }
        } catch (Throwable th2) {
            q0.b("CallbackComponent", th2.getMessage(), th2);
        }
        g();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.cal.CalCpt.g():void");
    }
}
