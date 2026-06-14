package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3674e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38503b;

    public C3674e6(String payload, ArrayList eventIDs) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f38502a = eventIDs;
        this.f38503b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3674e6)) {
            return false;
        }
        C3674e6 c3674e6 = (C3674e6) obj;
        return Intrinsics.areEqual(this.f38502a, c3674e6.f38502a) && Intrinsics.areEqual(this.f38503b, c3674e6.f38503b);
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(false) + ((this.f38503b.hashCode() + (this.f38502a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f38502a + ", payload=" + this.f38503b + ", shouldFlushOnFailure=false)";
    }
}
