package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s80 implements t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115719a;

    public s80(String str) {
        this.f115719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s80) && Intrinsics.areEqual(this.f115719a, ((s80) obj).f115719a);
    }

    public final int hashCode() {
        return this.f115719a.hashCode();
    }

    public final String toString() {
        return "OnWarningButtonClick(waring=" + this.f115719a + ")";
    }
}
