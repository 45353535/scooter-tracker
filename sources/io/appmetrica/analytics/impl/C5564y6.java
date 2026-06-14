package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5564y6 implements Hf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C5539x6 f78573b = new C5539x6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hf f78574a;

    public C5564y6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Hf
    @Nullable
    public final String a() {
        return this.f78574a.a();
    }

    public final boolean b() {
        try {
            String strA = this.f78574a.a();
            if (strA != null && strA.length() > 0) {
                return !StringsKt.g0(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C5564y6(@NotNull Hf hf2) {
        this.f78574a = hf2;
    }

    public final boolean a(@NotNull String str) {
        try {
            String strA = this.f78574a.a();
            if (strA != null && strA.length() > 0) {
                if (StringsKt.M(strA, StringUtils.PROCESS_POSTFIX_DELIMITER + str, false, 2, null)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5564y6(Hf hf2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            f78573b.getClass();
            hf2 = C5539x6.a();
        }
        this(hf2);
    }
}
