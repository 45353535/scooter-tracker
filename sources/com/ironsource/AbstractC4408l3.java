package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4478p3;
import com.ironsource.I0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4408l3<Listener extends I0> extends AbstractC4478p3<Listener> implements AdapterAdInteractionListener {

    /* JADX INFO: renamed from: com.ironsource.l3$a */
    class a extends AbstractRunnableC4232ae {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4408l3.this.P();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$b */
    class b extends AbstractRunnableC4232ae {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4408l3.this.S();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$c */
    class c extends AbstractRunnableC4232ae {
        c() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4408l3.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$d */
    class d extends AbstractRunnableC4232ae {
        d() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4408l3.this.T();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$e */
    class e extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f43536c;

        e(int i10, String str) {
            this.f43535b = i10;
            this.f43536c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4408l3.this.b(this.f43535b, this.f43536c);
        }
    }

    public AbstractC4408l3(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, ?> baseAdAdapter, C4237b1 c4237b1, C4424m2 c4424m2, Listener listener) {
        super(interfaceC4435md, c4405l0, baseAdAdapter, c4237b1, c4424m2, listener);
    }

    @Override // com.ironsource.AbstractC4478p3
    public boolean B() {
        Object obj;
        if (this.f44614k == null || !y()) {
            return false;
        }
        try {
            obj = this.f44606c;
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "isReadyToShow - exception = " + th2.getMessage() + " - state = " + this.f44608e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g(str);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f44614k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        D0 d03 = this.f44607d;
        if (d03 != null) {
            d03.f40516j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    public void a(Activity activity, C4283dd c4283dd) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + c4283dd.c()));
        try {
            this.f44610g = c4283dd;
            a(AbstractC4478p3.h.SHOWING);
            this.f44607d.f40515i.a(activity, j());
            Object obj = this.f44606c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f44614k, activity, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            a(AbstractC4478p3.h.FAILED);
            String str = "showAd - exception = " + th2.getMessage() + " - state = " + this.f44608e;
            IronLog.INTERNAL.error(a(str));
            D0 d03 = this.f44607d;
            if (d03 != null) {
                d03.f40516j.g(str);
            }
            onAdShowFailed(C4644z0.h(this.f44604a.a()), str);
        }
    }

    public void b(boolean z10) {
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.a(z10);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdClosed(Map map) {
        p4.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdEnded(Map map) {
        p4.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        if (u().e()) {
            u().a(new e(i10, str));
        } else {
            b(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdStarted(Map map) {
        p4.a.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdVisible(Map map) {
        p4.a.d(this, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f44620q) {
            try {
                if (this.f44608e != AbstractC4478p3.h.SHOWING) {
                    ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f44608e);
                    D0 d02 = this.f44607d;
                    if (d02 != null) {
                        d02.f40516j.l("unexpected ad closed - state = " + this.f44608e);
                    }
                    return;
                }
                a(AbstractC4478p3.h.NONE);
                if (this.f44607d != null) {
                    String string = "";
                    if (this.f44604a.a() == IronSource.a.REWARDED_VIDEO) {
                        String strF = ((I0) this.f44605b).f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("otherInstanceAvailable = ");
                        if (strF.length() > 0) {
                            str = "true|" + strF;
                        } else {
                            str = "false";
                        }
                        sb2.append(str);
                        string = sb2.toString();
                    }
                    this.f44607d.f40515i.a(j(), string);
                }
                ((I0) this.f44605b).a((AbstractC4408l3<?>) this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.d(j());
        }
        ((I0) this.f44605b).c(this);
    }

    private void R() {
        IronLog.INTERNAL.verbose(d());
        ((I0) this.f44605b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.i(j());
        }
        ((I0) this.f44605b).d((AbstractC4408l3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.k(j());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().e()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().e()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().e()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().e()) {
            u().a(new d());
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        AbstractC4478p3.h hVar = this.f44608e;
        if (hVar == AbstractC4478p3.h.SHOWING) {
            a(AbstractC4478p3.h.FAILED);
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40515i.a(j(), i10, str, "");
            }
            ((I0) this.f44605b).a(new IronSourceError(i10, str), (AbstractC4408l3<?>) this);
            return;
        }
        String strA = a(hVar, i10, str);
        ironLog.error(a(strA));
        D0 d03 = this.f44607d;
        if (d03 != null) {
            d03.f40516j.t(strA);
        }
    }

    static String a(AbstractC4478p3.h hVar, int i10, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i10), str);
    }
}
