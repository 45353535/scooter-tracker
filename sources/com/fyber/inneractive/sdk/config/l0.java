package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f20419a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnitDisplayType f20420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f20422d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, ToolBar.REFRESH, this.f20419a);
        c1.a(jSONObject, "unitDisplayType", this.f20420b);
        c1.a(jSONObject, "close", this.f20421c);
        c1.a(jSONObject, "hideDelay", this.f20422d);
        return jSONObject;
    }
}
