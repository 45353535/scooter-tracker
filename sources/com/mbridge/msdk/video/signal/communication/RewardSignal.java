package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f52804i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f52805h = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52807b;

        a(Object obj, String str) {
            this.f52806a = obj;
            this.f52807b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f52806a, this.f52807b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52810b;

        b(Object obj, String str) {
            this.f52809a = obj;
            this.f52810b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f52809a, this.f52810b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52813b;

        c(Object obj, String str) {
            this.f52812a = obj;
            this.f52813b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f52812a, this.f52813b);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52816b;

        d(Object obj, String str) {
            this.f52815a = obj;
            this.f52816b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f52815a, this.f52816b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52819b;

        e(Object obj, String str) {
            this.f52818a = obj;
            this.f52819b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f52818a, this.f52819b);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52822b;

        f(Object obj, String str) {
            this.f52821a = obj;
            this.f52822b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f52821a, this.f52822b);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52825b;

        g(Object obj, String str) {
            this.f52824a = obj;
            this.f52825b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f52824a, this.f52825b);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52828b;

        h(Object obj, String str) {
            this.f52827a = obj;
            this.f52828b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f52827a, this.f52828b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (v0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f52805h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (v0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f52805h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (v0.h()) {
            super.install(obj, str);
        } else {
            this.f52805h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f52805h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f52805h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (v0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.f52805h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f52805h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f52805h.post(new e(obj, str));
        }
    }
}
