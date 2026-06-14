package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5019ch extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8 f76973b;

    public C5019ch(@NonNull C5058e5 c5058e5) {
        this(c5058e5, c5058e5.j());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        EnumC5218ka enumC5218ka;
        if (!TextUtils.isEmpty(w52.getName())) {
            R8 r82 = this.f76973b;
            String name = w52.getName();
            if (r82.f76344c == null) {
                r82.a();
            }
            int iHashCode = name.hashCode();
            if (r82.f76344c.f76491b.contains(Integer.valueOf(iHashCode))) {
                enumC5218ka = EnumC5218ka.NON_FIRST_OCCURENCE;
            } else {
                T8 t82 = r82.f76344c;
                EnumC5218ka enumC5218ka2 = t82.f76490a ? EnumC5218ka.FIRST_OCCURRENCE : EnumC5218ka.UNKNOWN;
                if (t82.f76493d < 1000) {
                    t82.f76491b.add(Integer.valueOf(iHashCode));
                    t82.f76493d++;
                } else {
                    t82.f76490a = false;
                }
                W8 w82 = r82.f76343b;
                T8 t83 = r82.f76344c;
                IBinaryDataHelper iBinaryDataHelper = w82.f76632c;
                V8 v82 = w82.f76631b;
                w82.f76630a.getClass();
                iBinaryDataHelper.insert("event_hashes", v82.toByteArray(U8.a(t83)));
                enumC5218ka = enumC5218ka2;
            }
            w52.f76624k = enumC5218ka;
        }
        return false;
    }

    public C5019ch(C5058e5 c5058e5, R8 r82) {
        super(c5058e5);
        this.f76973b = r82;
    }
}
