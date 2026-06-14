package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class od implements hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f114278b;

    public od(String str, Runnable runnable) {
        this.f114277a = str;
        this.f114278b = runnable;
    }

    public final void a() {
        this.f114278b.run();
    }

    public final boolean a(String str, String str2) {
        return Intrinsics.areEqual("mobileads", str) && Intrinsics.areEqual(this.f114277a, str2);
    }
}
