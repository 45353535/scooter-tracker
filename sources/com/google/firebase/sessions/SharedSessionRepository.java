package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepository;", "", "isInForeground", "", "()Z", "appBackground", "", "appForeground", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SharedSessionRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33371a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepository$Companion;", "", "<init>", "()V", C4424m2.f43617p, "Lcom/google/firebase/sessions/SharedSessionRepository;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/SharedSessionRepository;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f33371a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SharedSessionRepository getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSharedSessionRepository();
        }
    }

    void appBackground();

    void appForeground();

    boolean isInForeground();
}
