package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3923o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39157a = C3923o4.class.getSimpleName();

    public final C3815jl a(C3722g2 configResponseObj, C3873m4 configRequestContext) {
        Integer num;
        Intrinsics.checkNotNullParameter(configResponseObj, "configResponseObj");
        Intrinsics.checkNotNullParameter(configRequestContext, "configRequestContext");
        int iB = configResponseObj.b();
        Config config = configRequestContext.f39008b;
        if (iB == 200) {
            try {
                Config configA = configResponseObj.a();
                if (configA == null) {
                    String tag = this.f39157a;
                    Intrinsics.checkNotNullExpressionValue(tag, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.f39157a;
                    Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            String tag3 = this.f39157a;
            Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            iB += 1000;
        } else {
            String tag4 = this.f39157a;
            Intrinsics.checkNotNullExpressionValue(tag4, "tag");
            configRequestContext.f39008b.getType();
        }
        return new C3815jl(iB, config);
    }
}
