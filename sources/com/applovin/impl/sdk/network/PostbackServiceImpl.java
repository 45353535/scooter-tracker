package com.applovin.impl.sdk.network;

import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.q5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10831a;

    public PostbackServiceImpl(k kVar) {
        this.f10831a = kVar;
    }

    private boolean a(e eVar) {
        Map mapI = eVar.i();
        if (mapI == null) {
            return false;
        }
        Object obj = mapI.get("event");
        if ("postinstall".equals(obj)) {
            obj = mapI.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f10831a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, d6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, d6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        q5 q5Var = new q5(eVar, bVar, this.f10831a, appLovinPostbackListener);
        q5Var.a(a(eVar));
        this.f10831a.q0().a((i5) q5Var, bVar);
    }
}
