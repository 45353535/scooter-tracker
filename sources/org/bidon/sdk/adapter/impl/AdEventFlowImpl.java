package org.bidon.sdk.adapter.impl;

import androidx.compose.foundation.c;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import hg.c0;
import hg.l0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.i;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/adapter/impl/AdEventFlowImpl;", "Lorg/bidon/sdk/adapter/impl/AdEventFlow;", "<init>", "()V", "pastEvents", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/adapter/impl/AdEventFlowImpl$PastEvent;", "adEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/bidon/sdk/adapter/AdEvent;", "getAdEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "adEvent$delegate", "Lkotlin/Lazy;", "emitEvent", "", "event", "didEventPass", "", "PastEvent", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdEventFlowImpl implements AdEventFlow {

    @NotNull
    private final MutableStateFlow pastEvents = l0.a(new PastEvent(false, false, false, false, false, false, false, false, false));

    /* JADX INFO: renamed from: adEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adEvent = i.a(new Function0() { // from class: org.bidon.sdk.adapter.impl.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdEventFlowImpl.adEvent_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lorg/bidon/sdk/adapter/impl/AdEventFlowImpl$PastEvent;", "", C4240b4.i.f42648r, "", "loadFailed", "shown", "showFailed", Reporting.EventType.VIDEO_AD_CLICKED, "expired", "impression", "rewarded", "closed", "<init>", "(ZZZZZZZZZ)V", "getLoaded", "()Z", "getLoadFailed", "getShown", "getShowFailed", "getClicked", "getExpired", "getImpression", "getRewarded", "getClosed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class PastEvent {
        private final boolean clicked;
        private final boolean closed;
        private final boolean expired;
        private final boolean impression;
        private final boolean loadFailed;
        private final boolean loaded;
        private final boolean rewarded;
        private final boolean showFailed;
        private final boolean shown;

        public PastEvent(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            this.loaded = z10;
            this.loadFailed = z11;
            this.shown = z12;
            this.showFailed = z13;
            this.clicked = z14;
            this.expired = z15;
            this.impression = z16;
            this.rewarded = z17;
            this.closed = z18;
        }

        public static /* synthetic */ PastEvent copy$default(PastEvent pastEvent, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = pastEvent.loaded;
            }
            if ((i10 & 2) != 0) {
                z11 = pastEvent.loadFailed;
            }
            if ((i10 & 4) != 0) {
                z12 = pastEvent.shown;
            }
            if ((i10 & 8) != 0) {
                z13 = pastEvent.showFailed;
            }
            if ((i10 & 16) != 0) {
                z14 = pastEvent.clicked;
            }
            if ((i10 & 32) != 0) {
                z15 = pastEvent.expired;
            }
            if ((i10 & 64) != 0) {
                z16 = pastEvent.impression;
            }
            if ((i10 & 128) != 0) {
                z17 = pastEvent.rewarded;
            }
            if ((i10 & 256) != 0) {
                z18 = pastEvent.closed;
            }
            boolean z19 = z17;
            boolean z20 = z18;
            boolean z21 = z15;
            boolean z22 = z16;
            boolean z23 = z14;
            boolean z24 = z12;
            return pastEvent.copy(z10, z11, z24, z13, z23, z21, z22, z19, z20);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getLoaded() {
            return this.loaded;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getLoadFailed() {
            return this.loadFailed;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShown() {
            return this.shown;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowFailed() {
            return this.showFailed;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getClicked() {
            return this.clicked;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getExpired() {
            return this.expired;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getImpression() {
            return this.impression;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getRewarded() {
            return this.rewarded;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @NotNull
        public final PastEvent copy(boolean loaded, boolean loadFailed, boolean shown, boolean showFailed, boolean clicked, boolean expired, boolean impression, boolean rewarded, boolean closed) {
            return new PastEvent(loaded, loadFailed, shown, showFailed, clicked, expired, impression, rewarded, closed);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PastEvent)) {
                return false;
            }
            PastEvent pastEvent = (PastEvent) other;
            return this.loaded == pastEvent.loaded && this.loadFailed == pastEvent.loadFailed && this.shown == pastEvent.shown && this.showFailed == pastEvent.showFailed && this.clicked == pastEvent.clicked && this.expired == pastEvent.expired && this.impression == pastEvent.impression && this.rewarded == pastEvent.rewarded && this.closed == pastEvent.closed;
        }

        public final boolean getClicked() {
            return this.clicked;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getExpired() {
            return this.expired;
        }

        public final boolean getImpression() {
            return this.impression;
        }

        public final boolean getLoadFailed() {
            return this.loadFailed;
        }

        public final boolean getLoaded() {
            return this.loaded;
        }

        public final boolean getRewarded() {
            return this.rewarded;
        }

        public final boolean getShowFailed() {
            return this.showFailed;
        }

        public final boolean getShown() {
            return this.shown;
        }

        public int hashCode() {
            return (((((((((((((((c.a(this.loaded) * 31) + c.a(this.loadFailed)) * 31) + c.a(this.shown)) * 31) + c.a(this.showFailed)) * 31) + c.a(this.clicked)) * 31) + c.a(this.expired)) * 31) + c.a(this.impression)) * 31) + c.a(this.rewarded)) * 31) + c.a(this.closed);
        }

        @NotNull
        public String toString() {
            return "PastEvent(loaded=" + this.loaded + ", loadFailed=" + this.loadFailed + ", shown=" + this.shown + ", showFailed=" + this.showFailed + ", clicked=" + this.clicked + ", expired=" + this.expired + ", impression=" + this.impression + ", rewarded=" + this.rewarded + ", closed=" + this.closed + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableSharedFlow adEvent_delegate$lambda$0() {
        return c0.a(0, Integer.MAX_VALUE, gg.a.f72765b);
    }

    private final boolean didEventPass(AdEvent event) {
        Object value;
        PastEvent pastEvent;
        Object value2;
        PastEvent pastEvent2;
        Object value3;
        PastEvent pastEvent3;
        Object value4;
        PastEvent pastEvent4;
        Object value5;
        PastEvent pastEvent5;
        Object value6;
        PastEvent pastEvent6;
        Object value7;
        PastEvent pastEvent7;
        Object value8;
        PastEvent pastEvent8;
        Object value9;
        PastEvent pastEvent9;
        if (event instanceof AdEvent.Fill) {
            MutableStateFlow mutableStateFlow = this.pastEvents;
            do {
                value9 = mutableStateFlow.getValue();
                pastEvent9 = (PastEvent) value9;
            } while (!mutableStateFlow.b(value9, PastEvent.copy$default(pastEvent9, true, false, false, false, false, false, false, false, false, 510, null)));
            return pastEvent9.getLoaded();
        }
        if (event instanceof AdEvent.LoadFailed) {
            MutableStateFlow mutableStateFlow2 = this.pastEvents;
            do {
                value8 = mutableStateFlow2.getValue();
                pastEvent8 = (PastEvent) value8;
            } while (!mutableStateFlow2.b(value8, PastEvent.copy$default(pastEvent8, false, true, false, false, false, false, false, false, false, 509, null)));
            return pastEvent8.getLoadFailed();
        }
        if (event instanceof AdEvent.Shown) {
            MutableStateFlow mutableStateFlow3 = this.pastEvents;
            do {
                value7 = mutableStateFlow3.getValue();
                pastEvent7 = (PastEvent) value7;
            } while (!mutableStateFlow3.b(value7, PastEvent.copy$default(pastEvent7, false, false, true, false, false, false, false, false, false, 507, null)));
            return pastEvent7.getShown();
        }
        if (event instanceof AdEvent.ShowFailed) {
            MutableStateFlow mutableStateFlow4 = this.pastEvents;
            do {
                value6 = mutableStateFlow4.getValue();
                pastEvent6 = (PastEvent) value6;
            } while (!mutableStateFlow4.b(value6, PastEvent.copy$default(pastEvent6, false, false, false, true, false, false, false, false, false, 503, null)));
            return pastEvent6.getShowFailed();
        }
        if (event instanceof AdEvent.PaidRevenue) {
            MutableStateFlow mutableStateFlow5 = this.pastEvents;
            do {
                value5 = mutableStateFlow5.getValue();
                pastEvent5 = (PastEvent) value5;
            } while (!mutableStateFlow5.b(value5, PastEvent.copy$default(pastEvent5, false, false, false, false, false, false, true, false, false, 447, null)));
            return pastEvent5.getImpression();
        }
        if (event instanceof AdEvent.Clicked) {
            MutableStateFlow mutableStateFlow6 = this.pastEvents;
            do {
                value4 = mutableStateFlow6.getValue();
                pastEvent4 = (PastEvent) value4;
            } while (!mutableStateFlow6.b(value4, PastEvent.copy$default(pastEvent4, false, false, false, false, true, false, false, false, false, 495, null)));
            return pastEvent4.getClicked();
        }
        if (event instanceof AdEvent.OnReward) {
            MutableStateFlow mutableStateFlow7 = this.pastEvents;
            do {
                value3 = mutableStateFlow7.getValue();
                pastEvent3 = (PastEvent) value3;
            } while (!mutableStateFlow7.b(value3, PastEvent.copy$default(pastEvent3, false, false, false, false, false, false, false, true, false, 383, null)));
            return pastEvent3.getRewarded();
        }
        if (event instanceof AdEvent.Closed) {
            MutableStateFlow mutableStateFlow8 = this.pastEvents;
            do {
                value2 = mutableStateFlow8.getValue();
                pastEvent2 = (PastEvent) value2;
            } while (!mutableStateFlow8.b(value2, PastEvent.copy$default(pastEvent2, false, false, false, false, false, false, false, false, true, 255, null)));
            return pastEvent2.getClosed();
        }
        if (!(event instanceof AdEvent.Expired)) {
            throw new m();
        }
        MutableStateFlow mutableStateFlow9 = this.pastEvents;
        do {
            value = mutableStateFlow9.getValue();
            pastEvent = (PastEvent) value;
        } while (!mutableStateFlow9.b(value, PastEvent.copy$default(pastEvent, false, false, false, false, false, true, false, false, false, 479, null)));
        return pastEvent.getExpired();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(@NotNull AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!didEventPass(event)) {
            getAdEvent().g(event);
            return;
        }
        LogExtKt.logError(TagKt.getTAG(this), "Event " + v0.b(event.getClass()).getSimpleName() + " already passed", null);
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    @NotNull
    public MutableSharedFlow getAdEvent() {
        return (MutableSharedFlow) this.adEvent.getValue();
    }
}
