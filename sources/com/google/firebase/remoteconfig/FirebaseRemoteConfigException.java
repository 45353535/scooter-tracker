package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Code f32965b;

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f32967b;

        Code(int i10) {
            this.f32967b = i10;
        }

        public int value() {
            return this.f32967b;
        }
    }

    public FirebaseRemoteConfigException(@NonNull String str) {
        super(str);
        this.f32965b = Code.UNKNOWN;
    }

    @NonNull
    public Code getCode() {
        return this.f32965b;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @Nullable Throwable th2) {
        super(str, th2);
        this.f32965b = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @NonNull Code code) {
        super(str);
        this.f32965b = code;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @Nullable Throwable th2, @NonNull Code code) {
        super(str, th2);
        this.f32965b = code;
    }
}
