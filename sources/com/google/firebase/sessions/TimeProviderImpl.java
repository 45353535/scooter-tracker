package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/TimeProviderImpl;", "Lcom/google/firebase/sessions/TimeProvider;", "<init>", "()V", "Lkotlin/time/b;", "elapsedRealtime-UwyO8pc", "()J", "elapsedRealtime", "Lcom/google/firebase/sessions/Time;", "currentTime", "()Lcom/google/firebase/sessions/Time;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeProviderImpl implements TimeProvider {

    @NotNull
    public static final TimeProviderImpl INSTANCE = new TimeProviderImpl();

    private TimeProviderImpl() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    @NotNull
    public Time currentTime() {
        return new Time(System.currentTimeMillis());
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo4497elapsedRealtimeUwyO8pc() {
        b.a aVar = kotlin.time.b.f93560c;
        return kotlin.time.c.t(SystemClock.elapsedRealtime(), cg.b.f6838e);
    }
}
