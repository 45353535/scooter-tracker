package com.google.firebase.sessions;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/sessions/UuidGenerator;)V", "", "a", "()Ljava/lang/String;", "Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "generateNewSession", "(Lcom/google/firebase/sessions/SessionDetails;)Lcom/google/firebase/sessions/SessionDetails;", "Lcom/google/firebase/sessions/TimeProvider;", "b", "Lcom/google/firebase/sessions/UuidGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UuidGenerator uuidGenerator;

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull UuidGenerator uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    private final String a() {
        String string = this.uuidGenerator.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = StringsKt.W(string, TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final SessionDetails generateNewSession(@Nullable SessionDetails currentSession) {
        String firstSessionId;
        String strA = a();
        if (currentSession == null || (firstSessionId = currentSession.getFirstSessionId()) == null) {
            firstSessionId = strA;
        }
        return new SessionDetails(strA, firstSessionId, currentSession != null ? currentSession.getSessionIndex() + 1 : 0, this.timeProvider.currentTime().getUs());
    }
}
