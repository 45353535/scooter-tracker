package com.my.target;

import android.content.Context;
import android.graphics.Point;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ec extends c2 {
    public Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        Point pointB = kb.b(context);
        int i10 = pointB.x;
        int i11 = pointB.y;
        if (i10 != 0 && i11 != 0) {
            map.put("vpw", String.valueOf(i10));
            map.put("vph", String.valueOf(i11));
        }
        return map;
    }
}
