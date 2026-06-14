package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.a6;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e4;
import com.my.target.gb;
import com.my.target.h4;
import com.my.target.m;
import com.my.target.s2;
import com.my.target.t4;
import com.my.target.x5;

/* JADX INFO: loaded from: classes11.dex */
public final class InterstitialAd extends BaseInterstitialAd {

    @Nullable
    protected InterstitialAdListener listener;

    public interface InterstitialAdListener {
        void onClick(@NonNull InterstitialAd interstitialAd);

        void onDismiss(@NonNull InterstitialAd interstitialAd);

        void onDisplay(@NonNull InterstitialAd interstitialAd);

        void onFailedToShow(@NonNull InterstitialAd interstitialAd);

        void onLoad(@NonNull InterstitialAd interstitialAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd);

        void onVideoCompleted(@NonNull InterstitialAd interstitialAd);
    }

    public InterstitialAd(int i10, @NonNull Context context) {
        super(i10, "fullscreen", context);
        gb.c("Interstitial ad created. Version - " + MyTargetVersion.VERSION);
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void a(t4 t4Var, IAdLoadingError iAdLoadingError) {
        InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener == null) {
            return;
        }
        if (t4Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            interstitialAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        e4 e4VarC = t4Var.c();
        x5 x5VarB = t4Var.b();
        if (e4VarC != null) {
            h4 h4VarA = h4.a(e4VarC, t4Var, this.f59182g, new a());
            this.f59181f = h4VarA;
            if (h4VarA != null) {
                this.listener.onLoad(this);
                return;
            } else {
                this.listener.onNoAd(m.f60110o, this);
                return;
            }
        }
        if (x5VarB != null) {
            a6 a6VarA = a6.a(x5VarB, this.f59399a, this.f59400b, new a());
            this.f59181f = a6VarA;
            a6VarA.b(this.f59180e);
        } else {
            InterstitialAdListener interstitialAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60116u;
            }
            interstitialAdListener2.onNoAd(iAdLoadingError, this);
        }
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    @Nullable
    public InterstitialAdListener getListener() {
        return this.listener;
    }

    public void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }

    public class a implements s2.a {
        public a() {
        }

        @Override // com.my.target.s2.a
        public void a() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onLoad(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void b() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onVideoCompleted(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void c() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onClick(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void d() {
            InterstitialAd.this.b();
        }

        @Override // com.my.target.s2.a
        public void e() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onFailedToShow(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void f() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDismiss(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void g() {
            InterstitialAd.this.a();
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDisplay(interstitialAd);
            }
        }

        @Override // com.my.target.s2.a
        public void a(IAdLoadingError iAdLoadingError) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onNoAd(iAdLoadingError, interstitialAd);
            }
        }
    }
}
