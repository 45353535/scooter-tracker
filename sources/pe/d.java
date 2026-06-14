package pe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ze.a f98269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie.c f98270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f98271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f98272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function0 f98273e;

    public d(ze.a key, ie.c client, Object pluginConfig) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.f98269a = key;
        this.f98270b = client;
        this.f98271c = pluginConfig;
        this.f98272d = new ArrayList();
        this.f98273e = new Function0() { // from class: pe.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.g();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f93236a;
    }

    public final ie.c b() {
        return this.f98270b;
    }

    public final List c() {
        return this.f98272d;
    }

    public final Function0 d() {
        return this.f98273e;
    }

    public final Object e() {
        return this.f98271c;
    }

    public final void f(a hook, Object obj) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f98272d.add(new j(hook, obj));
    }

    public final void h(Function4 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        f(l.f98283a, block);
    }

    public final void i(Function5 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        f(p.f98299a, block);
    }
}
