package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.n2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f8295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f8296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f8297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f8298d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Messenger f8299e;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    class C0167a implements AppLovinAdLoadListener {
        C0167a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f8297c.get();
            if (appLovinFullscreenActivity != null) {
                o unused = a.this.f8296b;
                if (o.a()) {
                    a.this.f8296b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                w1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f8295a, appLovinFullscreenActivity, new C0168a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            o unused2 = a.this.f8296b;
            if (o.a()) {
                a.this.f8296b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a.this.a("failed_to_receive_ad");
        }

        /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        class C0168a implements w1.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f8301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f8302b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f8303c;

            C0168a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f8301a = appLovinFullscreenActivity;
                this.f8302b = appLovinAd;
                this.f8303c = bVar;
            }

            @Override // com.applovin.impl.w1.g
            public void a(w1 w1Var) {
                this.f8301a.setPresenter(w1Var);
                w1Var.w();
            }

            @Override // com.applovin.impl.w1.g
            public void a(String str, Throwable th2) {
                n2.a((com.applovin.impl.sdk.ad.b) this.f8302b, this.f8303c, str, th2, this.f8301a);
                Map mapA = f2.a((AppLovinAdImpl) this.f8302b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapA);
                a.this.f8295a.g().d(d2.F, mapA);
            }
        }
    }

    private class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        /* synthetic */ b(a aVar, C0167a c0167a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f8299e.send(messageObtain);
            } catch (RemoteException e10) {
                o unused = a.this.f8296b;
                if (o.a()) {
                    a.this.f8296b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e10);
                }
            }
        }
    }

    private static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f8306a;

        /* synthetic */ c(a aVar, C0167a c0167a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f8306a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f8306a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f8295a = kVar;
        this.f8296b = kVar.O();
        this.f8297c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f8298d.compareAndSet(false, true)) {
            if (o.a()) {
                this.f8296b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f8299e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (o.a()) {
                    this.f8296b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f8299e.send(messageObtain);
            } catch (RemoteException e10) {
                if (o.a()) {
                    this.f8296b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f8298d.compareAndSet(true, false) && o.a()) {
            this.f8296b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f8297c.get();
        if (appLovinFullscreenActivity != null) {
            if (o.a()) {
                this.f8296b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (o.a()) {
            this.f8296b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, Reporting.Key.ZONE_ID, "");
            if (!TextUtils.isEmpty(string)) {
                this.f8295a.q0().a(new e6(jSONObject, u.a(string), true, new C0167a(), this.f8295a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e10) {
            if (o.a()) {
                this.f8296b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a("failed_to_process_ad");
        }
    }
}
