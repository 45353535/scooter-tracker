package q9;

import android.os.Bundle;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    public static ImmutableList a(Function function, List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            builder.add(function.apply((Bundle) a.e((Bundle) list.get(i10))));
        }
        return builder.build();
    }

    public static ArrayList b(Collection collection, Function function) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) function.apply(it.next()));
        }
        return arrayList;
    }
}
