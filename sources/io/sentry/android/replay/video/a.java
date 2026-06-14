package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f83197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f83198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f83200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f83201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83202f;

    public a(File file, int i10, int i11, int i12, int i13, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f83197a = file;
        this.f83198b = i10;
        this.f83199c = i11;
        this.f83200d = i12;
        this.f83201e = i13;
        this.f83202f = mimeType;
    }

    public final int a() {
        return this.f83201e;
    }

    public final File b() {
        return this.f83197a;
    }

    public final int c() {
        return this.f83200d;
    }

    public final String d() {
        return this.f83202f;
    }

    public final int e() {
        return this.f83199c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f83197a, aVar.f83197a) && this.f83198b == aVar.f83198b && this.f83199c == aVar.f83199c && this.f83200d == aVar.f83200d && this.f83201e == aVar.f83201e && Intrinsics.areEqual(this.f83202f, aVar.f83202f);
    }

    public final int f() {
        return this.f83198b;
    }

    public int hashCode() {
        return (((((((((this.f83197a.hashCode() * 31) + this.f83198b) * 31) + this.f83199c) * 31) + this.f83200d) * 31) + this.f83201e) * 31) + this.f83202f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f83197a + ", recordingWidth=" + this.f83198b + ", recordingHeight=" + this.f83199c + ", frameRate=" + this.f83200d + ", bitRate=" + this.f83201e + ", mimeType=" + this.f83202f + ')';
    }

    public /* synthetic */ a(File file, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }
}
