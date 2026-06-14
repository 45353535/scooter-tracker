package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.ironsource.C4424m2;
import com.my.target.ads.MyTargetView;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.h6;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationStandardAdAdapter;
import com.my.target.mediation.MyTargetStandardAdAdapter;
import com.my.target.v2;
import com.my.target.z5;

/* JADX INFO: loaded from: classes11.dex */
public class g6 extends z5 implements v2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MyTargetView f59711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v2.a f59712l;

    public class a implements MediationStandardAdAdapter.MediationStandardAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5 f59713a;

        public a(y5 y5Var) {
            this.f59713a = y5Var;
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onClick(MediationStandardAdAdapter mediationStandardAdAdapter) {
            g6 g6Var = g6.this;
            if (g6Var.f61165d != mediationStandardAdAdapter) {
                return;
            }
            Context contextG = g6Var.g();
            if (contextG != null) {
                bb.b(this.f59713a.h(), "click", 2, contextG);
            }
            v2.a aVar = g6.this.f59712l;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (g6.this.f61165d != mediationStandardAdAdapter) {
                return;
            }
            gb.a("MediationStandardAdEngine: Data from " + this.f59713a.b() + " ad network loaded successfully");
            g6.this.a(this.f59713a, true);
            g6.this.a(view);
            v2.a aVar = g6.this.f59712l;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (g6.this.f61165d != mediationStandardAdAdapter) {
                return;
            }
            gb.a("MediationStandardAdEngine: No data from " + this.f59713a.b() + " ad network - " + iAdLoadingError);
            g6.this.a(this.f59713a, false);
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onShow(MediationStandardAdAdapter mediationStandardAdAdapter) {
            g6 g6Var = g6.this;
            if (g6Var.f61165d != mediationStandardAdAdapter) {
                return;
            }
            Context contextG = g6Var.g();
            if (contextG != null) {
                bb.b(this.f59713a.h(), C4424m2.f43623v, 1, contextG);
            }
            v2.a aVar = g6.this.f59712l;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    public g6(MyTargetView myTargetView, x5 x5Var, j jVar, h6.a aVar) {
        super(x5Var, jVar, aVar);
        this.f59711k = myTargetView;
    }

    @Override // com.my.target.v2
    public void a(MyTargetView.AdSize adSize) {
    }

    @Override // com.my.target.v2
    public void destroy() {
        if (this.f61165d == null) {
            gb.b("MediationStandardAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        this.f59711k.removeAllViews();
        try {
            ((MediationStandardAdAdapter) this.f61165d).destroy();
        } catch (Throwable th2) {
            gb.b("MediationStandardAdEngine: Error - " + th2);
        }
        this.f61165d = null;
    }

    @Override // com.my.target.z5
    public void e() {
        v2.a aVar = this.f59712l;
        if (aVar != null) {
            aVar.a(m.f60116u);
        }
    }

    @Override // com.my.target.z5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MediationStandardAdAdapter f() {
        return new MyTargetStandardAdAdapter();
    }

    @Override // com.my.target.v2
    public void pause() {
    }

    @Override // com.my.target.v2
    public void prepare() {
        super.b(this.f59711k.getContext());
    }

    @Override // com.my.target.v2
    public void resume() {
    }

    @Override // com.my.target.v2
    public void start() {
    }

    @Override // com.my.target.v2
    public void stop() {
    }

    public static g6 a(MyTargetView myTargetView, x5 x5Var, j jVar, h6.a aVar) {
        return new g6(myTargetView, x5Var, jVar, aVar);
    }

    @Override // com.my.target.v2
    public void a(v2.a aVar) {
        this.f59712l = aVar;
    }

    @Override // com.my.target.z5
    public void a(MediationStandardAdAdapter mediationStandardAdAdapter, y5 y5Var, Context context) {
        z5.a aVarA = z5.a.a(y5Var.e(), y5Var.d(), y5Var.c(), this.f61162a.g().getAge(), this.f61162a.g().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.f61169h) ? null : this.f61162a.a(this.f61169h));
        if (mediationStandardAdAdapter instanceof MyTargetStandardAdAdapter) {
            t tVarG = y5Var.g();
            if (tVarG instanceof ua) {
                ((MyTargetStandardAdAdapter) mediationStandardAdAdapter).a((ua) tVarG);
            }
        }
        try {
            mediationStandardAdAdapter.load(aVarA, this.f59711k.getSize(), new a(y5Var), context);
        } catch (Throwable th2) {
            gb.b("MediationStandardAdEngine: Error - " + th2);
        }
    }

    @Override // com.my.target.z5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationStandardAdAdapter;
    }

    public void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        this.f59711k.removeAllViews();
        this.f59711k.addView(view);
    }
}
