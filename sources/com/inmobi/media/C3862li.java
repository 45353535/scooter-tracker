package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3862li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38985a;

    public C3862li(int i10) {
        this.f38985a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3862li) && this.f38985a == ((C3862li) obj).f38985a;
    }

    public final int hashCode() {
        return this.f38985a;
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f38985a + ")";
    }
}
