package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.my.target.common.menu.MenuActionType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UnitDisplayType f20447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f20448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f20449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f20450d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int iOptInt = jSONObject.optInt(MenuActionType.HIDE, Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        bVar.f20447a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f20448b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        bVar.f20450d = numValueOf;
        bVar.f20449c = iOptInt2 != Integer.MIN_VALUE ? numValueOf2 : null;
        return bVar;
    }
}
