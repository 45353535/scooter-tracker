package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32969c;

    public FirebaseRemoteConfigServerException(int i10, @NonNull String str) {
        super(str);
        this.f32969c = i10;
    }

    public int getHttpStatusCode() {
        return this.f32969c;
    }

    public FirebaseRemoteConfigServerException(int i10, @NonNull String str, @Nullable Throwable th2) {
        super(str, th2);
        this.f32969c = i10;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f32969c = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, @NonNull String str, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f32969c = i10;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @Nullable Throwable th2, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.f32969c = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, @NonNull String str, @Nullable Throwable th2, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.f32969c = i10;
    }
}
