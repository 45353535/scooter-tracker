package com.ironsource;

import com.ironsource.Z7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4226a8 extends Z7.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42326b;

        a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42325a = str;
            this.f42326b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42325a, "onRewardedVideoAdLoadSuccess()");
            this.f42326b.onRewardedVideoAdLoadSuccess(this.f42325a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42330c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42328a = str;
            this.f42329b = ironSourceError;
            this.f42330c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42328a, "onRewardedVideoAdLoadFailed() error = " + this.f42329b.getErrorMessage());
            this.f42330c.onRewardedVideoAdLoadFailed(this.f42328a, this.f42329b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42333b;

        c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42332a = str;
            this.f42333b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42332a, "onRewardedVideoAdOpened()");
            this.f42333b.onRewardedVideoAdOpened(this.f42332a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42337c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42335a = str;
            this.f42336b = ironSourceError;
            this.f42337c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42335a, "onRewardedVideoAdShowFailed() error = " + this.f42336b.getErrorMessage());
            this.f42337c.onRewardedVideoAdShowFailed(this.f42335a, this.f42336b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42340b;

        e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42339a = str;
            this.f42340b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42339a, "onRewardedVideoAdClicked()");
            this.f42340b.onRewardedVideoAdClicked(this.f42339a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42343b;

        f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42342a = str;
            this.f42343b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42342a, "onRewardedVideoAdRewarded()");
            this.f42343b.onRewardedVideoAdRewarded(this.f42342a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f42346b;

        g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f42345a = str;
            this.f42346b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4226a8.this.a(this.f42345a, "onRewardedVideoAdClosed()");
            this.f42346b.onRewardedVideoAdClosed(this.f42345a);
        }
    }

    C4226a8(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new e(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new g(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new a(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new c(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new f(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    C4226a8() {
    }
}
