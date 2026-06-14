package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdRevenue f75684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5432t f75686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4973an f75687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ym f75688e;

    public E(AdRevenue adRevenue, boolean z10, C5179in c5179in, PublicLogger publicLogger) {
        this.f75684a = adRevenue;
        this.f75685b = z10;
        this.f75686c = c5179in;
        this.f75687d = new C4973an(100, "ad revenue strings", publicLogger);
        this.f75688e = new Ym(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        Map linkedHashMap;
        C5407s c5407s = new C5407s();
        int length = 0;
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.f75684a.adNetwork, new C5532x(c5407s)), TuplesKt.to(this.f75684a.adPlacementId, new C5557y(c5407s)), TuplesKt.to(this.f75684a.adPlacementName, new C5582z(c5407s)), TuplesKt.to(this.f75684a.adUnitId, new A(c5407s)), TuplesKt.to(this.f75684a.adUnitName, new B(c5407s)), TuplesKt.to(this.f75684a.precision, new C(c5407s)), TuplesKt.to(this.f75684a.currency.getCurrencyCode(), new D(c5407s))})) {
            String str = (String) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            C4973an c4973an = this.f75687d;
            c4973an.getClass();
            String strA = c4973an.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            function1.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f75747a.get(this.f75684a.adType);
        c5407s.f78188d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f75684a.adRevenue;
        BigInteger bigInteger = F7.f75765a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(F7.f75765a) <= 0 && bigIntegerUnscaledValue.compareTo(F7.f75766b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
        Pair pair2 = TuplesKt.to(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
        long jLongValue = ((Number) pair2.getFirst()).longValue();
        int iIntValue = ((Number) pair2.getSecond()).intValue();
        rVar.f78101a = jLongValue;
        rVar.f78102b = iIntValue;
        c5407s.f78186b = rVar;
        Map<String, String> map = this.f75684a.payload;
        InterfaceC5432t interfaceC5432t = this.f75686c;
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strB = AbstractC5295nb.b(interfaceC5432t.a(linkedHashMap));
        Ym ym = this.f75688e;
        ym.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(ym.a(strB));
        c5407s.f78195k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f75685b) {
            c5407s.f78185a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return TuplesKt.to(MessageNano.toByteArray(c5407s), Integer.valueOf(length2));
    }
}
