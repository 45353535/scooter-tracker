package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5369qa implements InterfaceC5014cc {
    @Override // io.appmetrica.analytics.impl.InterfaceC5014cc
    @Nullable
    public final C5114g9 a(@Nullable C5366q7 c5366q7) {
        C5114g9 c5114g9 = null;
        if ((c5366q7 != null ? c5366q7.f78037b : null) != null && c5366q7.f78038c != null) {
            c5114g9 = new C5114g9();
            c5114g9.f77239b = c5366q7.f78037b.doubleValue();
            c5114g9.f77238a = c5366q7.f78038c.doubleValue();
            Integer num = c5366q7.f78039d;
            if (num != null) {
                c5114g9.f77244g = num.intValue();
            }
            Integer num2 = c5366q7.f78040e;
            if (num2 != null) {
                c5114g9.f77242e = num2.intValue();
            }
            Integer num3 = c5366q7.f78041f;
            if (num3 != null) {
                c5114g9.f77241d = num3.intValue();
            }
            Integer num4 = c5366q7.f78042g;
            if (num4 != null) {
                c5114g9.f77243f = num4.intValue();
            }
            Long l10 = c5366q7.f78043h;
            if (l10 != null) {
                c5114g9.f77240c = TimeUnit.MILLISECONDS.toSeconds(l10.longValue());
            }
            String str = c5366q7.f78044i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c5114g9.f77245h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c5114g9.f77245h = 2;
                }
            }
            String str2 = c5366q7.f78045j;
            if (str2 != null) {
                c5114g9.f77246i = str2;
            }
        }
        return c5114g9;
    }
}
