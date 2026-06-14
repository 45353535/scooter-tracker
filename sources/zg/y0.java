package zg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zg.a f119499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f119500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119502d;

    static final class a extends kotlin.coroutines.jvm.internal.j implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f119503r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f119504s;

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lf.b bVar, Unit unit, Continuation continuation) {
            a aVar = y0.this.new a(continuation);
            aVar.f119504s = bVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f119503r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                lf.b bVar = (lf.b) this.f119504s;
                byte bG = y0.this.f119499a.G();
                if (bG == 1) {
                    return y0.this.j(true);
                }
                if (bG == 0) {
                    return y0.this.j(false);
                }
                if (bG != 6) {
                    if (bG == 8) {
                        return y0.this.f();
                    }
                    zg.a.z(y0.this.f119499a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new lf.g();
                }
                y0 y0Var = y0.this;
                this.f119503r = 1;
                obj = y0Var.h(bVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return (JsonElement) obj;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f119506r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f119507s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f119508t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f119509u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f119510v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f119512x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f119510v = obj;
            this.f119512x |= Integer.MIN_VALUE;
            return y0.this.h(null, this);
        }
    }

    public y0(kotlinx.serialization.json.g configuration, zg.a lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f119499a = lexer;
        this.f119500b = configuration.q();
        this.f119501c = configuration.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement f() {
        byte bK = this.f119499a.k();
        if (this.f119499a.G() == 4) {
            zg.a.z(this.f119499a, "Unexpected leading comma", 0, null, 6, null);
            throw new lf.g();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f119499a.f()) {
            arrayList.add(e());
            bK = this.f119499a.k();
            if (bK != 4) {
                zg.a aVar = this.f119499a;
                boolean z10 = bK == 9;
                int i10 = aVar.f119378a;
                if (!z10) {
                    zg.a.z(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new lf.g();
                }
            }
        }
        if (bK == 8) {
            this.f119499a.l((byte) 9);
        } else if (bK == 4) {
            if (!this.f119501c) {
                i0.g(this.f119499a, "array");
                throw new lf.g();
            }
            this.f119499a.l((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement g() {
        return (JsonElement) kotlin.a.b(new lf.a(new a(null)), Unit.f93236a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(lf.b r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.y0.h(lf.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final JsonElement i() {
        byte bL = this.f119499a.l((byte) 6);
        if (this.f119499a.G() == 4) {
            zg.a.z(this.f119499a, "Unexpected leading comma", 0, null, 6, null);
            throw new lf.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f119499a.f()) {
                break;
            }
            String strS = this.f119500b ? this.f119499a.s() : this.f119499a.q();
            this.f119499a.l((byte) 5);
            linkedHashMap.put(strS, e());
            bL = this.f119499a.k();
            if (bL != 4) {
                if (bL != 7) {
                    zg.a.z(this.f119499a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new lf.g();
                }
            }
        }
        if (bL == 6) {
            this.f119499a.l((byte) 7);
        } else if (bL == 4) {
            if (!this.f119501c) {
                i0.h(this.f119499a, null, 1, null);
                throw new lf.g();
            }
            this.f119499a.l((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive j(boolean z10) {
        String strS = (this.f119500b || !z10) ? this.f119499a.s() : this.f119499a.q();
        return (z10 || !Intrinsics.areEqual(strS, "null")) ? new kotlinx.serialization.json.w(strS, z10, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement e() {
        byte bG = this.f119499a.G();
        if (bG == 1) {
            return j(true);
        }
        if (bG == 0) {
            return j(false);
        }
        if (bG == 6) {
            int i10 = this.f119502d + 1;
            this.f119502d = i10;
            this.f119502d--;
            return i10 == 200 ? g() : i();
        }
        if (bG == 8) {
            return f();
        }
        zg.a.z(this.f119499a, "Cannot read Json element because of unexpected " + zg.b.c(bG), 0, null, 6, null);
        throw new lf.g();
    }
}
