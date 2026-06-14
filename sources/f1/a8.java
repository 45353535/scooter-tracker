package f1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a8 implements g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f69381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f69382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f69383c;

    public a8(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(precacheDirectory, "precacheDirectory");
        Intrinsics.checkNotNullParameter(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.checkNotNullParameter(precachingInternalDirectory, "precachingInternalDirectory");
        this.f69381a = precacheDirectory;
        this.f69382b = precacheQueueDirectory;
        this.f69383c = precachingInternalDirectory;
    }

    @Override // f1.g7
    public File a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new File(c(), id2);
    }

    @Override // f1.g7
    public File b() {
        return this.f69383c;
    }

    @Override // f1.g7
    public File c() {
        return this.f69381a;
    }

    @Override // f1.g7
    public File a() {
        return this.f69382b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a8(Context context, File file, File file2, File file3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        file = (i10 & 2) != 0 ? td.m(context) : file;
        this(context, file, (i10 & 4) != 0 ? td.n(context) : file2, (i10 & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
    }
}
