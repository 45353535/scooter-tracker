package com.google.firebase.sessions.api;

import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "onSessionChanged", "", "sessionDetails", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "isDataCollectionEnabled", "", "()Z", "sessionSubscriberName", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "<init>", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Name {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Name[] f33430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f33431c;
        public static final Name CRASHLYTICS = new Name("CRASHLYTICS", 0);
        public static final Name PERFORMANCE = new Name("PERFORMANCE", 1);
        public static final Name MATT_SAYS_HI = new Name("MATT_SAYS_HI", 2);

        static {
            Name[] nameArrD = d();
            f33430b = nameArrD;
            f33431c = a.a(nameArrD);
        }

        private Name(String str, int i10) {
        }

        private static final /* synthetic */ Name[] d() {
            return new Name[]{CRASHLYTICS, PERFORMANCE, MATT_SAYS_HI};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f33431c;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) f33430b.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSessionId", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        public SessionDetails(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionDetails) && Intrinsics.areEqual(this.sessionId, ((SessionDetails) other).sessionId);
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
