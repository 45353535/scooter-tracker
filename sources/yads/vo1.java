package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vo1 {
    public static df2 a(String str, Exception exc) {
        ue2 ue2Var = exc instanceof eg.v1 ? ue2.f116621d : exc instanceof IllegalArgumentException ? ue2.f116622e : exc instanceof NoSuchElementException ? ue2.f116623f : ue2.f116624g;
        boolean z10 = lb1.f113032a;
        return ef2.a(str, ue2Var.b(), Integer.valueOf(ue2Var.a()));
    }

    public static df2 a(String str) {
        ue2 ue2Var = ue2.f116623f;
        boolean z10 = lb1.f113032a;
        return ef2.a(str, ue2Var.b(), Integer.valueOf(ue2Var.a()));
    }

    public static df2 a() {
        ue2.f116623f.b();
        boolean z10 = lb1.f113032a;
        return ef2.a();
    }
}
