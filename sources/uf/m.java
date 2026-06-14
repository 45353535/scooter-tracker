package uf;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class m extends l {
    public static final h r(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new h(file, direction);
    }

    public static /* synthetic */ h s(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.f93275b;
        }
        return r(file, fileWalkDirection);
    }

    public static final h t(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return r(file, FileWalkDirection.f93276c);
    }

    public static h u(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return r(file, FileWalkDirection.f93275b);
    }
}
