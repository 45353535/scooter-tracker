package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Status f32859b;

    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@NonNull Status status) {
        this.f32859b = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f32859b;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status) {
        super(str);
        this.f32859b = status;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status, @NonNull Throwable th2) {
        super(str, th2);
        this.f32859b = status;
    }
}
