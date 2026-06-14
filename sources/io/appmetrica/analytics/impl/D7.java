package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes12.dex */
public final class D7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C5267m8 c5267m8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5267m8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = F7.f75765a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(F7.f75765a) <= 0 && bigIntegerUnscaledValue.compareTo(F7.f75766b) >= 0) {
                Pair pair = TuplesKt.to(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
                E7 e72 = new E7(((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).longValue());
                C5267m8 c5267m8 = new C5267m8();
                c5267m8.f77746a = e72.f75728a;
                c5267m8.f77747b = e72.f75729b;
                return c5267m8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
    }
}
