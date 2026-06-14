package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f75355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f75356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75357c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f75355a = identifierStatus;
        this.f75356b = aVar;
        this.f75357c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f75355a == cVar.f75355a && Intrinsics.areEqual(this.f75356b, cVar.f75356b) && Intrinsics.areEqual(this.f75357c, cVar.f75357c);
    }

    public final int hashCode() {
        int iHashCode = this.f75355a.hashCode() * 31;
        a aVar = this.f75356b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f75357c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f75355a + ", advIdInfo=" + this.f75356b + ", errorExplanation=" + this.f75357c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i10) {
        this(identifierStatus, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str);
    }
}
