package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.videocommon.setting.c f50338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50339e;

    public e(String str, String str2, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, String str3) {
        this.f50335a = str;
        this.f50336b = str2;
        this.f50337c = z10;
        this.f50338d = cVar;
        this.f50339e = str3;
    }

    public com.mbridge.msdk.foundation.same.net.wrapper.e a(boolean z10, String str, int i10, String str2, String str3, String str4, String str5, boolean z11, int i11) {
        int iE;
        int iB;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i12 = z10 ? 2 : 3;
        com.mbridge.msdk.videocommon.setting.c cVar = this.f50338d;
        if (cVar != null) {
            iE = cVar.e();
            iB = this.f50338d.b();
        } else {
            iE = 0;
            iB = 0;
        }
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f50336b, "reward");
        int i13 = this.f50337c ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f50336b);
        if (!TextUtils.isEmpty(this.f50335a)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f50335a);
        }
        if (com.mbridge.msdk.util.b.a()) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ttc_ids", str4 == null ? "" : str4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "install_ids", str3 == null ? "" : str3);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", String.valueOf(i12));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", String.valueOf(iE));
        if (this.f50337c) {
            iB = 1;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CSSFontFeatureSettings.FEATURE_TNUM, String.valueOf(iB));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f48760g, strA);
        String str6 = com.mbridge.msdk.foundation.same.net.wrapper.e.f48761h;
        if (str == null) {
            str = "";
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, str6, str);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        String str7 = com.mbridge.msdk.foundation.same.net.wrapper.e.f48762i;
        if (str2 == null) {
            str2 = "";
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, str7, str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", String.valueOf(i13));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", String.valueOf(i10));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "token", str5);
        }
        if (this.f50337c) {
            if (i11 == com.mbridge.msdk.foundation.same.a.I || i11 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "0");
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar2 = this.f50338d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "u_stid", this.f50338d.a());
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        if (aVarC != null && !TextUtils.isEmpty(aVarC.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "r_stid", aVarC.a());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "rw_plus", z11 ? "1" : "0");
        String strD = v0.d(this.f50336b);
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "j", strD);
        }
        String str8 = this.f50339e;
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str8 != null ? str8 : "");
        return eVar;
    }
}
