package androidx.work.impl;

import androidx.work.impl.StartStopTokens;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {
    static {
        StartStopTokens.Companion companion = StartStopTokens.INSTANCE;
    }

    public static StartStopToken a(StartStopTokens startStopTokens, WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return startStopTokens.remove(WorkSpecKt.generationalId(spec));
    }

    public static StartStopToken b(StartStopTokens startStopTokens, WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return startStopTokens.tokenFor(WorkSpecKt.generationalId(spec));
    }

    public static StartStopTokens c() {
        return StartStopTokens.INSTANCE.create();
    }

    public static StartStopTokens d(boolean z10) {
        return StartStopTokens.INSTANCE.create(z10);
    }
}
