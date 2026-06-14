package ga;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements j {
    @Override // ga.j
    public d1 create(List list, List list2) {
        return new i(list, list2);
    }

    @Override // ga.j
    public d1 empty() {
        return new i(ImmutableList.of(), ImmutableList.of());
    }
}
