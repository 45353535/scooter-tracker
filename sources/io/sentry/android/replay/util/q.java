package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Color f83173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f83174b;

    public /* synthetic */ q(Color color, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, z10);
    }

    public final Color a() {
        return this.f83173a;
    }

    public final boolean b() {
        return this.f83174b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f83173a, qVar.f83173a) && this.f83174b == qVar.f83174b;
    }

    public int hashCode() {
        Color color = this.f83173a;
        return ((color == null ? 0 : Color.m1611hashCodeimpl(color.m1614unboximpl())) * 31) + androidx.compose.foundation.c.a(this.f83174b);
    }

    public String toString() {
        return "TextAttributes(color=" + this.f83173a + ", hasFillModifier=" + this.f83174b + ')';
    }

    private q(Color color, boolean z10) {
        this.f83173a = color;
        this.f83174b = z10;
    }
}
