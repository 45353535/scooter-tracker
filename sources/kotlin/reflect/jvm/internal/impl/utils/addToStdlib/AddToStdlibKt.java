package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AddToStdlibKt {

    @NotNull
    private static final ConcurrentHashMap<Function0<?>, Object> constantMap = new ConcurrentHashMap<>();

    @NotNull
    public static final Void shouldNotBeCalled(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
