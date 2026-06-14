package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0178a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10143a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f10147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f10148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f10149g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10145c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f10146d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f10144b = c();

    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f10150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f10151b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        class C0177a implements f {
            C0177a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f10150a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f10150a = onCompletedListener;
            this.f10151b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f10150a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f10151b, new C0177a());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f10154a;

        b(Activity activity) {
            this.f10154a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f10144b.b(this.f10154a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f10156a;

        c(Activity activity) {
            this.f10156a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f10144b.a(this.f10156a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    private enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f10143a = kVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f10143a);
        }
        if (!this.f10143a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f10144b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f10144b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0178a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0178a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f10145c) {
            try {
                if (this.f10148f == null) {
                    this.f10146d = d.COMPLETED;
                    this.f10147e = cmpErrorImpl;
                } else {
                    this.f10146d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0178a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f10145c) {
            try {
                if (this.f10148f == null) {
                    this.f10146d = d.COMPLETED;
                } else {
                    this.f10146d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0178a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f10149g = fVar;
        if (this.f10144b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f10143a.O();
        if (o.a()) {
            this.f10143a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f10143a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f10148f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f10148f = null;
        this.f10147e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f10149g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f10149g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f10144b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z10;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f10145c) {
            if (eVar != null) {
                try {
                    this.f10148f = eVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d dVar = this.f10146d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f10146d = d.LOADING;
                z10 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f10146d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f10147e);
                return;
            }
            c cVar = new c(activity);
            if (this.f10144b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f10143a.x().d());
    }
}
