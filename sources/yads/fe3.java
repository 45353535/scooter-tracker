package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fe3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm3 f110696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de3 f110697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f110698d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fe3(Context context, c4 c4Var, es2 es2Var, td3 td3Var, fa3 fa3Var) {
        Context applicationContext = context.getApplicationContext();
        this(applicationContext, new lm3(applicationContext, c4Var, es2Var, fa3Var, td3Var), new de3());
    }

    public fe3(Context context, lm3 lm3Var, de3 de3Var) {
        this.f110695a = context;
        this.f110696b = lm3Var;
        this.f110697c = de3Var;
        this.f110698d = new ArrayList();
    }
}
