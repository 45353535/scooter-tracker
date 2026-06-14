package yads;

import android.graphics.Bitmap;
import gg.y;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class k21 implements m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg.v f112559a;

    public k21(gg.v vVar) {
        this.f112559a = vVar;
    }

    @Override // yads.m31
    public final void a(String str, Bitmap bitmap) {
        this.f112559a.e(new b21(str, bitmap));
    }

    @Override // yads.m31
    public final void a(Map map) {
        y.a.a(this.f112559a.m(), null, 1, null);
    }
}
