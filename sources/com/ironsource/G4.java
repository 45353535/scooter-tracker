package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class G4 implements De<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f40951b;

    public G4(@NotNull String encryptedResponse, @NotNull String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f40950a = encryptedResponse;
        this.f40951b = descriptionKey;
    }

    @Override // com.ironsource.De
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = K9.b(this.f40951b, this.f40950a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
