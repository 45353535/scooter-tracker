package sg.bigo.ads.common.h.b;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f102500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.common.h.a f102501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f102502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f102503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f102504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f102505f;

    public a(@NonNull sg.bigo.ads.common.h.a aVar) {
        this.f102501b = aVar;
        this.f102500a = aVar.f102457a;
    }

    protected final void a(long j10) {
        this.f102501b.f102465i = j10;
    }

    protected final void b(long j10) {
        this.f102501b.f102463g = j10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f102500a.equals(aVar.f102500a) && this.f102501b.f102460d.equals(aVar.f102501b.f102460d) && this.f102501b.f102459c.equals(aVar.f102501b.f102459c);
    }

    public String toString() {
        return this.f102501b.toString();
    }
}
