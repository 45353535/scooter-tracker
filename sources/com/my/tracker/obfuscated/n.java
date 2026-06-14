package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.ironsource.C4257c4;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicBoolean f61706a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y2 f61707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f61708c;

    n(y2 y2Var, Context context) {
        this.f61707b = y2Var;
        this.f61708c = context.getApplicationContext();
    }

    public static n a(y2 y2Var, Context context) {
        return new n(y2Var, context);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            x2.a("AttributionHandler: referrer is empty");
            return;
        }
        if (a()) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
            if (TextUtils.isEmpty(queryParameter)) {
                x2.a("AttributionHandler: deeplink is empty");
            } else {
                a(new JSONObject().put(Constants.DEEPLINK, queryParameter));
            }
        } catch (Throwable th2) {
            x2.b("AttributionHandler error: handling referrer failed with error: ", th2);
        }
    }

    public void b(String str) {
        if (a()) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(C4257c4.f42799c);
            if (jSONObjectOptJSONObject == null) {
                x2.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            x2.a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th2) {
            x2.b("AttributionHandler error: handling server attribution failed with error: ", th2);
        }
    }

    boolean a() {
        if (this.f61706a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(p1.a(this.f61708c).h());
    }

    void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.DEEPLINK);
        if (TextUtils.isEmpty(strOptString)) {
            x2.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.f61706a.compareAndSet(false, true)) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        p1 p1VarA = p1.a(this.f61708c);
        if (!TextUtils.isEmpty(p1VarA.h())) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        p1VarA.i(jSONObject.toString());
        final MyTracker.AttributionListener attributionListenerD = this.f61707b.d();
        if (attributionListenerD == null) {
            return;
        }
        Handler handlerC = this.f61707b.c();
        if (handlerC == null) {
            handlerC = m.f61657a;
        }
        final MyTrackerAttribution myTrackerAttributionNewAttribution = MyTrackerAttribution.newAttribution(strOptString);
        try {
            handlerC.post(new Runnable() { // from class: com.my.tracker.obfuscated.p6
                @Override // java.lang.Runnable
                public final void run() {
                    n.a(attributionListenerD, myTrackerAttributionNewAttribution);
                }
            });
        } catch (Throwable th2) {
            x2.b("AttributionHandler error: exception occurred while post runnable", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            x2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }
}
