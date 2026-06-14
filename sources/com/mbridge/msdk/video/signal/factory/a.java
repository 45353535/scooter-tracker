package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: loaded from: classes10.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f53098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f53099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f53100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected g f53101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected f f53102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i f53103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c f53104g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f53098a == null) {
            this.f53098a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f53098a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f53103f == null) {
            this.f53103f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f53103f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f53104g == null) {
            this.f53104g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f53104g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f53099b == null) {
            this.f53099b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f53099b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f53102e == null) {
            this.f53102e = new e();
        }
        return this.f53102e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f53101d == null) {
            this.f53101d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f53101d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f53100c == null) {
            this.f53100c = new h();
        }
        return this.f53100c;
    }
}
