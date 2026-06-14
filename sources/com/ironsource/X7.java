package com.ironsource;

import com.ironsource.Z7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public class X7 extends Z7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42040b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42039a = str;
            this.f42040b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42039a, "onInterstitialAdReady()");
            this.f42040b.onInterstitialAdReady(this.f42039a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42044c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42042a = str;
            this.f42043b = ironSourceError;
            this.f42044c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42042a, "onInterstitialAdLoadFailed() error = " + this.f42043b.getErrorMessage());
            this.f42044c.onInterstitialAdLoadFailed(this.f42042a, this.f42043b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42047b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42046a = str;
            this.f42047b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42046a, "onInterstitialAdOpened()");
            this.f42047b.onInterstitialAdOpened(this.f42046a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42051c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42049a = str;
            this.f42050b = ironSourceError;
            this.f42051c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42049a, "onInterstitialAdShowFailed() error = " + this.f42050b.getErrorMessage());
            this.f42051c.onInterstitialAdShowFailed(this.f42049a, this.f42050b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42054b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42053a = str;
            this.f42054b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42053a, "onInterstitialAdClicked()");
            this.f42054b.onInterstitialAdClicked(this.f42053a);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f42057b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f42056a = str;
            this.f42057b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            X7.this.a(this.f42056a, "onInterstitialAdClosed()");
            this.f42057b.onInterstitialAdClosed(this.f42056a);
        }
    }

    X7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new e(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new f(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new c(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new a(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    X7() {
    }
}
