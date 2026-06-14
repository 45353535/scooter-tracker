package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.pc;
import com.startapp.sdk.internal.vf;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ad f64015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences f64016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdEventListener f64017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AdPreferences.Placement f64018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb f64020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f64021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f64022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f64023j;

    public c(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4) {
        this.f64014a = context;
        this.f64015b = ad2;
        this.f64016c = adPreferences == null ? new AdPreferences() : adPreferences;
        this.f64017d = adEventListener;
        this.f64018e = placement;
        this.f64020g = lbVar;
        this.f64021h = lbVar2;
        this.f64022i = lbVar3;
        this.f64023j = lbVar4;
    }

    @Override // com.startapp.sdk.internal.b2
    public final void a() {
        try {
            ((Executor) this.f64021h.a()).execute(new Runnable() { // from class: com.startapp.sdk.adsbase.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64161b.d();
                }
            });
        } catch (Throwable th2) {
            a(false);
            g9.a(th2);
        }
    }

    public abstract boolean a(Object obj);

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(boolean z10) {
        d(z10);
        if (z10) {
            return;
        }
        Ad ad2 = this.f64015b;
        if (ad2 != null) {
            ad2.setErrorMessage(this.f64019f);
        }
        Context context = this.f64014a;
        AdEventListener adEventListener = this.f64017d;
        this.f64017d = null;
        a0.a(context, adEventListener, this.f64015b, false);
    }

    public final /* synthetic */ void d() {
        a(b());
    }

    public abstract Object e();

    public final boolean b() {
        try {
            return a(e());
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    public void d(boolean z10) {
        Ad ad2 = this.f64015b;
        if (ad2 != null) {
            ad2.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        }
    }

    public final void a(final boolean z10) {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.startapp.sdk.adsbase.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64129b.b(z10);
                }
            });
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.startapp.sdk.adsbase.model.a a(com.startapp.sdk.adsbase.model.a aVar) {
        Pair pairA;
        String string;
        Pair pair;
        Context context = this.f64014a;
        boolean zA = MetaData.E().W().a(context);
        boolean zG0 = MetaData.E().g0();
        boolean zP0 = MetaData.E().p0();
        synchronized (g.class) {
            try {
                SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                Pair pair2 = new Pair(simpleTokenUtils$TokenType, "");
                if (zA) {
                    try {
                        SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = g.f64058h;
                        if (simpleTokenUtils$TokenType2 == SimpleTokenUtils$TokenType.UNDEFINED) {
                            boolean z10 = g.f64056f;
                            if (g.f64057g && !z10) {
                                pairA = g.b(context);
                            } else {
                                pairA = g.a(context);
                            }
                            if (!zP0) {
                                z10 = !g.f64057g;
                            }
                            g.f64057g = z10;
                            if (zG0 || ((string = ((vf) com.startapp.sdk.components.a.a(context).G.a()).getString("shared_prefs_simple_token", "")) != null && !string.equals(pairA.second))) {
                                pair2 = pairA;
                            }
                        } else {
                            pair2 = simpleTokenUtils$TokenType2 == simpleTokenUtils$TokenType ? g.a(context) : g.b(context);
                        }
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                }
                pair = new Pair(((SimpleTokenUtils$TokenType) pair2.first).toString(), (String) pair2.second);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            aVar.a(this.f64014a, this.f64016c, this.f64018e, pair);
            aVar.g(this.f64014a);
            if (!AdsCommonMetaData.k().J() && h0.a(this.f64014a)) {
                aVar.f64100w0 = true;
            }
            try {
                aVar.a(this.f64014a, this.f64016c);
            } catch (Throwable th4) {
                g9.a(th4);
            }
            try {
                double dA = ((pc) this.f64023j.a()).a();
                if (dA >= 0.0d) {
                    Locale locale = Locale.ENGLISH;
                    long jRound = Math.round(dA * 100.0d);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jRound);
                    aVar.T0 = sb2.toString();
                }
            } catch (Throwable th5) {
                g9.a(th5);
            }
            return aVar;
        } catch (Throwable th6) {
            g9.a(th6);
            g.f64058h = SimpleTokenUtils$TokenType.a((String) pair.first);
            return null;
        }
    }

    public com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarA = a(new com.startapp.sdk.adsbase.model.a());
        if (aVarA != null) {
            aVarA.f(this.f64014a);
        }
        return aVarA;
    }
}
