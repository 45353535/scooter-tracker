package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ld implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Kd f76070a = new Kd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f76071b = MapsKt.mapOf(TuplesKt.to(NativeCrashSource.UNKNOWN, 0), TuplesKt.to(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008c6 fromModel(@NotNull Rd rd2) {
        C5008c6 c5008c6 = new C5008c6();
        c5008c6.f76954f = 1;
        C4982b6 c4982b6 = new C4982b6();
        c4982b6.f76882a = rd2.f76346a;
        C5085f6 c5085f6 = new C5085f6();
        Integer num = (Integer) f76071b.get(rd2.f76347b.f76193a);
        if (num != null) {
            c5085f6.f77147a = num.intValue();
        }
        String str = rd2.f76347b.f76194b;
        if (str == null) {
            str = "";
        }
        c5085f6.f77148b = str;
        c4982b6.f76883b = c5085f6;
        c5008c6.f76955g = c4982b6;
        return c5008c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Rd a(@NotNull C5008c6 c5008c6) {
        throw new UnsupportedOperationException();
    }
}
