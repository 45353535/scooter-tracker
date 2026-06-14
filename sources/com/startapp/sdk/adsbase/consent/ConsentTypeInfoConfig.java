package com.startapp.sdk.adsbase.consent;

import androidx.annotation.Nullable;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;

    @Nullable
    private Integer falseClick;

    @Nullable
    private Integer impression;

    @Nullable
    private Integer trueClick;

    public final Integer a() {
        return this.falseClick;
    }

    public final Integer b() {
        return this.impression;
    }

    public final Integer c() {
        return this.trueClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConsentTypeInfoConfig.class == obj.getClass()) {
            ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
            if (vi.a((Object) this.impression, (Object) consentTypeInfoConfig.impression) && vi.a((Object) this.trueClick, (Object) consentTypeInfoConfig.trueClick) && vi.a((Object) this.falseClick, (Object) consentTypeInfoConfig.falseClick)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
