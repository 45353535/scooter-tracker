package androidx.test;

import android.app.Instrumentation;
import android.content.Context;
import android.os.Bundle;
import com.google.errorprone.annotations.InlineMe;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class InstrumentationRegistry {
    private InstrumentationRegistry() {
    }

    @InlineMe(replacement = "androidx.test.platform.app.InstrumentationRegistry.getArguments()")
    @Deprecated
    public static Bundle getArguments() {
        return androidx.test.platform.app.InstrumentationRegistry.getArguments();
    }

    @Deprecated
    public static Context getContext() {
        return androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().getContext();
    }

    @InlineMe(replacement = "androidx.test.platform.app.InstrumentationRegistry.getInstrumentation()")
    @Deprecated
    public static Instrumentation getInstrumentation() {
        return androidx.test.platform.app.InstrumentationRegistry.getInstrumentation();
    }

    @Deprecated
    public static Context getTargetContext() {
        return androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @InlineMe(replacement = "androidx.test.platform.app.InstrumentationRegistry.registerInstance(instrumentation, arguments)")
    @Deprecated
    public static void registerInstance(Instrumentation instrumentation, Bundle bundle) {
        androidx.test.platform.app.InstrumentationRegistry.registerInstance(instrumentation, bundle);
    }
}
