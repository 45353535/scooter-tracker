package f1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f69891a = new g3();

    public static final String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final List b(File file, boolean z10) {
        if (file == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !Intrinsics.areEqual(file2.getName(), ".nomedia")) {
                    Intrinsics.checkNotNull(file2);
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z10) {
                    arrayList.addAll(b(file2, z10));
                }
            }
        }
        return arrayList;
    }

    public static final String c() {
        return "Chartboost-Android-SDK  9.10.2";
    }
}
