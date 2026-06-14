package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w62 {
    public static final int a(Context context) {
        Integer num;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || (num = hr2VarA.f111750r0) == null) {
            return 1;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
