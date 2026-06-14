package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96837a = df.a.a("io.ktor.client.plugins.UserAgent");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pe.b f96838b = pe.i.b("UserAgent", a.f96839b, new Function1() { // from class: oe.m1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return n1.b((pe.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96839b = new a();

        a() {
            super(0, l1.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l1 invoke() {
            return new l1(null, 1, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function4 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96840r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96841s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f96842t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(4, continuation);
            this.f96842t = str;
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pe.k kVar, re.d dVar, Object obj, Continuation continuation) {
            b bVar = new b(this.f96842t, continuation);
            bVar.f96841s = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f96840r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            re.d dVar = (re.d) this.f96841s;
            n1.f96837a.i("Adding User-Agent header: agent for " + dVar.i());
            re.l.a(dVar, ve.u.f106718a.x(), this.f96842t);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.h(new b(((l1) createClientPlugin.e()).a(), null));
        return Unit.f93236a;
    }

    public static final pe.b d() {
        return f96838b;
    }
}
