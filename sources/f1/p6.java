package f1;

import android.view.View;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import f1.b6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6.a f70760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f70762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70766g;

    public p6(b6.a sessionHolder, boolean z10) {
        Intrinsics.checkNotNullParameter(sessionHolder, "sessionHolder");
        this.f70760a = sessionHolder;
        this.f70761b = z10;
    }

    public final MediaEvents a(String str) {
        if (this.f70760a.a() == null) {
            eg.e("MediaEvents are null when executing " + str, null, 2, null);
        } else {
            eg.e("MediaEvents valid when executing: " + str, null, 2, null);
        }
        return this.f70760a.a();
    }

    public final void b() {
        Unit unit;
        if (!this.f70761b) {
            eg.j("OMSDK signal impression event OM is disabled by the cb config!", null, 2, null);
            return;
        }
        try {
            AdEvents adEventsD = this.f70760a.d();
            if (adEventsD != null) {
                adEventsD.impressionOccurred();
                eg.e("Signal om ad event impression occurred!", null, 2, null);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Omid signal impression event is null!", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void c(float f10) {
        try {
            MediaEvents mediaEventsA = a("signalMediaVolumeChange volume: " + f10);
            if (mediaEventsA != null) {
                mediaEventsA.volumeChange(f10);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void d(float f10, float f11) {
        this.f70762c = false;
        this.f70763d = false;
        this.f70764e = false;
        try {
            MediaEvents mediaEventsA = a("signalMediaStart duration: " + f10 + " and volume " + f11);
            if (mediaEventsA != null) {
                mediaEventsA.start(f10, f11);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void e(View obstructionView) {
        Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
        AdSession adSessionE = this.f70760a.e();
        if (adSessionE != null) {
            adSessionE.addFriendlyObstruction(obstructionView, FriendlyObstructionPurpose.OTHER, "Industry Icon");
        }
    }

    public final void f(PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        try {
            MediaEvents mediaEventsA = a("signalMediaStateChange state: " + playerState.name());
            if (mediaEventsA != null) {
                mediaEventsA.playerStateChange(playerState);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void g(Integer num) {
        Unit unit;
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (!this.f70761b) {
            eg.j("OMSDK signal load OM is disabled by the cb config!", null, 2, null);
            return;
        }
        try {
            AdEvents adEventsD = this.f70760a.d();
            if (adEventsD != null) {
                boolean z10 = num != null && num.intValue() > 0;
                if (z10) {
                    if (z10) {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0.0f, true, Position.STANDALONE);
                    } else {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    adEventsD.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                } else {
                    adEventsD.loaded();
                }
                eg.e("Signal om ad event loaded!", null, 2, null);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Omid load event is null!", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void h() {
        try {
            MediaEvents mediaEventsA = a("signalMediaBufferFinish");
            if (mediaEventsA != null) {
                mediaEventsA.bufferFinish();
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void i() {
        try {
            MediaEvents mediaEventsA = a("signalMediaBufferStart");
            if (mediaEventsA != null) {
                mediaEventsA.bufferStart();
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void j() {
        try {
            MediaEvents mediaEventsA = a("signalMediaComplete");
            if (mediaEventsA != null) {
                mediaEventsA.complete();
            }
            this.f70765f = true;
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void k() {
        try {
            if (this.f70762c) {
                return;
            }
            eg.e("Signal media first quartile", null, 2, null);
            MediaEvents mediaEventsA = a("signalMediaFirstQuartile");
            if (mediaEventsA != null) {
                mediaEventsA.firstQuartile();
            }
            this.f70762c = true;
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void l() {
        try {
            if (this.f70763d) {
                return;
            }
            eg.e("Signal media midpoint", null, 2, null);
            MediaEvents mediaEventsA = a("signalMediaMidpoint");
            if (mediaEventsA != null) {
                mediaEventsA.midpoint();
            }
            this.f70763d = true;
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void m() {
        try {
            MediaEvents mediaEventsA = a("signalMediaPause");
            if (mediaEventsA != null) {
                mediaEventsA.pause();
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void n() {
        try {
            MediaEvents mediaEventsA = a("signalMediaResume");
            if (mediaEventsA != null) {
                mediaEventsA.resume();
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void o() {
        try {
            if (this.f70766g || this.f70765f) {
                return;
            }
            eg.e("Signal media skipped", null, 2, null);
            MediaEvents mediaEventsA = a("signalMediaSkipped");
            if (mediaEventsA != null) {
                mediaEventsA.skipped();
            }
            this.f70766g = true;
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void p() {
        try {
            if (this.f70764e) {
                return;
            }
            eg.e("Signal media third quartile", null, 2, null);
            MediaEvents mediaEventsA = a("signalMediaThirdQuartile");
            if (mediaEventsA != null) {
                mediaEventsA.thirdQuartile();
            }
            this.f70764e = true;
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void q() {
        try {
            MediaEvents mediaEventsA = a("signalUserInteractionClick");
            if (mediaEventsA != null) {
                mediaEventsA.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void r() {
        Unit unit;
        if (!this.f70761b) {
            eg.j("OMSDK start session OM is disabled by the cb config!", null, 2, null);
            return;
        }
        try {
            AdSession adSessionE = this.f70760a.e();
            if (adSessionE != null) {
                adSessionE.start();
                eg.e("Omid session started successfully! Version: " + Omid.getVersion(), null, 2, null);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.e("Omid start session is null!", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Error", e10);
        }
    }

    public final void s() {
        if (!this.f70761b) {
            eg.j("OMSDK stop session OM is disabled by the cb config!", null, 2, null);
            return;
        }
        try {
            try {
                AdSession adSessionE = this.f70760a.e();
                if (adSessionE != null) {
                    adSessionE.finish();
                    adSessionE.registerAdView(null);
                }
                Omid.updateLastActivity();
                eg.e("Omid session finished!", null, 2, null);
            } catch (Exception e10) {
                eg.i("OMSDK stop session exception", e10);
            }
            this.f70760a.c(null);
            this.f70760a.b(null);
        } catch (Throwable th2) {
            this.f70760a.c(null);
            this.f70760a.b(null);
            throw th2;
        }
    }
}
