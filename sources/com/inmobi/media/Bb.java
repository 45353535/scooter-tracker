package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Bb {
    public static final Ab a(String logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return StringsKt.N(logLevel, "DEBUG", true) ? Ab.f36562b : StringsKt.N(logLevel, "ERROR", true) ? Ab.f36563c : StringsKt.N(logLevel, "INFO", true) ? Ab.f36561a : StringsKt.N(logLevel, "STATE", true) ? Ab.f36564d : Ab.f36563c;
    }
}
