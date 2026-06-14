package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33122b;

    FirebaseRemoteConfigValueImpl(String str, int i10) {
        this.f33121a = str;
        this.f33122b = i10;
    }

    private String a() {
        return asString().trim();
    }

    private void b() {
        if (this.f33121a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f33122b == 0) {
            return false;
        }
        String strA = a();
        if (ConfigGetParameterHandler.f33060e.matcher(strA).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f33061f.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, TypedValues.Custom.S_BOOLEAN));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        return this.f33122b == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY : this.f33121a.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.f33122b == 0) {
            return 0.0d;
        }
        String strA = a();
        try {
            return Double.valueOf(strA).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "double"), e10);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.f33122b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, Constants.LONG), e10);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.f33122b == 0) {
            return "";
        }
        b();
        return this.f33121a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.f33122b;
    }
}
