package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49473c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f49475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f49476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49477g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f49479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f49480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f49482l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49478h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f49474d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.f49471a = str;
        this.f49472b = str2;
        this.f49473c = str3;
    }

    public void b(boolean z10) {
        this.f49481k = z10;
    }

    public void b(int i10) {
        this.f49482l = i10;
    }

    class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(str, str2);
            this.f49483b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f49478h = false;
            b.this.f49476f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f49474d, b.this.f49472b, bidResponsedEx.getBidId(), this.f49483b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f49478h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f49474d, b.this.f49472b, str, this.f49483b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f49480j = j10;
    }

    public void a(int i10) {
        this.f49477g = i10;
    }

    public void a(long j10) {
        this.f49479i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f49478h) {
                this.f49478h = true;
                if (this.f49474d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f49474d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a("app_id", strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f49472b);
                if (TextUtils.isEmpty(this.f49471a)) {
                    this.f49471a = "";
                }
                eVar.a(Reporting.Key.PLACEMENT_ID, this.f49471a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f49473c);
                eVar.a(e.f48761h, v0.a(this.f49474d, this.f49472b));
                eVar.a(e.f48760g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f49472b, ""));
                String str = "1";
                eVar.a("req_type", this.f49481k ? "1" : "2");
                eVar.a("orientation", m0.F(this.f49474d) + "");
                int i10 = this.f49477g;
                if (i10 == 296) {
                    if (this.f49479i > 0 && this.f49480j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f49480j + "x" + this.f49479i);
                        try {
                            int i11 = BannerUtils.f49417a;
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f49472b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f49472b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f49479i > 0 && this.f49480j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f49480j + "x" + this.f49479i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f49482l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f49479i > 0 && this.f49480j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f49480j + "x" + this.f49479i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f49471a, this.f49472b, md5);
                aVar2.setUnitId(this.f49472b);
                aVar2.setPlacementId(this.f49471a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f49475e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f49475e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f49475e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
