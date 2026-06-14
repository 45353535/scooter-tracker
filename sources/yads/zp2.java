package yads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class zp2 {
    public static View a(Context context, Class cls, int i10, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i10, viewGroup, false));
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
