package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e4;
import com.my.target.f6;
import com.my.target.gb;
import com.my.target.h4;
import com.my.target.m;
import com.my.target.s2;
import com.my.target.t4;
import com.my.target.x5;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAd extends BaseInterstitialAd {

    @Nullable
    protected RewardedAdListener listener;

    public interface RewardedAdListener {
        void onClick(@NonNull RewardedAd rewardedAd);

        void onDismiss(@NonNull RewardedAd rewardedAd);

        void onDisplay(@NonNull RewardedAd rewardedAd);

        void onFailedToShow(@NonNull RewardedAd rewardedAd);

        void onLoad(@NonNull RewardedAd rewardedAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd);

        void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd);
    }

    public class b implements s2.b {
        public b() {
        }

        @Override // com.my.target.s2.b
        public void a(Reward reward) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onReward(reward, rewardedAd);
            }
        }
    }

    public RewardedAd(int i10, @NonNull Context context) {
        super(i10, "rewarded", context);
        gb.c("Rewarded ad created. Version - " + MyTargetVersion.VERSION);
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void a(t4 t4Var, IAdLoadingError iAdLoadingError) {
        RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener == null) {
            return;
        }
        if (t4Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            rewardedAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        e4 e4VarC = t4Var.c();
        x5 x5VarB = t4Var.b();
        if (e4VarC != null) {
            h4 h4VarA = h4.a(e4VarC, t4Var, this.f59182g, new a());
            this.f59181f = h4VarA;
            if (h4VarA == null) {
                this.listener.onNoAd(m.f60110o, this);
                return;
            } else {
                h4VarA.a(new b());
                this.listener.onLoad(this);
                return;
            }
        }
        if (x5VarB != null) {
            f6 f6VarA = f6.a(x5VarB, this.f59399a, this.f59400b, new a());
            f6VarA.a(new b());
            this.f59181f = f6VarA;
            f6VarA.b(this.f59180e);
            return;
        }
        RewardedAdListener rewardedAdListener2 = this.listener;
        if (iAdLoadingError == null) {
            iAdLoadingError = m.f60116u;
        }
        rewardedAdListener2.onNoAd(iAdLoadingError, this);
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    @Nullable
    public RewardedAdListener getListener() {
        return this.listener;
    }

    public void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }

    public class a implements s2.a {
        public a() {
        }

        @Override // com.my.target.s2.a
        public void a() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onLoad(rewardedAd);
            }
        }

        @Override // com.my.target.s2.a
        public void b() {
        }

        @Override // com.my.target.s2.a
        public void c() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onClick(rewardedAd);
            }
        }

        @Override // com.my.target.s2.a
        public void d() {
            RewardedAd.this.b();
        }

        @Override // com.my.target.s2.a
        public void e() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onFailedToShow(rewardedAd);
            }
        }

        @Override // com.my.target.s2.a
        public void f() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDismiss(rewardedAd);
            }
        }

        @Override // com.my.target.s2.a
        public void g() {
            RewardedAd.this.a();
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDisplay(rewardedAd);
            }
        }

        @Override // com.my.target.s2.a
        public void a(IAdLoadingError iAdLoadingError) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onNoAd(iAdLoadingError, rewardedAd);
            }
        }
    }
}
