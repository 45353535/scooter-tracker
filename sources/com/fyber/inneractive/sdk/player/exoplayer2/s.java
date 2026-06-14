package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f22815d = new s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22818c;

    public s(float f10, float f11) {
        this.f22816a = f10;
        this.f22817b = f11;
        this.f22818c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f22816a == sVar.f22816a && this.f22817b == sVar.f22817b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f22817b) + ((Float.floatToRawIntBits(this.f22816a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
