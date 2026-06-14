package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes10.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f48022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f48023b;

    public a getBaseViewData() {
        return this.f48022a;
    }

    public EAction geteAction() {
        return this.f48023b;
    }

    public void setBaseViewData(a aVar) {
        this.f48022a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f48023b = eAction;
    }
}
