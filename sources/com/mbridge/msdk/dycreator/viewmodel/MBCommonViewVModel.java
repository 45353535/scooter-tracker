package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: loaded from: classes10.dex */
public class MBCommonViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f48162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f48163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f48164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f48165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f48166e;

    public MBCommonViewVModel() {
        EventBus.getDefault().register(this);
    }

    private void a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f48166e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f48163b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f48162a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f48166e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f48164c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f48165d = hVar;
        }
    }
}
