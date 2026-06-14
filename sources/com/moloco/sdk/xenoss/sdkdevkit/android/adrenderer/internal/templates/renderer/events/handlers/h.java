package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import hg.c0;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f56930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f56931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f56932c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0728a f56933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f56934d = new a("VIDEO", 0, "videoContainer");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f56935e = new a("MRAID", 1, "mraidContainer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f56936f = new a("STATIC", 2, "staticContainer");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f56937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f56938h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56939b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a$a, reason: collision with other inner class name */
        public static final class C0728a {
            public /* synthetic */ C0728a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                for (a aVar : a.values()) {
                    if (Intrinsics.areEqual(aVar.g(), value)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C0728a() {
            }
        }

        static {
            a[] aVarArrD = d();
            f56937g = aVarArrD;
            f56938h = qf.a.a(aVarArrD);
            f56933c = new C0728a(null);
        }

        public a(String str, int i10, String str2) {
            this.f56939b = str2;
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f56934d, f56935e, f56936f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f56937g.clone();
        }

        public final String g() {
            return this.f56939b;
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56940r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f56942t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f56942t = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return h.this.new b(this.f56942t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56940r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = h.this.f56931b;
                a aVar = this.f56942t;
                this.f56940r = 1;
                if (mutableSharedFlow.emit(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public h(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56930a = scope;
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f56931b = mutableSharedFlowB;
        this.f56932c = mutableSharedFlowB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf("playlistItemDisplaying");
    }

    public final MutableSharedFlow c() {
        return this.f56932c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, b(), event + " displaying.", false, 4, null);
        if (!Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            MolocoLogger.debug$default(molocoLogger, b(), "Event not supported: " + event.getString("event"), false, 4, null);
            return;
        }
        String string = event.getString("creativeType");
        a.C0728a c0728a = a.f56933c;
        Intrinsics.checkNotNull(string);
        a aVarA = c0728a.a(string);
        MolocoLogger.debug$default(molocoLogger, b(), aVarA + " displaying.", false, 4, null);
        if (aVarA != null) {
            eg.i.d(this.f56930a, null, null, new b(aVarA, null), 3, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "PlayListItemDisplayingEventHandler";
    }
}
