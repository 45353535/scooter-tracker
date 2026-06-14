package com.google.firebase.crashlytics.internal.common;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/crashlytics/internal/common/FirebaseInstallationId;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/crashlytics/internal/common/FirebaseInstallationId;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFid", "b", "getAuthToken", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FirebaseInstallationId {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authToken;

    public FirebaseInstallationId(@Nullable String str, @Nullable String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public static /* synthetic */ FirebaseInstallationId copy$default(FirebaseInstallationId firebaseInstallationId, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = firebaseInstallationId.fid;
        }
        if ((i10 & 2) != 0) {
            str2 = firebaseInstallationId.authToken;
        }
        return firebaseInstallationId.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final FirebaseInstallationId copy(@Nullable String fid, @Nullable String authToken) {
        return new FirebaseInstallationId(fid, authToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) other;
        return Intrinsics.areEqual(this.fid, firebaseInstallationId.fid) && Intrinsics.areEqual(this.authToken, firebaseInstallationId.authToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final String getFid() {
        return this.fid;
    }

    public int hashCode() {
        String str = this.fid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FirebaseInstallationId(fid=" + this.fid + ", authToken=" + this.authToken + ')';
    }
}
