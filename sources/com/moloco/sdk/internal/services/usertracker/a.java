package com.moloco.sdk.internal.services.usertracker;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements d {
    @Override // com.moloco.sdk.internal.services.usertracker.d
    public String a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
