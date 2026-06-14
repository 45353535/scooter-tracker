package com.moloco.sdk.internal.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54213a;

    public a(String str) {
        this.f54213a = str;
    }

    public final String a() {
        return this.f54213a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f54213a, ((a) obj).f54213a);
    }

    public int hashCode() {
        String str = this.f54213a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ErrorMetadata(mtid=" + this.f54213a + ')';
    }

    public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
