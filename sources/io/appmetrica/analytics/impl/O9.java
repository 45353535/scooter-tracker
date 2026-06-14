package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class O9 extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P9 f76192b;

    public O9(@NotNull C5058e5 c5058e5, @NotNull TimeProvider timeProvider) {
        super(c5058e5);
        this.f76192b = new P9(c5058e5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NotNull W5 w52) {
        long jOptLong;
        P9 p92 = this.f76192b;
        I9 i92 = p92.f76252a.t().B;
        Long lValueOf = i92 != null ? Long.valueOf(i92.f75928a) : null;
        if (lValueOf != null) {
            zo zoVar = p92.f76252a.f77081t;
            synchronized (zoVar) {
                jOptLong = zoVar.f78664a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = p92.f76253b.currentTimeMillis();
                p92.f76252a.f77081t.a(jOptLong);
            }
            if (p92.f76253b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                H9 h92 = (H9) MessageNano.mergeFrom(new H9(), w52.getValueBytes());
                int i10 = h92.f75853a;
                String str = new String(h92.f75854b, Charsets.UTF_8);
                String str2 = this.f76192b.f76252a.f77064c.k().get(Integer.valueOf(i10));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f76636a.f77074m.info("Ignoring attribution of type `" + R9.a(i10) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                P9 p93 = this.f76192b;
                Map<Integer, String> mapK = p93.f76252a.f77064c.k();
                mapK.put(Integer.valueOf(i10), str);
                p93.f76252a.f77064c.b(mapK);
                this.f76636a.f77074m.info("Handling attribution of type `" + R9.a(i10) + '`', new Object[0]);
                return false;
            }
        }
        this.f76636a.f77074m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
