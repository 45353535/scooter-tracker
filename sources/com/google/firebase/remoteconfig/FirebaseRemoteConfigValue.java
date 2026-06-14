package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public interface FirebaseRemoteConfigValue {
    boolean asBoolean() throws IllegalArgumentException;

    @NonNull
    byte[] asByteArray();

    double asDouble() throws IllegalArgumentException;

    long asLong() throws IllegalArgumentException;

    @NonNull
    String asString();

    int getSource();
}
