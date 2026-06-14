package com.inmobi.media;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class Q9 extends AbstractC3772i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f37584e = eventId;
        this.f37585f = componentType;
    }

    public final String toString() {
        return this.f38734a + "@" + this.f37585f + " ";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Q9(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this(string, str, str2, str3);
    }
}
