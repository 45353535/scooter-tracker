package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f52830j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f52831i = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52833b;

        a(Object obj, String str) {
            this.f52832a = obj;
            this.f52833b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f52832a, this.f52833b);
        }
    }

    class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52836b;

        a0(Object obj, String str) {
            this.f52835a = obj;
            this.f52836b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewRect(this.f52835a, this.f52836b);
        }
    }

    class a1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52839b;

        a1(Object obj, String str) {
            this.f52838a = obj;
            this.f52839b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUpdateFrame(this.f52838a, this.f52839b);
        }
    }

    class a2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52842b;

        a2(Object obj, String str) {
            this.f52841a = obj;
            this.f52842b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f52841a, this.f52842b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52845b;

        b(Object obj, String str) {
            this.f52844a = obj;
            this.f52845b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f52844a, this.f52845b);
        }
    }

    class b0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52848b;

        b0(Object obj, String str) {
            this.f52847a = obj;
            this.f52848b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeFromSuperView(this.f52847a, this.f52848b);
        }
    }

    class b1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52851b;

        b1(Object obj, String str) {
            this.f52850a = obj;
            this.f52851b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerMute(this.f52850a, this.f52851b);
        }
    }

    class b2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52854b;

        b2(Object obj, String str) {
            this.f52853a = obj;
            this.f52854b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f52853a, this.f52854b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52857b;

        c(Object obj, String str) {
            this.f52856a = obj;
            this.f52857b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f52856a, this.f52857b);
        }
    }

    class c0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52860b;

        c0(Object obj, String str) {
            this.f52859a = obj;
            this.f52860b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendSubView(this.f52859a, this.f52860b);
        }
    }

    class c1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52863b;

        c1(Object obj, String str) {
            this.f52862a = obj;
            this.f52863b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f52862a, this.f52863b);
        }
    }

    class c2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52866b;

        c2(Object obj, String str) {
            this.f52865a = obj;
            this.f52866b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f52865a, this.f52866b);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52869b;

        d(Object obj, String str) {
            this.f52868a = obj;
            this.f52869b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f52868a, this.f52869b);
        }
    }

    class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52872b;

        d0(Object obj, String str) {
            this.f52871a = obj;
            this.f52872b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendViewTo(this.f52871a, this.f52872b);
        }
    }

    class d1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52875b;

        d1(Object obj, String str) {
            this.f52874a = obj;
            this.f52875b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUnmute(this.f52874a, this.f52875b);
        }
    }

    class d2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52878b;

        d2(Object obj, String str) {
            this.f52877a = obj;
            this.f52878b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f52877a, this.f52878b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52881b;

        e(Object obj, String str) {
            this.f52880a = obj;
            this.f52881b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f52880a, this.f52881b);
        }
    }

    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52884b;

        e0(Object obj, String str) {
            this.f52883a = obj;
            this.f52884b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendSubView(this.f52883a, this.f52884b);
        }
    }

    class e1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52887b;

        e1(Object obj, String str) {
            this.f52886a = obj;
            this.f52887b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerGetMuteState(this.f52886a, this.f52887b);
        }
    }

    class e2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52890b;

        e2(Object obj, String str) {
            this.f52889a = obj;
            this.f52890b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f52889a, this.f52890b);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52893b;

        f(Object obj, String str) {
            this.f52892a = obj;
            this.f52893b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f52892a, this.f52893b);
        }
    }

    class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52896b;

        f0(Object obj, String str) {
            this.f52895a = obj;
            this.f52896b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendViewTo(this.f52895a, this.f52896b);
        }
    }

    class f1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52899b;

        f1(Object obj, String str) {
            this.f52898a = obj;
            this.f52899b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetSource(this.f52898a, this.f52899b);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52902b;

        g(Object obj, String str) {
            this.f52901a = obj;
            this.f52902b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f52901a, this.f52902b);
        }
    }

    class g0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52905b;

        g0(Object obj, String str) {
            this.f52904a = obj;
            this.f52905b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f52904a, this.f52905b);
        }
    }

    class g1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52908b;

        g1(Object obj, String str) {
            this.f52907a = obj;
            this.f52908b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetRenderType(this.f52907a, this.f52908b);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52911b;

        h(Object obj, String str) {
            this.f52910a = obj;
            this.f52911b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f52910a, this.f52911b);
        }
    }

    class h0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52914b;

        h0(Object obj, String str) {
            this.f52913a = obj;
            this.f52914b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.bringViewToFront(this.f52913a, this.f52914b);
        }
    }

    class h1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52917b;

        h1(Object obj, String str) {
            this.f52916a = obj;
            this.f52917b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f52916a, this.f52917b);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52920b;

        i(Object obj, String str) {
            this.f52919a = obj;
            this.f52920b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f52919a, this.f52920b);
        }
    }

    class i0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52923b;

        i0(Object obj, String str) {
            this.f52922a = obj;
            this.f52923b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.hideView(this.f52922a, this.f52923b);
        }
    }

    class i1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52926b;

        i1(Object obj, String str) {
            this.f52925a = obj;
            this.f52926b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeAd(this.f52925a, this.f52926b);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52929b;

        j(Object obj, String str) {
            this.f52928a = obj;
            this.f52929b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f52928a, this.f52929b);
        }
    }

    class j0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52932b;

        j0(Object obj, String str) {
            this.f52931a = obj;
            this.f52932b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showView(this.f52931a, this.f52932b);
        }
    }

    class j1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52935b;

        j1(Object obj, String str) {
            this.f52934a = obj;
            this.f52935b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.broadcast(this.f52934a, this.f52935b);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52938b;

        k(Object obj, String str) {
            this.f52937a = obj;
            this.f52938b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f52937a, this.f52938b);
        }
    }

    class k0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52941b;

        k0(Object obj, String str) {
            this.f52940a = obj;
            this.f52941b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewBgColor(this.f52940a, this.f52941b);
        }
    }

    class k1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52944b;

        k1(Object obj, String str) {
            this.f52943a = obj;
            this.f52944b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f52943a, this.f52944b);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52947b;

        l(Object obj, String str) {
            this.f52946a = obj;
            this.f52947b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f52946a, this.f52947b);
        }
    }

    class l0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52950b;

        l0(Object obj, String str) {
            this.f52949a = obj;
            this.f52950b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewAlpha(this.f52949a, this.f52950b);
        }
    }

    class l1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52953b;

        l1(Object obj, String str) {
            this.f52952a = obj;
            this.f52953b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f52952a, this.f52953b);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52956b;

        m(Object obj, String str) {
            this.f52955a = obj;
            this.f52956b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f52955a, this.f52956b);
        }
    }

    class m0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52959b;

        m0(Object obj, String str) {
            this.f52958a = obj;
            this.f52959b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewScale(this.f52958a, this.f52959b);
        }
    }

    class m1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52962b;

        m1(Object obj, String str) {
            this.f52961a = obj;
            this.f52962b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewFireEvent(this.f52961a, this.f52962b);
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52965b;

        n(Object obj, String str) {
            this.f52964a = obj;
            this.f52965b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f52964a, this.f52965b);
        }
    }

    class n0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52968b;

        n0(Object obj, String str) {
            this.f52967a = obj;
            this.f52968b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewAbove(this.f52967a, this.f52968b);
        }
    }

    class n1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52971b;

        n1(Object obj, String str) {
            this.f52970a = obj;
            this.f52971b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f52970a, this.f52971b);
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52974b;

        o(Object obj, String str) {
            this.f52973a = obj;
            this.f52974b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f52973a, this.f52974b);
        }
    }

    class o0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52977b;

        o0(Object obj, String str) {
            this.f52976a = obj;
            this.f52977b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewBelow(this.f52976a, this.f52977b);
        }
    }

    class o1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52980b;

        o1(Object obj, String str) {
            this.f52979a = obj;
            this.f52980b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.increaseOfferFrequence(this.f52979a, this.f52980b);
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52983b;

        p(Object obj, String str) {
            this.f52982a = obj;
            this.f52983b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getFileInfo(this.f52982a, this.f52983b);
        }
    }

    class p0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52986b;

        p0(Object obj, String str) {
            this.f52985a = obj;
            this.f52986b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewAbove(this.f52985a, this.f52986b);
        }
    }

    class p1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52989b;

        p1(Object obj, String str) {
            this.f52988a = obj;
            this.f52989b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handleNativeObject(this.f52988a, this.f52989b);
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52992b;

        q(Object obj, String str) {
            this.f52991a = obj;
            this.f52992b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f52991a, this.f52992b);
        }
    }

    class q0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52995b;

        q0(Object obj, String str) {
            this.f52994a = obj;
            this.f52995b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewBelow(this.f52994a, this.f52995b);
        }
    }

    class q1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52998b;

        q1(Object obj, String str) {
            this.f52997a = obj;
            this.f52998b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadingResourceStatus(this.f52997a, this.f52998b);
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53001b;

        r(Object obj, String str) {
            this.f53000a = obj;
            this.f53001b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f53000a, this.f53001b);
        }
    }

    class r0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53004b;

        r0(Object obj, String str) {
            this.f53003a = obj;
            this.f53004b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f53003a, this.f53004b);
        }
    }

    class r1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53007b;

        r1(Object obj, String str) {
            this.f53006a = obj;
            this.f53007b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createNativeEC(this.f53006a, this.f53007b);
        }
    }

    class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53010b;

        s(Object obj, String str) {
            this.f53009a = obj;
            this.f53010b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f53009a, this.f53010b);
        }
    }

    class s0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53013b;

        s0(Object obj, String str) {
            this.f53012a = obj;
            this.f53013b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewLoad(this.f53012a, this.f53013b);
        }
    }

    class s1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53016b;

        s1(Object obj, String str) {
            this.f53015a = obj;
            this.f53016b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f53015a, this.f53016b);
        }
    }

    class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53019b;

        t(Object obj, String str) {
            this.f53018a = obj;
            this.f53019b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createWebview(this.f53018a, this.f53019b);
        }
    }

    class t0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53022b;

        t0(Object obj, String str) {
            this.f53021a = obj;
            this.f53022b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewReload(this.f53021a, this.f53022b);
        }
    }

    class t1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53025b;

        t1(Object obj, String str) {
            this.f53024a = obj;
            this.f53025b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f53024a, this.f53025b);
        }
    }

    class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53028b;

        u(Object obj, String str) {
            this.f53027a = obj;
            this.f53028b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createView(this.f53027a, this.f53028b);
        }
    }

    class u0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53031b;

        u0(Object obj, String str) {
            this.f53030a = obj;
            this.f53031b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoBack(this.f53030a, this.f53031b);
        }
    }

    class u1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53034b;

        u1(Object obj, String str) {
            this.f53033a = obj;
            this.f53034b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f53033a, this.f53034b);
        }
    }

    class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53037b;

        v(Object obj, String str) {
            this.f53036a = obj;
            this.f53037b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f53036a, this.f53037b);
        }
    }

    class v0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53040b;

        v0(Object obj, String str) {
            this.f53039a = obj;
            this.f53040b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoForward(this.f53039a, this.f53040b);
        }
    }

    class v1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53043b;

        v1(Object obj, String str) {
            this.f53042a = obj;
            this.f53043b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f53042a, this.f53043b);
        }
    }

    class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53046b;

        w(Object obj, String str) {
            this.f53045a = obj;
            this.f53046b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createPlayerView(this.f53045a, this.f53046b);
        }
    }

    class w0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53049b;

        w0(Object obj, String str) {
            this.f53048a = obj;
            this.f53049b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPlay(this.f53048a, this.f53049b);
        }
    }

    class w1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53052b;

        w1(Object obj, String str) {
            this.f53051a = obj;
            this.f53052b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f53051a, this.f53052b);
        }
    }

    class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53055b;

        x(Object obj, String str) {
            this.f53054a = obj;
            this.f53055b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createSubPlayTemplateView(this.f53054a, this.f53055b);
        }
    }

    class x0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53058b;

        x0(Object obj, String str) {
            this.f53057a = obj;
            this.f53058b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPause(this.f53057a, this.f53058b);
        }
    }

    class x1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53061b;

        x1(Object obj, String str) {
            this.f53060a = obj;
            this.f53061b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f53060a, this.f53061b);
        }
    }

    class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53064b;

        y(Object obj, String str) {
            this.f53063a = obj;
            this.f53064b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.destroyComponent(this.f53063a, this.f53064b);
        }
    }

    class y0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53067b;

        y0(Object obj, String str) {
            this.f53066a = obj;
            this.f53067b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerResume(this.f53066a, this.f53067b);
        }
    }

    class y1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53070b;

        y1(Object obj, String str) {
            this.f53069a = obj;
            this.f53070b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f53069a, this.f53070b);
        }
    }

    class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53073b;

        z(Object obj, String str) {
            this.f53072a = obj;
            this.f53073b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getComponentOptions(this.f53072a, this.f53073b);
        }
    }

    class z0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53076b;

        z0(Object obj, String str) {
            this.f53075a = obj;
            this.f53076b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerStop(this.f53075a, this.f53076b);
        }
    }

    class z1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53079b;

        z1(Object obj, String str) {
            this.f53078a = obj;
            this.f53079b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f53078a, this.f53079b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.f52831i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.f52831i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f52831i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.broadcast(obj, str);
        } else {
            this.f52831i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.f52831i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.click(obj, str);
        } else {
            this.f52831i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeAd(obj, str);
        } else {
            this.f52831i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f52831i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f52831i.post(new n(obj, str));
        com.mbridge.msdk.foundation.tools.q0.b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.f52831i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.f52831i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f52831i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createView(obj, str);
        } else {
            this.f52831i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createWebview(obj, str);
        } else {
            this.f52831i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.f52831i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.f52831i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.f52831i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f52831i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f52831i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCutout(obj, str);
        } else {
            this.f52831i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f52831i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.f52831i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f52831i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f52831i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f52831i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f52831i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f52831i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f52831i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.hideView(obj, str);
        } else {
            this.f52831i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f52831i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.init(obj, str);
        } else {
            this.f52831i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f52831i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f52831i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.f52831i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f52831i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadads(obj, str);
        } else {
            this.f52831i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f52831i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f52831i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f52831i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f52831i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f52831i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f52831i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f52831i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f52831i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f52831i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerMute(obj, str);
        } else {
            this.f52831i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPause(obj, str);
        } else {
            this.f52831i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.f52831i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerResume(obj, str);
        } else {
            this.f52831i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f52831i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.f52831i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerStop(obj, str);
        } else {
            this.f52831i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.f52831i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f52831i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f52831i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f52831i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.f52831i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f52831i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.q0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.f52831i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f52831i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f52831i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.f52831i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.f52831i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f52831i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f52831i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f52831i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f52831i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.f52831i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.f52831i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.f52831i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f52831i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f52831i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showView(obj, str);
        } else {
            this.f52831i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.f52831i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.statistics(obj, str);
        } else {
            this.f52831i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f52831i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f52831i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.f52831i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f52831i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f52831i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f52831i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.f52831i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.f52831i.post(new t0(obj, str));
        }
    }
}
