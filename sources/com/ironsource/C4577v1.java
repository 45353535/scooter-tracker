package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4577v1 extends AbstractC4511r3 {
    public C4577v1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4511r3
    protected int c(@Nullable C4649z5 c4649z5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4511r3
    @NotNull
    protected String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void f(@Nullable C4649z5 c4649z5) {
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean h(@Nullable C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean j(@Nullable C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean d(@NotNull C4649z5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iC = event.c();
        return iC == A5.FIRST_INSTANCE.b() || iC == A5.INIT_COMPLETE.b() || iC == A5.SDK_INIT_FAILED.b() || iC == A5.SDK_INIT_SUCCESS.b();
    }
}
