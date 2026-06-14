package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4408l3;
import com.ironsource.AbstractC4425m3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4391k3<Smash extends AbstractC4408l3<?>, Listener extends AdapterAdInteractionListener> extends AbstractC4425m3<Smash, Listener> implements I0 {

    /* JADX INFO: renamed from: com.ironsource.k3$a */
    class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f43437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4283dd f43438c;

        a(Activity activity, C4283dd c4283dd) {
            this.f43437b = activity;
            this.f43438c = c4283dd;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4391k3.this.b(this.f43437b, this.f43438c);
        }
    }

    protected AbstractC4391k3(U u10, C4432ma c4432ma, C4246ba c4246ba) {
        super(u10, c4432ma, c4246ba);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, C4283dd c4283dd) {
        AbstractC4408l3 abstractC4408l3;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(b("state = " + this.f43657p));
        synchronized (this.f43665x) {
            try {
                this.f43650i = c4283dd;
                this.f43660s.f40515i.a(activity, n());
                AbstractC4425m3.f fVar = this.f43657p;
                AbstractC4425m3.f fVar2 = AbstractC4425m3.f.SHOWING;
                abstractC4408l3 = null;
                if (fVar == fVar2) {
                    ironSourceError = new IronSourceError(C4644z0.g(this.f43656o.b()), "can't show ad while an ad is already showing");
                } else if (fVar != AbstractC4425m3.f.READY_TO_SHOW) {
                    ironSourceError = new IronSourceError(509, "show called while no ads are available");
                } else if (c4283dd == null) {
                    ironSourceError = new IronSourceError(C4644z0.b(this.f43656o.b()), "empty default placement");
                } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4283dd, this.f43656o.b())) {
                    ironSourceError = new IronSourceError(C4644z0.f(this.f43656o.b()), "placement " + c4283dd.c() + " is capped");
                } else {
                    ironSourceError = null;
                }
                if (ironSourceError != null) {
                    IronLog.API.error(b(ironSourceError.getErrorMessage()));
                    a(ironSourceError, "");
                } else {
                    List listB = this.f43642a.b();
                    vg vgVar = new vg(this.f43656o);
                    abstractC4408l3 = (AbstractC4408l3) vgVar.c(listB);
                    a(abstractC4408l3, (List<AbstractC4408l3>) vgVar.b(listB));
                    if (abstractC4408l3 != null) {
                        a(fVar2);
                        i(abstractC4408l3);
                    } else {
                        a(ErrorBuilder.buildNoAdsToShowError(this.f43656o.b().toString()), a(listB));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC4408l3 != null) {
            a(activity, (AbstractC4408l3<?>) abstractC4408l3, this.f43650i);
        }
    }

    public void a(Activity activity, C4283dd c4283dd) {
        if (e()) {
            a(new a(activity, c4283dd));
        } else {
            b(activity, c4283dd);
        }
    }

    @Override // com.ironsource.I0
    public void c(AbstractC4408l3<?> abstractC4408l3) {
        IronLog.INTERNAL.verbose(b(abstractC4408l3.k()));
        this.f43661t.a();
    }

    @Override // com.ironsource.I0
    public void d(AbstractC4408l3<?> abstractC4408l3) {
        IronLog.INTERNAL.verbose(b(abstractC4408l3.k()));
        this.f43661t.b();
    }

    @Override // com.ironsource.I0
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f43657p == AbstractC4425m3.f.READY_TO_SHOW) {
            for (AbstractC4408l3 abstractC4408l3 : this.f43642a.b()) {
                if (abstractC4408l3.y()) {
                    sb2.append(abstractC4408l3.c());
                    sb2.append(";");
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.AbstractC4425m3
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.f43651j && !IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f43642a.b().iterator();
        while (it.hasNext()) {
            if (((AbstractC4408l3) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean v() {
        return false;
    }

    AbstractC4391k3(I7 i72, H7 h72, U u10, C4432ma c4432ma, C4246ba c4246ba) {
        super(i72, h72, u10, c4432ma, c4246ba);
    }

    private void a(@Nullable Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    private String a(List<Smash> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb2.append(smash.c());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(smash.e());
                sb2.append(StringUtils.COMMA);
            }
        }
        return sb2.toString();
    }

    private void a(Activity activity, AbstractC4408l3<?> abstractC4408l3, C4283dd c4283dd) {
        if (this.f43656o.h().e()) {
            this.f43659r.a();
        }
        abstractC4408l3.a(activity, c4283dd);
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (AbstractC4408l3<?>) null, str);
    }

    private void a(IronSourceError ironSourceError, AbstractC4408l3<?> abstractC4408l3, String str) {
        this.f43660s.f40515i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f43658q.g();
        this.f43661t.a(ironSourceError, abstractC4408l3 != null ? abstractC4408l3.f() : null);
        if (this.f43656o.h().e()) {
            b(false);
        }
    }

    @Override // com.ironsource.I0
    public void a(IronSourceError ironSourceError, AbstractC4408l3<?> abstractC4408l3) {
        IronLog.INTERNAL.verbose(b(abstractC4408l3.k() + " - error = " + ironSourceError));
        this.f43643b.put(abstractC4408l3.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(AbstractC4425m3.f.READY_TO_LOAD);
        a(ironSourceError, abstractC4408l3, "");
    }

    @Override // com.ironsource.I0
    public void a(AbstractC4408l3<?> abstractC4408l3) {
        IronLog.INTERNAL.verbose(b(abstractC4408l3.k()));
        if (this.f43657p == AbstractC4425m3.f.SHOWING) {
            a(AbstractC4425m3.f.READY_TO_LOAD);
        }
        this.f43658q.f();
        this.f43661t.a(abstractC4408l3.f());
    }

    @Override // com.ironsource.I0
    public void b(AbstractC4408l3<?> abstractC4408l3) {
        IronLog.INTERNAL.verbose(b(abstractC4408l3.k()));
        this.f43661t.g(abstractC4408l3.f());
    }
}
