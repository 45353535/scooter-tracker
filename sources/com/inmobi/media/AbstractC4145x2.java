package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4145x2 extends AbstractC3669e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f39887h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4145x2(CoroutineScope coroutineScope, InterfaceC3878m9 interfaceC3878m9) {
        super(coroutineScope, interfaceC3878m9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f39888g = AbstractC4145x2.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC3669e1
    public final void a(boolean z10) {
        if (this.f38487e == null) {
            Intrinsics.checkNotNullExpressionValue(this.f39888g, "tag");
            return;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            String tag = this.f39888g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3903n9) interfaceC3878m9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f38483a, new C4070u2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue(this.f39888g, "tag");
            e10.getStackTrace();
        }
    }

    public final void b(Rl rl) {
        MediaEvents mediaEvents;
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            String tag = this.f39888g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3903n9) interfaceC3878m9).a(tag, "fireAdVideoEvent - received video event: " + rl);
        }
        if (rl instanceof Ql) {
            AdSession adSession = this.f38485c;
            if (adSession != null) {
                ErrorType errorType = ErrorType.VIDEO;
                ((Ql) rl).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (rl instanceof Om) {
            MediaEvents mediaEvents2 = this.f38486d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (rl instanceof C3768hn) {
            MediaEvents mediaEvents3 = this.f38486d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (rl instanceof C4165xm) {
            MediaEvents mediaEvents4 = this.f38486d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (rl instanceof C3792in) {
            MediaEvents mediaEvents5 = this.f38486d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (rl instanceof C4016rn) {
            MediaEvents mediaEvents6 = this.f38486d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (rl instanceof Pl) {
            MediaEvents mediaEvents7 = this.f38486d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (rl instanceof C3842kn) {
            MediaEvents mediaEvents8 = this.f38486d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((C3842kn) rl).f38909a, 0.0f);
                return;
            }
            return;
        }
        if (rl instanceof S1) {
            MediaEvents mediaEvents9 = this.f38486d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((S1) rl).f37683b);
                return;
            }
            return;
        }
        if (!(rl instanceof C3817jn) || (mediaEvents = this.f38486d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f10, boolean z10) {
        if (this.f38487e == null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
            if (interfaceC3878m9 != null) {
                String tag = this.f39888g;
                Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ((C3903n9) interfaceC3878m9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38484b;
        if (interfaceC3878m92 != null) {
            String tag2 = this.f39888g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            ((C3903n9) interfaceC3878m92).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f10 + ", isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f38483a, new C4095v2(this, VastProperties.createVastPropertiesForSkippableMedia(f10, z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue(this.f39888g, "tag");
            e10.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC3669e1, com.inmobi.media.Kl
    public final void a(Rl videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (videoEvent instanceof Xm) {
            return;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            String tag = this.f39888g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3903n9) interfaceC3878m9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.f38486d == null) {
            Intrinsics.checkNotNullExpressionValue(this.f39888g, "tag");
        } else {
            P4.a(this.f38483a, new C4120w2(this, videoEvent, null));
        }
    }
}
