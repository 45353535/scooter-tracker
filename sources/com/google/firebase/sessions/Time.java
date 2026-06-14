package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.e2;
import yg.t2;

/* JADX INFO: loaded from: classes9.dex */
@ug.l
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u001c¨\u00061"}, d2 = {"Lcom/google/firebase/sessions/Time;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "Lyg/t2;", "serializationConstructorMarker", "(IJJJLyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/Time;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "time", "Lkotlin/time/b;", "minus-5sfh64U", "(Lcom/google/firebase/sessions/Time;)J", "minus", "component1", "()J", MenuActionType.COPY, "(J)Lcom/google/firebase/sessions/Time;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMs", "b", "getUs", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSeconds", y.f66058y, "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long us;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long seconds;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/Time;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Time$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, Time$$serializer.INSTANCE.getDescriptor());
        }
        this.ms = j10;
        this.us = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.seconds = j10 / ((long) 1000);
        } else {
            this.seconds = j12;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = time.ms;
        }
        return time.copy(j10);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time self, xg.f output, SerialDescriptor serialDesc) {
        output.v(serialDesc, 0, self.ms);
        if (output.r(serialDesc, 1) || self.us != self.ms * ((long) 1000)) {
            output.v(serialDesc, 1, self.us);
        }
        if (!output.r(serialDesc, 2) && self.seconds == self.ms / ((long) 1000)) {
            return;
        }
        output.v(serialDesc, 2, self.seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMs() {
        return this.ms;
    }

    @NotNull
    public final Time copy(long ms) {
        return new Time(ms);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    public final long getMs() {
        return this.ms;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final long getUs() {
        return this.us;
    }

    public int hashCode() {
        return androidx.collection.b.a(this.ms);
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m4496minus5sfh64U(@NotNull Time time) {
        Intrinsics.checkNotNullParameter(time, "time");
        b.a aVar = kotlin.time.b.f93560c;
        return kotlin.time.c.t(this.ms - time.ms, cg.b.f6838e);
    }

    @NotNull
    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j10) {
        this.ms = j10;
        long j11 = 1000;
        this.us = j10 * j11;
        this.seconds = j10 / j11;
    }
}
