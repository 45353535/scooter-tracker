package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.s3;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* JADX INFO: loaded from: classes11.dex */
public class InstreamResearch extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f59061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InstreamResearchListener f59064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v9 f59065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z9 f59066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r3 f59067l;

    public interface InstreamResearchListener {
        void onLoad(@NonNull InstreamResearch instreamResearch);

        void onNoData(@NonNull InstreamResearch instreamResearch, @Nullable IAdLoadingError iAdLoadingError);
    }

    public InstreamResearch(int i10, int i11, Context context) {
        super(i10, "instreamresearch");
        this.f59062g = 0;
        this.f59063h = -1;
        this.f59060e = i11;
        this.f59061f = context;
        gb.c("Instream research ad created. Version - " + MyTargetVersion.VERSION);
    }

    @NonNull
    public static InstreamResearch newResearch(int i10, int i11, @NonNull Context context) {
        return new InstreamResearch(i10, i11, context);
    }

    public final void a(u3 u3Var, IAdLoadingError iAdLoadingError) {
        if (u3Var != null) {
            r3 r3VarC = u3Var.c();
            this.f59067l = r3VarC;
            if (r3VarC != null) {
                this.f59065j = v9.a(r3VarC.x());
                this.f59066k = z9.a(this.f59067l.x());
                InstreamResearchListener instreamResearchListener = this.f59064i;
                if (instreamResearchListener != null) {
                    instreamResearchListener.onLoad(this);
                    return;
                }
                return;
            }
        }
        InstreamResearchListener instreamResearchListener2 = this.f59064i;
        if (instreamResearchListener2 != null) {
            instreamResearchListener2.onNoData(this, iAdLoadingError);
        }
    }

    public void load() {
        s3.a(this.f59399a, this.f59400b, this.f59060e).a(new s3.b() { // from class: k5.a
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f85985a.a((com.my.target.u3) tVar, mVar);
            }
        }).a(this.f59400b.a(), this.f59061f);
    }

    public void registerPlayerView(@NonNull View view) {
        z9 z9Var = this.f59066k;
        if (z9Var != null) {
            z9Var.a(view);
        }
    }

    public void setListener(@Nullable InstreamResearchListener instreamResearchListener) {
        this.f59064i = instreamResearchListener;
    }

    public void trackFullscreen(boolean z10) {
        a(z10 ? "fullscreenOn" : "fullscreenOff");
    }

    public void trackMute(boolean z10) {
        a(z10 ? "volumeOff" : "volumeOn");
    }

    public void trackPause() {
        if (this.f59062g == 1) {
            a("playbackPaused");
            this.f59062g = 2;
        } else {
            gb.b("InstreamResearch: Unable to track pause, wrong state " + a(this.f59062g));
        }
    }

    public void trackProgress(float f10) {
        if (this.f59062g < 1) {
            a("playbackStarted");
            this.f59062g = 1;
        }
        if (this.f59062g > 1) {
            gb.a("InstreamResearch: Unable to track progress while state is - " + a(this.f59062g));
            return;
        }
        int iRound = Math.round(f10);
        int i10 = this.f59063h;
        if (iRound < i10) {
            a(EventConstants.REWIND);
        } else if (iRound == i10) {
            return;
        }
        this.f59063h = iRound;
        z9 z9Var = this.f59066k;
        if (z9Var != null) {
            z9Var.b(iRound);
        }
        v9 v9Var = this.f59065j;
        if (v9Var != null) {
            v9Var.a(iRound, this.f59060e, this.f59061f);
        }
    }

    public void trackResume() {
        if (this.f59062g == 2) {
            a("playbackResumed");
            this.f59062g = 1;
        } else {
            gb.b("InstreamResearch: VideoAdTracker error - unable to track resume, wrong state " + a(this.f59062g));
        }
    }

    public void unregisterPlayerView() {
        z9 z9Var = this.f59066k;
        if (z9Var != null) {
            z9Var.a((View) null);
        }
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "idle";
        }
        if (i10 == 1) {
            return C4240b4.i.f42621d0;
        }
        if (i10 == 2) {
            return C4240b4.i.f42623e0;
        }
        if (i10 != 3) {
            return "unknown";
        }
        return "completed";
    }

    public final void a(String str) {
        r3 r3Var = this.f59067l;
        if (r3Var != null) {
            bb.c(r3Var.x(), str, -1, this.f59061f);
        }
    }
}
