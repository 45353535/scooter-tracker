package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w80 implements z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117340a;

    public w80(String str) {
        this.f117340a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w80) && Intrinsics.areEqual(this.f117340a, ((w80) obj).f117340a);
    }

    public final int hashCode() {
        return this.f117340a.hashCode();
    }

    public final String toString() {
        return "Message(text=" + this.f117340a + ")";
    }
}
