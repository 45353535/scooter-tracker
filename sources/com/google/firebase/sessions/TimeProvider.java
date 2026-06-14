package com.google.firebase.sessions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/TimeProvider;", "", "Lkotlin/time/b;", "elapsedRealtime-UwyO8pc", "()J", "elapsedRealtime", "Lcom/google/firebase/sessions/Time;", "currentTime", "()Lcom/google/firebase/sessions/Time;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TimeProvider {
    @NotNull
    Time currentTime();

    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc, reason: not valid java name */
    long mo4497elapsedRealtimeUwyO8pc();
}
