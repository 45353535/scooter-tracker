package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4424m2;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.h6;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationRewardedAdAdapter;
import com.my.target.mediation.MyTargetRewardedAdAdapter;
import com.my.target.s2;
import com.my.target.z5;

/* JADX INFO: loaded from: classes11.dex */
public class f6 extends z5 implements s2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s2.a f59658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s2.b f59659l;

    public class a implements MediationRewardedAdAdapter.MediationRewardedAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5 f59660a;

        public a(y5 y5Var) {
            this.f59660a = y5Var;
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            f6 f6Var = f6.this;
            if (f6Var.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextG = f6Var.g();
            if (contextG != null) {
                bb.b(this.f59660a.h(), "click", 2, contextG);
            }
            f6.this.f59658k.c();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            f6 f6Var = f6.this;
            if (f6Var.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            f6Var.f59658k.f();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            f6 f6Var = f6.this;
            if (f6Var.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextG = f6Var.g();
            if (contextG != null) {
                bb.b(this.f59660a.h(), C4424m2.f43623v, 1, contextG);
            }
            f6.this.f59658k.g();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onFailedToShow(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            f6 f6Var = f6.this;
            if (f6Var.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            f6Var.f59658k.e();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (f6.this.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            gb.a("MediationRewardedAdEngine$AdapterListener: Data from " + this.f59660a.b() + " ad network loaded successfully");
            f6.this.a(this.f59660a, true);
            f6.this.f59658k.a();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (f6.this.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            gb.a("MediationRewardedAdEngine$AdapterListener: No data from " + this.f59660a.b() + " ad network - " + iAdLoadingError);
            f6.this.a(this.f59660a, false);
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            f6 f6Var = f6.this;
            if (f6Var.f61165d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextG = f6Var.g();
            if (contextG != null) {
                bb.b(this.f59660a.h(), "reward", -1, contextG);
            }
            s2.b bVarJ = f6.this.j();
            if (bVarJ != null) {
                bVarJ.a(reward);
            }
        }
    }

    public f6(x5 x5Var, j jVar, h6.a aVar, s2.a aVar2) {
        super(x5Var, jVar, aVar);
        this.f59658k = aVar2;
    }

    @Override // com.my.target.s2
    public void destroy() {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter == null) {
            gb.b("MediationRewardedAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).destroy();
        } catch (Throwable th2) {
            gb.b("MediationRewardedAdEngine: Error - " + th2);
        }
        this.f61165d = null;
    }

    @Override // com.my.target.s2
    public void dismiss() {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter == null) {
            gb.b("MediationRewardedAdEngine: Error - can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).dismiss();
        } catch (Throwable th2) {
            gb.b("MediationRewardedAdEngine: Error - " + th2);
        }
    }

    @Override // com.my.target.z5
    public void e() {
        this.f59658k.a(m.f60116u);
    }

    @Override // com.my.target.z5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MediationRewardedAdAdapter f() {
        return new MyTargetRewardedAdAdapter();
    }

    public s2.b j() {
        return this.f59659l;
    }

    public static f6 a(x5 x5Var, j jVar, h6.a aVar, s2.a aVar2) {
        return new f6(x5Var, jVar, aVar, aVar2);
    }

    @Override // com.my.target.s2
    public void a(Context context) {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter == null) {
            this.f59658k.e();
            gb.b("MediationRewardedAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).show(context);
        } catch (Throwable th2) {
            this.f59658k.e();
            gb.b("MediationRewardedAdEngine: Error - " + th2);
        }
    }

    @Override // com.my.target.s2
    public void a(s2.b bVar) {
        this.f59659l = bVar;
    }

    @Override // com.my.target.z5
    public void a(MediationRewardedAdAdapter mediationRewardedAdAdapter, y5 y5Var, Context context) {
        z5.a aVarA = z5.a.a(y5Var.e(), y5Var.d(), y5Var.c(), this.f61162a.g().getAge(), this.f61162a.g().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.f61169h) ? null : this.f61162a.a(this.f61169h));
        if (mediationRewardedAdAdapter instanceof MyTargetRewardedAdAdapter) {
            t tVarG = y5Var.g();
            if (tVarG instanceof t4) {
                ((MyTargetRewardedAdAdapter) mediationRewardedAdAdapter).a((t4) tVarG);
            }
        }
        try {
            mediationRewardedAdAdapter.load(aVarA, new a(y5Var), context);
        } catch (Throwable th2) {
            gb.b("MediationRewardedAdEngine: Error - " + th2);
        }
    }

    @Override // com.my.target.z5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationRewardedAdAdapter;
    }
}
