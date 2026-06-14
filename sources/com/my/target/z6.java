package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.MyTargetConfig;
import com.my.tracker.MyTracker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class z6 extends c2 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f61181a;

        static {
            String id2;
            try {
                id2 = MyTracker.getTrackerConfig().getId();
            } catch (Throwable th2) {
                gb.a("MyTrackerHelper: Error occurred while working with myTracker, " + th2.getMessage());
            }
            if (TextUtils.isEmpty(id2)) {
                gb.a("MyTrackerHelper: myTracker id is empty");
                id2 = null;
            }
            f61181a = id2;
        }
    }

    public Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        String str = a.f61181a;
        if (str != null) {
            map.put("mtr_id", str);
        }
        return map;
    }
}
