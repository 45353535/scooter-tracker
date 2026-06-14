package com.ironsource;

import com.ironsource.U0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4461o3<Listener extends U0> extends AbstractC4408l3<Listener> implements AdapterAdRewardListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C4360i5 f44537r;

    /* JADX INFO: renamed from: com.ironsource.o3$a */
    class a extends AbstractRunnableC4232ae {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            C4461o3.this.U();
        }
    }

    public C4461o3(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C4237b1 c4237b1, C4424m2 c4424m2, Listener listener) {
        super(interfaceC4435md, c4405l0, baseAdAdapter, c4237b1, c4424m2, listener);
    }

    @Override // com.ironsource.AbstractC4408l3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f44537r = new C4360i5();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC4478p3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f44537r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public /* synthetic */ void onAdRewarded(Map map) {
        p4.c.a(this, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f44610g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g("mCurrentPlacement is null state = " + this.f44608e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f44607d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.r.m().r() != null) {
                for (String str : com.ironsource.mediationsdk.r.m().r().keySet()) {
                    map.put("custom_" + str, com.ironsource.mediationsdk.r.m().r().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f44607d.f40515i.a(j(), this.f44610g.f(), this.f44610g.e(), jCurrentTimeMillis, IronSourceUtils.a(jCurrentTimeMillis, c()), C4360i5.a(this.f44537r), map, com.ironsource.mediationsdk.r.m().l());
        }
        ((U0) this.f44605b).a((C4461o3<?>) this, this.f44610g);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().e()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
