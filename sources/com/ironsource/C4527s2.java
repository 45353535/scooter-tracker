package com.ironsource;

import com.ironsource.Z7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4527s2 extends Z7.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: renamed from: com.ironsource.s2$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f44882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f44883c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f44881a = str;
            this.f44882b = ironSourceError;
            this.f44883c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4527s2.this.a(this.f44881a, "onBannerAdLoadFailed() error = " + this.f44882b.getErrorMessage());
            this.f44883c.onBannerAdLoadFailed(this.f44881a, this.f44882b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s2$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f44886b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f44885a = str;
            this.f44886b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4527s2.this.a(this.f44885a, "onBannerAdLoaded()");
            this.f44886b.onBannerAdLoaded(this.f44885a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s2$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f44889b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f44888a = str;
            this.f44889b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4527s2.this.a(this.f44888a, "onBannerAdShown()");
            this.f44889b.onBannerAdShown(this.f44888a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s2$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f44892b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f44891a = str;
            this.f44892b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4527s2.this.a(this.f44891a, "onBannerAdClicked()");
            this.f44892b.onBannerAdClicked(this.f44891a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s2$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f44895b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f44894a = str;
            this.f44895b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4527s2.this.a(this.f44894a, "onBannerAdLeftApplication()");
            this.f44895b.onBannerAdLeftApplication(this.f44894a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new e(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new b(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new c(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
