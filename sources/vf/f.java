package vf;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class f extends c {
    public static final List a(Path path, String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = e.a(directoryStreamNewDirectoryStream);
            Intrinsics.checkNotNull(directoryStreamA);
            List list = CollectionsKt.toList(directoryStreamA);
            uf.c.a(directoryStreamNewDirectoryStream, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        return a(path, str);
    }
}
