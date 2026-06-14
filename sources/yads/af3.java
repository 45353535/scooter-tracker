package yads;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class af3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f108677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch3 f108678b = new ch3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ih3 f108679c = new ih3();

    public af3(Context context) {
        this.f108677a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            boolean z10 = map != null;
            if (z10) {
                this.f108678b.getClass();
                String strW = str;
                for (Map.Entry entry : map.entrySet()) {
                    strW = StringsKt.W(strW, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                str = strW;
            } else if (z10) {
                throw new lf.m();
            }
            arrayList.add(str);
        }
        this.f108679c.getClass();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.areEqual((String) obj, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList2.add(obj);
            }
        }
        for (String str2 : arrayList2) {
            of3 of3VarA = of3.f114304c.a(this.f108677a);
            of3VarA.f114307b.a(new ob2(of3VarA.f114306a, str2, new uj3()));
        }
    }
}
