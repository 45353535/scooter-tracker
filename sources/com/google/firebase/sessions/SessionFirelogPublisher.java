package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher;", "", "mayLogSession", "", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SessionFirelogPublisher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33332a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher$Companion;", "", "<init>", "()V", C4424m2.f43617p, "Lcom/google/firebase/sessions/SessionFirelogPublisher;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f33332a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionFirelogPublisher getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionFirelogPublisher();
        }
    }

    void mayLogSession(@NotNull SessionDetails sessionDetails);
}
