package yads;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fl0 f108850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pd f108851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108852c;

    public /* synthetic */ ax() {
        this(new pd(), new fl0());
    }

    public ax(pd pdVar, fl0 fl0Var) {
        this.f108850a = fl0Var;
        this.f108851b = pdVar;
        this.f108852c = CollectionsKt.listOf((Object[]) new String[]{Constants.SMALL, "medium", Constants.LARGE});
    }
}
