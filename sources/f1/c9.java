package f1;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f69518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f69519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f69520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f69521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69522g;

    public c9(String url, String filename, File file, File file2, long j10, String queueFilePath, long j11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(queueFilePath, "queueFilePath");
        this.f69516a = url;
        this.f69517b = filename;
        this.f69518c = file;
        this.f69519d = file2;
        this.f69520e = j10;
        this.f69521f = queueFilePath;
        this.f69522g = j11;
    }

    public final long a() {
        return this.f69520e;
    }

    public final void b(long j10) {
        this.f69522g = j10;
    }

    public final File c() {
        return this.f69519d;
    }

    public final long d() {
        return this.f69522g;
    }

    public final String e() {
        return this.f69517b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return Intrinsics.areEqual(this.f69516a, c9Var.f69516a) && Intrinsics.areEqual(this.f69517b, c9Var.f69517b) && Intrinsics.areEqual(this.f69518c, c9Var.f69518c) && Intrinsics.areEqual(this.f69519d, c9Var.f69519d) && this.f69520e == c9Var.f69520e && Intrinsics.areEqual(this.f69521f, c9Var.f69521f) && this.f69522g == c9Var.f69522g;
    }

    public final File f() {
        return this.f69518c;
    }

    public final String g() {
        return this.f69521f;
    }

    public final String h() {
        return this.f69516a;
    }

    public int hashCode() {
        int iHashCode = ((this.f69516a.hashCode() * 31) + this.f69517b.hashCode()) * 31;
        File file = this.f69518c;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.f69519d;
        return ((((((iHashCode2 + (file2 != null ? file2.hashCode() : 0)) * 31) + androidx.collection.b.a(this.f69520e)) * 31) + this.f69521f.hashCode()) * 31) + androidx.collection.b.a(this.f69522g);
    }

    public String toString() {
        return "VideoAsset(url=" + this.f69516a + ", filename=" + this.f69517b + ", localFile=" + this.f69518c + ", directory=" + this.f69519d + ", creationDate=" + this.f69520e + ", queueFilePath=" + this.f69521f + ", expectedFileSize=" + this.f69522g + ")";
    }

    public /* synthetic */ c9(String str, String str2, File file, File file2, long j10, String str3, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, file, file2, (i10 & 16) != 0 ? o3.a() : j10, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? 0L : j11);
    }
}
