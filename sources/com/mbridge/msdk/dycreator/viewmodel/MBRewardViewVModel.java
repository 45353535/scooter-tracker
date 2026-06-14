package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewdata.a;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: loaded from: classes10.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f48167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f48168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f48169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f48170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f48171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DyOption f48172f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f48172f = dyOption;
        EventBus.getDefault().register(this);
    }

    private void a(Object obj) {
        c cVar = this.f48168b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f48167a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    private void c(Object obj) {
        f fVar = this.f48169c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    private void d(Object obj) {
        h hVar = this.f48170d;
        if (hVar != null) {
            hVar.a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f48168b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f48167a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f48171e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f48169c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f48172f);
        b(aVar);
        a(aVar);
        c(aVar);
        d(aVar);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f48170d = hVar;
        }
    }

    private void a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f48171e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
