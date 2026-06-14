package com.mbridge.msdk.dycreator.binding.base;

import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes10.dex */
public class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f48019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f48020b;

    public a getBaseViewData() {
        return this.f48019a;
    }

    public EAction geteAction() {
        return this.f48020b;
    }

    public void setBaseViewData(a aVar) {
        this.f48019a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f48020b = eAction;
    }
}
