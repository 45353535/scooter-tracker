package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ra3 extends i53 {
    public final w93 C;

    public ra3(Context context, c4 c4Var, mr1 mr1Var, String str, wj3 wj3Var, ib3 ib3Var, sm3 sm3Var, w93 w93Var) {
        super(context, c4Var, 0, str, wj3Var, ib3Var, sm3Var, null, mr1Var, 1664);
        this.C = w93Var;
    }

    @Override // yads.i53
    public final qn2 a(r62 r62Var, int i10) {
        s93 s93VarA = this.C.a(r62Var);
        if (s93VarA == null) {
            return new qn2(new y92("Can't parse VAST response."));
        }
        List list = s93VarA.f115723a.f113763b;
        return list.isEmpty() ? new qn2(new vk0()) : new qn2(list, null);
    }
}
