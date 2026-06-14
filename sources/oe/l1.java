package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f96821a;

    public l1(String agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f96821a = agent;
    }

    public final String a() {
        return this.f96821a;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96821a = str;
    }

    public /* synthetic */ l1(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Ktor http-client" : str);
    }
}
