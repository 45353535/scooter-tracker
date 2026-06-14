package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5537x4 extends AbstractC5562y4 {
    public C5537x4(@NonNull C5526wi c5526wi) {
        super(c5526wi);
    }

    public final void a(@NonNull EnumC5168ib enumC5168ib, @NonNull List<Wg> list) {
        if (!D9.f75664h.contains(enumC5168ib)) {
            list.add(this.f78571a.f78530s);
        }
        if (D9.f75658b.contains(enumC5168ib)) {
            return;
        }
        list.add(this.f78571a.f78514c);
    }
}
