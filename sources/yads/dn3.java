package yads;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.common.Creative;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class dn3 {
    public static AdInfo a(oz ozVar) {
        ja jaVar = ozVar.f114450b;
        AdSize adSize = jaVar != null ? new AdSize(jaVar.f112272a, jaVar.f112273b) : null;
        List<wz> list = ozVar.f114452d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (wz wzVar : list) {
            arrayList.add(new Creative(wzVar.f117648a, wzVar.f117649b));
        }
        return new AdInfo(ozVar.f114449a, adSize, ozVar.f114451c, arrayList);
    }
}
