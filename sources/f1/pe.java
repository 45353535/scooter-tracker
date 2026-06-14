package f1;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class pe {
    public static final PackageInfo a(PackageManager packageManager, String packageName, int i10) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i10));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i10);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public static final z8 b(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new z8(Integer.valueOf(iVar.a()), Integer.valueOf(iVar.c().g()), iVar.b(), iVar.f());
    }

    public static final b9 c(i8 i8Var) {
        Intrinsics.checkNotNullParameter(i8Var, "<this>");
        return new b9(i8Var.a(), i8Var.b(), i8Var.c());
    }

    public static final String d(PackageManager packageManager, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            String str = vd.c(packageManager, packageName, 128).versionName;
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e10) {
            eg.i("Exception raised getting package manager object", e10);
            return "";
        }
    }

    public static final List e(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeV = kotlin.ranges.g.v(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public static final List f(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeV = kotlin.ranges.g.v(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
